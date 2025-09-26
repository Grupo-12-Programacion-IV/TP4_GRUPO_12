package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dominio.*;

@WebServlet("/servletAgregarSeguro")
public class servletAgregarSeguro extends HttpServlet {
    private static final long serialVersionUID = 1L;

    public servletAgregarSeguro() {
        super();
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        tipoSeguroDao tipoDao = new tipoSeguroDao();
        ArrayList<tipoSeguro> listaTipos = tipoDao.obtenerTiposSeguros();

        seguroDao seguroDao = new seguroDao();
        int proximoId = seguroDao.obtenerProximoId();

        request.setAttribute("listaTipos", listaTipos);
        request.setAttribute("proximoId", proximoId);

        RequestDispatcher rd = request.getRequestDispatcher("/AgregarSeguros.jsp");
        rd.forward(request, response);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String descripcion = request.getParameter("descripcion");
        int idTipo = Integer.parseInt(request.getParameter("idTipo"));
        double costoContratacion = Double.parseDouble(request.getParameter("costoContratacion"));
        double costoAsegurado = Double.parseDouble(request.getParameter("costoAsegurado"));

        seguroDao seguroDao = new seguroDao();
        int proximoId = seguroDao.obtenerProximoId();

        seguro nuevoSeguro = new seguro();
        nuevoSeguro.setIdSeguro(proximoId);
        nuevoSeguro.setDescripcion(descripcion);
        nuevoSeguro.setIdTipo(idTipo);
        nuevoSeguro.setCostoContratacion(costoContratacion);
        nuevoSeguro.setCostoAsegurado(costoAsegurado);

        boolean exito = seguroDao.agregarSeguro(nuevoSeguro);

        if (exito) {
            response.sendRedirect("servletSeguro?Param=1");
        } else {
            response.getWriter().append("Error al agregar el seguro");
        }
    }
}

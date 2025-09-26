<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
    <%@ page import="java.util.ArrayList" %>
        <%@ page import="dominio.tipoSeguro" %>
            <!DOCTYPE html>
            <html>

            <head>
                <meta charset="UTF-8">
                <title>Agregar Seguros</title>
            </head>

            <body>

                <a href="Inicio.jsp"> Inicio</a> <a href="servletAgregarSeguro"> Agregar Seguros</a> <a
                    href="servletSeguro?Param=1"> ListarSeguros</a>

                <br><br>
                <h2>Agregar Seguros</h2>

                <form method="post" action="servletAgregarSeguro">
                    <table>
                        <tr>
                            <td>Id Seguro:</td>
                            <td><input type="text" name="idSeguro" value="<%=request.getAttribute(" proximoId") !=null ?
                                    request.getAttribute("proximoId") : "" %>" readonly></td>
                        </tr>
                        <tr>
                            <td>Descripción:</td>
                            <td><input type="text" name="descripcion" required></td>
                        </tr>
                        <tr>
                            <td>Tipo de Seguro:</td>
                            <td>
                                <select name="idTipo" required>
                                    <option value="">Seleccione un tipo</option>
                                    <% ArrayList<tipoSeguro> listaTipos = null;
                                        if(request.getAttribute("listaTipos") != null) {
                                        listaTipos = (ArrayList<tipoSeguro>)request.getAttribute("listaTipos");
                                            for(tipoSeguro tipo : listaTipos) {
                                            %>
                                            <option value="<%=tipo.getIdTipo()%>">
                                                <%=tipo.getDescripcion()%>
                                            </option>
                                            <% } } %>
                                </select>
                            </td>
                        </tr>
                        <tr>
                            <td>Costo contratación:</td>
                            <td><input type="number" name="costoContratacion" step="0.01" required></td>
                        </tr>
                        <tr>
                            <td>Costo Máximo Asegurado:</td>
                            <td><input type="number" name="costoAsegurado" step="0.01" required></td>
                        </tr>
                        <tr>
                            <td colspan="2"><input type="submit" value="Aceptar"></td>
                        </tr>
                    </table>
                </form>

            </body>

            </html>
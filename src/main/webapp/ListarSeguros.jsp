<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
	<%@ page import="java.util.ArrayList" %>
		<%@ page import="dominio.seguro" %>
			<!DOCTYPE html>
			<html>

			<head>
				<meta charset="UTF-8">
				<title>Insert title here</title>
			</head>

			<body>

				<a href="Inicio.jsp"> Inicio</a> <a href="AgregarSeguros.jsp"> Agregar Seguros</a> <a
					href="servletSeguro?Param=1"> ListarSeguros</a>

				<br>
				<h2>"Tipos de seguros en la base de datos"</h2>
				<br>
				<form method="get" action="servletSeguro">
					Busqueda por tipo de seguros:
					<select name="TipoSeguro">

						<option>Seguro de casas</option>
						<option>Seguro de vida</option>
						<option>Seguro de motos</option>

					</select>


					<input type="submit" name="btnFiltrar" value="Filtrar">
				</form>
				<% ArrayList<seguro> listaSeguros = null;
					if(request.getAttribute("listaS") != null)
					{
					listaSeguros = (ArrayList<seguro>)request.getAttribute("listaS");
						}

						%>

						<table border="1">
							<tr>
								<th>ID Seguro</th>
								<th>Descripción Seguro</th>
								<th>Descripcion Tipo Seguro</th>
								<th>Costo Contratacion</th>
								<th>Costo Maximo Asegurado</th>
							</tr>
							<% if(listaSeguros !=null) for(seguro seg : listaSeguros) { %>
								<tr>
									<td>
										<%=seg.getIdSeguro() %>
									</td>
									<td>
										<%=seg.getDescripcion() %>
									</td>
									<td>
										<%=seg.getIdTipo() %>
									</td>
									<td>
										<%=seg.getCostoContratacion() %>
									</td>
									<td>
										<%=seg.getCostoAsegurado() %>
									</td>
								</tr>
								<% } %>
						</table>



			</body>

			</html>
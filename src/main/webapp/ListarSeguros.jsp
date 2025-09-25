<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<a href="Inicio.jsp"> Inicio</a> <a href="AgregarSeguros.jsp"> Agregar Seguros</a> <a href="servletSeguro?Param=1"> ListarSeguros</a>

<br>
<h2>"Tipos de seguros en la base de datos"</h2>
<br>
Busqueda por tipo de seguros:
<select name = "TipoSeguro">

<option>Seguro de casas</option>
<option>Seguro de vida</option>
<option>Seguro de motos</option>

</select>

<input type="submit" name="btnFiltrar" value="Filtrar"> 




</body>
</html>
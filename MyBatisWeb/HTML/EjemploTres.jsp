<html>
<head>
<title>Catálogo Clientes</title>
</head>
<body>
<h3>Listado de Clientes</h3>
<table border  = "1px" cellpadding="5px" cellpadding="opx">
<tr>
<td bgcolor="#FF0000" color = "#FFFFFF" >Codigo</td>
<td bgcolor="#FF0000" color = "#FFFFFF" >Nombre</td>
<td bgcolor="#FF0000" color = "#FFFFFF" >Tipo</td>
</tr>
<%
	for(int = i ; i<10;i++){
		out.write("<tr>");
		out.write("<td>"+(i+1)+"</td>");
		out.write("<td>Nombre"+(i+1)+"</td>");
		out.write("<td>Tipo"+(i+1)+"</td>");
		out.write("<tr>");
	}
%>
</table>
</body>
</html>
<%-- 
    Document   : EjemploTres
    Created on : 25/05/2016, 10:01:29 AM
    Author     : Oliverco
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>Catálogo Clientes</title>
</head>
<body>
<h3>Listado de Clientes</h3>
<table border  = "1px" cellpadding="5px" cellpadding="opx">
<tr>
<td bgcolor='#918380' color = '#FFFFFF' >Codigo</td>
<td bgcolor="#918380" color = "#FFFFFF" >Nombre</td>
<td bgcolor="#918380" color = "#FFFFFF" >Tipo</td>
</tr>

<%
        for(int i=0; i<40;i++){
            if (i%2==0) {
                    out.write("<tr>");
                    out.write("<td bgcolor='#0F91B7'><font color = '#FFFFFF'>"+(i+1));
                    out.write("<td bgcolor='#0F91B7'><font color = '#FFFFFF'>Nombre"+(i+1)+"</td>");
                    out.write("<td bgcolor='#0F91B7'><font color = '#FFFFFF'>Tipo"+(i+1)+"</td>");
                    
                    out.write("<tr>");
                } else {
                    out.write("<tr>");
                    out.write("<td>"+(i+1)+"</td>");
                    out.write("<td>Nombre"+(i+1)+"</td>");
                    out.write("<td>Tipo"+(i+1)+"</td>");
                    out.write("<tr>");
                }
	}
%>
</table>
</body>
</html>

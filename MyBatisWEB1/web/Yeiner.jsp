<%-- 
    Document   : Yeiner
    Created on : 25/05/2016, 10:24:11 AM
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
<table border  = "1px" cellpadding="5px" cellpadding="5px">
<tr>
<%
        for(int i = 0;i<20;i++){
            out.write("<td bgcolor='#918380' color = '#FFFFFF' ><b>"+ (i+1)+ "</b></</td>");
        }
            
%>
</tr>
<%
	for(int i = 0 ; i<20;i++){
            if (i%2==0) {
                    out.write("<tr>");
                    for(int j =0;j<20;j++){
                        out.write("<td bgcolor='#0F91B7'>Nombre" +(j+1)+"<font color = '#FFFFFF'>");
                    }
                    out.write("<tr>");
                } else {
                    out.write("<tr>");
                    for(int j =0;j<20;j++){
                        out.write("<td>Appellido" +(j+1)+"</td>");
                    }
                    out.write("<tr>");
                }
                //out.write("<tr>");
                //out.write("<td bgcolor='#0F91B7' color = '#FFFFFF' >"+ (i+1)+"</td>");
                //out.write("</tr>");
        }
%>
</table>
</body>
</html>


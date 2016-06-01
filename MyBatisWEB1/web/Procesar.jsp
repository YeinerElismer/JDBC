<%
    Integer Numero1;
    Integer Numero2;
    String operacion;
    Integer resultado;
    Numero1 = Integer.parseInt(request.getParameter("txtNumero1").toString());
    Numero2 = Integer.parseInt(request.getParameter("txtNumero2").toString());
    operacion = request.getParameter("cboOperacion").toString();
    if (operacion.equals("S")) {
            resultado=Numero1+Numero2;
        }else{
        if (operacion.equals("R")) {
                resultado=Numero1-Numero2;
            }
        else{
            if (operacion.equals("M")) {
                    resultado=Numero1*Numero2;
                }
            else{
                resultado=Numero1/Numero2;
            }
        }
    }
%>
<html>
    <head>
        <title>Resultado</title>
    </head>
    <body>
        <h2>El resultado es: <%out.write(resultado.toString());%></h2>
    </body>
</html>

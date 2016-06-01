<html>
<head>
<title>Calculadora Basica</title>
</head>
<body>
    <form id="frmCalculadora" action="/GestionVentas/calcular" method="post">
    <table>
        <tr>
            <td>Numero 1</td>
            <td><input type="text" name="txtNumero1" value="" /></td>
        </tr>
        <tr>
            <td>Numero 2</td>
            <td><input type="text" name="txtNumero2" value="" /></td>
        </tr>
        <tr>
            <td>Operacion</td>
            <td><select name="cboOperacion">
                    <option value="S">Sumar</option>
                    <option value="R">Restar</option>
                    <option value="M">Multiplicar</option>
                    <option value="D">Dividir</option>
                </select></td>
        </tr>        
        <tr>
            <td></td>
            <td><input type="submit" value="Calcular" name="btnCalcular" /></td>
        </tr>        
        <tr>
            <td>Resultado</td>
            <td>${mensaje}</td>
        </tr>                
    </table>
    </form>
</body>
</html>
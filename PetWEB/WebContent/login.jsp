<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<LINK REL=StyleSheet HREF="comum.css" TYPE="text/css" >
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Login do sistema</title>
</head>
<body>
 
<form action="login" method="POST">
    <h2>Fa�a o login</h2>
    <table border="0" cellpadding="1">
        <tr>
            <td><label>Usu�rio</label></td>
            <td><input type="text" name="usuario" size="20" /> </td>
        </tr>
        <tr>
            <td><label>Senha</label></td>
            <td><input type="password" name="senha" size="20" /> </td>
        </tr>
         
        <tr>
            <td colspan="2">
                <input type="submit" value="Entrar"/>
                <input type="reset" value="Limpar"/>
            </td>
        </tr>
    </table>
</form>
 
</body>
</html>



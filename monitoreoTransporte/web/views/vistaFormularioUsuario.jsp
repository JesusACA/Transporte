<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->
<html>
    <head>
        <title>Registro de Usuario</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="../css/vistaFormularioUsuarioStyle.css">
        <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
    </head>
    <body>
        <div class="formulario">
            <h3>Ingrese sus datos en el formulario de abajo</h3>
            <form action="vistaFormularioUsuario.jsp" method="get">
                <label for="nombre">Nombre:</label>
                <input type="text" name="nombre">
                <label for="apellido">Apellido:</label>
                <input type="text" name="apellido">
                <label for="edad">Edad:</label>
                <input type="number">
                <label for="correo">Correo:</label>
                <input type="email" name="correo">
                <label for="contrasenia">Password:</label>
                <input type="password" name="contrasenia">
                <label for="telefono">Telefono:</label>
                <input type="text" name="telefono">
                <input type="submit" value="Aceptar" name="aceptar">
            </form>
        </div>
    </body>
</html>
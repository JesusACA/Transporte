<!DOCTYPE html>
<!--
To change this license header, choose License Headers in Project Properties.
To change this template file, choose Tools | Templates
and open the template in the editor.
-->

<%
    String usuarios = "Chuy";

%>

<html>
    <head>
        <title>Usuarios registrados</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="../css/vistaTablaUsuarioStyle.css">
        <link href="https://fonts.googleapis.com/css?family=Roboto" rel="stylesheet">
    </head>
    <body>
        <div>
            <%
                if(usuarios != null){
            %>
            <table class="table">
                <tr>
                    <th>Id</th>
                    <th>Nombre</th>
                    <th>Apellido</th>
                    <th>Edad</th>
                    <th>Correo</th>
                    <th>Telefono</th>
                </tr>
                <tr>
                    <td>1</td>
                    <td>Chuy</td>
                    <td>Castro</td>
                    <td>21</td>
                    <td>Chezz191@gmail.com</td>
                    <td>6221262601</td>
                </tr>
                <tr>
                    <td>2</td>
                    <td>Alvaro</td>
                    <td>Castro</td>
                    <td>21</td>
                    <td>Alvaro70001@gmail.com</td>
                    <td>6222276467</td>
                </tr>
                
            </table>
            <%} else{%>
                <h3>No hay usuarios registrados</h3>
            <% } %>
        </div>
    </body>
</html>
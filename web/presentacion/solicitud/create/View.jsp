<%-- 
    Document   : view
    Created on : Mar 17, 2019, 10:56:27 PM
    Author     : Anthony
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Nueva Solicitud</title>
    </head>
    <body>
       <%@ include file="/presentation/Header.jsp" %>
    
    <!-- formulario para agregar el bien-->
    <span> </span>
    <br>
    <div class= "pantallaPrincipal" style="display: block; border: 2px solid blue; height:400px; width:96%; margin: 25px; alignment-adjust: central">
        <h1>Solicitud</h1>
        <form>       
           <!--aqui va una tabla que se debe actualizar cada ves que se ingresa un nuevo bien a la solicitud-->
          
           tipo de adquisición:
           <Select name="tipoAdquisicion" id="tipoAdqui">
               <Option Selected value="compra">compra</Option>
               <Option Selected value="alquiler">alquiler</Option>
               <Option Selected value="donacion">donacion</Option>
           </Select>
           
           
        </form> 
        
        <br>
        <button onclick="myFunction()">Agregar un bien</button> 
    </div>
  
    </body>
</html>

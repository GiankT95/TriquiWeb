<%-- 
    Document   : Triqui
    Created on : 4/10/2017, 12:43:28 PM
    Author     : Sala_04
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>TODO supply a title</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
    </head>
    <body>
        <form method="POST" action="Controlador">
            <center>
                
                <h1> Triqui </h1>
                <input type="Text" value="<%= request.getAttribute("Triqui") == null?"":(((int[][])(request.getAttribute("Triqui")))[0][0]) == 1?"X":(((int[][])(request.getAttribute("Triqui")))[0][0]) == 2?"O":""%>" name="1" style="font-family: Arial; font-size: 20pt;width:80px;height:80px;text-align:center" maxlength="1">
                <input type="Text" value="<%= request.getAttribute("Triqui") == null?"":(((int[][])(request.getAttribute("Triqui")))[0][1]) == 1?"X":(((int[][])(request.getAttribute("Triqui")))[0][1]) == 2?"O":""%>" name="2" style="font-family: Arial; font-size: 20pt;width:80px;height:80px;text-align:center" maxlength="1">
                <input type="Text" value="<%= request.getAttribute("Triqui") == null?"":(((int[][])(request.getAttribute("Triqui")))[0][2]) == 1?"X":(((int[][])(request.getAttribute("Triqui")))[0][2]) == 2?"O":""%>" name="3" style="font-family: Arial; font-size: 20pt;width:80px;height:80px;text-align:center" maxlength="1">
                <br>
                <input type="Text" value="<%= request.getAttribute("Triqui") == null?"":(((int[][])(request.getAttribute("Triqui")))[1][0]) == 1?"X":(((int[][])(request.getAttribute("Triqui")))[1][0]) == 0?"":"O"%>" name="4" style="font-family: Arial; font-size: 20pt;width:80px;height:80px;text-align:center" maxlength="1">
                <input type="Text" value="<%= request.getAttribute("Triqui") == null?"":(((int[][])(request.getAttribute("Triqui")))[1][1]) == 1?"X":(((int[][])(request.getAttribute("Triqui")))[1][1]) == 0?"":"O"%>" name="5" style="font-family: Arial; font-size: 20pt;width:80px;height:80px;text-align:center" maxlength="1">
                <input type="Text" value="<%= request.getAttribute("Triqui") == null?"":(((int[][])(request.getAttribute("Triqui")))[1][2]) == 1?"X":(((int[][])(request.getAttribute("Triqui")))[1][2]) == 0?"":"O"%>" name="6" style="font-family: Arial; font-size: 20pt;width:80px;height:80px;text-align:center" maxlength="1">
                <br>
                <input type="Text" value="<%= request.getAttribute("Triqui") == null?"":(((int[][])(request.getAttribute("Triqui")))[2][0]) == 1?"X":(((int[][])(request.getAttribute("Triqui")))[2][0]) == 0?"":"O"%>" name="7" style="font-family: Arial; font-size: 20pt;width:80px;height:80px;text-align:center" maxlength="1">
                <input type="Text" value="<%= request.getAttribute("Triqui") == null?"":(((int[][])(request.getAttribute("Triqui")))[2][1]) == 1?"X":(((int[][])(request.getAttribute("Triqui")))[2][1]) == 0?"":"O"%>" name="8" style="font-family: Arial; font-size: 20pt;width:80px;height:80px;text-align:center" maxlength="1">
                <input type="Text" value="<%= request.getAttribute("Triqui") == null?"":(((int[][])(request.getAttribute("Triqui")))[2][2]) == 1?"X":(((int[][])(request.getAttribute("Triqui")))[2][2]) == 0?"":"O"%>" name="9" style="font-family: Arial; font-size: 20pt;width:80px;height:80px;text-align:center" maxlength="1">

                <br><br>
                <input type="Submit" name="Jugar" value="Jugar" style="left:inherit">
                <h1> <% if (request.getAttribute("Error2") != null) out.println(request.getAttribute("Error2")); %> </h1> 
                <h1> <% if (request.getAttribute("Error") != null) out.println(request.getAttribute("Error")); %> </h1> 


            </center>
    </body>
</html>


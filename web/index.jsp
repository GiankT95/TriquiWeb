
<html>
    <head>
        <title>Triqui</title>
    </head>
    <body>
        <h1>Triqui</h1>
        
        <form method="POST" action="ServletControlador">
            
            <input 
                type="input" 
                name="1" 
                style="width: 50px; height: 50px; text-align: center"
                value=<%= request.getAttribute("triki") == null?"":(((int[][])(request.getAttribute("triki")))[0][0]) == 1?"X":(((int[][])(request.getAttribute("triki")))[0][0]) == 2?"O":""%>>
            
            <input 
                type="input" 
                name="2" 
                style="width: 50px; height: 50px; text-align: center"
                value=<%= request.getAttribute("triki") == null?"":(((int[][])(request.getAttribute("triki")))[0][1]) == 1?"X":(((int[][])(request.getAttribute("triki")))[0][1]) == 2?"O":""%>>
                
            <input 
                type="input" 
                name="4" 
                style="width: 50px; height: 50px; text-align: center"
                value=<%= request.getAttribute("triki") == null?"":(((int[][])(request.getAttribute("triki")))[0][2]) == 1?"X":(((int[][])(request.getAttribute("triki")))[0][2]) == 2?"O":""%>><br>
            
            <input 
                type="input" 
                name="4" 
                style="width: 50px; height: 50px; text-align: center"
                value=<%= request.getAttribute("triki") == null?"":(((int[][])(request.getAttribute("triki")))[1][0]) == 1?"X":(((int[][])(request.getAttribute("triki")))[1][0]) == 2?"O":""%>>
            
            <input 
                type="input" 
                name="5" 
                style="width: 50px; height: 50px; text-align: center"
                value=<%= request.getAttribute("triki") == null?"":(((int[][])(request.getAttribute("triki")))[1][1]) == 1?"X":(((int[][])(request.getAttribute("triki")))[1][1]) == 2?"O":""%>>
            
            <input 
                type="input" 
                name="6" 
                style="width: 50px; height: 50px; text-align: center"
                value=<%= request.getAttribute("triki") == null?"":(((int[][])(request.getAttribute("triki")))[1][2]) == 1?"X":(((int[][])(request.getAttribute("triki")))[1][2]) == 2?"O":""%>><br>
            
            <input 
                type="input" 
                name="7" 
                style="width: 50px; height: 50px; text-align: center"
                value=<%= request.getAttribute("triki") == null?"":(((int[][])(request.getAttribute("triki")))[2][0]) == 1?"X":(((int[][])(request.getAttribute("triki")))[2][0]) == 2?"O":""%>>
            
            <input 
                type="input" 
                name="8" 
                style="width: 50px; height: 50px; text-align: center"
                value=<%= request.getAttribute("triki") == null?"":(((int[][])(request.getAttribute("triki")))[2][1]) == 1?"X":(((int[][])(request.getAttribute("triki")))[2][1]) == 2?"O":""%>>
            
            <input 
                type="input" 
                name="9" 
                style="width: 50px; height: 50px; text-align: center"
                value=<%= request.getAttribute("triki") == null?"":(((int[][])(request.getAttribute("triki")))[2][2]) == 1?"X":(((int[][])(request.getAttribute("triki")))[2][2]) == 2?"O":""%>><br><br>
            
            <input 
                type="submit" 
                name="botonJugar" 
                value="Jugar" >
  
        </form>
        
    </body>
</html>

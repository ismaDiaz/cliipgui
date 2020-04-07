<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
  <head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/css/bootstrap.min.css" integrity="sha384-MCw98/SFnGE8fJT3GXwEOngsV7Zt27NXFoaoApmYm81iuXoPkFOJwJ8ERdknLPMO" crossorigin="anonymous">
    <script src="https://apis.google.com/js/platform.js" async defer></script>
    <script src="https://apis.google.com/js/api.js"></script>
    <meta name="google-signin-client_id" content="480486348509-mro5es12b37ng1nun6equup2tnmcbgtc.apps.googleusercontent.com">
    <link href="css/estilos.css" rel= "stylesheet" type= "text/css"/>
    <meta http-equiv="content-type" content="application/xhtml+xml; charset=UTF-8" />
    
    <title>Hello world</title>
    
  </head>



  <body>
   
   <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
   <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.3/umd/popper.min.js" integrity="sha384-ZMP7rVo3mIykV+2+9J3UJ46jBk0WLaUAdn689aCwoqbBJiSnjAK/l8WvCWPIPm49" crossorigin="anonymous"></script>
   <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.1.3/js/bootstrap.min.js" integrity="sha384-ChfqqxuZUCnJSK3+MXmPNIyE6ZbWh2IMqE241rYiqJxyMiZ6OW/JmZQ5stwEULTy" crossorigin="anonymous"></script>
   
   <div class="container">
   		<form action="FormLoginServlet">
   		<div class="form-group">
   			<p><strong>Bienvenido al sistema</strong></p>
   		</div>
   		<div class="form-group">
   			<label>Email</label>
   			<input type="text" name= "email" placeholder= "example@gmail.com">
   		</div>
   		<div class="form-group">
   			<label>Contraseña</label>
   			<input type="password" name= "password" placeholder= "Password">
   		</div>
   		<button type="submit">Login</button>
  		</form>
   </div>
   
  </body>
</html>
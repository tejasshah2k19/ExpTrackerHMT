<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Login Page</title>
    <style>
        body {
            font-family: Arial, sans-serif;
            background-color: #f4f7f8;
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
        }

        .signup-form {
            background: white;
            padding: 30px;
            border-radius: 10px;
            box-shadow: 0 2px 10px rgba(0,0,0,0.1);
            width: 350px;
        }

        .signup-form h2 {
            margin-bottom: 20px;
            text-align: center;
        }

        .signup-form label {
            display: block;
            margin-top: 10px;
        }

        .signup-form input[type="text"],
        .signup-form input[type="email"],
        .signup-form input[type="password"],
        .signup-form select {
            width: 100%;
            padding: 10px;
            margin-top: 5px;
            border: 1px solid #ccc;
            border-radius: 5px;
        }

        .signup-form button {
            margin-top: 20px;
            width: 100%;
            padding: 10px;
            background: #28a745;
            border: none;
            color: white;
            font-size: 16px;
            border-radius: 5px;
            cursor: pointer;
        }

        .signup-form button:hover {
            background: #218838;
        }
    </style>
</head>
<body>

    <form action="LoginController" method="post" class="signup-form">
        <h2>Login</h2>

       
 
        <label for="email">Email</label>
        <input type="email" id="email" name="email" required>

        <label for="password">Password</label>
        <input type="password" id="password" name="password" required>

         

        <button type="submit">Login</button>
       <br><br>
    <a href="Signup.jsp">New User?</a>  
	<br>    
	<a href="ForgetPassword.jsp">ForgetPassword?</a>  
	
    </form>

</body>
</html>

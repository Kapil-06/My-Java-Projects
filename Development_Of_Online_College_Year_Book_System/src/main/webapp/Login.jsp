<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>

    <meta charset="UTF-8">
    <title>Development of Online College Year Book</title>
    <link rel="stylesheet" href="bootstrap.min.css">
</head>
<body style="margin-top: 30px;">
    
   

<!-- Main Header -->
<header class="main-header">
    <center><h1>Development of Online College Year Book</h1></center>
    <hr>
</header>


<!-- Login Form -->
<div class="container">
    
    <h2> Login Page</h2>
    <hr>
    <table>
        <form method="post" action="Login1" class="form-control">
        <tr>
            
            <td><input type="text" class="form-control" placeholder="Username" name="username" required="" autocomplete="off"></td>
            
        </tr>
        <tr>
            <td><input type="password" class="form-control" placeholder="Password" name="password" required="" autocomplete="off"></td>
        </tr>
        <tr>
            <td>
                <select name="utype" id="" class="form-control" required="">
                    <option value="">--Select--</option>
                    <option value="admin">Admin</option>
                    <option value="teacher">Teacher</option>
                    <option value="student">Student</option>
                </select>
            </td>
        </tr>
        <tr>
            <td>
            	<br>
                <div class="pt-1 mb-2">
                    <button class="btn btn-info btn-block" type="submit" value="Submit">Login</button>
                </div>
            </td>
        </tr>
    </form>
    </table>
    <h4 class="small mb-4 pb-lg-2"><a class="text-muted" href="#!">Forgot password?</a></h4>
    <h class="display-9">Don't have an account? <a href="NewRegister.html" class="link-info">Create Account</a></h>

</div>

<!-- Main Footer -->
<footer class="main-footer">
   
</footer>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>NewUser</title>
    <link rel="stylesheet" href="bootstrap.min.css">
</head>
<body style="margin-top:50px; margin-left: 80px;">
    <div class="container">
        <table style="border:0px solid black; height: 90%;">
            <tr style="border: 0px solid;">
                <td style="border: 0px solid black; width: 35%;">
                    <table style="border: 0px solid black;position: relative;">
                        <tr style="height: 550px;">
                            <td style="width: 450px;">
                                <img src="Register.png" class="img-fluid" alt="Sample photo" style="width: 550;margin-left: 10px;"/>
                            </td>
                        </tr>
                    </table>
                </td>

                <td style="border: 0px solid black;">
                    <h3 class="mb-5 text-uppercase">NEW REGISTERATION</h3>
                    
                    <form action="Register" method="post">
                    <table style="border:0px solid black;  width:350px; height: 100%;">
                        <tr style="border:0px solid black">
                            <td>   
                                
                                <div class="form-outline mb-3">
                                    <input type="text" name="username" class="form-control"  placeholder="UserNamw">
                                </div>
                                  
                                <div class="form-outline mb-3">
                                  <input type="password" name="password"  class="form-control" placeholder="password">
                                </div>

                                <div class="input-group mb-3">
                                    
                                    <input type="mail" class="form-control" name="mail" placeholder="Mail">
                                </div>

                                <div class="input-group mb-3">
                                    
                                    <input type="text" name="address" class="form-control"  placeholder="Address">
                                </div>

                                <div class="form-outline mb-3">
                                    <input type="number" name="conct" class="form-control" placeholder="Contact Number">
                                </div>

                                <div class="form-outline mb-3">    
                                      <select name="utype" class="form-control">
                                        <option selected disabled></option>
                                        <option value="admin">Admin</option>
                                        <option value="teacher">Teacher</option>
                                        <option value="student">Student</option>
                                       
                                      </select>   
                                </div>

                            
                  
                                <div class="d-grid gap-2">
                                    <input type="submit" value="Register" class="btn btn-outline-info">
                                </div>
                                  
                                <p class="text-center text-muted mt-4 mb-0">Have already an account? <a href="index.jsp"
                                    class="fw-bold text-body"><u>Login here</u></a>
                                </p>
                                
                            </td>
                        </tr>
                    </table>
                    </form>
                </td>
            </tr>
        </table>
    </div>
</body>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LoginForm</title>
<link rel="stylesheet" href="bootstrap.min.css">
</head>
<body style="margin-top: 50px;margin-left: 50px;">
    <div class="container">
        <table style="width: 90%;">
            
            <tr style="border: 2px;">
                <td>
                    <section class="min-vh-50">
                        <div class="container-fluid">
                          <div class="row">
                            <div class="col-sm-6 text-black">
                      
                              <div class="px-5 ms-xl-4">
                                <i class="fas fa-crow fa-2x me-3 pt-5 mt-xl-4" style="color: #709085;"></i>
                                <h3 class="h1 fw-bold mb-0">My NetBanking Application</h3>
                                <hr>
                                
                                <h3>Welcome to Admin Portal</h3>
                              </div>
                      
                              <div class="d-flex align-items-center h-custom-2 px-5 ms-xl-4 mt-5 pt-5 pt-xl-0 mt-xl-n5">
                      
                                <form method="post" action="AdminCheck" style="width: 15rem;">
                      
                                  <h3 class="fw-normal mb-3 pb-3" style="letter-spacing: 1px;">Log in here</h3>
                      
                                  <div class="form-outline mb-2">
                                    <input type="text" name="uid" class="form-control form-control-lg" />
                                    <label class="form-label" for="form2Example18">UserID</label>
                                  </div>
                      
                                  <div class="form-outline mb-2">
                                    <input type="password" name="psw" class="form-control form-control-lg" />
                                    <label class="form-label" for="form2Example28">Password</label>
                                  </div>
                      
                                  <div class="pt-1 mb-2">
                                    <button class="btn btn-info btn-block" type="submit" value="Submit">Login</button>
                                  </div>
                      
                                  <h4 class="small mb-4 pb-lg-2"><a class="text-muted" href="#!">Forgot password?</a></h4>
                                  
                                </form>
                      
                              </div>
                      
                            </div>
                            
                          </div>
                        </div>
                      </section>
                </td>
            </tr>
        </table>
        <hr>
        <h6 class="display-9">&emsp;Developed by kk
        <br>&emsp;kapilkadu&copy;2023</h6>
    </div>
</body>

</body>
</html>
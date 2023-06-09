<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>LoginForm</title>
  <link rel="stylesheet" href="bootstrap.min.css">
  </head>
  <body style="margin-top: 20px;">
    <div class="container">
      <table style="width: 90%; border: 1px solid black none;">
            
        <tr style="border: 2px; height: 650px;">
          <td>
              <section class="min-vh-30" style="border: 1px solid black none;">
                <div class="container-fluid">
                 <div class="row">
                 <div class="col-sm-6 text-black">
                      
                 <div class="px-5 ms-xl-4">
                 <i class="fas fa-crow fa-2x me-3 pt-5 mt-xl-4" style="color: #709085;"></i>
                 <h3 class="h1 fw-bold mb-0" style="margin-left: 50px;">My NetBanking Application</h3>
                 </div>
                      
                 <div class="d-flex align-items-center h-custom-2 px-5 ms-xl-4 mt-5 pt-5 pt-xl-0 mt-xl-n5" style="margin-left: 30px;">
                      
                    <form method="post" action="Login" style="width: 15rem;margin-left: 90px;">
                      
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
                          <h class="display-9">Don't have an account? <a href="NewUser.html" class="link-info">Create Account</a></h>
                      
                    </form>
                      
                              </div>
                      
                            </div>
                            <div class="col-sm-6 px-0 d-none d-sm-block">
                              <img src="Net-Banking.png"
                                alt="Login image" class="w-100 vh-50" style="height: 105%; position: relative;">
                            </div>
                          </div>
                        </div>
                      </section>
                </td>
            </tr>
        </table>
        <hr>
        <h6 class="display-9">&emsp;&emsp;&emsp;&emsp;&emsp;Developed by kk
        <br>&emsp;&emsp;&emsp;&emsp;&emsp;kapilkadu&copy;2023</h6>
    </div>
</body>
</html>
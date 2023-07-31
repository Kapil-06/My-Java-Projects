<%-- 
    Document   : index
    Created on : 4 May, 2021, 11:39:03 AM
    Author     : JAVA-JP
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <title>Online Oxygen Cylinder Management System Version 1.0</title>
        <!--meta tags -->
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <meta name="keywords" content="Cargoes Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
              Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
        <script>
            addEventListener("load", function () {
                setTimeout(hideURLbar, 0);
            }, false);

            function hideURLbar() {
                window.scrollTo(0, 1);
            }
        </script>
        <script>
            function add() {
                var x = parseInt(document.getElementById("a").value);
                var y = parseInt(document.getElementById("b").value)
                document.getElementById("c").value = x * y;
            }
        </script>
        <!--//meta tags ends here-->
        <!--booststrap-->
        <link href="css/bootstrap.min.css" rel="stylesheet" type="text/css" media="all">
        <!--//booststrap end-->
        <!-- font-awesome icons -->
        <link href="css/font-awesome.min.css" rel="stylesheet">
        <!-- //font-awesome icons -->
        <!--stylesheets-->
        <link href="css/style.css" rel='stylesheet' type='text/css' media="all">
        <!--//stylesheets-->
        <link href="//fonts.googleapis.com/css?family=Fira+Sans:400,500,600,700" rel="stylesheet">
        <link href="//fonts.googleapis.com/css?family=Source+Sans+Pro:400,600" rel="stylesheet">
    </head>
    <body>
        <div class="main-top" id="home">
            <!-- header -->
            <header>
                <div class="container-fluid">
                    <div class="header d-md-flex justify-content-between py-3 pl-2">
                        <!-- logo -->
                        <div id="logo">
                            <h1>
                                <a>Oxygen</a>
                            </h1>
                        </div>
                        <!-- //logo -->
                        <!-- nav -->
                        <div class="nav_main">
                            <nav>
                                <label for="drop" class="toggle">Menu</label>
                                <input type="checkbox" id="drop" />
                                <ul class="menu">
                                    <li>
                                        <a href="Hospital_Home.jsp" class="nav-style">Home</a>
                                    </li>
                                    <li>
                                        <a href="View_oxygens1.jsp" class="active nav-style">View Oxygen Cylinders</a>
                                    </li>
                                    <li>
                                        <a href="hospital_orders.jsp" class="nav-style">Your Orders</a>
                                    </li>
                                    <li>
                                        <a href="graph1.jsp" class="active nav-style">Graph</a>
                                    </li>
                                    <li>
                                        <a href="index.jsp" class="nav-style" style="color: red">Logout</a>
                                    </li>
                                </ul>
                            </nav>
                        </div>
                        <!-- //nav -->
                    </div>
                </div>
            </header>
            <!-- //header -->
            <!-- banner -->
            <div class="main-banner">
                <div class="container-fluid">
                    <div class="row">
                        <div class="col-lg-6">
                            <div class="style-banner ">
                                <br><br><br>
                                <h4 class="mb-2">Online Oxygen Cylinder EPR Version 1.0</h4>
                            </div>
                        </div>
                        <div class="col-lg-6 left-banner">
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- //banner -->
        <div class="using-border py-3">
            <div class="inner_breadcrumb  ml-4">
                <ul class="short_ls">
                    <li>
                        <a href="Hospital_Home.jsp">Home</a>
                        <span>/ /</span>
                    </li>
                    <li>Contact</li>
                </ul>
            </div>
        </div>
        <!-- //short-->
        <!--contact -->
         <%
            String cid = request.getParameter("cid");
        %>
        <section class="contact py-lg-4 py-md-3 py-sm-3 py-3">
            <div class="container py-lg-5 py-md-4 py-sm-4 py-3">
                <h3 class="title text-center mb-lg-5 mb-md-4 mb-sm-4 mb-3">Order Oxygen Cylinders</h3>
                <div class="row">
                    <div class="col-lg-6">
                        <img src="images/msg.png" width="450" height="400" />
                    </div>
                    <div class="col-lg-6">
                        <form action="msg1.jsp" method="post">
                            <div class="form-group contact-forms col-lg-12">
                                <input type="hidden" value="<%=cid%>" name="cid">
                                <label>Quantity :</label>
                                <textarea class="form-control" name="msg" placeholder="Enter Message" required=""></textarea><br>
                            </div>
                            <div class="form-group contact-forms col-lg-12">
                                <button type="submit" class="btn sent-butnn">Send</button>
                            </div>
                        </form>
                    </div>
                </div>
            </div>
        </section>
        <!-- footer -->
        <footer class="py-lg-4 py-3">
            <div class="bottom-footer text-center">
                <p>
                    © 2021
                </p>
            </div>
        </footer>
    </body>
</html>

<%-- 
    Document   : index
    Created on : 28 Aug, 2019, 5:56:33 PM
    Author     : Nehal Saonerkar
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Write Page Title over here</title>
        <meta name="keyword" content=""/>
        <meta name="Description" content=""/>
        <%@include file="headFiles.jsp" %>
        <style>
            body {
                font-family: Arial, Helvetica, sans-serif;
            }

            .flip-card {
                background-color: transparent;
                width: 260px;
                height: 260px;
                perspective: 1000px;
            }

            .flip-card-inner {
                position: relative;
                width: 100%;
                height: 100%;
                text-align: center;
                transition: transform 0.6s;
                transform-style: preserve-3d;
                box-shadow: 0 4px 8px 0 rgba(0,0,0,0.2);
            }

            .flip-card:hover .flip-card-inner {
                transform: rotateY(180deg);
            }

            .flip-card-front, .flip-card-back {
                position: absolute;
                width: 100%;
                height: 100%;
                backface-visibility: hidden;
            }

            .flip-card-front {
                background-color: #bbb;
                color: black;
            }

            .flip-card-back {
                background-color: white;
                color: white;
                transform: rotateY(180deg);
            }
        </style>
    </head>
    <body id="page-top" data-spy="scroll" data-target=".navbar">
        <div id="main-wrapper">

            <div id="preloader">
                <div id="status">
                    <div class="status-mes"></div>
                </div>
            </div>

            <div class="uc-mobile-menu-pusher">
                <div class="content-wrapper">
                    <section id="header_section_wrapper" class="header_section_wrapper">
                        <div class="container">
                            <%@include file="header.jsp" %>
                        </div>
                    </section>



                    <section id="category_section" class="category_section">
                        <div class="container">
                            <div class="row">
                                <div class="col-md-12">
                                    <div class="category_section mobile">
                                        <div class="col-md-12">
                                            <center><h1 style="font-size: 350%"><a href="category.html" target="_self">About Us</a></h1></center>
                                            <div class="col-md-8"> 
                                                <br>
                                                <br>
                                                <br>
                                                <div class="category_article_wrapper">
                                                    <div class="row">







                                                        <div class="category_article_content">
                                                            <p style="font-style: italic; font-size: 120%; "><emsp><b>NOIS Tech</b></emsp> mainly focused on Technology and it's latest offerings. We provide you the latest information on hardware, software & Tech videos such as unboxing, to the point reviews, hands on, etc 
                                                        </p><p style="font-style: italic; font-size: 120%"> At <b>NOIS Tech</b>, we serve the best tech news in town through our website and YouTube channel, and detailed unbiased reviews to help our audience decide what's best for them, and making tech videos where quality is the utmost priority.
                                                    </p></div>





                                            </div>

                                        </div>



                                    </div> 
                                    <div class="col-md-4">
                                        <div class="top_article_img">
                                            <a href="single.html" target="_self"><img class="img-responsive" src="assets/img/nois_logo.jpg" alt="feature-top">
                                            </a>
                                        </div>

                                    </div>
                                </div>
                                <br>
                                <br>
                            </div>
                        </div>
                    </div>
                    <div style="background-color: black; height: 100px">

                        <center> <h1 style="color: whitesmoke; padding-top: 40px ; font-style: italic; ">Making Tech Better!</h1></center>

                    </div>

                    <br>
                    <br>
                    <div class="col-md-12" style="padding-left: 7%">
                        <div class="col-md-4">


                            <div class="flip-card">
                                <div class="flip-card-inner">
                                    <div class="flip-card-front">
                                        <img src="img_avatar.png" alt="Avatar" style="width:260px;height:260px;">
                                        <h1>name</h1>
                                    </div>
                                    <div class="flip-card-back">
                                        <h1>Sample</h1> 
                                        <div><button class="btn btn-facebook waves-effect waves-light" style="background-color: white">
                                            <span><i class="fa fa-facebook-square" style="font-size: 30px; color: #4267b2"> </i> </span> </button>
                                            <button class="btn btn-facebook waves-effect waves-light" style="background-color: white; color: darkorchid"><span><i class="fa fa-instagram" style="font-size: 30px"> </i> </span></button>
                                            <button class="btn btn-facebook waves-effect waves-light" style="background-color: white"><span><i class="fa fa-share-altfa fa-linkedin-square" style="font-size: 30px; color: rgb(120,180,208)"> </i> </span></button>
                                            </button>
                                        
                                    </div>
                                </div>
                            </div>
                            <br>
                            <br>
                        </div>
                            <br>
                            <br>
                        </div>



                        <div class="col-md-4">
                            
                            <div class="flip-card">
                                <div class="flip-card-inner">
                                    <div class="flip-card-front">
                                        <img src="img_avatar.png" alt="Avatar" style="width:260px;height:260px;">
                                        <h1>name</h1>
                                    </div>
                                    <div class="flip-card-back">
                                        <h1>sample</h1> 
                                        <div><button class="btn btn-facebook waves-effect waves-light" style="background-color: white">
                                            <span><i class="fa fa-facebook-square" style="font-size: 30px; color: #4267b2"> </i> </span> </button>
                                            <button class="btn btn-facebook waves-effect waves-light" style="background-color: white; color: darkorchid"><span><i class="fa fa-instagram" style="font-size: 30px"> </i> </span></button>
                                            <button class="btn btn-facebook waves-effect waves-light" style="background-color: white"><span><i class="fa fa-share-altfa fa-linkedin-square" style="font-size: 30px; color: rgb(120,180,208)"> </i> </span></button>
                                            </button>
                                        
                                    </div>
                                </div>
                            </div>
                            <br>
                            <br>
                        </div>
                            <br>
                            <br>
                        </div>




                        <div class="col-md-4">
                            
                            <div class="flip-card">
                                <div class="flip-card-inner">
                                    <div class="flip-card-front">
                                        <img src="img_avatar.png" alt="Avatar" style="width:260px;height:260px;">
                                        <h1>name</h1>
                                    </div>
                                    <div class="flip-card-back">
                                        <h1>sample</h1> 
                                        <div><button class="btn btn-facebook waves-effect waves-light" style="background-color: white">
                                            <span><i class="fa fa-facebook-square" style="font-size: 30px; color: #4267b2"> </i> </span> </button>
                                            <button class="btn btn-facebook waves-effect waves-light" style="background-color: white; color: darkorchid"><span><i class="fa fa-instagram" style="font-size: 30px"> </i> </span></button>
                                            <button class="btn btn-facebook waves-effect waves-light" style="background-color: white"><span><i class="fa fa-share-altfa fa-linkedin-square" style="font-size: 30px; color: rgb(120,180,208)"> </i> </span></button>
                                            </button>
                                        
                                    </div>
                                </div>
                            </div>
                            <br>
                            <br>
                        </div>


                    </div>

                </div>
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
                    <br>
                    
                    <div class="footer_bottom_Section">
        <div class="container">
            <div class="row">
                <div class="footer">
                    <div class="col-sm-3">
                        <div class="social">
                            <a class="icons-sm fb-ic"><i class="fa fa-facebook"></i></a>

                            <a class="icons-sm tw-ic"><i class="fa fa-twitter"></i></a>

                            <a class="icons-sm inst-ic"><i class="fa fa-instagram"> </i></a>

                            <a class="icons-sm tmb-ic"><i class="fa fa-tumblr"> </i></a>

                            <a class="icons-sm rss-ic"><i class="fa fa-rss"> </i></a>
                        </div>
                    </div>
                    <div class="col-sm-6">
                        <p>&copy; Copyright 2016-Tech News . Design by: <a href="https://uicookies.com/">uiCookies</a> </p>
                    </div>
                    <div class="col-sm-3">
                        <p>Technology News Magazine</p>
                    </div>
                </div>
            </div>
        </div>
    </div>
            </section>
            


        </div>
    </div>
<a href="#" class="crunchify-top"><i class="fa fa-angle-up" aria-hidden="true"></i></a>
            <div class="uc-mobile-menu uc-mobile-menu-effect">
                <button type="button" class="close" aria-hidden="true" data-toggle="offcanvas" id="uc-mobile-menu-close-btn">&times;</button>
                <div>
                    <div>
                        <ul id="menu">
                            <li class="active"><a href="blog.html">News</a></li>
                            <li><a href="category.html">Mobile</a></li>
                            <li><a href="blog.html">Tablet</a></li>
                            <li><a href="category.html">Gadgets</a></li>
                            <li><a href="blog.html">Camera</a></li>
                            <li><a href="category.html">Design</a></li>
                            <li class="dropdown m-menu-fw"><a href="#" data-toggle="dropdown" class="dropdown-toggle">More
                                    <span><i class="fa fa-angle-down"></i></span></a>
                                <ul class="dropdown-menu">
                                    <li>
                                        <div class="m-menu-content">
                                            <ul class="col-sm-3">
                                                <li class="dropdown-header">Widget Haeder</li>
                                                <li><a href="#">Awesome Features</a></li>
                                                <li><a href="#">Clean Interface</a></li>
                                                <li><a href="#">Available Possibilities</a></li>
                                                <li><a href="#">Responsive Design</a></li>
                                                <li><a href="#">Pixel Perfect Graphics</a></li>
                                            </ul>
                                            <ul class="col-sm-3">
                                                <li class="dropdown-header">Widget Haeder</li>
                                                <li><a href="#">Awesome Features</a></li>
                                                <li><a href="#">Clean Interface</a></li>
                                                <li><a href="#">Available Possibilities</a></li>
                                                <li><a href="#">Responsive Design</a></li>
                                                <li><a href="#">Pixel Perfect Graphics</a></li>
                                            </ul>
                                            <ul class="col-sm-3">
                                                <li class="dropdown-header">Widget Haeder</li>
                                                <li><a href="#">Awesome Features</a></li>
                                                <li><a href="#">Clean Interface</a></li>
                                                <li><a href="#">Available Possibilities</a></li>
                                                <li><a href="#">Responsive Design</a></li>
                                                <li><a href="#">Pixel Perfect Graphics</a></li>
                                            </ul>
                                            <ul class="col-sm-3">
                                                <li class="dropdown-header">Widget Haeder</li>
                                                <li><a href="#">Awesome Features</a></li>
                                                <li><a href="#">Clean Interface</a></li>
                                                <li><a href="#">Available Possibilities</a></li>
                                                <li><a href="#">Responsive Design</a></li>
                                                <li><a href="#">Pixel Perfect Graphics</a></li>
                                            </ul>
                                        </div>
                                    </li>
                                </ul>
                            </li>
                        </ul>
                    </div>
                </div>
            </div>
</div>
<%@include file="footerFiles.jsp" %>
</body>
</html>
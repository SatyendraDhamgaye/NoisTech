

<%@page import="com.mycompany.noisdev.DivisibleBy"%>
<%@page import="com.noistech.beans.TblApksBeans"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.noistech.model.ApkModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%!
    ApkModel apk = new ApkModel();
    ArrayList<TblApksBeans> arrayLists = apk.select();
    DivisibleBy by = new DivisibleBy();
    long size = 0;
%>

<!DOCTYPE html>
<html>
    <head>
        <title>Write Page Title over here</title>
        <meta name="keyword" content=""/>
        <meta name="Description" content=""/>
        <%@include file="headFiles.jsp" %>
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
                    <section id="feature_news_section" class="feature_news_section">
                        <div class="container">
                            <div class="row">
                                <div class="col-md-7">
                                    <div class="feature_article_wrapper">
                                        <div class="feature_article_img">
                                            <img class="img-responsive top_static_article_img" src="assets/img/feature-top.jpg" alt="feature-top">
                                        </div>

                                        <div class="feature_article_inner">
                                            <div class="tag_lg red"><a href="category.html">Hot Games</a></div>
                                            <div class="feature_article_title">
                                                <h1><a href="single.html" target="_self">Grand Theft Auto: San Andreas</a></h1>
                                            </div>

                                            <div class="feature_article_date"><a href="#" target="_self">Rockstar North</a>,<a href="#" target="_self">26 October 2004</a></div>

                                            <div class="feature_article_content">
                                                Grand Theft Auto: San Andreas is an action-adventure video game developed by Rockstar North and published by Rockstar Games. 
                                            </div>

                                            <div class="article_social">
                                                <span><i class="fa fa-download"></i><a href="#">Download</a></span>
                                                <span><i class="fa fa-download"></i><a href="#">Download more</a></span>
                                            </div>

                                        </div>

                                    </div>

                                </div>

                                <div class="col-md-5">
                                    <div class="feature_static_wrapper">
                                        <div class="feature_article_img">
                                            <img class="img-responsive" src="assets/img/feature-static1.jpg" alt="feature-top">
                                        </div>

                                        <div class="feature_article_inner">
                                            <div class="tag_lg purple"><a href="category.html">Top Apps</a></div>
                                            <div class="feature_article_title">
                                                <h1><a href="single.html" target="_self">Example_top_app</a></h1>
                                            </div>

                                            <div class="feature_article_date"><a href="#" target="_self">developer</a>,<a href="#" target="_self">Launched date</a></div>

                                            <div class="feature_article_content">
                                                Specific android apk short discription
                                            </div>

                                            <div class="article_social">
                                                <span><i class="fa fa-download"></i><a href="#">Download</a></span>
                                                <span><i class="fa fa-download"></i><a href="#">Download More</a></span>
                                            </div>

                                        </div>

                                    </div>

                                </div>

                                <div class="col-md-5">
                                    <div class="feature_static_last_wrapper">
                                        <div class="feature_article_img">
                                            <img class="img-responsive" src="assets/img/feature-static2.jpg" alt="feature-top">
                                        </div>

                                        <div class="feature_article_inner">
                                            <div class="tag_lg blue"><a href="category.html">Top Paid</a></div>
                                            <div class="feature_article_title">
                                                <h1><a href="single.html" target="_self">Top_paid_app_eg</a></h1>
                                            </div>

                                            <div class="feature_article_date"><a href="#" target="_self">developer name</a>,<a href="#" target="_self">Launched date</a></div>

                                            <div class="feature_article_content">
                                                top paid add short description
                                            </div>

                                            <div class="article_social">
                                                <span><i class="fa fa-download"></i><a href="#">Download</a></span>
                                                <span><i class="fa fa-download"></i><a href="#">Download More</a></span>
                                            </div>

                                        </div>

                                    </div>

                                </div>

                            </div>

                        </div>

                    </section>


                    <section id="category_section" class="category_section">
                        <div class="container">
                            <div class="row">
                                <div class="col-md-8">
                                    <div class="category_section mobile">
                                        <div class="article_title header_purple">
                                            <h2><a href="category.html" target="_self">All Apps</a></h2>
                                        </div>




                                                                                    
                                        <div class="category_article_wrapper">
                                            <div class="row">



                                                <%
                                                    size = arrayLists.size();
                                                    for (TblApksBeans apks : arrayLists) {
                                                %>
                                                <div class="col-md-6" style="margin-bottom: 5px; margin-top: 5px">
                                                    <div class="media">
                                                        <div class="media-left">
                                                            <a href="singleapk.jsp?id=<%= apks.getId() %>" target="_blank"><img class="media-object" src="<%= apks.getImg()%>?tr=w-122,h-122" alt="<%= apks.getName()%>"></a>
                                                        </div>
                                                        <div class="media-body">
                                                            <span class="tag purple">Mobile <%= apks.getId()%></span>
                                                            <h3 class="media-heading"><a href="singleapk.jsp?id=<%= apks.getId() %>" target="_blank"><%= apks.getName()%></a></h3>
                                                            <span class="media-date"><a href="#"><%= apks.getVersion()%> | </a>, Version :<a href="#"><%= apks.getVersion()%></a></span>
                                                            <div class="media_social">
                                                                <span><a href="singleapk.jsp?id=<%= apks.getId() %>" target="_blank"><i class="fa fa-download"></i>Download</a></span>
                                                                <span><a href="#"><i class="fa fa-download"></i>Download More</a></span>
                                                            </div>
                                                        </div>
                                                    </div>
                                                </div>

                                                <%
                                                    if (by.check(String.valueOf(apks.getSerialNo()), 4)) {
                                                %>
                                                <div class="col-md-12">
                                                    <div class="widget_advertisement">
                                                        <img class="img-responsive" src="assets/img/category_advertisement.jpg" alt="feature-top">
                                                    </div>
                                                </div>
                                                <%
                                                        }
                                                    }
                                                %>
                                            </div>
                                        </div>





                                        <br>

                                      



                                        <p class="divider"><a href="#">More Apps&nbsp;&raquo;</a></p>
                                    </div>
                                </div>










                                <div class="col-md-4">
                                    <%@include file="sidebar.jsp" %>
                                </div>
                            </div>

                        </div>

                    </section>



                    <%-- FOOTER AREA START --%>
                    <%@include file="footer.jsp" %>
                    <%-- FOOTER AREA END --%>
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
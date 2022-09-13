<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%!
    NewsModel news = new NewsModel();
    ArrayList<TblNewsBeans> arrayLists = news.select();
    DivisibleBy by = new DivisibleBy();
    long size = 0;
%>
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
                    <section class="breadcrumb_section">
                        <div class="container">
                            <div class="row">
                                <ol class="breadcrumb">
                                    <li><a href="#">Home</a></li>
                                    <li><a href="#">News</a></li>
                                    <li><a href="#">Tech</a></li>
                                    <li class="active"><a href="#">Mobile</a></li>
                                </ol>
                            </div>
                        </div>
                    </section>



                    <section id="category_section" class="category_section">
                        <div class="container">
                            <div class="row">
                                <div class="col-md-8">
                                    <div class="entity_wrapper">
                                        <div class="entity_title header_purple">
                                            <h1><a href="category.html" target="_blank">Mobile</a></h1>
                                        </div>

                                        <div class="entity_thumb">
                                            <img class="img-responsive" src="assets/img/category_img_top.jpg" alt="feature-top">
                                        </div>

                                        <div class="entity_title">
                                            <a href="single.html" target="_blank"><h3> Head launches photo-centric app for iPads and Android
                                                    tablets. </h3></a>
                                        </div>

                                        <div class="entity_meta">
                                            <a href="#">10Aug- 2015</a>, by: <a href="#">Eric joan</a>
                                        </div>

                                        <div class="entity_content">
                                            Collaboratively administrate empowered markets via plug-and-play networks. Dynamically procrastinate B2C users
                                            after installed base benefits. Dramatically visualize customer directed convergence without revolutionary ROI.
                                        </div>

                                        <div class="entity_social">
                                            <span><i class="fa fa-share-alt"></i>424 <a href="#">Shares</a> </span>
                                            <span><i class="fa fa-comments-o"></i>4 <a href="#">Comments</a> </span>
                                        </div>

                                    </div>

                                    <div class="row">
                                        <%
                                            size = arrayLists.size();
                                            for (TblNewsBeans news : arrayLists) {
                                        %>
                                        <div class="col-md-6" style="margin-top: 10px; margin-bottom: 10px;">
                                            <div class="category_article_body">
                                                <div class="top_article_img">
                                                    <img class="img-fluid" src="<%= news.getThumbnail() %>?tr=w-358,h-186" alt="<%= news.getTitle() %>">
                                                </div>

                                                <div class="category_article_title">
                                                    <h5><a href="single.html" target="_blank"><%= news.getTitle() %> </a></h5>
                                                </div>

                                                <div class="article_date">
                                                    <a href="#"><%= news.getDateTime().substring(0,10) %></a>, by: <a href="#"><%= news.getPostedBy() %></a>
                                                </div>

                                                <div class="category_article_content">
                                                    <%= news.getDescription()%>
                                                </div>

                                                <div class="article_social">
                                                    <span><a href="#"><i class="fa fa-share-alt"></i>424 </a> Shares</span>
                                                    <span><i class="fa fa-comments-o"></i><a href="#">4</a> Comments</span>
                                                </div>

                                            </div>

                                        </div>
                                        <%
                                            if (by.check(String.valueOf(news.getSerialNo()), 2)) {
                                        %>
                                        <div class="col-12" style="margin-top: 10px">
                                            <div class="widget_advertisement">
                                                <img class="img-responsive" src="assets/img/category_advertisement.jpg" alt="feature-top">
                                            </div>
                                        </div>
                                        <%
                                                }
                                            }
                                        %>


                                        

                                    </div>


                                    <nav aria-label="Page navigation" class="pagination_section">
                                        <ul class="pagination">
                                            <li>
                                                <a href="#" aria-label="Previous"> <span aria-hidden="true">&laquo;</span> </a>
                                            </li>
                                            <li><a href="#">1</a></li>
                                            <li><a href="#">2</a></li>
                                            <li><a href="#">3</a></li>
                                            <li><a href="#">4</a></li>
                                            <li><a href="#">5</a></li>
                                            <li>
                                                <a href="#" aria-label="Next" class="active"> <span aria-hidden="true">&raquo;</span> </a>
                                            </li>
                                        </ul>
                                    </nav>

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
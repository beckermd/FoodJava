<%--<?php--%>
<%--session_start();--%>
<%--?>--%>

<!DOCTYPE html>

<html lang="en">

<head>
    <meta http-equiv="Content-Type" content="text/html;charset=utf-8">
    <title>"Food Network"</title>

    <link rel="stylesheet/less" type="text/css" href="/less/bootstrap.less"/>
    <link rel="stylesheet" href="/css/bootstrap.css">
    <link rel="stylesheet/Css/glyphicons_free" href="/css/glyphicons_social">

</head>


<body>
<fieldset style="background-color: lightgoldenrodyellow">
    <header>
        <div class="alert alert-dismissable alert-warning">

            <div class="col-lg-4">
                <h2>Welcome to Food Network</h2>
                <small> "NOW we're cooking with gas"</small>
            </div>
            <div class="col-lg-4">
                <img src="/img/banner.jpg" width="800px" height="100px">
            </div>


            </br>
        </div>

        <div class=col-lg-11 style="background: transparent;margin-bottom: -22px">


            <div class="navbar navbar-default" style="background: transparent;border-top-color: #808080">

                <div class="navbar-collapse collapse">
                    <ul class="nav navbar-nav">
                        <li class="active">
                            <a class="navbar-brandhref" href="IndexFood.php?content=main"
                               style="background: transparent">Home</a>
                        </li>
                        <li class="active">
                            <a href='newrecipe' style="background: transparent">Post a new
                                Recipe</a>

                        </li>
                    </ul>


                    <ul class="nav navbar-nav navbar-right">
                        <li class="dropdown">
                            <a href='' class="dropdown-toggle" data-toggle="dropdown"
                               style="background: transparent">Welcome
                                <b class="caret"></b>
                            </a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href='Login.inc.php?content=Login'>Login</a>
                                </li>
                                <li>
                                    <a href='IndexFood.php?content=Registration'>Register for free</a>
                                </li>
                                <li>
                                    <a href='IndexFood.php?content=logout'>Logout</a>
                                </li>
                                <li>
                                    <a href="http://www.linkedin.com/pub/daniela-becker/9/9b3/549/">About us</a>
                                </li>
                            </ul>
                        </li>
                        <li class="active">
                            <a href="" style="background: transparent"> $userid</a>
                        </li>
                    </ul>
                </div>
            </div>
        </div>

        </div>
    </header>
</fieldset>
<script src="https://code.jquery.com/jquery-1.10.2.min.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/bootswatch.js"></script>


<!-- Center page
     ================================================= -->
<div class="col-lg-6">
    <%--<?php--%>
    <%--if (!isset($_REQUEST['content'])) {--%>

    <%--include("main.inc.php");--%>
    <%--} else {--%>
    <%--$page = $_REQUEST['content'];--%>
    <%--$nextpage = $page . ".inc.php";--%>
    <%--include("$nextpage");--%>
    <%--}--%>

    <%--?>--%>
</div>
<!-- How to make
    =====================================================  -->
</br>
</br>
<div class="col-lg-4">
    <div class="well bs-component">
        <fieldset>
            <legend>How to make</legend>
            <form action="IndexFood.php" method="get">
                <input type="text" class="form-control" name="search">
                </br>
                <input name="content" type="hidden" value="search">
                <button type="submit" class="btn btn-primary">Search</button>
            </form>
            <br/>
            <ul>
                <a href="http://pinterest.com"><img
                        src="/css/glyphicons_social/png/glyphicons_social_00_pinterest.png"></a>
                <a href="http://google.com/+"><img
                        src="/css/glyphicons_social/png/glyphicons_social_02_google_plus.png"></a>
                <a href="http://facebook.com"><img
                        src="/css/glyphicons_social/png/glyphicons_social_30_facebook.png"></a>
            </ul>

        </fieldset>
    </div>
</div>
<fieldset>
    <div>
        <a href="http://www.cookingchanneltv.com/home.html">Cooking Channel</a> <br/>
        <a href="http://www.foodnetwork.com">Food Network</a>
    </div>
</fieldset>
<div>
    <fieldset>
        <span style="font-family:Arial bold; font-size: 40px; color: #000000">News</span>

        <%--<?php--%>

        <%--include('news.inc.php');--%>

        <%--?>--%>

    </fieldset>
</div>
</div>

<!-- Foot Page
      ============================================== -->

<footer style="text-align:center">
    <div>
        <div class="col-lg-12">
            <%--<?php--%>
            <%--include('FootPage.php');--%>
            <%--?>--%>
        </div>
    </div>
</footer>


</body>
</html>
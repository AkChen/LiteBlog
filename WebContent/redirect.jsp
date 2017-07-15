<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
	<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>Lite Blog</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Lite Blog" />
	<meta name="keywords" content="Lite Blog" />
	

  

  	<!-- Facebook and Twitter integration -->
	<meta property="og:title" content=""/>
	<meta property="og:image" content=""/>
	<meta property="og:url" content=""/>
	<meta property="og:site_name" content=""/>
	<meta property="og:description" content=""/>
	<meta name="twitter:title" content="" />
	<meta name="twitter:image" content="" />
	<meta name="twitter:url" content="" />
	<meta name="twitter:card" content="" />
     <meta http-equiv="refresh" content="1;url=<%=session.getAttribute("redirect_path")%>">
	<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
	<link rel="shortcut icon" href="favicon.ico">

	<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,700,300' rel='stylesheet' type='text/css'>
	
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/animate.css">
	<link rel="stylesheet" href="css/style.css">

	<!-- Modernizr JS -->
	<script src="js/modernizr-2.6.2.min.js"></script>
	<script src="js/md5.js"></script>
    
	<!-- FOR IE9 below -->
	<!--[if lt IE 9]>
	<script src="js/respond.min.js"></script>
	<![endif]-->

	</head>
	<body class="style-2">

		<div class="container">
			
			<div class="row">
				<div class="col-md-4">
					

					<!-- Start Sign In Form -->
					<form class="fh5co-form animate-box" data-animate-effect="fadeInLeft">
                        
                        <h2>提示</h2>
						
						<div class="form-group">
							<p><%=session.getAttribute("redirect_msg")%></p>
						</div>
						<div class="form-group">
							
							<a href="<%=session.getAttribute("redirect_path") %>">页面将在一秒后跳转</a>
						</div>
						
						
					</form>
					<!-- END Sign In Form -->
					<!-- Hidden Form -->
					<form method="post"  id="hidden_form">
					<input type="hidden" id="hidden_username" name="username">
					<input type="hidden" id="hidden_password" name="password">
					</form>


				</div>
			</div>
            <div class="row" style="padding-top: 60px; clear: both;">
                <div class="col-md-12 text-center"><p><small>&copy; All Rights Reserved. <a href="http://blog.akchen.cn" target="_blank" title="">LiteBlog</a></small></p></div>
            </div>
		</div>
	
	<!-- jQuery -->
	<script src="js/jquery.min.js"></script>
	<!-- Bootstrap -->
	<script src="js/bootstrap.min.js"></script>
	<!-- Placeholder -->
	<script src="js/jquery.placeholder.min.js"></script>
	<!-- Waypoints -->
	<script src="js/jquery.waypoints.min.js"></script>
	<!-- Main JS -->
	<script src="js/main.js"></script>

	</body>
</html>


﻿
<!DOCTYPE html>
<!--[if lt IE 7]>      <html class="no-js lt-ie9 lt-ie8 lt-ie7"> <![endif]-->
<!--[if IE 7]>         <html class="no-js lt-ie9 lt-ie8"> <![endif]-->
<!--[if IE 8]>         <html class="no-js lt-ie9"> <![endif]-->
<!--[if gt IE 8]><!--> <html class="no-js"> <!--<![endif]-->
	<head>
	<meta charset="utf-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<title>Minimal and Clean Sign up / Login and Forgot Form by FreeHTML5.co</title>
	<meta name="viewport" content="width=device-width, initial-scale=1">
	<meta name="description" content="Free HTML5 Template by FreeHTML5.co" />
	<meta name="keywords" content="free html5, free template, free bootstrap, html5, css3, mobile first, responsive" />
	

  

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

	<!-- Place favicon.ico and apple-touch-icon.png in the root directory -->
	<link rel="shortcut icon" href="favicon.ico">

	<link href='https://fonts.googleapis.com/css?family=Open+Sans:400,700,300' rel='stylesheet' type='text/css'>
	
	<link rel="stylesheet" href="css/bootstrap.min.css">
	<link rel="stylesheet" href="css/animate.css">
	<link rel="stylesheet" href="css/style.css">

	<!-- Modernizr JS -->
	<script src="js/modernizr-2.6.2.min.js"></script>
    <script type="text/javascript">
         function checkInput()
         {
             var username = document.getElementById("username").value;
             var password = document.getElementById("password").value;
             var repassword = document.getElementById("re-password").value;
             if (username.length==0)
             {
                 alert("请输入用户名")
                 return false;
             }
             if (username >= 32)
             {
                 alert("用户名过长(32位)")
                 return false;
             }
             if (password.length==0) {
                 alert("请输入密码")
                 return false;
             }
             if (repassword.length==0) {
                 alert("请再次输入密码")
                 return false;
             }
             if (repassword != password) {
                 alert("两次输入不一致")
                 return false;
             }
             if (repassword.length <= 8)
             {
                 alert("密码太短(大于8位)");
                 return false;
             }

             return true;
         }
         function checkUsername()
         {
             return true;
         }
    </script>
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
					<form action="lt_signup" method="post" class="fh5co-form animate-box" data-animate-effect="fadeInLeft">
						
                        <img src="images/logo.png" />
                        <h2>注册</h2>
						
						<div class="form-group">
							<label for="name" class="sr-only">Name</label>
							<input type="text" class="form-control" id="username" name="username" placeholder="用户名" autocomplete="off">
						</div>
						<div class="form-group">
							<label for="password" class="sr-only">Password</label>
                            <input type="password" class="form-control" id="password" name="password" placeholder="密码" autocomplete="off" onclick="checkUsername()">
						</div>
						<div class="form-group">
							<label for="re-password" class="sr-only">Re-type Password</label>
							<input type="password" class="form-control" id="re-password" placeholder="再次输入密码" autocomplete="off">
						</div>
						
						<div class="form-group">
							<p>已经注册 ? <a href="login.html">登录</a></p>
						</div>
						<div class="form-group">
							<input type="submit" value="注册" class="btn btn-primary" onclick="return check()">
						</div>
					</form>
					<!-- END Sign In Form -->


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


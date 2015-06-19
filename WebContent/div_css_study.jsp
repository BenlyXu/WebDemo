<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>DIV &amp; CSS Study Page</title>
	<link type="text/css" rel="stylesheet" href="css/smoothness/jquery-ui-1.10.4.custom.min.css" />
	<link type="text/css" rel="stylesheet" href="css/common.css" />
	<script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
	<script type="text/javascript" src="js/jquery-ui-1.10.4.custom.min.js"></script>
</head>
<body>
	<div id="header">
		<a href="#" id="sign_up"><button class="button">注册</button></a>
		<a href="#" id="sign_in"><button class="button">登录</button></a>
		<a href="index.jsp"><img id="logo" src="img/logo.png" alt="logo"/></a>
	</div>
	<div id="main_content">
		<div id="side">left side</div>
		<div id="side_r">right side</div>
		<div id="main">
			<div id="img00"><img src="http://www.aa25.cn/uploadfile/taobao0903/20090212165039036721.gif" width="192" height="142" /></div>
			<div id="img00_desc">标准之路[www.aa25.cn]提供DIV+CSS教程,DIV+CSS视频教程,web2.0标准,DIV+CSS布局入门教程,网页布局实例,css布局实例,div+css模板,div+css实例解析,网站重构，网页代码,水晶图标,幻灯广告图片.教程适合初学者循序渐进学习!</div>
		</div>
	</div>
	<div id="footer">
		<div id="company">畅游天下</div>
		<div id="date_time">Where is time?</div>
	</div>
	
	<script type="text/javascript">
		$(function() {
			$(".button").button();
			
			setInterval(function() {
				var dateTime = new Date().toLocaleString();
				$('#date_time').html(dateTime);
			}, 1000);
		});
	</script>
</body>
</html>
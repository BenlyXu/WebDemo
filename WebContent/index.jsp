<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>首页</title>
	<link type="text/css" rel="stylesheet" href="css/smoothness/jquery-ui-1.10.4.custom.min.css" />
	<script type="text/javascript" src="js/jquery-1.10.2.min.js"></script>
	<script type="text/javascript" src="js/jquery-ui-1.10.4.custom.min.js"></script>
</head>
<body>
	<!-- Accordion -->
	<h2 class="demoHeaders">Accordion</h2>
	<div id="accordion">
		<h3>First</h3>
		<div>Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet. Lorem ipsum dolor sit amet.</div>
		<h3>Second</h3>
		<div>Phasellus mattis tincidunt nibh.</div>
		<h3>Third</h3>
		<div>Nam dui erat, auctor a, dignissim quis.</div>
	</div>
	
	<!-- Button -->
	<h2 class="demoHeaders">Button</h2>
	<button id="button">A button element</button>
	<form style="margin-top: 1em;">
		<div id="radioset">
			<input type="radio" id="radio1" name="radio"><label for="radio1">Choice 1</label>
			<input type="radio" id="radio2" name="radio" checked="checked"><label for="radio2">Choice 2</label>
			<input type="radio" id="radio3" name="radio"><label for="radio3">Choice 3</label>
		</div>
	</form>
	
	<a href="UserServlett?name=admin">Login</a>
	
	<script type="text/javascript">
		var msg = '${msg}';
		if(msg != '') {
			alert(msg);
		}
		
		$( "#accordion" ).accordion();
		
		$( "#button" ).button();
		$( "#radioset" ).buttonset();
	</script>
</body>
</html>
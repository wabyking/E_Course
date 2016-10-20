
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html lang="en"  xmlns="http://www.w3.org/1999/xhtml">
<head>
	<meta charset="utf-8">
	<title>jQuery UI Dialog - Modal form</title>
	<link rel="stylesheet" href="css/jquery.ui.all.css"/>
        
	<script src="js/jquery-1.10.2.js"></script>
	<script src="js/jquery.ui.core.js"></script>
	<script src="js/jquery.ui.widget.js"></script>
	<script src="js/jquery.ui.mouse.js"></script>
	<script src="js/jquery.ui.button.js"></script>
	<script src="js/jquery.ui.draggable.js"></script>
	<script src="js/jquery.ui.position.js"></script>
	<script src="js/jquery.ui.resizable.js"></script>
	<script src="js/jquery.ui.button.js"></script>
	<script src="js/jquery.ui.dialog.js"></script>
	<script src="js/jquery.ui.effect.js"></script>
	<link rel="stylesheet" href="css/demos.css"/>
        
        <link rel="stylesheet" type="text/css" href="css/style.css">
<!--        <script type="text/javascript" src="js/jquery.js" ></script>-->
<!--        <script type="text/javascript" src="js/jquery.validate.js" ></script>-->
<!--        <script type="text/javascript" src="js/login.js" ></script>-->
        
        
	<style>
		body { font-size: 62.5%; }
		label, input { display:block; }
		input.text { margin-bottom:12px; width:95%; padding: .4em; }
		fieldset { padding:0; border:0; margin-top:25px; }
		h1 { font-size: 1.2em; margin: .6em 0; }
		.ui-dialog .ui-state-error { padding: .3em; }
		.validateTips { border: 1px solid transparent; padding: 0.3em; }
	</style>
	<script>
            
	$(function() {
//            $( "#dialog-form" ).hide();
		var username = $( "#username" ),
			code = $( "#code" ),
			password = $( "#password" ),
			allFields = $( [] ).add( username ).add( password ).add( code ),
			tips = $( ".validateTips" );

		
                        
		$( "#dialog-form" ).dialog({
			autoOpen: false,
			height: 320,
			width: 350,
			modal: true,
			buttons: {
				"登陆": function() {
					//var bValid = true;
					allFields.removeClass( "ui-state-error" );
						$("#login").append("<p>"+username.val()+"登陆中。。。</p>"
							);
                                                $("logindiv").submit();
                                                //window.location="login/loginCheck";
						$( this ).dialog( "close" );
                                                $("#loginbutton").hide();
					
				},
				"注册": function() {
					$( this ).dialog( "close" );
				}
			},
			close: function() {
				allFields.val( "" ).removeClass( "ui-state-error" );
			}
		});

		$( "#loginbutton" )
			.button()
			.click(function() {
//                             $( "#dialog-form" ).show();
				$( "#dialog-form" ).dialog( "open" );
			});
	});
	</script>
</head>
<body>

<div id="dialog-form" title="欢迎登陆">
	<form id="logindiv" action="<%= request.getContextPath()%>/login/ImageServlet" method="post">
	<fieldset>
		<label for="username">用户名</label>
		<input type="text" name="username" id="username" class="text ui-widget-content ui-corner-all" />
		<label for="password">密码</label>
		<input type="password" name="password" id="password" value="" class="text ui-widget-content ui-corner-all" />
		<label for="randomCode">验证码</label>
		<input type="text" name="randomCode" id="randomCode" value="" class="text ui-widget-content ui-corner-all" />
                <img title="看不清，换一个" onclick="javascript:window.top.location.reload()" name="randomCodeImage"  id="randomCodeImage" src="<%= request.getContextPath()%>/login/ImageServlet"/>
	</fieldset>
	</form>
</div>

<button id="loginbutton">登陆()</button>

<div id="login">

</div>

</body>
</html>

<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
  <head>  
    <title>login starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is login page">
	
	<link rel="css/layout.css" type="text/css" href="styles.css">
  </head>
  
  <body>
  	<s:if test="#session.user == 'admin'">
	欢迎你，${sessionScope.user}，你已经成功登陆！
 	欢迎你，${sessionScope.user}，你已经成功登陆！
  		<s:form action="logout" namespace="/">
  			<s:submit value="注销"></s:submit>
  		</s:form>
  	</s:if>
  	<s:else>
  	你还没有登陆！
  		<s:form action="login" namespace="/" method="post">
  			<s:textfield name="username" label="用户名" />
  			<s:password name="password" label="密码" />
  		<s:submit value="登陆"></s:submit>
  		</s:form>
  	</s:else>
  </body>
</html>

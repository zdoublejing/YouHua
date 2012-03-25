<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ taglib uri="/birt.tld" prefix="birt" %>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
  <head>
  	<title>Ê×Ò³</title>
  </head>
  
  <body>
  
  <birt:report id="RealTime"
  	reportDesign="RealTime/Year.rptdesign"
  	scrolling="true"
  	position="relative"
  	width="775"
  	height="900"
  	frameborder="no"
  	format="html"
  	showParameterPage="false"
  	reportContainer="iframe">
  	<birt:param name="OrgId" value='<%=session.getAttribute("orgid")%>'/>
  </birt:report><br><br></body>
  	
</html>
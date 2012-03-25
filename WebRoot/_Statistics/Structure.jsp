<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@ taglib uri="/birt.tld" prefix="birt" %>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
	<head>
  		<title>首页</title>
  		<script type="text/javascript" src="../scripts/My97DatePicker/WdatePicker.js"></script>
  		<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/1.6.2/jquery.min.js"></script>
  	</head>
  
  	<body>
  		<div id="sa_page_main" class="clearfix">
  			<div class="sa-page-left">
    		    
    		</div>
    	
  			<div class="sa-page-right">
  				<div class="sa-site-nav">
  					<span>当前位置 : </span>
  					<a href="../index.jsp">公司主页</a> &gt;&gt; 
  					<a href="../_EnergyReport/OrgBaseInfo.action" title="能耗报表">能耗报表</a>
  				</div>
  				
  				<h2>您所在企业：<%=session.getAttribute("orgname")%>，企业代码：<%=session.getAttribute("orgid")%></h2>
  				<br />		
      		
      			<s:form action="StructureUpdate" namespace="/_Statistics" theme = "simple">
					<s:label>选择需要对比的一级能耗项</s:label>
					<s:select
					label="选择需要对比的一级能耗项" 
					list="structure_fitemtname" 
					name="structure_fitemtname_selected" 
					value="structure_fitemtname_selected" /><br /><br />
					<s:label>填写需要对比的时间段（yyyy-mm-dd）</s:label><br /><br />			
					<s:textfield name="structure_dates_selected"/> 至 <s:textfield name="structure_datee_selected"/>			
					<s:submit value="查询" name="submit"/>
				</s:form>
      			<br /><br />		
  			
  				<div class="page-reports">			
  					<!-- Contrast the first energy item Over The Same Period -->
  					<birt:report id="Contrast"
  							reportDesign="Statistics/ConsumptionStructure.rptdesign"
  							scrolling="true"
  							position="relative"
  							width="775"
  							height="900"
  							frameborder="no"
  							format="html"
  							showParameterPage="false"
  							reportContainer="iframe">
  						<birt:param name="OrgName" value='<%=session.getAttribute("orgname")%>'/>
  						<birt:param name="EnergyFirstItemName" value="${structure_fitemtname_selected}"/>
  						<birt:param name="DateStart" value="${structure_dates_selected}"/>
  						<birt:param name="DateEnd" value="${structure_datee_selected}"/>
  					</birt:report><br />
  					
      			</div></div></div></body>
</html>
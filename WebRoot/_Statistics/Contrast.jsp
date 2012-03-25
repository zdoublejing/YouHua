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
      		
      			<s:form action="ContrastUpdate" namespace="/_Statistics" theme = "simple">
					<s:label>选择需要查询的部门</s:label>
					<s:select
					label="选择需要对比的部门" 
					list="contrast_departname" 
					name="contrast_departname_selected" 
					value="contrast_departname_selected" />&nbsp;
					<s:label>选择需要对比的一级能耗项</s:label>
					<s:select
					label="选择需要对比的一级能耗项" 
					list="contrast_fitemtname" 
					name="contrast_fitemtname_selected" 
					value="contrast_fitemtname_selected" /><br /><br />
					<s:label>填写需要对比的时间段（yyyy-mm-dd）</s:label><br /><br />			
					<s:textfield name="contrast_fdates_selected"/> 至 <s:textfield name="contrast_fdatee_selected"/><br /><br />
					<s:label>选择需要对比的年份</s:label>
					<s:select
					label="选择需要对比的年份 "
					list="contrast_year" 
					name="contrast_year_selected" 
					value="contrast_year_selected" />
					<s:textfield name="contrast_sdates_selected"/> 至 <s:textfield name="contrast_sdatee_selected"/>		
					
					<s:submit value="查询" name="submit"/>
				</s:form>
      			<br /><br />		
  			
  				<div class="page-reports">			
  					<!-- Contrast the first energy item Over The Same Period -->
  					<birt:report id="Contrast"
  							reportDesign="Statistics/ContrastFirstEnergyItem.rptdesign"
  							scrolling="true"
  							position="relative"
  							width="775"
  							height="900"
  							frameborder="no"
  							format="html"
  							showParameterPage="false"
  							reportContainer="iframe">
  						<birt:param name="OrgName" value='<%=session.getAttribute("orgname")%>'/>
  						<birt:param name="DepartName" value="${contrast_departname_selected}"/>
  						<birt:param name="EnergyFirstItemName" value="${contrast_fitemtname_selected}"/>
  						<birt:param name="FirstDateStart" value="${contrast_fdates_selected}"/>
  						<birt:param name="FirstDateEnd" value="${contrast_fdatee_selected}"/>
  						<birt:param name="SecondDateStart" value="${contrast_sdates_selected}"/>
  						<birt:param name="SecondDateEnd" value="${contrast_sdatee_selected}"/>
  					</birt:report><br />
  					
      			</div></div></div></body>
</html>
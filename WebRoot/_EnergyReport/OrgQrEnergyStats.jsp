<%@ page language="java" import="java.util.*" pageEncoding="gb2312"%>
<%@ taglib uri="/birt.tld" prefix="birt" %>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html>
  <head>
    <title>实时监控</title>
  </head>
 
  <body>
  	<div id="er_page_main" class="clearfix">
  	
  	    <div class="er-page-left"> 		    		    
        	<div class="er-left-depinfoaccount" style="cursor:pointer;" onclick="location.href='../_EnergyReport/DepInfoAccount.action'"><h2><span>部门信息台帐</span></h2></div>
        	<div class="er-left-orgqrenergystats" style="cursor:pointer;" onclick="location.href='OrgQrEnergyStats.action'"><h2><span>机构各部门能耗统计</span></h2></div>
        	<div class="er-left-depenergyaccount" style="cursor:pointer;" onclick="location.href='DepEnergyAccount.action'"><h2><span>部门能耗台帐</span></h2></div>
    	</div>
    	    	
    	<div class="er-page-right">
      		<div class="er-site-nav">
      			<span>当前位置 : </span>
      			<a href="../index.jsp">公司主页</a> &gt;&gt; 
      			<a href="../_EnergyReport/OrgBaseInfo.action" title="能耗报表">能耗报表</a>&gt;&gt; 
      			<a href="../_EnergyReport/DepInfoAccount.action" title="各部门">各部门</a>
      		</div>

      		<h2>您所在企业：<%=session.getAttribute("orgname")%>，企业代码：<%=session.getAttribute("orgid")%></h2>
      		<br />		
      		
      		<s:form action="OrgQrEnergyStatsUpdate" namespace="/_EnergyReport" theme = "simple">
      			<label>选择需要查询的年度</label>
				<s:select
				label="选择需要查询的年度" 
				list="orgqrenergystats_recordyear" 
				name="orgqrenergystats_recordyear_selected" 
				value="orgqrenergystats_recordyear_selected" />&nbsp;
				<label>选择需要查询的季度</label>
				<s:select
				label="选择需要查询的季度" 
				list="#{'1':'1', '2':'2', '3':'3', '4':'4'}"
				name="orgqrenergystats_quarter_selected" 
				value="orgqrenergystats_quarter_selected" />&nbsp;
				<s:submit value="查询" name="submit"/>&nbsp;
			</s:form>
      		<br />
      		   		
      		<div class="page-reports">			
      		
      			<!--<h1>机构能耗资源消耗统计部门情况季度（年_月_日）_综1表</h1>  	
  				-->
  				<birt:viewer id="OrgQrEnergyStats"
	    			pattern="frameset"
					reportDesign="OrgQrEnergyStats.rptdesign"
					title="Org Qr Energy Stats"
					scrolling="true"
					position="relative"
					width="775"
					height="800"
					format="html"
					showTitle="true"
					showToolBar="true"
					showNavigationBar="true"
					showParameterPage="false">
					<birt:param name="OrgId" value='<%=session.getAttribute("orgid")%>'/>
					<birt:param name="Year" value="${orgqrenergystats_recordyear_selected}"/>
					<birt:param name="Quarter" value="${orgqrenergystats_quarter_selected}"/>
				</birt:viewer></div>
				
		</div></div></body>
</html>

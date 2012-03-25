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
        	<div class="er-left-info" style="cursor:pointer;" onclick="location.href='../_EnergyReport/OrgBaseInfo.action'"><h2><span>基本信息</span></h2></div>
    		<div class="er-left-infoaccount" style="cursor:pointer;" onclick="location.href='OrgInfoAccount.action'"><h2><span>基本信息台帐</span></h2></div>
    		<div class="er-left-energy" style="cursor:pointer;" onclick="location.href='OrgEnergyItemResult.action'"><h2><span>能耗统计</span></h2></div>
    		<div class="er-left-energyaccount" style="cursor:pointer;" onclick="location.href='OrgEnergyAccount.action'"><h2><span>能耗统计台帐</span></h2></div>		
    	</div>
    	
    	<div class="er-page-right">
      		<div class="er-site-nav">
      			<span>当前位置 : </span>
      			<a href="../index.jsp">公司主页</a> &gt;&gt; 
      			<a href="../_EnergyReport/OrgBaseInfo.action" title="能耗报表">能耗报表</a>&gt;&gt; 
      			<a href="../_EnergyReport/OrgBaseInfo.action" title="总机构">总机构</a>
      		</div>
      		
      		<h2>您所在企业：<%=session.getAttribute("orgname")%>，企业代码：<%=session.getAttribute("orgid")%></h2>
      		<br />		
      		
      		<s:form action="OrgEnergyItemResultUpdate" namespace="/_EnergyReport" theme = "simple">
				<s:label>选择需要查询的年度</s:label>
				<s:select
				label="选择需要查询的年度" 
				list="orgenergyaccount_recordyear" 
				name="orgenergyaccount_recordyear_selected" 
				value="orgenergyaccount_recordyear_selected" />
				<s:submit value="查询" name="submit"/>
			</s:form>
      		<br />
      		   		
      		<div class="page-reports">			    				

			<!--<h1>总机构年度能耗信息统计台帐（台账2表）</h1>
					-->
				<birt:viewer id="OrgEnergyAccount"
	    				pattern="frameset"
						reportDesign="OrgEnergyAccount.rptdesign"
						title="Org Energy Account"
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
					<birt:param name="Year" value="${orgenergyaccount_recordyear_selected}"/>
				</birt:viewer></div>
		
		</div></div></body>
</html>

<%@ page session="true" contentType="text/html; charset=UTF-8" %>
<%@ taglib uri="http://www.tonbeller.com/jpivot" prefix="jp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<%-- 添加代码段获得查询参数  --%>
<%
    String strYear = (String)session.getAttribute("Year");//从Session中获得年份的查询参数
    String strEnergyItem = (String)session.getAttribute("EnergyItem");//从Session中获得能耗项的查询参数
    String strOrgName = (String)session.getAttribute("orgname");//从登陆Session中获得组织机构的查询参数
%>

<%-- jp:mondrianQuery标签设置查询连接和MDX查询  使用StrToMember函数将参数连接进查询语句 --%>
<jp:mondrianQuery id="query01" 
	jdbcDriver="com.mysql.jdbc.Driver" 
	jdbcUrl="jdbc:mysql://192.168.0.100:3307/olap" 
	catalogUri="/WEB-INF/queries/olap.xml"
    jdbcUser="root" jdbcPassword="root" connectionPooling="false">
	select {[Measures].[能耗值]} ON columns,
       {(StrToMember("[机构部门].["||"<%=strOrgName%>"||"]"), StrToMember("[日期].["||"<%=strYear%>"||"]"))} ON rows
	from [Energy]
	where StrToMember("[能耗项].["||"<%=strEnergyItem%>"||"]")
</jp:mondrianQuery>

<%-- 添加代码段remove Session对象中的参数 --%>
<%
    session.removeAttribute("Year");
    session.removeAttribute("EnergyItem");
%>

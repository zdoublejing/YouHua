<%@ page session="true" contentType="text/html; charset=gbk" %>
<%@ taglib uri="http://www.tonbeller.com/jpivot" prefix="jp" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>

<jp:mondrianQuery id="query01" 
	jdbcDriver="com.mysql.jdbc.Driver" 
	jdbcUrl="jdbc:mysql://192.168.0.100:3307/olap" 
	catalogUri="/WEB-INF/queries/olap.xml"
    jdbcUser="root" jdbcPassword="root" connectionPooling="false">
	select {[Measures].[能耗值]} ON columns,
       {([机构部门].[所有机构部门], [日期].[所有日期], [能耗项].[所有能耗项])} ON rows
	from [Energy]
</jp:mondrianQuery>

<c:set var="title01" scope="session">Energy</c:set>

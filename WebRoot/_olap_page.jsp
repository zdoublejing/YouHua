<%@ page session="true" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib uri="http://www.tonbeller.com/jpivot" prefix="jp" %>
<%@ taglib uri="http://www.tonbeller.com/wcf" prefix="wcf" %>
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>
<%@ page import="java.sql.*"%><%--引入java类 --%>
<%@ page import="java.util.*"%><%--引入java类 --%>
<%--

  JPivot / WCF comes with its own "expression language", which simply
  is a path of properties. E.g. #{customer.address.name} is
  translated into:
    session.getAttribute("customer").getAddress().getName()
  WCF uses jakarta commons beanutils to do so, for an exact syntax
  see its documentation.

  With JSP 2.0 you should use <code>#{}</code> notation to define
  expressions for WCF attributes and <code>\${}</code> to define
  JSP EL expressions.

  JSP EL expressions can not be used with WCF tags currently, all
  tag attributes have their <code>rtexprvalue</code> set to false.
  There may be a twin library supporting JSP EL expressions in
  the future (similar to the twin libraries in JSTL, e.g. core
  and core_rt).

  Check out the WCF distribution which contains many examples on
  how to use the WCF tags (like tree, form, table etc).

--%>

<html>
<head>
  <title>Mondrian/JPivot Test Page</title>
  <meta http-equiv="Content-Type" content="text/html; charset=gbk">
  <link rel="stylesheet" type="text/css" href="jpivot/table/mdxtable.css">
  <link rel="stylesheet" type="text/css" href="jpivot/navi/mdxnavi.css">
  <link rel="stylesheet" type="text/css" href="wcf/form/xform.css">
  <link rel="stylesheet" type="text/css" href="wcf/table/xtable.css">
  <link rel="stylesheet" type="text/css" href="wcf/tree/xtree.css">
</head>

<body bgcolor=white>

    <%--添加用户选择查询表单，接收用户查询参数，这里的action跳转到待查询参数的页面  --%>
    <form action="_olap_page.jsp?query=olap" method="post"><br> 
     
    <%-- 查询数据库得到用户选择下拉框的显示列表 并设置默认显示数值  --%>
    <%
    	Class.forName("com.mysql.jdbc.Driver");
    	List<String> yearList = new ArrayList<String>();
        List<String> energyItemList = new ArrayList<String>();
        Class.forName("com.mysql.jdbc.Driver");
    	Connection connection = DriverManager.getConnection("jdbc:mysql://192.168.0.100:3307/olap", "root", "root");
    	Statement statement = connection.createStatement();
    	ResultSet resultSet = statement.executeQuery("select distinct DateYear from Dimen_Date");
    	while(resultSet.next())
    	{
    		yearList.add(resultSet.getString(1));
    	}
    	resultSet.previous();
    	String strDefaultYear = resultSet.getString(1);
    	
    	resultSet = statement.executeQuery("select distinct FirstItemName from Dimen_EnergyItem");
    	while(resultSet.next())
    	{
    		energyItemList.add(resultSet.getString(1));
    	}
    	String strDefaultEnergyItem = "电";
    	connection.close();
    %>
    
    <%-- 添加下拉框选择需要查询的年份  --%>
    <h4>
           选择年份:
    <select id="selectYear" name="selectYear"> 
    <%	
        for(int i = 0;i<yearList.size(); i++){
 	%>
        <option value="<%=yearList.get(i)%>" 
        <%if(request.getParameter("selectYear")==null&&yearList.get(i).equals(strDefaultYear)){%>selected<%}else if(yearList.get(i).equals((String)request.getParameter("selectYear"))){%>selected<%}%>>
        <%=yearList.get(i)%></option>
    <%	
    	}
    %>
    </select>
	
	<%-- 添加下拉框选择需要查询的能耗项  --%>
           选择能耗项:
    <select id="selectEnergyItem" name="selectEnergyItem"> 
    <%
        for(int i = 0;i<energyItemList.size(); i++){
 	%>
        <option value="<%=energyItemList.get(i)%>" 
        <%if(request.getParameter("selectEnergyItem")==null&&energyItemList.get(i).equals(strDefaultEnergyItem)){%>selected<%}else if(energyItemList.get(i).equals(request.getParameter("selectEnergyItem"))){%>selected<%}%>>
        <%=energyItemList.get(i)%></option>
    <%
        }
    %>
    </select>

    <%-- 添加代码段是将查询参数赋值给Session对象 --%>
    <%
    	String strYear = (String)request.getParameter("selectYear");
    	session.setAttribute("Year", strYear);//设置年份查询参数的session值
        if(strYear==null){
        	session.setAttribute("Year", strDefaultYear);//如果年份查询参数为空则使用默认年份
        }
    	
        String strEnergyItem = (String)request.getParameter("selectEnergyItem");
        session.setAttribute("EnergyItem", strEnergyItem);//设置能耗项查询参数的session参数值
        if(strEnergyItem==null){
        	session.setAttribute("EnergyItem", strDefaultEnergyItem);//如果能耗项查询参数为空则使用默认能耗项
        }
    %>
    
    <%-- 提交该表单进行查询  --%>
    <input type="submit" value="查询"></input><br><br>
    </h4>
    </form>
    
    <%-- 以下表单为查询结果显示表单 表单提交跳转页面为本页面 --%>
	<form action="_olap_page.jsp" method="post"> <%--@jean 这里的action 跳转的页面是本身!!!--%>
    <%-- include query and title, so this jsp may be used with different queries --%>
	<wcf:include id="include01" httpParam="query" prefix="/WEB-INF/queries/" suffix=".jsp"/>
	<c:if test="${query01 == null}">
	  <jsp:forward page="/index.jsp"/>
	</c:if>
	
	<%--第一步首先使用jp和wcf标签库来定义需要显示的部分  --%>
	
	<%-- 使用jp和wcf标签库定义表格、图形、导航器和编辑器等 --%>   
	<jp:table id="table01" query="#{query01}"/>
	<jp:navigator id="navi01" query="#{query01}" visible="false"/>
	
	<wcf:form id="mdxedit01" xmlUri="/WEB-INF/jpivot/table/mdxedit.xml" model="#{query01}" visible="false"/>
	<wcf:form id="sortform01" xmlUri="/WEB-INF/jpivot/table/sortform.xml" model="#{table01}" visible="false"/>
	
	<jp:print id="print01"/>
	<wcf:form id="printform01" xmlUri="/WEB-INF/jpivot/print/printpropertiesform.xml" model="#{print01}" visible="false"/>
	
	<jp:chart id="chart01" query="#{query01}" visible="true"/>
	<wcf:form id="chartform01" xmlUri="/WEB-INF/jpivot/chart/chartpropertiesform.xml" model="#{chart01}" visible="false"/>
	<wcf:table id="query01.drillthroughtable" visible="false" selmode="none" editable="true"/>
	
	<%--使用wcf标签库定义工具条 --%>
	<wcf:toolbar id="toolbar01" bundle="com.tonbeller.jpivot.toolbar.resources">
	  <wcf:scriptbutton id="cubeNaviButton" tooltip="toolb.cube" img="cube" model="#{navi01.visible}"/>
	  <wcf:scriptbutton id="mdxEditButton" tooltip="toolb.mdx.edit" img="mdx-edit" model="#{mdxedit01.visible}"/>
	  <wcf:scriptbutton id="sortConfigButton" tooltip="toolb.table.config" img="sort-asc" model="#{sortform01.visible}"/>
	  <wcf:separator/>
	  <wcf:scriptbutton id="levelStyle" tooltip="toolb.level.style" img="level-style" model="#{table01.extensions.axisStyle.levelStyle}"/>
	  <wcf:scriptbutton id="hideSpans" tooltip="toolb.hide.spans" img="hide-spans" model="#{table01.extensions.axisStyle.hideSpans}"/>
	  <wcf:scriptbutton id="propertiesButton" tooltip="toolb.properties"  img="properties" model="#{table01.rowAxisBuilder.axisConfig.propertyConfig.showProperties}"/>
	  <wcf:scriptbutton id="nonEmpty" tooltip="toolb.non.empty" img="non-empty" model="#{table01.extensions.nonEmpty.buttonPressed}"/>
	  <wcf:scriptbutton id="swapAxes" tooltip="toolb.swap.axes"  img="swap-axes" model="#{table01.extensions.swapAxes.buttonPressed}"/>
	  <wcf:separator/>
	  <wcf:scriptbutton model="#{table01.extensions.drillMember.enabled}"	 tooltip="toolb.navi.member" radioGroup="navi" id="drillMember"   img="navi-member"/>
	  <wcf:scriptbutton model="#{table01.extensions.drillPosition.enabled}" tooltip="toolb.navi.position" radioGroup="navi" id="drillPosition" img="navi-position"/>
	  <wcf:scriptbutton model="#{table01.extensions.drillReplace.enabled}"	 tooltip="toolb.navi.replace" radioGroup="navi" id="drillReplace"  img="navi-replace"/>
	  <wcf:scriptbutton model="#{table01.extensions.drillThrough.enabled}"  tooltip="toolb.navi.drillthru" id="drillThrough01"  img="navi-through"/>
	  <wcf:separator/>
	  <wcf:scriptbutton id="chartButton01" tooltip="toolb.chart" img="chart" model="#{chart01.visible}"/>
	  <wcf:scriptbutton id="chartPropertiesButton01" tooltip="toolb.chart.config" img="chart-config" model="#{chartform01.visible}"/>
	  <wcf:separator/>
	  <wcf:scriptbutton id="printPropertiesButton01" tooltip="toolb.print.config" img="print-config" model="#{printform01.visible}"/>
	  <wcf:imgbutton id="printpdf" tooltip="toolb.print" img="print" href="./Print?cube=01&type=1"/>
	  <wcf:imgbutton id="printxls" tooltip="toolb.excel" img="excel" href="./Print?cube=01&type=0"/>
	</wcf:toolbar>
	
	<%--第二步所有定义完的标签元素必须由wcf:render标签渲染才会可见    以下为渲染部分 --%>
	<%-- 渲染工具条  --%>  
	<wcf:render ref="toolbar01" xslUri="/WEB-INF/jpivot/toolbar/htoolbar.xsl" xslCache="true"/><br>
	<%-- if there was an overflow, show error message --%>
	<c:if test="${query01.result.overflowOccured}">
	  <strong style="color:red">Resultset overflow occured</strong>
	</c:if>
	
	<%-- 渲染图形 --%>
	<wcf:render ref="chart01" xslUri="/WEB-INF/jpivot/chart/chart.xsl" xslCache="true"/><br>
	
	<%-- 渲染导航器 --%>
	<wcf:render ref="navi01" xslUri="/WEB-INF/jpivot/navi/navigator.xsl" xslCache="true"/>
	
	<%-- 渲染MDX编辑器 --%>
	<c:if test="${mdxedit01.visible}">
	  <h3>MDX Query Editor</h3>
	  <wcf:render ref="mdxedit01" xslUri="/WEB-INF/wcf/wcf.xsl" xslCache="true"/>
	</c:if>
	
	<%-- render sort properties --%>
	<wcf:render ref="sortform01" xslUri="/WEB-INF/wcf/wcf.xsl" xslCache="true"/>
	
	<%-- render chartform properties --%>
	<wcf:render ref="chartform01" xslUri="/WEB-INF/wcf/wcf.xsl" xslCache="true"/>
	
	<%-- render printform print properties --%>
	<wcf:render ref="printform01" xslUri="/WEB-INF/wcf/wcf.xsl" xslCache="true"/>
	
	<%-- 渲染表格 --%>
	<br>
	<wcf:render ref="table01" xslUri="/WEB-INF/jpivot/table/mdxtable.xsl" xslCache="true"/>
	
	<%--Slicer:
	<wcf:render ref="table01" xslUri="/WEB-INF/jpivot/table/mdxslicer.xsl" xslCache="true"/>--%>
	
	<%-- render drill through table --%>
	<wcf:render ref="query01.drillthroughtable" xslUri="/WEB-INF/wcf/wcf.xsl" xslCache="true"/>	
	
	<%--<a href="index.jsp">back to index</a>--%>
	</form>
</body>
</html>

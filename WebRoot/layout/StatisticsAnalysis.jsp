<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<decorator:head />
	  
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
	<title>
		<decorator:title default="珠海优华" />
	</title>
	<meta name="robots" content="all" />
	<meta name="keywords" content="节能、能耗统计、企业能耗管理" />
	<meta name="description" content="珠海优华节能有限公司" />
	<link rel="Shortcut Icon" href="/favicon.ico" type="image/x-icon" />
	<link rel="Bookmark" href="/favicon.ico" type="image/x-icon" />
	<link href="../css/reset.css" rel="stylesheet" type="text/css" />
	<link href="../css/webmain.css" rel="stylesheet" type="text/css" />
	<link href="../css/ddsmoothmenu.css" rel="stylesheet" type="text/css" />
	<link href="../css/layout.css" rel="stylesheet" type="text/css" />
	<script type="text/javascript" src="../scripts/jquery-1.4.2.min.js"></script>
	<script type="text/javascript" src="../scripts/jquery.KinSlideshow-1.2.1.js"></script>
	<script type="text/javascript" src="../scripts/webtry_roll.js"></script>
	<script type="text/javascript" src="../scripts/ddsmoothmenu.js"></script>
	<script type="text/javascript">
	ddsmoothmenu.init({
		mainmenuid: "MainMenu", //menu DIV id
		orientation: 'h', //Horizontal or vertical menu: Set to "h" or "v"
		classname: 'ddsmoothmenu', //class added to menu's outer DIV
		//customtheme: ["#1c5a80", "#18374a"],
		contentsource: "markup" //"markup" or ["container_id", "path_to_menu_file"]
	})
	</script>
</head>

<body>
	<div id="wrapper">
		<div class="top">
    		<img src="../images/logo.gif" width="650" height="90" alt="珠海优华节能有限公司" /> 	
  			<div id="user">
  				<a href="javascript:if(confirm('是否退出登录。')){location.href='../logout.action'}">
  				欢迎你！来自${sessionScope.orgname}的${sessionScope.username},您的公司代码为${sessionScope.orgid}.退出请点击.</a>			
  			</div>
  		</div>
  		
  		<div id="MainMenu" class="ddsmoothmenu">
  			<ul>
      			<li><a href="../index.jsp" title="公司主页"><span>公司主页</span></a></li>
	  			<li><a href="###" title="实时监测"><span>实时监测</span></a>
	  				<ul class="menulevel">
	  				<li><a href="../_RealTime/Day.jsp" title="实时能耗">实时能耗</a></li>
	  				<li><a href="###" title="实时参数">实时参数</a></li></ul></li>
	  			<li><a href="###" title="设备管理"><span>设备管理</span></a></li>
	  			<li><a href="../_EnergyReport/OrgBaseInfo.action" title="能耗报表"><span>能耗报表</span></a>
	  				<ul class="menulevel">
	  				<li><a href="../_EnergyReport/OrgBaseInfo.action" title="总机构">总机构</a></li>
	  				<li><a href="../_EnergyReport/DepInfoAccount.action" title="各部门">各部门</a></li></ul></li>
	  			<li><a href="###" title="统计分析" id="menu_selected"><span>统计分析</span></a>
	  				<ul class="menulevel">
	  				<li><a href="../_Statistics/Contrast.action" title="同期对比">同期对比</a></li>
	  				<li><a href="../_Statistics/Structure.action" title="消费结构">消费结构</a></li>
	  				<li><a href="###" title="标杆对比">标杆对比</a></li>
	  				<li><a href="###" title="能耗分析">能耗分析</a></li></ul></li>
	  			<li><a href="../_olap_page.jsp?query=olap" title="OLAP"><span>联机分析</span></a>
	  				<ul class="menulevel">
	  				<li><a href="../_olap_page.jsp?query=olap" title="Olap">Energy OLAP</a></li>
	  				</ul></li>
	  			<li><a href="###" title="警报管理"><span>警报管理</span></a></li>
	  			<li><a href="###" title="关于我们"><span>关于我们</span></a>
	  				<ul class="menulevel">
	  		 		<li><a href="###" title="组织构架">组织构架</a></li>
	  		 		<li><a href="###" title="公司历史">公司历史</a></li>
	  		 		<li><a href="###" title="联系我们">联系我们</a></li></ul></li>
    		</ul>
  		</div>
  		
  		<decorator:body />

  		<div id="copyright"> Copyright &copy;2004-2011&nbsp;<a href="###" title="珠海优华">珠海优华节能有限公司</a> All Rights Reserved.<br />
    		<span>地址: </span>珠海XXX　<span>邮编: </span>200000　<span>联系人: </span>XXX<br />
   	 		<span>电话: </span>021-58888888　<span>传真: </span>021-58888888　<span>手机: </span>13888888888<br />
    		<span>邮箱: </span>example@example.com
  		</div>
	
	</div>
	
</body>
</html>
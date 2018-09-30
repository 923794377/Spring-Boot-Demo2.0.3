<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<meta name="viewport" content="width=device-width,initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=no">
	<!--<meta name="viewport" content="target-densitydpi=device-dpi,width=device-width,initial-scale=1.0,minimum-scale=0.1,maximum-scale=1,user-scalable=no" />-->
	<meta http-equiv="X-UA-Compatible" content="IE=7" />
	<link rel="stylesheet" href="/css/about.css" />

	<script type="text/javascript" src="/js/jquery-2.0.0.min.js"></script>
	<title>关于我们</title>
</head>
<script>
	$(function(){
	    if(getUrlParam("appVersion") != null){
            $("#version").text("当前版本："+getUrlParam("appVersion"));
        }
	});
    /**
     * 获取url中的参数
     * */
    function getUrlParam(name) {
        var reg = new RegExp("(^|&)" + name + "=([^&]*)(&|$)"); //构造一个含有目标参数的正则表达式对象
        var r = window.location.search.substr(1).match(reg);  //匹配目标参数
        if (r != null) return unescape(r[2]); return null; //返回参数值
    }
</script>
<div class="logo">
	<div class="logo-img">
		<img src="/images/login_logo_Image.png" style="width:90px;" />
	</div>
</div>
<div class="line"></div>
<div class="title">
	<p>&nbsp;重庆管家婆房屋托管中心，于2010年5月在重庆南岸注册成立，本着可持续健康发展的经营方针，稳扎稳打形成了以房产托管业务为主，家政服务等服务多业并举的综合型企业。</p>
	<p>&nbsp;管家婆始终以“为客户提供更方便快捷、省事省心、安全保障的服务”为己任，以感恩回报社会为宗旨，在实现公司可持续健康发展的同时，不断为客户、员工和股东创造价值。</p>
</div>
<div class="bottom">

	<p><span style="color:#00000">官网地址：<span style="color:#1285fb;">www.cqgjp.com</p>
	<p><span style="color:#000">联系电话：</span><span style="color:#1285fb;"><a>023-88067511</a></span></p>
	<p id="version">当前版本：${appVersion}${pwd}</p>

</div>
<div class="copyright">
	<p> Copyright © 2010-2017 重庆人人房科技有限公司.All Rights Reserved 渝ICP备18010046号</p>
</div>
<body>
</body>

</html>

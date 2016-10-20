<%-- 
    Document   : introduction_content
    Created on : 2014-9-16, 15:16:59
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head> 
<meta http-equiv="Content-Type" content="text/html; charset=gb2312" /> 
<title>手风琴</title> 
<style> 
*{ padding:0; margin:0; } 
body{ background:#fafafa; font-size:12px; } 
.slider{ line-height:24px; width:700px; color:#7ecef4; margin:10px auto; background:#010e16; } 
.slider dt{ background:#f5f5d2; padding-left:30px; cursor:pointer; overflow:hidden; background:#1b1b1b; border-bottom:1px solid #fff; height:32px; line-height:32px; } 
.slider dt.slider_open{background:#707070; color:red} 
.slider dd{ display:none; background:#f1f1ea; height:90px; background:#111; border-bottom:1px dashed #fafafa; overflow:hidden;} 
.slider dd p{ padding:10px 20px; overflow:hidden; } 
</style> 
<script type="text/javascript" src="http://demo.jb51.net/jslib/jquery/jquery-1.4.2.min.js"></script> 
<script> 
$(function(){ 
//初始化变量 
var flag = 0; 
var $dt = $('.slider dt'); 
var $dd = $('.slider dd'); 
//初始化状态 
$dd.eq(0).show(); 
$dt.eq(0).css('cursor','default'); 
//单击事件 
$dt.click(function(){ 
if($dt.index(this) == flag) return false; 
flag = $dt.index(this); 
$dd.not($dd.eq(flag)).slideUp(); 
$dd.eq(flag).slideDown(); 
$dt.eq(flag).css('cursor','default').addClass('slider_open'); 
$dt.not($dt.eq(flag)).css('cursor','pointer').removeClass('slider_open'); 
}); 
}); 
</script> 
</head> 
<body> 
<dl class="slider"> 
<dt class="slider_open">赵本山，央视春晚</dt> 
<dd><p>央视春晚台柱子赵本山在2011年央视春晚演出后，不得不接受紧急治疗。从个体人性角度祝愿这老爷子健康长寿。但诺将其身体状况作为一种文化隐喻，它却预示着CCTV洗脑愚乐文化正面临无可奈何花落去寿终正襟的命运。</p></dd> 
<dt>支持打拐</dt> 
<dd><p>据媒体报道，全国政协委员濮存昕也表示对打拐的支持。他建议全国公安系统应尽快建立起一支专业的打拐队伍，各地公安机关应当设立专门的打拐机构，配备必要的编制和专项经费。</p></dd> 
<dt>爱的真言</dt> 
<dd><p>我曾经喜欢八八，坚定只有八八才能给川儿幸福、只是最近几集，你让我情何以堪？感动，心疼，纠结，真的是不悲不喜了！现在我的心情。。很难过、不知道应该选择八八还是四四呢？</p></dd> 
<dt>注意保重身体</dt> 
<dd><p>还头痛吗？如果不是生病引起的头痛,我一般会听听音乐,自己喜欢的音乐,用心做自己的事固然是对的,但不要忽略自己的身体。</p></dd> 
</dl> 
如果是通过网页运行代码的，需要刷新下才能看到效果。
</body> 



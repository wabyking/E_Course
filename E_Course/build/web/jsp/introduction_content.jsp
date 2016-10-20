<%-- 
    Document   : vedio
    Created on : 2014-9-14, 9:52:26
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<!-- Gallery Specific Elements -->
<script type="text/javascript" src="../scripts/jquery.js"></script>
<script type="text/javascript">
//$(document).ready(function () {
//    $("a[rel^='prettyPhoto']").prettyPhoto({
//        theme: 'dark_rounded',
//        overlay_gallery: false
//    });
//});
    (document).ready(function() {
        $("ul li").hover(function() {
            $(this).find("ul:first").show();//鼠标滑过查找li下面的第一个ul然后显示； 
        }, function() {
            $(this).find("ul:first").hide();//鼠标离开隐藏li下面d的ul； 
        })
        $("ul li ul li ul").prev().addClass("bbb");//给li下面ul是aaa的样式的前一个同辈元素添加css； 
    })
</script>

<script type="text/javascript" src="scripts/jquery-prettyPhoto.js"></script>

<style text="css/text">
    ul, li{padding:0;margin:0;} 
    ul li{float:left;;margin-right:1px;display:inline;list-style:none;text-align:center;} 
    ul li ul li{float:none;background:#ccc;margin-bottom:1px;display:block;_display:inline;position:relative;} 
    ul li ul{display:none;} 
    ul a{text-decoration:none;width:80px;height:20px;line-height:20px;display:block;background:#bbb;font-size:12px} 
    ul li a:hover{background:#eee;color:#000} 
    ul li ul li .aaa{position:absolute;left:80px;top:0;border-left:1px solid #fff} 
    ul li ul li .aaa li{float:none;} 
    body .bbb{background:#f00;color:#fff} 
</style>

<div class="wrapper row3">
    <div id="container" class="clear">
        <!-- ####################################################################################################### -->



        <!-- <div id="column">-->
        <div  >
            <h2>Secondary Navigation</h2>
            <ul> 
                <li> 
                    <a href="">栏目一</a> 
                    <ul> 
                        <li><a href="">菜单一</a></li> 
                        <li><a href="">菜单一</a></li> 
                        <li><a href="">菜单一</a></li> 
                        <li><a href="">菜单一</a> 
                            <ul class="aaa"> 
                                <li><a href="">菜单三</a></li> 
                                <li><a href="">菜单三</a> 
                                    <ul class="aaa"> 
                                        <li><a href="">菜单三</a></li> 
                                        <li><a href="">菜单三</a></li> 
                                        <li><a href="">菜单三</a> 
                                            <ul class="aaa"> 
                                                <li><a href="">菜单三</a></li> 
                                                <li><a href="">菜单三</a></li> 
                                                <li><a href="">菜单三</a> 
                                                    <ul class="aaa"> 
                                                        <li><a href="">菜单三</a></li> 
                                                        <li><a href="">菜单三</a></li> 
                                                        <li><a href="">菜单三</a></li> 
                                                        <li><a href="">菜单三</a></li> 
                                                    </ul> 
                                                </li> 
                                                <li><a href="">菜单三</a></li> 
                                            </ul> 
                                        </li> 
                                        <li><a href="">菜单三</a></li> 
                                    </ul> 
                                </li> 
                                <li><a href="">菜单三</a></li> 
                                <li><a href="">菜单三</a></li> 
                            </ul> 
                        </li> 
                    </ul> 
                </li> 
                <li> 
                    <a href="">栏目二</a> 
                </li> 
                <li> 
                    <a href="">栏目三</a> 
                    <ul> 
                        <li><a href="">菜单三</a> 
                        </li> 
                        <li><a href="">菜单三</a> 
                            <ul class="aaa"> 
                                <li><a href="">菜单三</a></li> 
                                <li><a href="">菜单三</a> 
                                    <ul class="aaa"> 
                                        <li><a href="">菜单三</a></li> 
                                        <li><a href="">菜单三</a></li> 
                                        <li><a href="">菜单三</a> 
                                            <ul class="aaa"> 
                                                <li><a href="">菜单三</a></li> 
                                                <li><a href="">菜单三</a></li> 
                                                <li><a href="">菜单三</a></li> 
                                                <li><a href="">菜单三</a></li> 
                                            </ul> 
                                        </li> 
                                        <li><a href="">菜单三</a> 
                                            <ul class="aaa"> 
                                                <li><a href="">菜单三</a></li> 
                                                <li><a href="">菜单三</a> 
                                                    <ul class="aaa"> 
                                                        <li><a href="">菜单三</a></li> 
                                                        <li><a href="">菜单三</a></li> 
                                                        <li><a href="">菜单三</a></li> 
                                                        <li><a href="">菜单三</a></li> 
                                                    </ul> 
                                                </li> 
                                                <li><a href="">菜单三</a></li> 
                                                <li><a href="">菜单三</a></li> 
                                            </ul> 
                                        </li> 
                                    </ul> 
                                </li> 
                                <li><a href="">菜单三</a></li> 
                                <li><a href="">菜单三</a></li> 
                            </ul> 
                        </li> 
                        <li><a href="">菜单三</a></li> 
                        <li><a href="">菜单三</a></li> 
                    </ul> 
                </li> 
                <li> 
                    <a href="">栏目四</a> 
                </li> 
            </ul> 
        </div>

   
</div>
<%-- 
    Document   : vedio
    Created on : 2014-9-14, 9:52:26
    Author     : Administrator
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<link rel="stylesheet" href="../styles/layout.css" type="text/css" />
<!-- Gallery Specific Elements -->
<script type="text/javascript" src="../scripts/jquery-1.4.1.min.js"></script>
<script type="text/javascript">
$(document).ready(function () {
    $("a[rel^='prettyPhoto']").prettyPhoto({
        theme: 'dark_rounded',
        overlay_gallery: false
    });
});
</script>
<link rel="stylesheet" href="styles/prettyPhoto.css" type="text/css" />
<script type="text/javascript" src="scripts/jquery-prettyPhoto.js"></script>



<div class="wrapper row3">
  <div id="container" class="clear">
    <!-- ####################################################################################################### -->
    
    
    
<!-- <div id="column">-->
      <div class="subnav" style="width: 250px ;float:left">
        <h2>Secondary Navigation</h2>
        <ul>
          <li><a href="#">Free Website Templates</a></li>
          <li><a href="#">Free CSS Templates</a>
            <ul>
              <li><a href="#">Free XHTML Templates</a></li>
              <li><a href="#">Free Web Templates</a></li>
            </ul>
          </li>
          <li><a href="#">Free Website Layouts</a>
            <ul>
              <li><a href="#">Free Website Software</a></li>
              <li><a href="#">Free Webdesign Templates</a>
                <ul>
                  <li><a href="#">Free FireWorks Templates</a></li>
                  <li><a href="#">Free PNG Templates</a></li>
                </ul>
              </li>
            </ul>
          </li>
          <li><a href="#">Free Website Themes</a></li>
        </ul>
      </div>
      
    <div style="width: 650px;float:right">
    <div id="gallery" class="clear"  >
      <h2 class="title">Latest Images From The University</h2>
      <ul>
        
        <li><a href="images/demo/450x380.gif" rel="prettyPhoto[gallery1]" title="Image 3"><img src="images/demo/130x130.gif" alt="" /></a></li>
        <li><a href="images/demo/450x380.gif" rel="prettyPhoto[gallery1]" title="Image 4"><img src="images/demo/130x130.gif" alt="" /></a></li>
        <li><a href="images/demo/450x380.gif" rel="prettyPhoto[gallery1]" title="Image 5"><img src="images/demo/130x130.gif" alt="" /></a></li>
        <li class="last"><a href="images/demo/450x380.gif" rel="prettyPhoto[gallery1]" title="Image 6"><img src="images/demo/130x130.gif" alt="" /></a></li>
        
        <li><a href="images/demo/450x380.gif" rel="prettyPhoto[gallery1]" title="Image 9"><img src="images/demo/130x130.gif" alt="" /></a></li>
        <li><a href="images/demo/450x380.gif" rel="prettyPhoto[gallery1]" title="Image 10"><img src="images/demo/130x130.gif" alt="" /></a></li>
        <li><a href="images/demo/450x380.gif" rel="prettyPhoto[gallery1]" title="Image 11"><img src="images/demo/130x130.gif" alt="" /></a></li>
        <li class="last"><a href="images/demo/450x380.gif" rel="prettyPhoto[gallery1]" title="Image 12"><img src="images/demo/130x130.gif" alt="" /></a></li>
      
        <li><a href="images/demo/450x380.gif" rel="prettyPhoto[gallery1]" title="Image 15"><img src="images/demo/130x130.gif" alt="" /></a></li>
        <li><a href="images/demo/450x380.gif" rel="prettyPhoto[gallery1]" title="Image 16"><img src="images/demo/130x130.gif" alt="" /></a></li>
        <li><a href="images/demo/450x380.gif" rel="prettyPhoto[gallery1]" title="Image 17"><img src="images/demo/130x130.gif" alt="" /></a></li>
        <li class="last"><a href="images/demo/450x380.gif" rel="prettyPhoto[gallery1]" title="Image 18"><img src="images/demo/130x130.gif" alt="" /></a></li>
      </ul>
    </div>
    <!-- ####################################################################################################### -->
    <div class="pagination">
      <ul>
        <li class="prev"><a href="#">&laquo; Previous</a></li>
        <li><a href="#">1</a></li>
        <li><a href="#">2</a></li>
        <li class="splitter">&hellip;</li>
        <li><a href="#">6</a></li>
        <li class="current">7</li>
        <li><a href="#">8</a></li>
        <li><a href="#">9</a></li>
        <li class="splitter">&hellip;</li>
        <li><a href="#">14</a></li>
        <li><a href="#">15</a></li>
        <li class="next"><a href="#">Next &raquo;</a></li>
      </ul>
    </div>
    <!-- ####################################################################################################### -->
    </div>
</div>
</div>
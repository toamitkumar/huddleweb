<!doctype html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="com.example.model.Theme"%>

<html>
<head>
    <meta charset="utf-8">
    <title>Huddle Agile Workshop</title>

    <meta content="IE=edge,chrome=1" http-equiv="X-UA-Compatible">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <link href="http://twitter.github.com/bootstrap/assets/css/bootstrap.css" rel="stylesheet">
    <link href="http://twitter.github.com/bootstrap/assets/css/bootstrap-responsive.css" rel="stylesheet">
</head>

<body>
<div class="navbar navbar-fixed-top">
    <div class="navbar-inner">
        <div class="container">
            <a href="/" class="brand">Agile Workshop</a>
        </div>
    </div>
</div>

<div class="container" style="margin-top: 100px;">
    <div class="row">
    		<div class="span8 offset2 page-header">
    			<h1>Theme <small><%=((Theme) request.getAttribute("theme")).getName()%></small></h1>
    		</div>
    		<div class="span8 offset2">
    			<h2>Question</h2>
    			<p><%=((Theme) request.getAttribute("theme")).getQuestion()%></p>
    		</div>
    		
        <div class="span8 offset2">
        	<ul class="thumbnails">
        		<li class="span3">
          		<div class="thumbnail">
            		<a href="#" class="thumbnail"><img src="../images/11.jpg" height="260" width="260" /></a>
            		<div class="caption">
              		<p><a href="#" class="btn btn-primary">Select</a></p>
            		</div>
          		</div>
        		</li>
        		<li class="span3">
          		<div class="thumbnail">
            		<a href="#" class="thumbnail"><img src="../images/10.jpg" height="260" width="260" /></a>
            		<div class="caption">
              		<p><a href="#" class="btn btn-primary">Select</a></p>
            		</div>
          		</div>
        		</li>
      		</ul>
			</div>
			<div class="span8 offset4"><span class="label">Round 1 of 10</span></div>
    </div>
</div>

</body>
</html>
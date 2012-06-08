<!doctype html>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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

<div class="container" style="margin-top: 200px;">
    <div class="row">
        <div class="span8 offset2">
            <c:if  test="${!empty themeList}">
                <h3>Select a Theme</h3>
                <table class="table table-bordered table-striped">
                    <tbody>
                    <c:forEach items="${themeList}" var="theme">
                        <tr>
                            <td><a href="/theme/question?theme=${theme.id}">${theme.name}</a></td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </c:if>
        </div>
    </div>
</div>

</body>
</html>
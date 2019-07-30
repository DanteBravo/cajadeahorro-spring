<!DOCTYPE html>
<html lang="en">
<head>
    <title>Hello</title>
</head>
<body>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:forEach items="${credits}" var="credit">
    ${credit.getGroup().getDescription()}
</c:forEach>
</body>
</html>
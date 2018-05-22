<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!
</h1>

<P>  The time on the server is ${serverTime}. </P>

<%-- メッセージ領域 --%>
			<div class="row">
				<div class="col-md-offset-1 col-md-10"><%@include
					file="/WEB-INF/fragment/messages.jspf"%></div>
			</div>

</body>
</html>

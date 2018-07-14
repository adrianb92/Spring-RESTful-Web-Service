<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Index Page</title>
	</head>
	<body>
		<h2>Spring REST Demo</h2>
		<hr>
		<p>
			<a href="${ pageContext.request.contextPath }/test/hello">Hello</a>
		</p>
		<p>
			<a href="${ pageContext.request.contextPath }/api/students">Get students list</a>
		</p>
	</body>
</html>
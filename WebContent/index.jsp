<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>자바 리소스 서버</title>
</head>
<body>
<%
// 자바 소스 코드를 작성 - 자바에서 사용하는 주석
System.out.println("여기는 스크립트 릿입니다. 자바 소스코드 작성 가능!");
// 사용자가 생성한 클래스도 JSP 파일에서 실행 가능.
HelloWorld Hello = new HelloWorld("박규영", "안녕하세요!");
hello.say.Hello();
%>

<!--  이것은 HTML에서 사용하는 주석 -->
<h1>리소스 서버 페이지</h1>
<h3>박규영의 홈페이지입니다!</h3>
<p>
링크 : <a href="home.jsp">home page</a>
</p>

</body>
</html>
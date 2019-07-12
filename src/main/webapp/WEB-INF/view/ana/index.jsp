<%@ taglib prefix="s" uri="/struts-tags"%>
<%@page contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<html>
	<body>
		<h1>HOŞGELDİNİZ</h1>
		<% out.print("Struts` a Hoşgeldiniz ");%> <s:property value="duser.name"/>
			<a href="jpa">issdeneme</a>
	</body>
</html>

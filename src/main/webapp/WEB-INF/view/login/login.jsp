<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
	<title>Giriş</title>
	</head>
	<body>
		<h1>Stargate Inc</h1>
		<s:form action="ana/index">
			<s:textfield name="duser.name" label="Kullanıcı adı"/>
			<s:textfield name="duser.password" label="Şifre"/>
				<s:textfield name="kapc" label="kontrol"/>
			<s:submit value="Giriş"/>
		</s:form>
	</body>
<html>


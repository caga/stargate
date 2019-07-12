<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ page language="java" contentType="text/html" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
	<head>
	<title>JPA DENEME</title>
	</head>
	<body>
		<h1>Stargate Inc</h1>
		<s:form action="ana/kayit">
			<s:textfield name="kisi.firstName" label="Adı"/>
			<s:textfield name="kisi.lastName" label="Soyad"/>
			<s:submit value="Kayıt"/>
		</s:form>
	</body>
<html>


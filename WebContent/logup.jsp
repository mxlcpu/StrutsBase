<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>注册</title>
</head>
<body>
	<s:form action="/upld/photoup" method="post" enctype="multipart/form-data">
		<s:file name="photo" label="选择头像"></s:file>
		<s:submit value="提交"></s:submit>
	</s:form>
	<s:actionerror/>
	<s:property value="'abcde'"/>
	<hr>
	<s:property value="@java.lang.Integer@MAX_VALUE"/>
	<hr>
	<s:property value="@java.lang.Math@random()"/>
	<hr>
	<s:radio list="{'男','女'}" name="gender"></s:radio>
	<hr>
	<s:radio list="#{'m':'男','f':'女'}" name="gender"></s:radio>
</body>
</html>
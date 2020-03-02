<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>new product</title>
</head>
<body>
<form action="/hibenateEx1/add" method="post">
<div>
<label>product name</label>
<input type="text" name="name" placeholder="introduce product's name">
</div>
<div>
<label> Description of the product</label>
<textarea name="description" placeholder="introduce production's despription"></textarea>
</div>
<div>
<input type="submit" value="enter the product">
</div>
</form>
</body>
</html>
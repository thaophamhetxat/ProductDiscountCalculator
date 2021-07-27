<%--
  Created by IntelliJ IDEA.
  User: ThaoLan
  Date: 07/27/2021
  Time: 10:48 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>

</head>
<body>
<h2>Product Discount Calculator</h2>
<form ACTION="/index" method="post">
    <label>Product Description</label><BR>
    <input type="text" name="txtProduct" placeholder="Mô tả của sản phẩm"/><br>
    <label>List Price</label><BR>
    <input type="text" name="txtPrice" placeholder="Giá niêm yết của sản phẩm"/><br>
    <input type="text" name="txtPercent" placeholder="Tỷ lệ chiết khấu (phần trăm)"/><br><br>
    <input type="submit" id="submit" name="Submit">
</form>
</body>
</html>

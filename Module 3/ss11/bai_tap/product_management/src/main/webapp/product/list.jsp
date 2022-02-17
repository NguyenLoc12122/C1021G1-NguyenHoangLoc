<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2/15/2022
  Time: 4:17 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Product List</title>
</head>
<body>
<h1 style="text-align: center">Product</h1>
<p style="text-align: center">
    <a href="/product?action=create">Create new Product</a>
</p>

<p style="text-align: center">
<td><a href="/product?action=seach&nameProduct=${products.getNameProduct()}">Search</a></td>
</p>
<table border="1" style="margin: auto">
    <tr>
        <th>Id</th>
        <th>NameProduct</th>
        <th>Price</th>
        <th>Quality</th>
    </tr>

    <c:forEach var="products" items='${requestScope["product"]}'>
        <tr>
            <td>${products.getId()}</td>
            <td><a href="/product?action=view&id=${products.getId()}">${products.getNameProduct()}</a></td>
            <td>${products.getPrice()}</td>
            <td>${products.getQuality()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

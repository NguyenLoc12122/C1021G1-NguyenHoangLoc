<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 1/26/2022
  Time: 8:09 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
    <link rel="stylesheet" type="text/css" href="css/style.css">
  </head>
  <body>
  <h1> Product Discount Calculator</h1>
  <form action="/DiscountServlet" method="post">
    <input type="text" name="Product Description" placeholder="Mô tả Sản phẩm " />
    <input type="text" name="List Price" placeholder="Giá niêm yết " />
    <input type="text" name="Discount Percent" placeholder="Tỷ lệ phần trăm " />
    <input type = "submit" id = "submit" value = "Discount"/>
  </form>
  </body>
</html>

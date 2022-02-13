<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2/13/2022
  Time: 4:35 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<table border="1px solid black" >
    <th colspan="4">Danh sách khách hàng</th>
    <tr>
        <td><b>Tên</b></td>
        <td><b>Ngày sinh</b></td>
        <td><b>Địa chỉ</b></td>
        <td><b>Hình ảnh</b></td>
    </tr>

    <c:forEach items="${customers}" var="dataCustomers">
        <tr>
            <td><c:out value = "${dataCustomers.name}"></c:out></td>
            <td><c:out value = "${dataCustomers.dateOfBirth}"></c:out></td>
            <td><c:out value = "${dataCustomers.address}"></c:out></td>
            <td><img src="${dataCustomers.photo}" style="height: 40px" width="40px"></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

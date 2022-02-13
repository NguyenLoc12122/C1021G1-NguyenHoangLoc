<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2/13/2022
  Time: 4:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <form action="/calculator" method="post">

    <h2>Calculator</h2>
    <table>
      <tr>
        <td><label>First operand :</label></td>
        <td><input type="text" name="firstOperand" placeholder="Enter number"></td>
      </tr>
      <tr>
        <td><label>Operator :</label></td>
        <td><select name="operator" id="operator">
          <option value="+">+</option>
          <option value="-">-</option>
          <option value="*">*</option>
          <option value="/">/</option>
          <option value="%">%</option>
        </select></td>
      </tr>
      <tr>
        <td><label>Second operand :</label></td>
        <td><input type="text" name="secondOperand" placeholder="Enter number"></td>
      </tr>
      <tr>
        <td><input type="submit" id="submit" value="Calculate"></td>
      </tr>
    </table>
  </form>
  </body>
</html>

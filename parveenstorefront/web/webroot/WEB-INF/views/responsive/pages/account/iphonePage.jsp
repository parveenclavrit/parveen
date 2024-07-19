
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>



<style type="text/css" >
.table, th, td {
  border:1px solid black;
}
</style>

<h2 style = "margin-left: 42%;"> Iphone table</h2>

<table style="width:80%; margin-top: 30px; margin-left: 90px; ">
  <tr style = "background-color:#24aee4; color: white ;" >
    <th>Mobile Name</th>
    <th>Price</th>
    <th>Color</th>
    <th>Model</th>
  </tr>
  <c:forEach items = "${iphoneTableDetails }" var= "iphoneTableDetail"  >
  <tr>
    <td> ${fn:escapeXml(iphoneTableDetail.name)}</td>
    <td> ${fn:escapeXml(iphoneTableDetail.price)}</td>
    <td> ${fn:escapeXml(iphoneTableDetail.color)}</td>
    <td> ${fn:escapeXml(iphoneTableDetail.model)}</td>
  </tr>
  </c:forEach>
</table>


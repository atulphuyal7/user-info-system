<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>User List</title>
<%@ include file="header.jsp"%>
</head>
<body>
     <div>
       <header>
        <h1>User List</h1>
     </header>
   </div>
   <c:if test="${!empty user}">
    <div>
      <table>
         <thead>
             <tr>
               <th>SN</th>
               <th>Id</th>
               <th>Username</th>
               <th>Password</th>
               <th>Gender</th>
               <th>Email</th>
               <th>Hobbies</th>
               <th>Nationality</th>
               <th>DOB</th>       
                </tr>
             </thead>
            <tbody>
            <c:forEach items="${user}" var="user" varStatus="i">
            <tr>
            <td>${i.count}</td>
            <td>${user.id}</td>
            <td>${user.username}</td>
            <td>${user.password}</td>
            <td>${user.gender}</td>
            <td>${user.email}</td>
            <td>${user.hobbies}</td>
            <td>${user.nationality}</td>
            <td>${user.dob}</td>
            </tr>
            </c:forEach>
            </tbody>
          </table>
         </div>
         <%
         int a = 6;
         int b = 7;
         int sum = a+b;
         out.println("sum is: "+sum);
          %>
          
          int a = 6; int b = 7; sum = a + b; out.println("sum is: " + sum);
          </c:if>
</body>
</html>
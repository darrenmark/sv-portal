<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<body>
<h2>Login</h2>
<form:form commandName="user"  action="../login" >
   <table>
       <tr>
           <td>User Id</td>
           <td><form:input path="loginId" /></td>
       </tr>
       <tr>
           <td>Password</td>
           <td><form:input path="password" /></td>
       </tr>
       <tr>
           <td></td>
           <td>
               <input type="submit" value="Login"/>
           </td>
       </tr>
   </table>

</form:form>
</body>
</html>

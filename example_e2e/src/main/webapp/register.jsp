<%--
  Created by IntelliJ IDEA.
  User: abhinavpandey
  Date: 27/12/25
  Time: 20:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Register</title>
    <script>
        function validate() {
            if (document.f.username.value === "" ||
                document.f.password.value === "") {
                alert("All fields required");
                return false;
            }
            return true;
        }
    </script>
</head>
<body>

<h2>Register</h2>
<form name="f" action="register" method="post" onsubmit="return validate()">
    <label>Username: <input type="text" name="username"></label><br><br>
    <label>Password: <input type="password" name="password"></label><br><br>
    <input type="submit" value="Register">
</form>

</body>
</html>

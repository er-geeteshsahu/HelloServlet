<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 03-03-2023
  Time: 11:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Jsp</title>

    <!-- Compiled and minified CSS -->
    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/css/materialize.min.css">

    <!-- Compiled and minified JavaScript -->
    <script src="https://cdnjs.cloudflare.com/ajax/libs/materialize/1.0.0/js/materialize.min.js"></script>

</head>
<body>
<div class="container">
    <div class="row">
        <div class="col m6" offset-m3>
            <div class="card">
                <div class="card-container">
                    <h3>Register here!</h3>

                    <div class="form">
                        <!--//creating form-->
                        <form action="Register" method="post" style="align-content: center">
                            <input type="text" name="user_name" placeholder="Enter user name">
                            <input type="password" name="user_password" placeholder="Enter user password">
                            <input type="email" name="user_email" placeholder="Enter user email">

                            <button type="submit" class="btn">Submit</button>
                        </form>
                    </div>
                    <div class="loader">

                    </div>

                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>

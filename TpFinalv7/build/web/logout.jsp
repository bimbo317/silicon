<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Cerrando Session</title>
    </head>
    <body>
        <%
            session.invalidate();
            response.sendRedirect("login.jsp");
            %>
            
    </body>
</html>

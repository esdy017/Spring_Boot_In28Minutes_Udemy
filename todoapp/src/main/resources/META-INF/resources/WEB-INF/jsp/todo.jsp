<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
    <head>
        <link href="webjars/bootstrap/5.3.3/css/bootstrap.min.css" rel="stylesheet" />
        <title>Add a Todo</title>
    </head>
    <body>
        <div class="container">
            <h1>Todo Details</h1>
            <form:form method="post" modelAttribute="todo">
                <label>Description</label>
                <form:input type="text" name="description" path="description" required="required" />
                <form:input type="hidden" path="id" />
                <form:input type="hidden" path="completed" />
                <input type="submit" class="btn btn-success" />
            </form:form>
        </div>
        <script src="webjars/bootstrap/5.3.3/js/bootstrap.min.js" />
        <script src="webjars/jquery/3.7.1/jquery.min.js" />
    </body>
</html>
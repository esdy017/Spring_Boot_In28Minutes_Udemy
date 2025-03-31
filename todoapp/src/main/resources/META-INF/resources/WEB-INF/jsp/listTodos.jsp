<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
    <head>
        <link href="webjars/bootstrap/5.3.3/css/bootstrap.min.css" rel="stylesheet" />
        <title>List of Todos</title>
    </head>
    <body>
        <div class="container">
            <h1>Your Todos</h1>
            <table class="table">
                <thead>
                    <tr>
                        <th>ID</th>
                        <th>Description</th>
                        <th>Target Date</th>
                        <th>IsCompleted?</th>
                        <th>Actions</th>
                    </tr>
                </thead>
                <tbody>
                    <c:forEach items="${todos}" var="todo">
                        <tr>
                            <td>${todo.id}</td>
                            <td>${todo.description}</td>
                            <td>${todo.targetDate}</td>
                            <td>${todo.completed}</td>
                            <td><a href="deleteTodo?id=${todo.id}" class="btn btn-danger">Delete</a></td>
                        </tr>
                    </c:forEach>
                </tbody>
            </table>
            <a href="/addTodo" class="btn btn-success">Add Todo</a>
        </div>
        <script src="webjars/bootstrap/5.3.3/js/bootstrap.min.js" />
        <script src="webjars/jquery/3.7.1/jquery.min.js" />
    </body>
</html>
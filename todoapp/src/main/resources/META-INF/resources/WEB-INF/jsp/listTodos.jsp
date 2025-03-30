<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
    <head>
        <title>List of Todos</title>
    </head>
    <body>
        <div>Welcome, ${name}</div>
        <hr/>
        <h1>Your Todos are:</h1>
        <table>
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Description</th>
                    <th>Target Date</th>
                    <th>IsCompleted?</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach items="${todos}" var="todo">
                    <tr>
                        <td>${todo.id}</td>
                        <td>${todo.description}</td>
                        <td>${todo.targetDate}</td>
                        <td>${todo.completed}</td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </body>
</html>
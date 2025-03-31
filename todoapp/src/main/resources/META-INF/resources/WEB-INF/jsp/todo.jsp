<%@ taglib prefix="c" uri="jakarta.tags.core" %>

<html>
    <head>
        <link href="webjars/bootstrap/5.3.3/css/bootstrap.min.css" rel="stylesheet" />
        <title>Add a Todo</title>
    </head>
    <body>
        <div class="container">
            <h1>Todo Details</h1>
            <form method="post">
                <label>Description</label>
                <input type="text" name="description" />
                <input type="submit" class="btn btn-success" />
            </form>
        </div>
        <script src="webjars/bootstrap/5.3.3/js/bootstrap.min.js" />
        <script src="webjars/jquery/3.7.1/jquery.min.js" />
    </body>
</html>
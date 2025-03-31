<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<html>
    <head>
        <link href="webjars/bootstrap/5.3.3/css/bootstrap.min.css" rel="stylesheet" />
        <link href="webjars/bootstrap-datepicker/1.10.0/css/bootstrap-datepicker.standalone.min.css" rel="stylesheet" >
        <title>Add a Todo</title>
    </head>
    <body>
        <div class="container">
            <h1>Todo Details</h1>
            <form:form method="post" modelAttribute="todo">
                <fieldset class="mb-3">
                    <form:label path="description">Description</form:label>
                    <form:input type="text" name="description" path="description" required="required" />
                    <form:errors path="description" cssClass="text-warning" />
                </fieldset>

                <fieldset class="mb-3">
                    <form:label path="targetDate">Target Date</form:label>
                    <form:input type="text" path="targetDate" required="required"/>
                    <form:errors path="targetDate" cssClass="text-warning"/>
                </fieldset>

                <form:input type="hidden" path="id" />

                <form:input type="hidden" path="completed" />

                <input type="submit" class="btn btn-success" />
            </form:form>
        </div>
        <script src="webjars/jquery/3.7.1/jquery.min.js" />
        <script src="webjars/bootstrap/5.3.3/js/bootstrap.min.js" />
        <script src="webjars/bootstrap-datepicker/1.10.0/js/bootstrap-datepicker.min.js" />
        <script type="text/javascript">
        	$('#targetDate').datepicker({
        	    format: 'yyyy-mm-dd'
        	});
        </script>
    </body>
</html>
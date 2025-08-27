@import org.example.ToDo
@import java.util.List


@param List<ToDo> toDos
@param String countOfActiveToDosDisplay
@param String appliedFilter


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <link rel="stylesheet" href="/webjars/todomvc-app-css/2.4.1/index.css" type="text/css">
    <script src="/webjars/htmx.org/2.0.6/dist/htmx.min.js"></script>
    <title>ToDo-App</title>

</head>

<body>

@template.web.app(toDos = toDos, countOfActiveToDosDisplay = countOfActiveToDosDisplay, appliedFilter = appliedFilter)
</body>

</html>

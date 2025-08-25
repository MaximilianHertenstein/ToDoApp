@import org.example.ToDo
@import org.example.Utils
@import java.util.List


@param List<ToDo> toDos
@param String countOfActiveToDosDisplay
@param String appliedFilter


<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="color-scheme" content="light dark"/>
    <link rel="stylesheet" href="/webjars/todomvc-app-css/2.4.1/index.css" type="text/css">
    <script src="/webjars/htmx.org/2.0.6/dist/htmx.min.js"></script>
    <title>ToDo-App</title>

</head>
<body>


<section class="todoapp">
    <header class="header">
        <h1>todos</h1>

        <form action="/todos/new" method="post">
            <input type="hidden"/>
            <input type="text" class="new-todo" placeholder="What needs to be done?" name="text_of_new_todo"
                   autofocus="${true}">
        </form>
    </header>
    <main>
        <ul class="todo-list">
            @for(var toDo: toDos)
                @template.singleItem(toDo = toDo)
            @endfor
        </ul>
    </main>
    <footer class="footer"><span class="todo-count"><strong>${countOfActiveToDosDisplay}</strong></span>


        <ul class="filters">
            @for(var filter: List.of("All", "Active", "Completed"))
                <li><a href="/todos?filter=${filter}"
                       class="${Utils.computeLinkClass(appliedFilter, filter)}">${filter}</a></li>
            @endfor
        </ul>

        <button class="clear-completed" hx-delete="/todos/completed" hx-target="body" >Clear completed</button>
    </footer>
</section>

</body>
</html>

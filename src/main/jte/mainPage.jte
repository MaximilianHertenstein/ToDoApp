@import org.example.ToDoItem
@import org.example.Utils
@import java.util.List


@param List<ToDoItem> toDoItems
@param int countOfActiveToDos
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
            @for(int i = 0; i < toDoItems.size(); i++)
                @template.singleItem(index = i, toDo  = toDoItems.get(i))
            @endfor
        </ul>
    </main>
    <footer class="footer" style="display: block;"><span class="todo-count"><strong>${countOfActiveToDos}</strong> item left</span>


        <ul class="filters">
            @for(var filter: List.of("All", "Active", "Completed"))
                <li><a href="/todos?f=${filter}"
                       class="${Utils.computeLinkClass(appliedFilter, filter)}">${filter}</a></li>
            @endfor
        </ul>

        <button class="clear-completed" style="display: none;"></button>
    </footer>
</section>

</body>
</html>

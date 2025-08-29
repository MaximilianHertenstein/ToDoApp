@import org.example.ToDo
@import org.example.Utils
@import java.util.List


@param List<ToDo> toDos
@param String countOfActiveToDosDisplay
@param String appliedFilter


<section class="todoapp" id="app">
    <header class="header">
        <h1>todos</h1>

        <input hx-post="/todos/new" hx-target="body" hx-trigger="keyup[keyCode==13]" type="text" class="new-todo" placeholder="What needs to be done?" name="text_of_new_todo"
               autofocus="${true}">
    </header>

    <main>
        <ul class="todo-list">
            @for(var toDo: toDos)
                @template.web.singleItem(toDo = toDo)
            @endfor
        </ul>
    </main>
    <footer class="footer"><span class="todo-count"><strong>${countOfActiveToDosDisplay}</strong></span>


        <ul class="filters">
            @for(var filter: List.of("All", "Active", "Completed"))
                <li><a hx-post="/todos/setFilter/${filter}" hx-target="body"
                       class="${Utils.computeFilterClass(appliedFilter, filter)}">${filter}</a></li>
            @endfor
        </ul>

        <button class="clear-completed" hx-delete="/todos/completed" hx-target="body" >Clear completed</button>
    </footer>
    </section>
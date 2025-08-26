@import org.example.ToDo
@import org.example.Utils
@import java.util.List


@param List<ToDo> toDos
@param String countOfActiveToDosDisplay
@param String appliedFilter


<section class="todoapp" id="app">
    @template.header()

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
                <li><a hx-post="/todos/${filter}" hx-target="body"
                       class="${Utils.computeLinkClass(appliedFilter, filter)}">${filter}</a></li>
            @endfor
        </ul>

        <button class="clear-completed" hx-delete="/todos/completed" hx-target="body" >Clear completed</button>
    </footer>
    </section>
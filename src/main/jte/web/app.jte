@import org.example.UIState
@import org.example.Utils
@import java.util.List


@param UIState uiState

<%--hx-trigger="keyup[keyCode==13]"--%>

<section class="todoapp" id="todoapp">
    <header class="header">
        <h1>todos</h1>
        <%--        <form action="/todos/new" method="post">--%>
        <form>
            <input type="text"
                   class="new-todo"
                   placeholder="What needs to be done?"
                   name="text_of_new_todo"
                   autofocus="${true}">
            <button type="submit"
                    style="display:none;"
                    hx-post="/todos/new"
                    hx-target="#todoapp"
                    hx-swap="outerHTML"
            >
                Add
            </button>
        </form>
    </header>

    <main>
        <ul class="todo-list">
            @for(var toDo: uiState.selectedToDos())
                @template.toDo(toDo = toDo)
            @endfor
        </ul>
    </main>
    <footer class="footer">
        <span class="todo-count">
            <strong>${uiState.displayOfActiveToDos()}</strong>
        </span>


        <ul class="filters">
            @for(var filter: List.of("All", "Active", "Completed"))
                <li>
                    <a hx-post="/todos/setFilter/${filter}"
                       hx-target="body"
                       class="${Utils.computeFilterClass(uiState.currentFilter(), filter)}">
                        ${filter}
                    </a>
                </li>
            @endfor
        </ul>

        <button
                class="clear-completed"
                hx-post="/todos/clearCompleted"
                hx-target="body">
            Clear completed
        </button>
    </footer>
</section>
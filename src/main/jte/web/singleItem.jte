@import org.example.ToDo

@param ToDo toDo

<li id="todo${toDo.id()}"
    class="${org.example.Utils.statusToCompleted(toDo.completed())}">


    <input class="toggle"
           type="checkbox"
           checked="${toDo.completed()}"
           hx-post="todos/${toDo.id()}/toggleStatus"
           hx-target="body"
           hx-trigger="click"
           hx-swap="outerHTML"/>

    <label hx-get="/todos/${toDo.id()}/edit"
           hx-target="#todo${toDo.id()}"
           hx-swap="outerHTML"> ${toDo.text()}
    </label>
    <button class="destroy"
            hx-post="todos/${toDo.id()}/delete"
            hx-target="body">
    </button>
</li>
@import org.example.ToDo

@param ToDo toDo

<li class="${org.example.Utils.statusToCompleted(toDo.completed())}">
    <input class="toggle" type="checkbox" checked="${toDo.completed()}" hx-post="todos/${toDo.id()}/toggleStatus"
           hx-target="body" hx-trigger="click">
    <label hx-get="/todos/${toDo.id()}/edit" hx-target="closest li"> ${toDo.text()}</label>
    <button class="destroy" hx-delete="todos/${toDo.id()}" hx-target="body"></button>
</li>
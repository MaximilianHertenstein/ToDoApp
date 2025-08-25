@import org.example.ToDoItem

@param int index
@param ToDoItem toDo

<li class="${org.example.Utils.statusToCompleted(toDo.completed())}">
    <input class="toggle" type="checkbox" checked="${toDo.completed()}" hx-post="todos/${index}/toggleStatus"
           hx-target="body" hx-trigger="click">
    <label hx-get="/todos/${index}/edit" hx-target="closest li"> ${toDo.text()}</label>
    <button class="destroy" hx-delete="todos/${index}" hx-target="body"></button>
</li>
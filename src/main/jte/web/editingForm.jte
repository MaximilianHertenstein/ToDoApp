@import org.example.ToDo

@param ToDo toDo



<li id="todo${toDo.id()}"  class="editing">
    <input class="edit new-todo" autofocus="${true}" hx-post="todos/${toDo.id()}/edit" hx-swap="outerHTML" hx-target="#todo${toDo.id()}"
           type="text" value="${toDo.text()}"
           name="updated_text_of_new_todo" hx-trigger="blur, keyup[keyCode==13]">
</li>


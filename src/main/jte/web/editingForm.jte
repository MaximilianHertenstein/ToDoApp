@import org.example.ToDo

@param ToDo toDo



<li class="editing">
    <input class="edit new-todo" autofocus="${true}" hx-post="todos/${toDo.id()}/edit" hx-swap="outerHTML" hx-target="closest li"
           type="text" value="${toDo.text()}"
           name="updated_text_of_new_todo" hx-trigger="blur, keyup[keyCode==13]">
</li>


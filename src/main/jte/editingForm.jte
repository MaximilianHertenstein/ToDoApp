@param int index
@param String text



<li class="editing">
    <input class="edit new-todo" autofocus="${true}" hx-post="todos/${index}/edit" hx-target="closest li"
           type="text" value="${text}"
           name="updated_text_of_new_todo" hx-trigger="blur, keyup[keyCode==13]">
</li>


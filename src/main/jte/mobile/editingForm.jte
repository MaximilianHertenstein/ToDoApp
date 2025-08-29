@import org.example.ToDo

@param ToDo toDo



<item xmlns="https://hyperview.org/hyperview" key="${toDo.id()} id="${toDo.id()}   style="editing">
    <form>
        <text-field
                style="edit new-todo"
                autofocus="${true}"
                  target="${toDo.id()}"
                value="${toDo.text()}"
               name="updated_text_of_new_todo" >
            <text verb="post"
                  href="todos/${toDo.id()}/edit"
                  action = "replace"
            > Submit </text>

            </form>

</item>


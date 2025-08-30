@import org.example.ToDo

@param ToDo toDo

<item xmlns="https://hyperview.org/hyperview"
      id="${toDo.id()}"
      key="${toDo.id()}"
      style="toDoItem"
>

    <form style= "toDoItem">
        <text-field
                placeholder="${toDo.text()}"
                value="${toDo.text()}"
                name="updated_text_of_new_todo"
                style="new-todo"
                autoFocus="true"
                trigger="blur"
        />
        <text   style = "ordinary-text"
                trigger="press"
                verb="post"
                href="/todos/${toDo.id()}/edit"
                target="${toDo.id()}"
                action="replace"

        >💾</text>
    </form>

</item>


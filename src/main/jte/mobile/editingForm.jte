@import org.example.ToDo

@param ToDo toDo



<item xmlns="https://hyperview.org/hyperview"
      id="${toDo.id()}"
      style="todoapp">
    <form>
        <text-field
                style="new-todo"
                placeholder="${toDo.text()}"
                value="${toDo.text()}"
                name="updated_text_of_new_todo"
        />
        <text
                style="submitButton"
                verb="post"
                href="/todos/${toDo.id()}/edit"
                target="${toDo.id()}"
                action="replace"
        >Submit</text>
    </form>
</item>


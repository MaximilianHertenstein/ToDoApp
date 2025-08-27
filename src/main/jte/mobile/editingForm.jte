@import org.example.ToDo

@param ToDo toDo



<view style="editing">
    <input
            style="edit new-todo"
            name="updated_text_of_new_todo"
            value="${toDo.text()}"
            autofocus="true"
            action="/todos/${toDo.id()}/edit"
            target="replaceSelf"
            trigger="onBlur onSubmit"
    />
</view>


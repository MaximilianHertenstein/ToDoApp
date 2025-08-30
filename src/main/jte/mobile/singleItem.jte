@import org.example.ToDo
@import org.example.Utils

@param ToDo toDo

<item xmlns="https://hyperview.org/hyperview"
      id="${toDo.id()}"
      key="${toDo.id()}"
      style="toDoItem"
>
    <text
            style="${Utils.computeToggleClass(toDo.completed())}"
          verb="post"
          href="/todos/${toDo.id()}/toggleStatus?replace=true"
          target="body"
          action="replace-inner">
        ${Utils.statusToSymbol(toDo.completed())}
    </text>
    <text
          href="/todos/${toDo.id()}/edit"
          trigger="press"
          target="${toDo.id()}"
          action="replace"
        style="${org.example.Utils.statusToCompleted(toDo.completed())} ordinary-text">
            ${toDo.text()}
        </text>
        <text style="ordinary-text destroy "
              verb="post"
              href="/todos/${toDo.id()}/delete?replace=true"
              target="body"
              action="replace-inner">×</text>

</item>

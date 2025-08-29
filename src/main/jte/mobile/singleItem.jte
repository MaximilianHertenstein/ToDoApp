@import org.example.ToDo
@import org.example.Utils

@param ToDo toDo




<item xmlns="https://hyperview.org/hyperview"
      id="${toDo.id()}"
      key="${toDo.id()}"
      style="toDoItem"
>
    <text style="${Utils.computeToggleClass(toDo.completed())}"
          verb="post"
          href="/todos/${toDo.id()}/toggleStatus"
          target="${toDo.id()}"
          action="replace">${Utils.statusToCheckMark(toDo.completed())} </text>
    <text
          href="/todos/${toDo.id()}/edit"
          trigger="press"
          target="${toDo.id()}"
          action="replace"
        style="${org.example.Utils.statusToCompletedOrActive(toDo.completed())}">
            ${toDo.text()}
        </text>
    <text style="destroy"
          verb="post"
          href="/todos/${toDo.id()}/delete?replace=true"
          target="body"
          action="replace-inner">X</text>
</item>

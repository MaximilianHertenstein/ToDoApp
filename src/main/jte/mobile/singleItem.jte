@import org.example.ToDo

@param ToDo toDo




<item xmlns="https://hyperview.org/hyperview" id = "${toDo.id()}"  key = "${toDo.id()}" style="${org.example.Utils.statusToCompleted(toDo.completed())}">


    <text style="toggle"
          verb="post"
          href="/todos/${toDo.id()}/toggleStatus"
          target="${toDo.id()}"
          action="replace">
        toggle
    </text>

    <text verb="get"
          href="/todos/${toDo.id()}/edit"
          target="${toDo.id()}"
          action="replace">
        ${toDo.text()}
    </text>
    <text style="destroy"
          verb = "post"
          href="/todos/${toDo.id()}/delete?q=replace"
          target="body"
          action="replace">
        destroy</text>
</item>
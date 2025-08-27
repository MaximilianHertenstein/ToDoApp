@import org.example.ToDo

@param ToDo toDo




<item id = "${toDo.id()}" style="${org.example.Utils.statusToCompleted(toDo.completed())}">


    <text style="toggle" href="todos/${toDo.id()}/toggleStatus" verb="post" target="${toDo.id()}" trigger="click" action="replace">toggle</text>

    <text verb="get" href="/todos/${toDo.id()}/edit" target="${toDo.id()}" action="replace"> ${toDo.text()}</text>
    <text style="destroy" verb = "delete" href="todos/${toDo.id()}" target="body" action="replace">destroy</text>
</item>
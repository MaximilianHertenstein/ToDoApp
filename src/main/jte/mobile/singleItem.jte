@import org.example.ToDo

@param ToDo toDo

<view style="${org.example.Utils.statusToCompleted(toDo.completed())}">
    <!-- Toggle checkbox -->
    <switch
            style="toggle"
            value="${toDo.completed()}"
            action="/todos/${toDo.id()}/toggleStatus"
            target="replaceSelf"
            trigger="onChange"
    />

    <!-- Label: edit trigger -->
<%--    <link--%>
<%--            action="/todos/${toDo.id()}/edit"--%>
<%--            target="replaceSelf"--%>
<%--    >--%>
<%--    <text>${toDo.text()}</text>--%>
<%--    </link>--%>

    <!-- Destroy button -->
    <button
            style="destroy"
            action="/todos/${toDo.id()}"
            method="delete"
            target="replaceBody"
    >
        <text>×</text>
    </button>
</view>
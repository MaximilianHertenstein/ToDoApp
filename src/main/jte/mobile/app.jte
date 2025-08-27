@import org.example.ToDo
@import org.example.Utils
@import java.util.List


@param List<ToDo> toDos
@param String countOfActiveToDosDisplay
@param String appliedFilter


<body>
    <view id="app" style="todoapp" >
        <view style="header">
            <text style="h1">todos</text>

            <input
                    name="text_of_new_todo"
                    placeholder="What needs to be done?"
                    autofocus="true"
                    action="/todos/new"
                    trigger="onSubmit"
                    target="replaceBody"
            />
        </view>

        <view style="main">
            <list style="todo-list">
                @for(var toDo: toDos)
                    <view>
                        @template.mobile.singleItem(toDo = toDo)
                    </view>
                @endfor
            </list>
        </view>

        <view style="footer">
            <text style="todo-count">
                <text style="strong">${countOfActiveToDosDisplay}</text>
            </text>

            <list style="filters">
                @for(var filter: List.of("All", "Active", "Completed"))
                    <view>
<%--                        <link--%>
<%--                                action="/todos/${filter}"--%>
<%--                                target="replaceBody"--%>
<%--                                style="${Utils.computeLinkClass(appliedFilter, filter)}"--%>
<%--                        >--%>
<%--                        <text>${filter}</text>--%>
<%--                        </link>--%>
                    </view>
                @endfor
            </list>

            <button
                    style="clear-completed"
                    action="/todos/completed"
                    method="delete"
                    target="replaceBody"
            >
                <text>Clear completed</text>
            </button>
        </view>
    </view>
</body>
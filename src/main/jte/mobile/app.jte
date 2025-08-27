@import org.example.ToDo
@import org.example.Utils
@import java.util.List


@param List<ToDo> toDos
@param String countOfActiveToDosDisplay
@param String appliedFilter


<view style="todoapp" id="app">
    <header style="header">
        <text>todos</text>
        <form>
            <text-field target="body"
                        trigger="blur"
                        style="new-todo"
                        placeholder="What needs to be done?"
                        name="text_of_new_todo"
                        autofocus="${true}"/>

                <text verb="post" href="/todos/new" action="replace-inner" target="body">
                    Submit
                </text>


        </form>

    </header>


    <list style="todo-list">
        @for(var toDo: toDos)
            @template.mobile.singleItem(toDo = toDo)
        @endfor
    </list>

    <view class="footer"><text style="todo-count"> ${countOfActiveToDosDisplay}</text>


        <list style="filters">
            @for(var filter: List.of("All", "Active", "Completed"))
                <item>
                    <text verb="post" href="/todos/${filter}" target="body" action="replace-inner"
                          class="${Utils.computeLinkClass(appliedFilter, filter)}">${filter}</text>
                </item>
            @endfor
        </list>

        <text style="clear-completed" verb="delete" href="/todos/completed" target="body" action="replace-inner">Clear
            completed
        </text>
    </view>
</view>
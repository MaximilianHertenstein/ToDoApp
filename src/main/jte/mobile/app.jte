@import org.example.ToDo
@import org.example.Utils
@import java.util.List


@param List<ToDo> toDos
@param String countOfActiveToDosDisplay
@param String appliedFilter


<view xmlns="https://hyperview.org/hyperview" style="todoapp" id="app" >
    <header style="header">
        <text style = "heading" >todos</text>
        <form>
            <text-field target="body"
                        trigger="blur"
                        style="new-todo"
                        placeholder="What needs to be done?"
                        name="text_of_new_todo"
                        autofocus="${true}"

            />

                <text verb="post" href="/todos/new?replace=true" action="replace-inner" target="body">
                    Submit
                </text>


        </form>

    </header>


    <list style="todo-list">
        @for(var toDo: toDos)
            @template.mobile.singleItem(toDo = toDo)
        @endfor
    </list>

    <view class="footer">

        <text style="todo-count"> ${countOfActiveToDosDisplay}</text>


        <list style="filters">
            @for(var filter: List.of("All", "Active", "Completed"))
                <item key="${filter}">
                    <text verb="post" href="/todos/setFilter/${filter}?replace=true" target="body" action="replace-inner"
                          class="${Utils.computeLinkClass(appliedFilter, filter)}">${filter}</text>
                </item>
            @endfor
        </list>

        <text style="clear-completed" verb="post" href="/todos/clearCompleted?replace=true" target="body" action="replace-inner">Clear
            completed
        </text>
    </view>
</view>
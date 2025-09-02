@import org.example.ToDo
@import org.example.UIState
@import org.example.Utils
@import java.util.List


@param UIState uiState


<view xmlns="https://hyperview.org/hyperview" style="todoapp" id="app">
    <header style="header">
        <text style="heading">todos</text>
        <form style="input-container">
            <text-field
                    style="new-todo"
                    placeholder="What needs to be done?"
                    name="text_of_new_todo"
            />
            <text verb="post" href="/todos/new?replace=true" action="replace-inner" target="body" style="ordinary-text">
                Add
            </text>
        </form>
    </header>

    <list style="todo-list">
        @for(var toDo: uiState.selectedToDos())
            @template.singleItem(toDo = toDo)
        @endfor
    </list>

    <view style="footer">
        <text style="ordinary-text">${uiState.displayOfActiveToDos()}</text>

        <view style="filters">
            @for(var filter: List.of("All", "Active", "Completed"))
                <text verb="post" href="/todos/setFilter/${filter}?replace=true" target="body"
                      action="replace-inner"
                      style="filter ordinary-text ${Utils.computeFilterClass(uiState.currentFilter(), filter)} ">${filter}</text>
            @endfor
        </view>

        <text style="ordinary-text" verb="post" href="/todos/clearCompleted?replace=true" target="body"
              action="replace-inner">Clear completed</text>
    </view>
</view>

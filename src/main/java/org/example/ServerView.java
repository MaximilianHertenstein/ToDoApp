package org.example;

import io.javalin.http.Context;
import java.util.List;

public interface ServerView {

    public void renderApp(Context ctx, List<ToDo> toDos, String countOfActiveToDosDisplay, String appliedFilter);

    public void renderEditForm(Context ctx, ToDo toDo);

    public void renderToDo(Context ctx, ToDo toDo);

}

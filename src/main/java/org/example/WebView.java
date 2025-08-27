package org.example;

import io.javalin.http.Context;

import java.util.List;
import java.util.Map;

public class WebView implements ServerView {

    public void renderApp(Context ctx, List<ToDo> toDos, String countOfActiveToDosDisplay, String appliedFilter) {
        var map = Map.of("toDos", toDos, "countOfActiveToDosDisplay", countOfActiveToDosDisplay, "appliedFilter",
                appliedFilter);
        var templateName = "web/mainPage.jte";
        if (ctx.header("HX-Request") != null) {
            templateName = "web/app.jte";
        }

        ctx.render(templateName, map);

    }

    public void renderEditForm(Context ctx, ToDo toDo) {
        ctx.render("web/editingForm.jte", Map.of("toDo", toDo));
    }

    public void renderToDo(Context ctx, ToDo toDo) {
        ctx.render("web/singleItem.jte", Map.of("toDo", toDo));
    }

}

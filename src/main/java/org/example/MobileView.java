package org.example;


import io.javalin.http.Context;

import java.util.List;
import java.util.Map;

import static java.io.IO.println;

public class MobileView implements ServerView {

     private void renderHXML(Context ctx, String templateName, Map<String, Object> map){

         ctx.contentType("application/vnd.hyperview+xml");
         println("Set content type to hxml");
        ctx.render(templateName, map);
    }


    public void renderApp(Context ctx, List<ToDo> toDos, String countOfActiveToDosDisplay, String appliedFilter) {
        var map = Map.of("toDos", toDos, "countOfActiveToDosDisplay", countOfActiveToDosDisplay, "appliedFilter",
                appliedFilter);
        var templateName = "mobile/mainPage.jte";
        if (ctx.header("HX-Request") != null) {
            templateName = "mobile/app.jte";
        }

        renderHXML(ctx, templateName, map);

    }

    public void renderEditForm(Context ctx, ToDo toDo) {
        renderHXML(ctx, "mobile/editingForm.jte", Map.of("toDo", toDo));
    }

    public void renderToDo(Context ctx, ToDo toDo) {
        renderHXML(ctx, "mobile/singleItem.jte", Map.of("toDo", toDo));
    }

}

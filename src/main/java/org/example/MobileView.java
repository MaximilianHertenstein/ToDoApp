package org.example;


import io.javalin.http.Context;

import java.util.List;
import java.util.Map;


public class MobileView implements ServerView {

     private void renderHXML(Context ctx, String templateName, Map<String, Object> map){
         var newctx = ctx.render(templateName, map);
         newctx.contentType("application/vnd.hyperview+xml");
    }


    public void renderApp(Context ctx, List<ToDo> toDos, String countOfActiveToDosDisplay, String appliedFilter) {
        var map = Map.of("toDos", toDos, "countOfActiveToDosDisplay", countOfActiveToDosDisplay, "appliedFilter",
                appliedFilter);
        var templateName = "mobile/mainPage.jte";
        if (ctx.queryParam("replace")!= null)  {
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

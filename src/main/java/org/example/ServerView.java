package org.example;

import gg.jte.CodeResolver;
import gg.jte.ContentType;
import gg.jte.TemplateEngine;
import gg.jte.resolve.DirectoryCodeResolver;
import io.javalin.http.Context;

import java.nio.file.Path;
import java.util.List;
import java.util.Map;

public class ServerViewAlt {


    CodeResolver codeResolver = new DirectoryCodeResolver(Path.of("src/main/jte")); // This is the directory where your .jte files are located.
    TemplateEngine htmlTemplateEngine = TemplateEngine.create(codeResolver, ContentType.Html);
    TemplateEngine xmlTemplateEngine = TemplateEngine.create(codeResolver, ContentType.Plain);




    private void renderTemplate(Context ctx, String templateName, Map<String, Object> map){
        var folder = "web/";
        boolean acceptsHXML = ctx.header("Accept").contains("hyperview");
        if (acceptsHXML) {
            folder = "mobile/";
            ctx.contentType("application/vnd.hyperview+xml");

        }
        var newCTX = ctx.render(folder + templateName, map);
        if (acceptsHXML) {
            newCTX.contentType("application/vnd.hyperview+xml");
        }
    }


    public void renderApp(Context ctx, List<ToDo> toDos, String countOfActiveToDosDisplay, String appliedFilter) {
        var map = Map.of("toDos", toDos, "countOfActiveToDosDisplay", countOfActiveToDosDisplay, "appliedFilter",
                appliedFilter);
        var templateName = "mainPage.jte";
        if (ctx.queryParam("replace")!= null || ctx.header("HX-Request") != null)  {
            templateName = "app.jte";
        }

        renderTemplate(ctx, templateName, map);

    }

    public void renderEditForm(Context ctx, ToDo toDo) {
        renderTemplate(ctx, "editingForm.jte", Map.of("toDo", toDo));
    }

    public void renderToDo(Context ctx, ToDo toDo) {
        renderTemplate(ctx, "singleItem.jte", Map.of("toDo", toDo));
    }


}

package org.example;

import gg.jte.CodeResolver;
import gg.jte.ContentType;
import gg.jte.TemplateEngine;
import gg.jte.output.StringOutput;
import gg.jte.resolve.DirectoryCodeResolver;
import io.javalin.http.Context;

import java.nio.file.Path;

public class ServerView {

    TemplateEngine htmlTemplateEngine;
    TemplateEngine hxmlTemplateEngine;

    public ServerView() {
        CodeResolver htmlCodeResolver = new DirectoryCodeResolver(Path.of("src/main/jte/web"));
        CodeResolver hxmlCodeResolver = new DirectoryCodeResolver(Path.of("src/main/jte/mobile"));
        htmlTemplateEngine = TemplateEngine.create(htmlCodeResolver, ContentType.Html);
        hxmlTemplateEngine = TemplateEngine.create(hxmlCodeResolver, ContentType.Plain);
    }

    public String renderToString(String templateName, Object model, boolean useHXML) {
        StringOutput output = new StringOutput();
        var templateEngine = htmlTemplateEngine;
        if (useHXML) {
            templateEngine = hxmlTemplateEngine;
        }
        templateEngine.render(templateName + ".jte", model, output);
        return output.toString();
    }

    public String acceptHeaderToContentType(boolean useHXML) {
        if (useHXML) {
            return "application/vnd.hyperview+xml";
        } else {
            return "text/html";
        }
    }

    private void renderAndSend(Context ctx, Object object, String templateName) {
        var useHXML = ctx.header("Accept") != null && ctx.header("Accept").contains("hyperview");
        var content = renderToString(templateName, object, useHXML);
        ctx.contentType(acceptHeaderToContentType(useHXML));
        ctx.result(content);
    }

    public void showApp(Context ctx, UIState uiState) {
        var partial = ctx.header("HX-Request") != null || ctx.queryParam("replace") != null;
        var templateName = "mainPage";
        if (partial) {
            templateName = "app";
        }
        renderAndSend(ctx, uiState, templateName);
    }

    public void showToDo(Context ctx, ToDo toDo) {
        renderAndSend(ctx, toDo, "singleItem");
    }

    public void showEditForm(Context ctx, ToDo toDo) {
        renderAndSend(ctx, toDo, "editingForm");
    }

}

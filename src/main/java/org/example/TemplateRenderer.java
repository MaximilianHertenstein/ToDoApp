package org.example;

import gg.jte.ContentType;
import gg.jte.TemplateEngine;
import gg.jte.output.StringOutput;
import gg.jte.resolve.DirectoryCodeResolver;
import gg.jte.resolve.ResourceCodeResolver;

import java.nio.file.Path;

public class TemplateRenderer {

    TemplateEngine htmlTemplateEngine;
    TemplateEngine hxmlTemplateEngine;

    TemplateRenderer() {

//        ResourceCodeResolver htmlCodeResolver = new ResourceCodeResolver("web");
//        ResourceCodeResolver hxmlCodeResolver = new ResourceCodeResolver("mobile");
        DirectoryCodeResolver htmlCodeResolver = new DirectoryCodeResolver(Path.of("src/main/resources/jte/web"));
        DirectoryCodeResolver hxmlCodeResolver = new DirectoryCodeResolver(Path.of("src/main/resources/jte/mobile"));
        htmlTemplateEngine = TemplateEngine.create(htmlCodeResolver, ContentType.Html);
        hxmlTemplateEngine = TemplateEngine.create(hxmlCodeResolver, ContentType.Plain);
    }

    private <T> String renderToString(T model, String templateName, boolean useHXML) {
        StringOutput output = new StringOutput();
        var templateEngine = htmlTemplateEngine;
        if (useHXML) {
            templateEngine = hxmlTemplateEngine;
        }
        templateEngine.render(templateName + ".jte", model, output);
        return output.toString();
    }

    public String renderAppToString(UIState uiState, boolean partial, boolean useHXML) {
        var templateName = "mainPage";
        if (partial) {
            templateName = "app";
        }
        return renderToString(uiState, templateName, useHXML);
    }

    public String renderToDoToString(ToDo toDo, boolean editing, boolean useHXML) {
        var templateName = "toDo";
        if (editing) {
            templateName = "editingForm";
        }

        return renderToString(toDo, templateName, useHXML);
    }

}

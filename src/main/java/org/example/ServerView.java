package org.example;


import io.javalin.http.Context;


public class ServerView {

     TemplateRenderer templateRenderer = new TemplateRenderer();

    private static boolean shouldRespondHXML(Context ctx) {
        return ctx.header("Accept") != null && ctx.header("Accept").contains("hyperview");
    }


    private void setContentTypeAndSend(Context ctx, String content, boolean useHXML) {
        var contentType = "text/html";
        if (useHXML){
            contentType = "application/vnd.hyperview+xml";
        }
        ctx.contentType(contentType);
        ctx.result(content);
    }

    public void showApp(Context ctx, UIState uiState) {
        var partial = ctx.header("HX-Request") != null || ctx.queryParam("replace") != null;
        var useHXML = shouldRespondHXML(ctx);
        var content = templateRenderer.renderAppToString(uiState, partial, useHXML);
        setContentTypeAndSend(ctx,content,useHXML);
    }

    public void showToDo(Context ctx, ToDo toDo, boolean editing) {
        var useHXML = shouldRespondHXML(ctx);
        var content = templateRenderer.renderToDoToString(toDo, editing, useHXML);
        setContentTypeAndSend(ctx,content,useHXML);
    }


}

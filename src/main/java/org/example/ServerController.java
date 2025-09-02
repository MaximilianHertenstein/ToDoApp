package org.example;

import io.javalin.http.Context;

public class ServerController {
    Model model = new Model();
    ServerView view = new ServerView();



    public void renderApp(Context ctx) {
        view.showApp(ctx, model.getUIState());
    }

    public void addToDo(Context ctx) {
        var text_of_new_todo = ctx.formParam("text_of_new_todo");
        model.add(text_of_new_todo);
        renderApp(ctx);
    }

    public void deleteToDo(Context ctx) {
        var idOfToDo = Integer.parseInt(ctx.pathParam("id"));
        model.delete(idOfToDo);
        renderApp(ctx);
    }

    public void deleteCompletedToDos(Context ctx) {
        model.removeFinishedToDoItems();
        renderApp(ctx);
    }

    public void toggleStatus(Context ctx) {
        var idOfToDo = Integer.parseInt(ctx.pathParam("id"));
        model.toggle(idOfToDo);
        renderApp(ctx);
    }

    public void setFilter(Context ctx) {
        var nextFilter  = ctx.pathParam("filter");
        model.setFilter(nextFilter);
        renderApp(ctx);
    }

    public void editToDo(Context ctx) {
        var idOfToDo = Integer.parseInt(ctx.pathParam("id"));
        view.showEditForm(ctx, model.getToDoItem(idOfToDo));
    }

    public void updateTextOfToDo(Context ctx) {
        var idOfToDo = Integer.parseInt(ctx.pathParam("id"));
        var text_of_new_todo = ctx.formParam("updated_text_of_new_todo");
        model.updateText(idOfToDo, text_of_new_todo);
        view.showToDo(ctx, model.getToDoItem(idOfToDo));
    }

}

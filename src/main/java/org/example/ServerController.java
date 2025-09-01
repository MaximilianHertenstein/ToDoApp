package org.example;

import io.javalin.http.Context;

public class ServerController {
    Model model = new Model();
    ServerView view = new ServerView();
    String currentFilter = "All";


    public void renderApp(Context ctx) {
        var toDos = model.getToDosWithFilter(currentFilter);
        view.renderApp(ctx, toDos, model.showCountOfActiveToDoItems(), currentFilter);
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
        currentFilter = ctx.pathParam("filter");
        renderApp(ctx);
    }

    public void editToDo(Context ctx) {
        var idOfToDo = Integer.parseInt(ctx.pathParam("id"));
        view.renderEditForm(ctx, model.getToDoItem(idOfToDo));
    }

    public void updateTextOfToDo(Context ctx) {
        var idOfToDo = Integer.parseInt(ctx.pathParam("id"));
        var text_of_new_todo = ctx.formParam("updated_text_of_new_todo");
        model.updateText(idOfToDo, text_of_new_todo);
        view.renderToDo(ctx, model.getToDoItem(idOfToDo));
    }

}

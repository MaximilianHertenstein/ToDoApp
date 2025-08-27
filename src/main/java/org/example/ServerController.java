package org.example;

import io.javalin.http.Context;
import io.javalin.http.HttpStatus;

public class ServerController {
    Model model = new Model();
    ServerView view;
    String currentFilter = "All";


    public ServerController(ServerView view){
        this.view = view;
    }

    public void index(Context ctx) {
        ctx.redirect("/todos", HttpStatus.forStatus(303));
    }

    public void renderApp(Context ctx) {
        var toDos = model.getItemsWithStatus(currentFilter);
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
        view.renderToDo(ctx, model.getToDoItem(idOfToDo));
    }

    public void setFilter(Context ctx) {
        currentFilter = ctx.pathParam("filter");
        renderApp(ctx);
    }

    public void editToDo(Context ctx) {
        var idOfToDo = Integer.parseInt(ctx.pathParam("id"));
        view.renderEditForm(ctx, model.getToDoItem(idOfToDo));
    }

    public void updateToDo(Context ctx) {
        var idOfToDo = Integer.parseInt(ctx.pathParam("id"));
        var text_of_new_todo = ctx.formParam("updated_text_of_new_todo");
        model.set(idOfToDo, text_of_new_todo);
        view.renderToDo(ctx, model.getToDoItem(idOfToDo));
    }

}

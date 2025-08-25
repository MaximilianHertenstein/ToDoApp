package org.example;

import io.javalin.http.Context;
import io.javalin.http.HttpStatus;


public class ServerController {
    Model model = new Model();
    ServerView view = new ServerView();
    String currentFilter = "All";


    public void renderMain(Context ctx) {
        String newFilterOrNull = ctx.queryParam("filter");
        currentFilter = Utils.nullToOldElseOld(newFilterOrNull,currentFilter);
        var toDos= model.getItemsWithStatus(currentFilter);
        view.renderMain(ctx,toDos, model.showCountOfActiveToDoItems(),currentFilter);
    }

    public void addToDo(Context ctx){
        var text_of_new_todo =   ctx.formParam("text_of_new_todo");
        model.add(text_of_new_todo);
        ctx.redirect("/todos", HttpStatus.forStatus(303));
    }

    public void deleteToDo(Context ctx){
        var idOfToDo =   ctx.pathParam("id");
        model.delete(Integer.parseInt(idOfToDo),currentFilter);
        ctx.redirect("/todos", HttpStatus.forStatus(303));
    }

    public void toggleStatus(Context ctx) {
        var idOfToDo =   ctx.pathParam("id");
        model.toggle(Integer.parseInt(idOfToDo));
        ctx.redirect("/todos", HttpStatus.forStatus(303));
    }


    public void updateToDo(Context ctx) {
        var idOfToDo =   Integer.parseInt(ctx.pathParam("id"));
        var text_of_new_todo =   ctx.formParam("updated_text_of_new_todo");
        model.set(idOfToDo,text_of_new_todo);
        view.renderSingleItem(ctx,model.getToDoItem(idOfToDo));
    }

    public void editToDo(Context ctx) {
        var idOfToDo =   Integer.parseInt(ctx.pathParam("id"));
        view.renderEditForm(ctx, model.getToDoItem(idOfToDo));
    }

    public void deleteCompletedToDos(Context ctx) {
        model.removeFinishedToDoItems();
        ctx.redirect("/todos", HttpStatus.forStatus(303));
    }
}

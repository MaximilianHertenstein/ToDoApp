package org.example;

import io.javalin.http.Context;
import io.javalin.http.HttpStatus;


public class ServerController {
    Model model = new Model();
    ServerView view = new ServerView();


    public void renderMain(Context ctx) {

        String appliedFilterOrNull = ctx.queryParam("f");
        String appliedFilter = Utils.nullToAll(appliedFilterOrNull);
        var toDos= model.getItemsWithStatus(appliedFilter);


        view.renderMain(ctx,toDos, model.countActiveToDoItems(),appliedFilter);
    }

    public void addToDo(Context ctx){
        var text_of_new_todo =   ctx.formParam("text_of_new_todo");
        model.add(text_of_new_todo);
        ctx.redirect("/todos", HttpStatus.forStatus(303));
    }

    public void deleteToDo(Context ctx){
        var indexOfToDo =   ctx.pathParam("i");
        model.delete(Integer.parseInt(indexOfToDo));
        ctx.redirect("/todos", HttpStatus.forStatus(303));
    }

    public void toggleStatus(Context ctx) {
        var indexOfToDo =   ctx.pathParam("i");
        model.toggle(Integer.parseInt(indexOfToDo));
        ctx.redirect("/todos", HttpStatus.forStatus(303));
    }

    
    public void updateToDo(Context ctx) {
        var indexOfToDo =   Integer.parseInt(ctx.pathParam("i"));
        var text_of_new_todo =   ctx.formParam("updated_text_of_new_todo");
        model.set(indexOfToDo,text_of_new_todo);
        view.renderSingleItem(ctx,indexOfToDo, model.getToDoItems().get(indexOfToDo));
    }

    public void editToDo(Context ctx) {
        var indexOfToDo =   Integer.parseInt(ctx.pathParam("i"));
        view.renderEditForm(ctx,indexOfToDo, model.getToDoItems().get(indexOfToDo).text());
    }
}

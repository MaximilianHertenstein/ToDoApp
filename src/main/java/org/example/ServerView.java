package org.example;

import io.javalin.http.Context;

import java.util.List;
import java.util.Map;

public class ServerView {



    public void renderMain(Context ctx, List<ToDoItem> toDoItems, int countOfActiveToDos, String appliedFilter) {
        var map = Map.of("toDoItems", toDoItems, "countOfActiveToDos", countOfActiveToDos, "appliedFilter", appliedFilter);
        ctx.render("mainPage.jte", map);
    }


    public void renderEditForm(Context ctx, int indexOfToDo, String text) {
        ctx.render("editingForm.jte", Map.of("index", indexOfToDo, "text", text));
    }


    public void renderSingleItem(Context ctx, int indexOfToDo, ToDoItem toDoItem) {
        ctx.render("singleItem.jte", Map.of("index", indexOfToDo, "toDo", toDoItem));
    }
}

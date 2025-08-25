package org.example;

import java.util.List;

import static java.io.IO.println;

public record View() {


    public String choiceToResponse(String choice) {
        return switch (choice) {
            case "1" -> "Gib den Text des neuen Items ein!";
            case "2" -> "Gib den Index des ToDos ein!";
            case "3" -> "Willst du wirklich alle abgeschlossenen ToDos löschen? y";
            case "4" -> "Welche ToDos willst du anzeigen \n 1 alle  \n 2 nur aktive \n 3 nur abgeschlossene";
            default -> "Wähle eine der Optionen 1 - 4!";
        };
    }

    private String showToDo(ToDo toDo) {
        var done = "❌";
        if (toDo.completed()) {
            done = "✓";
        }
        return done + " " + toDo.text();
    }

    private void printToDos(List<ToDo> toDos) {
        for (var toDoItem : toDos) {
            println(showToDo(toDoItem));
        }
    }

//    private List<ToDoItem> numberToItems(String choice, Model model) {
//        return switch (choice) {
//            case "1" -> model.getToDoItems();
//            case "2" -> model.getActiveToDoItems();
//            case "3" -> model.getFinishedToDoItems();
//            default -> throw new IllegalArgumentException("Only the numbers from 1 to 3 are allowed here!");
//        };
//    }


    public void viewChoiceToToDoList(String choice, Model model) {
        if (!List.of("1", "2", "3").contains(choice)) {
            println("Es gibt nur die Optionen 1 - 3!");
        }
       // printToDos(numberToItems(choice, model));
    }


}
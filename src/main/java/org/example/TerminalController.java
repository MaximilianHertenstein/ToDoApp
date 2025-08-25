package org.example;

import static java.io.IO.println;
import static java.io.IO.readln;

public class TerminalController {
    Model model = new Model();
    View view = new View();


//    private void updateItem(String secondInput) {
//        var index = Integer.parseInt(secondInput);
//        if (index >= model.getToDoItems().size() || index < 0) {
//            println("Es gibt kein ToDo mit diesem Index!");
//            return;
//        }
//        println("Was möchtest du ändern? \n 1 Text aktualisieren \n 2 Status ändern \n 3 Item löschen");
//
//        var updateOperation = readln();
//        switch (updateOperation) {
//            case "1" -> {
//                println("Gib den neuen Text des ToDos ein!");
//                var newText = readln();
//                model.set(index, newText);
//            }
//            case "2" -> model.toggle(index);
//            //case "3" ->  ; //model.delete(index);
//            default -> println("Es gibt nur die Optionen 1 - 3");
//        }
//    }

    private void maybeRemoveFinishedToDos(String secondInput) {
        if (secondInput.equals("y")) {
            model.removeFinishedToDoItems();
        }
    }

    public void runApp() {
        var firstChoice = "";
        while (!firstChoice.equals("q")) {
            println("Was willst du tun? \n 1 ToDo hinzufügen \n 2 ToDo ändern \n 3 Alle abgeschlossenen ToDos löschen \n 4 ToDos anzeigen");
            firstChoice = readln();
            println(view.choiceToResponse(firstChoice));
            var secondInput = readln();
            switch (firstChoice) {
                case "1" -> model.add(secondInput);
               // case "2" -> updateItem(secondInput);
                case "3" -> maybeRemoveFinishedToDos(secondInput);
                case "4" -> view.viewChoiceToToDoList(secondInput, model);
                default -> println("Wähle eine der Optionen 1 - 4");
            }
        }
    }
}
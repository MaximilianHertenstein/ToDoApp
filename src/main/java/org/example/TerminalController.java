package org.example;

import static java.io.IO.println;
import static java.io.IO.readln;

public class TerminalController {
    Model model = new Model();
    View view = new View();


    private void updateItem() {
        var id = view.askUntilInputIsId(model.getItemsWithStatus("All"));
        println("Was möchtest du ändern? \n 1 Text aktualisieren \n 2 Status ändern \n 3 Item löschen");
        var updateOperation = view.askUntilInputIsSmallerOrEqual(3);
        switch (updateOperation) {
            case 1 -> {
                println("Gib den neuen Text des ToDos ein!");
                var newText = readln();
                model.set(id, newText);
            }
            case 2 -> model.toggle(id);
            case 3 ->  model.delete(id);
        }
    }



    public void runApp() {
        var choice = -1;
        var selectedFilter = "All";
        while (!(choice == 0)) {
            view.printToDos(model.getItemsWithStatus(selectedFilter));
            println("Was willst du tun? \n 1 ToDo hinzufügen \n 2 ToDo ändern \n 3 Alle abgeschlossenen ToDos löschen \n 4 Filter der ToDos ändern");
            choice = view.askUntilInputIsSmallerOrEqual(4);
            switch (choice) {
                case 1 -> {
                    println("Gib den Text des neuen Items ein!");
                    var textOfNewToDo = readln();
                    model.add(textOfNewToDo);
                }
                case 2 -> updateItem();
                case 3 -> model.removeFinishedToDoItems();
                case 4 -> {
                    println("Welche ToDos willst du anzeigen \n 1 alle  \n 2 nur aktive \n 3 nur abgeschlossene");
                    selectedFilter =  view.numberToFilter(view.askUntilInputIsSmallerOrEqual(3));
                }
            }
            println("\n");
        }
    }
}


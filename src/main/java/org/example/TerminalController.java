package org.example;

import static java.io.IO.println;
import static java.io.IO.readln;

public class TerminalController {
    Model model = new Model();
    View view = new View();


    private void updateItem() {
        var id = view.askUntilInputIsId(model.getItemsWithStatus("All"));
        println("What do you want to change? \n 1 Update text \n 2 Change status \n 3 Delete item");
        var updateOperation = view.askUntilInputIsSmallerOrEqual(3);
        switch (updateOperation) {
            case 1 -> {
                println("Enter the new text for the ToDo!");
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
        println("Enter 0 to exit the app\n");
        while (!(choice == 0)) {
            view.printToDos(model.getItemsWithStatus(selectedFilter));
            println(model.showCountOfActiveToDoItems());

            println("\nWhat do you want to do? \n 1 Add ToDo \n 2 Edit ToDo \n 3 Delete all completed ToDos \n 4 Change ToDo filter");
            choice = view.askUntilInputIsSmallerOrEqual(4);
            switch (choice) {
                case 1 -> {
                    println("Enter the text for the new item!");
                    var textOfNewToDo = readln();
                    model.add(textOfNewToDo);
                }
                case 2 -> updateItem();
                case 3 -> model.removeFinishedToDoItems();
                case 4 -> {
                    println("Which ToDos do you want to display? \n 1 All \n 2 Only active \n 3 Only completed");
                    selectedFilter =  view.numberToFilter(view.askUntilInputIsSmallerOrEqual(3));
                }
            }
            println("\n");
        }
    }
}


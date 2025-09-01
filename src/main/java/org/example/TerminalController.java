package org.example;


public class TerminalController {
    Model model = new Model();
    View view = new View();

    public void updateItem() {
        var id = view.askUntilInputIsId(model.getToDosWithFilter("All"));
        var updateOperation = view.askForUpdateOperation();
        switch (updateOperation) {
            case 1 -> {
                var newText = view.askForNewText();
                model.updateText(id, newText);
            }
            case 2 -> model.toggle(id);
            case 3 -> model.delete(id);
        }
    }

    public void runApp() {
        var choice = -1;
        var selectedFilter = "All";
        while ((choice != 5)) {
            choice = view.showMainMenuAskForOption(model.getToDosWithFilter(selectedFilter), model.showCountOfActiveToDoItems(), selectedFilter);
            switch (choice) {
                case 1 -> {
                    var textOfNewToDo = view.askForNewToDo();
                    model.add(textOfNewToDo);
                }
                case 2 -> updateItem();
                case 3 -> model.removeFinishedToDoItems();
                case 4 -> selectedFilter = view.askForFilter();
            }
        }
    }
}


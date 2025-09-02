package org.example;


public class TerminalController {
    Model model = new Model();
    View view = new View();

    public void updateItem() {
        var id = view.askUntilInputIsId(model.getFilteredToDos());
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
        while ((choice != 5)) {
            choice = view.showMainMenuAskForOption(model.getUIState());
            switch (choice) {
                case 1 -> {
                    var textOfNewToDo = view.askForNewToDo();
                    model.add(textOfNewToDo);
                }
                case 2 -> updateItem();
                case 3 -> model.removeFinishedToDoItems();
                case 4 -> model.setFilter(view.askForFilter());
            }
        }
    }
}


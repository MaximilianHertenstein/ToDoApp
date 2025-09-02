package org.example;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.ArrayList;
import java.util.List;

import static java.io.IO.println;
import static java.io.IO.readln;

public record View() {

    private String numberToFilter(int number) {
        return switch (number) {
            case 1 -> "All";
            case 2 -> "Active";
            case 3 -> "Completed";
            default -> throw new IllegalStateException("Unexpected value: " + number);
        };
    }


    private String showToDo(ToDo toDo) {
        var done = "❌";
        if (toDo.completed()) {
            done = "✓";
        }
        return done + " " + toDo.text() + "\t\t\t\t ID: " + toDo.id();
    }

    private void printToDos(List<ToDo> toDos) {
        println("\n\t\ttodos");
        for (var toDoItem : toDos) {
            println(showToDo(toDoItem));
        }
    }

    private List<Integer> getIDs(List<ToDo> toDos) {
        var ids = new ArrayList<Integer>();
        for (var toDoItem : toDos) {
            ids.add(toDoItem.id());
        }
        return ids;
    }

    private List<Integer> numbersFromOneTo(int number) {
        var smallerNumbersAsStrings = new ArrayList<Integer>();
        for (int i = 1; i <= number; i++) {
            smallerNumbersAsStrings.add(i);
        }
        return smallerNumbersAsStrings;
    }

    public String askForNewText() {
        println("Enter the new text for the ToDo!");
        return readln();
    }

    public String askForNewToDo() {
        println("Enter the text for the new item!");
        return readln();
    }


    private int askUntilElementInList(List<Integer> elems, String prompt) {
        var input = "";
        while (!NumberUtils.isCreatable(input) || !elems.contains(Integer.parseInt(input))) {
            println(prompt);
            input = readln();
        }
        return Integer.parseInt(input);
    }

    public int askUntilInputIsId(List<ToDo> toDos) {

        return askUntilElementInList(getIDs(toDos), "Enter the ID of an visible ToDo!");
    }


    private int askUntilInputIsSmallerOrEqual(int upperBound) {
        return askUntilElementInList(numbersFromOneTo(upperBound), "Enter a number between 1 and " + upperBound);
    }


    public int showMainMenuAskForOption(UIState uiState) {
        printToDos(uiState.selectedToDos());
        println(uiState.displayOfActiveToDos());
        println("Current Filter: " + uiState.currentFilter());
        println("\nWhat do you want to do?  \n 1 Add ToDo \n 2 Edit ToDo \n 3 Delete all completed ToDos \n 4 Change ToDo filter \n 5 Quit the app");
        return askUntilInputIsSmallerOrEqual(5);
    }

    public String askForFilter() {
        println("Which ToDos do you want to display? \n 1 All \n 2 Only active \n 3 Only completed");
        return numberToFilter(askUntilInputIsSmallerOrEqual(3));
    }

    public int askForUpdateOperation() {
        println("What do you want to change? \n 1 Update text \n 2 Change status \n 3 Delete item");
        return askUntilInputIsSmallerOrEqual(3);
    }


}

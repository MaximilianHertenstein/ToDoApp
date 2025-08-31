package org.example;

import org.apache.commons.lang3.math.NumberUtils;

import java.util.ArrayList;
import java.util.List;

import static java.io.IO.println;
import static java.io.IO.readln;

public record View() {




    private String showToDo(ToDo toDo) {
        var done = "❌";
        if (toDo.completed()) {
            done = "✓";
        }
        return done + " " + toDo.text() + "\t\t\t\t ID: " + toDo.id();
    }

    public void printToDos(List<ToDo> toDos) {
        println("\t\ttodos");
        for (var toDoItem : toDos) {
            println(showToDo(toDoItem));
        }
    }

    public List<Integer> getIDs(List<ToDo> toDos){
        var ids = new ArrayList<Integer>();
        for (var toDoItem : toDos) {
                ids.add(toDoItem.id());
        }
        return ids;
    }

    private List<Integer> numbersFromZeroTo(int number){
        var smallerNumbersAsStrings = new ArrayList<Integer>();
        for (int i = 1; i <= number; i++){
            smallerNumbersAsStrings.add(i);
        }
        return smallerNumbersAsStrings;
    }

    public int askUntilElementInList(List<Integer> elems, String prompt) {
        var input = "";
        while (!NumberUtils.isCreatable(input) ||  !elems.contains(Integer.parseInt(input))) {
            println(prompt);
            input = readln();
        }
        return Integer.parseInt(input);
    }

    public int askUntilInputIsId(List<ToDo> toDos) {

        return askUntilElementInList(getIDs(toDos), "Enter the ID of the ToDo");
    }


    public int askUntilInputIsSmallerOrEqual(int upperBound) {
        return askUntilElementInList(numbersFromZeroTo(upperBound),"Enter a number between 1 and " + upperBound + " ein");
    }



    String numberToFilter(int number){
        return switch (number){
            case 1 -> "All";
            case 2 -> "Active";
            case 3 -> "Completed";
            default -> throw new IllegalStateException("Unexpected value: " + number);
        };
    }


}

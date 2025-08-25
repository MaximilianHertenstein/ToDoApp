package org.example;



public record ToDoItem(String text, boolean completed) {

    public ToDoItem(String text) {
        this(text, false);
    }

    public ToDoItem toggleDone() {
        return new ToDoItem(text, !completed);
    }

    public ToDoItem updateText(String text) {
        return new ToDoItem(text, completed);
    }

}





package org.example;



public record ToDoItem(int id, String text, boolean completed) {

    public ToDoItem(int id, String text) {
        this(id, text, false);
    }

    public ToDoItem toggleDone() {
        return new ToDoItem(id, text, !completed);
    }

    public ToDoItem updateText(String text) {
        return new ToDoItem(id, text, completed);
    }

}





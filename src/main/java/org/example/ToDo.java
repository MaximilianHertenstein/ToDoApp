package org.example;



public record ToDo(int id, String text, boolean completed) {

    public ToDo(int id, String text) {
        this(id, text, false);
    }

    public ToDo toggleDone() {
        return new ToDo(id, text, !completed);
    }

    public ToDo updateText(String text) {
        return new ToDo(id, text, completed);
    }

}





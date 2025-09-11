package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ModelTest {

    @Test
    void constructor_initializesCorrectly() {
        Model model = new Model();
        assertEquals("All", model.getFilteredToDos().isEmpty() ? "All" : model.getFilteredToDos().get(0).text());
        Model model2 = new Model(List.of(new ToDo(1, "Test", false)), "Active");
    }
    @Test
    void getToDosCompleted() {
        var toDos = List.of(
                new ToDo(1, "Kaffee trinken", false),
                new ToDo(2, "Rakete bauen", true),
                new ToDo(2, "App programmieren", true),
                new ToDo(3, "Welt retten", false)
        );
        Model modelActive = new Model(toDos, "Active");
        Model modelCompleted = new Model(toDos, "Completed");
        Model modelAll = new Model(toDos, "All");

        assertEquals(toDos, modelAll.getFilteredToDos());

        var activ = List.of(
                new ToDo(1, "Kaffee trinken", false),
                new ToDo(3, "Welt retten", false)
        );
        assertEquals(activ, modelActive.getFilteredToDos());

        var completed = List.of(
                new ToDo(2, "Rakete bauen", true),
                new ToDo(2, "App programmieren", true)
        );
        assertEquals(completed, modelCompleted.getFilteredToDos());
    }

    @Test
    void idToIndex() {
        Model model = new Model(List.of(
                new ToDo(3, "Kaffee trinken", false),
                new ToDo(5, "Rakete bauen", true),
                new ToDo(7, "App programmieren", true),
                new ToDo(2, "Welt retten", false)
        ), "All");
        assertEquals(0, model.idToIndex(3));
        assertEquals(1, model.idToIndex(5));
        assertEquals(2, model.idToIndex(7));
        assertEquals(3, model.idToIndex(2));
        assertEquals(-1, model.idToIndex(4));
    }

    @Test
    void getToDoItem() {
        Model model = new Model(List.of(
                new ToDo(3, "Kaffee trinken", false),
                new ToDo(5, "Rakete bauen", true),
                new ToDo(7, "App programmieren", true),
                new ToDo(2, "Welt retten", false)
        ), "All");
        assertEquals(new ToDo(5, "Rakete bauen", true), model.getToDoItem(5));
    }

    @Test
    void nextId() {
        Model model = new Model(List.of(
                new ToDo(1, "Kaffee trinken", false),
                new ToDo(5, "App programmieren", true),
                new ToDo(3, "Welt retten", false)
        ),"All");
        assertEquals(6, model.nextId());
    }

    @Test
    void add() {
        Model model = new Model();
        model.add("Kaffee trinken");
        assertEquals(new ToDo(1, "Kaffee trinken"), model.getToDoItem(1));
        model.add("Rakete bauen");
        assertEquals(new ToDo(2, "Rakete bauen"), model.getToDoItem(2));
    }

    @Test
    void toggle() {
        Model model = new Model(List.of(
                new ToDo(1, "Kaffee trinken", false),
                new ToDo(2, "Rakete bauen", true)
        ),"All");
        model.toggle(1);
        assertTrue(model.getToDoItem(1).completed());
        model.toggle(2);
        assertFalse(model.getToDoItem(2).completed());
    }

    @Test
    void updateText() {
        Model model = new Model(List.of(
                new ToDo(1, "Kaffee trinken", false)
        ),"All");
        model.updateText(1, "Katzen füttern");
        assertEquals("Katzen füttern", model.getToDoItem(1).text());
    }

    @Test
    void delete() {
        Model model = new Model(List.of(
                new ToDo(1, "Kaffee trinken", false),
                new ToDo(2, "Rakete bauen", true)
        ),"All");
        model.delete(2);
        assertEquals(-1, model.idToIndex(2));
        assertEquals(1, model.getFilteredToDos().size());
    }

    @Test
    void removeFinishedToDoItems() {
        Model model = new Model(List.of(
                new ToDo(3, "Kaffee trinken", false),
                new ToDo(5, "Rakete bauen", true),
                new ToDo(7, "App programmieren", true),
                new ToDo(2, "Welt retten", false)
        ),"All");
        model.removeFinishedToDoItems();
        assertEquals(0, model.getToDosCompleted(true).size());
    }

    @Test
    void removeFinishedToDoItems_allCompleted() {
        Model model = new Model(List.of(
                new ToDo(1, "A", true),
                new ToDo(2, "B", true)
        ), "All");
        model.removeFinishedToDoItems();
        assertTrue(model.getFilteredToDos().isEmpty());
    }

    @Test
    void showCountOfActiveToDoItems() {
        Model model = new Model(List.of(
                new ToDo(1, "Kaffee trinken", false),
                new ToDo(2, "Rakete bauen", false)
        ),"All");
        assertEquals("2 items left", model.showCountOfActiveToDoItems());
        model.toggle(1);
        model.toggle(2);
        assertEquals("0 items left", model.showCountOfActiveToDoItems());
        model.add("App programmieren");
        assertEquals("1 item left", model.showCountOfActiveToDoItems());
    }

    @Test
    void showCountOfActiveToDoItems_noneActive() {
        Model model = new Model(List.of(
                new ToDo(1, "A", true),
                new ToDo(2, "B", true)
        ), "All");
        assertEquals("0 items left", model.showCountOfActiveToDoItems());
    }

    @Test
    void setFilter_changesFilterCorrectly() {
        Model model = new Model(List.of(
                new ToDo(1, "A", false),
                new ToDo(2, "B", true)
        ), "All");
        model.setFilter("Completed");
        assertEquals(1, model.getFilteredToDos().size());
    }
}
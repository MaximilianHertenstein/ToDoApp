package org.example;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ModelTest {

//    @Test
//    void getToDosCompleted() {
//        var toDos = List.of(
//                new ToDo(1, "Kaffee trinken", false),
//                new ToDo(2, "Rakete bauen", true),
//                new ToDo(2, "App programmieren", true),
//                new ToDo(3, "Welt retten", false)
//        );
//        Model model = new Model(toDos);
//
//        var activ = List.of(
//                new ToDo(1, "Kaffee trinken", false),
//                new ToDo(3, "Welt retten", false)
//        );
//        assertEquals(activ, model.getToDosCompleted(false));
//
//        var completed = List.of(
//                new ToDo(2, "Rakete bauen", true),
//                new ToDo(2, "App programmieren", true)
//        );
//        assertEquals(completed, model.getToDosCompleted(true));
//    }
//
//    @Test
//    void getFilteredToDos() {
//        Model model = new Model(List.of(
//                new ToDo(1, "Kaffee trinken", false),
//                new ToDo(2, "Rakete bauen", true),
//                new ToDo(3, "App programmieren", true),
//                new ToDo(4, "Welt retten", false)
//        ));

//        // "Completed"
//        var completed = model.getToDosWithFilter("Completed");
//        assertEquals(2, completed.size());
//        assertEquals(new ToDo(2, "Rakete bauen", true), completed.get(0));
//        assertEquals(new ToDo(3, "App programmieren", true), completed.get(1));
//
//        // "Active"
//        var active = model.getToDosWithFilter("Active");
//        assertEquals(2, active.size());
//        assertEquals(new ToDo(1, "Kaffee trinken", false), active.get(0));
//        assertEquals(new ToDo(4, "Welt retten", false), active.get(1));
//
//        // "All" oder unbekannt
//        var all = model.getToDosWithFilter("All");
//        assertEquals(4, all.size());
//        var unknown = model.getToDosWithFilter("irgendwas");
//        assertEquals(4, unknown.size());
//        var nullStatus = model.getToDosWithFilter(null);
//        assertEquals(4, nullStatus.size());
//    }
//
//    @Test
//    void idToIndex() {
//        Model model = new Model(List.of(
//                new ToDo(3, "Kaffee trinken", false),
//                new ToDo(5, "Rakete bauen", true),
//                new ToDo(7, "App programmieren", true),
//                new ToDo(2, "Welt retten", false)
//        ));
//        assertEquals(0, model.idToIndex(3));
//        assertEquals(1, model.idToIndex(5));
//        assertEquals(2, model.idToIndex(7));
//        assertEquals(3, model.idToIndex(2));
//        assertEquals(-1, model.idToIndex(4));
//    }
//
//    @Test
//    void getToDoItem() {
//        Model model = new Model(List.of(
//                new ToDo(3, "Kaffee trinken", false),
//                new ToDo(5, "Rakete bauen", true),
//                new ToDo(7, "App programmieren", true),
//                new ToDo(2, "Welt retten", false)
//        ));
//        assertEquals(new ToDo(5, "Rakete bauen", true), model.getToDoItem(5));
//    }
//
//    @Test
//    void nextId() {
//        Model model = new Model(List.of(
//                new ToDo(1, "Kaffee trinken", false),
//                new ToDo(5, "App programmieren", true),
//                new ToDo(3, "Welt retten", false)
//        ));
//        assertEquals(6, model.nextId());
//    }
//
//    @Test
//    void add() {
//        Model model = new Model();
//        model.add("Kaffee trinken");
//        assertEquals(new ToDo(1, "Kaffee trinken"), model.getToDoItem(1));
//        model.add("Rakete bauen");
//        assertEquals(new ToDo(2, "Rakete bauen"), model.getToDoItem(2));
//    }
//
//    @Test
//    void toggle() {
//        Model model = new Model(List.of(
//                new ToDo(1, "Kaffee trinken", false),
//                new ToDo(2, "Rakete bauen", true)
//        ));
//        model.toggle(1);
//        assertTrue(model.getToDoItem(1).completed());
//        model.toggle(2);
//        assertFalse(model.getToDoItem(2).completed());
//    }
//
//    @Test
//    void updateText() {
//        Model model = new Model(List.of(
//                new ToDo(1, "Kaffee trinken", false)
//        ));
//        model.updateText(1, "Katzen füttern");
//        assertEquals("Katzen füttern", model.getToDoItem(1).text());
//    }
//
//    @Test
//    void delete() {
//        Model model = new Model(List.of(
//                new ToDo(1, "Kaffee trinken", false),
//                new ToDo(2, "Rakete bauen", true)
//        ));
//        model.delete(2);
//        assertEquals(-1, model.idToIndex(2));
//        assertEquals(1, model.getFilteredToDos().size());
//    }
//
//    @Test
//    void removeFinishedToDoItems() {
//        Model model = new Model(List.of(
//                new ToDo(3, "Kaffee trinken", false),
//                new ToDo(5, "Rakete bauen", true),
//                new ToDo(7, "App programmieren", true),
//                new ToDo(2, "Welt retten", false)
//        ));
//        model.removeFinishedToDoItems();
//        assertEquals(0, model.getToDosCompleted(true).size());
//        //assertEquals(2, model.getToDosWithFilter("All").size());
//    }
//
//    @Test
//    void showCountOfActiveToDoItems() {
//        Model model = new Model(List.of(
//                new ToDo(1, "Kaffee trinken", false),
//                new ToDo(2, "Rakete bauen", false)
//        ));
//        assertEquals("2 items left", model.showCountOfActiveToDoItems());
//        model.toggle(1);
//        model.toggle(2);
//        assertEquals("0 items left", model.showCountOfActiveToDoItems());
//        model.add("App programmieren");
//        assertEquals("1 item left", model.showCountOfActiveToDoItems());
//    }
}
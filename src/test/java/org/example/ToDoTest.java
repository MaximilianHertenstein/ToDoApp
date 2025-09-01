package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ToDoTest {


    ToDo task1 =       new ToDo(1, "IFT-Homework", false);
    ToDo task2 =       new ToDo(2, "Drink Coffee", true);
    ToDo task3 =       new ToDo(3, "Write an App", false);


    @Test
    void toggleDone() {
        assertEquals(new ToDo(1, "IFT-Homework", true), task1.toggle());
        assertEquals(new ToDo(2, "Drink Coffee", false), task2.toggle());
        assertEquals(new ToDo(3, "Write an App", true), task3.toggle());
    }

    @Test
    void updateText() {
        assertEquals(new ToDo(1, "Katzen füttern", false), task1.updateText("Katzen füttern"));
        assertEquals(new ToDo(2, "Rakete bauen", true), task2.updateText("Rakete bauen"));
        assertEquals(new ToDo(3, "Welt retten", false), task3.updateText("Welt retten"));
    }

}
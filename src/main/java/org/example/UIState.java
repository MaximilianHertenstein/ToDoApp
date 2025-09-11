package org.example;

import java.util.List;

public record UIState(String selectedFilter, List<ToDo> selectedToDos ,String displayOfActiveToDos) {
}
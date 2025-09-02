package org.example;

import java.util.List;

public record UIState(String currentFilter, List<ToDo> selectedToDos ,String displayOfActiveToDos) {
}
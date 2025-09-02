package org.example;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private ArrayList<ToDo> toDos;
    private String selectedFilter = "All";


    public Model() {
        this.toDos = new ArrayList<>();
        selectedFilter = "All";
    }

    public Model(List<ToDo> toDos, String selectedFilter) {
        this.selectedFilter = selectedFilter;
        this.toDos = new ArrayList<>(toDos);
    }

    public List<ToDo> getToDosCompleted(boolean status) {
        var acc = new ArrayList<ToDo>();
        for (var item : toDos) {
            if (item.completed() == status) {
                acc.add(item);
            }
        }
        return acc;
    }



    public List<ToDo> getFilteredToDos() {
        return switch (selectedFilter) {
            case "Completed" -> getToDosCompleted(true);
            case "Active" -> getToDosCompleted(false);
            case null, default -> toDos;
        };
    }




    public int idToIndex(int id) {
        for (int i = 0; i < toDos.size(); i++) {
            if (toDos.get(i).id() == id) {
                return i;
            }
        }
        return -1;
    }

    public ToDo getToDoItem(int id) {
        return toDos.get(idToIndex(id));
    }



    public int nextId() {
        if (toDos.size() == 0) {
            return 1;
        }
        int max = toDos.get(0).id();
        for (int i = 1; i < toDos.size(); i++) {
            if (toDos.get(i).id() > max) {
                max = toDos.get(i).id();
            }
        }
        return max + 1;
    }
    public void add(String text) {
        toDos.add(new ToDo(nextId(), text));
    }


    public void toggle(int id) {
        int index = idToIndex(id);
        toDos.set(index, toDos.get(index).toggle());
    }

    public void updateText(int id, String text) {
        int index = idToIndex(id);
        toDos.set(index, toDos.get(index).updateText(text));
    }

    public void delete(int id) {
        int index = idToIndex(id);
        toDos.remove(index);
    }

    public void removeFinishedToDoItems() {
        toDos = new ArrayList<>(getToDosCompleted(false));
    }

    public String showCountOfActiveToDoItems() {
        int countOfActiveToDoItems = getToDosCompleted(false).size();
        var sOrEmpty = "s";
        if (countOfActiveToDoItems == 1) {
            sOrEmpty = "";
        }
        return countOfActiveToDoItems + " item" + sOrEmpty + " left";
    }

    public void setFilter(String newFilter) {
        selectedFilter = newFilter;
    }

    public UIState getUIState(){
        return new UIState(selectedFilter, getFilteredToDos(), showCountOfActiveToDoItems());
    }

}

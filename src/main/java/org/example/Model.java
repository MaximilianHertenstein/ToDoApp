package org.example;

import java.util.ArrayList;
import java.util.List;

public class Model {
    private ArrayList<ToDo> toDos;

    public Model() {
        this.toDos = new ArrayList<>();
    }

    public Model(List<ToDo> toDos) {
        this.toDos = new ArrayList<>(toDos);
    }

    private List<ToDo> getToDoItems(boolean status) {
        var acc = new ArrayList<ToDo>();
        for (var item : toDos) {
            if (item.completed() == status) {
                acc.add(item);
            }
        }
        return acc;
    }

    private int nextId() {
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

    private int idToIndex(int id) {
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

    private List<ToDo> getActiveToDoItems() {
        return getToDoItems(false);
    }

    public void add(String text) {
        toDos.add(new ToDo(nextId(), text));
    }

    public void removeFinishedToDoItems() {
        toDos = new ArrayList<>(getActiveToDoItems());
    }

    public List<ToDo> getItemsWithStatus(String status) {
        return switch (status) {
            case "Completed" -> getToDoItems(true);
            case "Active" -> getToDoItems(false);
            case null, default -> toDos;
        };
    }

    public void toggle(int id) {
        int index = idToIndex(id);
        toDos.set(index, toDos.get(index).toggleDone());
    }

    public void set(int id, String text) {
        int index = idToIndex(id);
        toDos.set(index, toDos.get(index).updateText(text));
    }

    public void delete(int id) {
        int index = idToIndex(id);
        toDos.remove(index);
    }

    public String showCountOfActiveToDoItems() {
        int countOfActiveToDoItems = getActiveToDoItems().size();
        var sOrEmpty = "s";
        if (countOfActiveToDoItems == 1) {
            sOrEmpty = "";
        }
        return countOfActiveToDoItems + " item" + sOrEmpty + " left";
    }

}

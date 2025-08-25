package org.example;



import java.util.ArrayList;
import java.util.List;






public class Model {
    private ArrayList<ToDoItem> toDoItems;

    public Model() {
        this.toDoItems = new ArrayList<>();
    }

    public Model(List<ToDoItem> toDoItems) {
        this.toDoItems = new ArrayList<>(toDoItems);
    }

    private List<ToDoItem> getToDoItems(boolean status) {
        var acc = new ArrayList<ToDoItem>();
        for (var item : toDoItems) {
            if (item.completed() == status) {
                acc.add(item);
            }
        }
        return acc;
    }


    public void add(String text) {
        toDoItems.add(new ToDoItem(text));
    }

    public List<ToDoItem> getToDoItems() {
        return toDoItems;
    }

    public List<ToDoItem> getFinishedToDoItems() {
        return getToDoItems(true);
    }

    public List<ToDoItem> getActiveToDoItems() {
        return getToDoItems( false);
    }


    public void removeFinishedToDoItems() {
        toDoItems = new ArrayList<>(getActiveToDoItems());
    }


    public List<ToDoItem> getItemsWithStatus(String status) {
        return switch (status){
            case "Completed" ->  getToDoItems(true);
            case "Active" ->  getToDoItems(false);
            case null, default -> getToDoItems();
        };
    }


    public void toggle(int i) {
        toDoItems.set(i, toDoItems.get(i).toggleDone());
    }

    public void set(int i, String text) {
        toDoItems.set(i, toDoItems.get(i).updateText(text));
    }

    public void delete(int i) {
        toDoItems.remove(i);
    }

    public int countActiveToDoItems() {
        return getActiveToDoItems().size();
    }
}

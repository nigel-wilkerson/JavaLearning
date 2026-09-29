package oopArrayList;

import java.util.ArrayList;

/**
 * Name: Nigel Wilkerson
 * File: GroceryList.java
 * Version: 1.0
 * Date: 9/27/2026
 * Description:
 */

public class GroceryList {

    private ArrayList<String> items = new ArrayList<>();
    private String listName;

    public GroceryList(String listName) {
        this.listName = listName;
    }

    public void addItem(String item) {
        items.add(item);
        System.out.println(item + " added to " + listName + ".");
    }

    public void removeItem(String item) {
        boolean removed = items.remove(item);
        if (removed) {
            System.out.println(item + " removed.");
        } else {
            System.out.println(item + " not found.");
        }
    }

    public boolean hasItem(String item) {
        return items.contains(item);
    }

    public int getItemCount(){
        return items.size();
    }

    public void showList() {
        if (items.isEmpty()) {
            System.out.println(listName + " is empty.");
            return;
        }
        System.out.println(listName);
        for (int i = 0; i < items.size(); i++) {
            System.out.println((i + 1) + ". " + items.get(i));
        }
    }

    public void clearList(){
        items.clear();
        System.out.println(listName + " has been cleared.");
    }
}

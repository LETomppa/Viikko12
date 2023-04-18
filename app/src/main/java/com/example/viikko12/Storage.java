package com.example.viikko12;

import java.util.ArrayList;

public class Storage {
    ArrayList<Item> items = new ArrayList<>();

    ArrayList<Item> importantItems = new ArrayList<>();
    private static Storage storage = null;

    private Storage() {}

    public static Storage getInstance() {
        if (storage == null) {
            storage = new Storage();
        }
        return storage;
    }

    public void addItem(Item item) {
        items.add(item);
    }

    public void addImportantItems(Item item) {importantItems.add(item);}

    public ArrayList<Item> getImportantItems() {return importantItems;}
    public ArrayList<Item> getItems() {return items;}

    public Item getItemByID(int id) {return items.get(id);}

}
package com.example.viikko12;

import java.util.Date;
import java.util.UUID;

public class Item{
    private String Item;
    private String Info;
    private boolean isImportant;
    private String ID;

    private Date dateAdded;

    public Item (String Item, String Info, boolean isImportant) {
        this.Item = Item;
        this.Info = Info;
        this.isImportant = isImportant;
        this.ID = UUID.randomUUID().toString();
    }

    public String getItem() {return Item;}

    public String getInfo() {return Info;}

    public boolean isImportant() {
        return isImportant;
    }
}
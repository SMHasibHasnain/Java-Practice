package com.smhasib.exercise.Library;

public class DVD extends LibraryItem {
    protected String duration;

    public DVD(String itemID, String title, String author, String duration) {
        this.itemID = itemID;
        this.title = title;
        this.author = author;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "DVD [itemID=" + itemID + ", duration=" + duration + ", title=" + title + ", author=" + author + "]";
    }

}

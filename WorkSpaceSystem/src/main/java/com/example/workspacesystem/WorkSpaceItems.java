package com.example.workspacesystem;

// Base class for WorkSpaceItems
abstract public class WorkSpaceItems {
    private String title;
    private String author;
//Constructor
    public WorkSpaceItems(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public WorkSpaceItems() {

    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {this.author = author;}
}
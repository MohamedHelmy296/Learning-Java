package com.example.workspacesystem;

// Base class for WorkSpaceUser
abstract public class WorkSpaceUser {
    private String name;
    private int userId;
//Constructor
    public WorkSpaceUser(String name, int userId) {
        this.name = name;
        this.userId = userId;
    }

    public WorkSpaceUser() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}

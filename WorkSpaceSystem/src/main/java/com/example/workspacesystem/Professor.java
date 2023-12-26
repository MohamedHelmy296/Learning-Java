package com.example.workspacesystem;

import java.util.Objects;

// Inherited class for Professor
public class Professor extends WorkSpaceUser {
    private String department;
    private String issn;


    public Professor(String name, int userId, String department) {
        super(name, userId);
        this.department = department;
    }

    public Professor() {
        super();
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Professor otherProfessor = (Professor) obj;
        return Objects.equals(issn, otherProfessor.issn);
    }
}
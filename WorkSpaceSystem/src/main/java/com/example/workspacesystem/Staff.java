package com.example.workspacesystem;

import java.util.Objects;

// Inherited class for Staff
public class Staff extends WorkSpaceUser {
    private String position;
    private String issn;

    public Staff(String name, int userId, String position) {
        super(name, userId);
        this.position = position;
    }

    public Staff() {
        super();
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Staff otherStaff = (Staff) obj;
        return Objects.equals(issn, otherStaff.issn);
    }
}

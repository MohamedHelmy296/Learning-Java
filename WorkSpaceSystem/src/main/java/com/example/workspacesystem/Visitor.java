package com.example.workspacesystem;

import java.util.Objects;

// Inherited class for Visitor
public class Visitor extends WorkSpaceUser {
    private String purpose;
    private String issn;


    public Visitor(String name, int userId, String purpose) {
        super(name, userId);
        this.purpose = purpose;
    }

    public Visitor() {
        super();
    }

    public String getPurpose() {
        return purpose;
    }

    public void setPurpose(String purpose) {
        this.purpose = purpose;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Visitor otherVisitor = (Visitor) obj;
        return Objects.equals(issn, otherVisitor.issn);
    }

}
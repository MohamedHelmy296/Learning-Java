package com.example.workspacesystem;// Inherited class for Magazine

import java.util.Objects;

public class Magazine extends WorkSpaceItems {
    private int version;
    private String issn;

    public Magazine(String title, String author, int version) {
        super(title, author);
        this.version = version;
    }

    public Magazine() {
        super();
    }

    public int getVersion() {
        return version;
    }

    public void setVersion(int version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Magazine otherMagazine = (Magazine) obj;
        return Objects.equals(issn, otherMagazine.issn);
    }

}
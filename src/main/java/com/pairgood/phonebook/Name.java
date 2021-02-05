package com.pairgood.phonebook;

public class Name {
    private String first;
    private String last;

    public Name(String first, String last) {
        this.first = first;
        this.last = last;
    }

    public String getLast() {
        return last;
    }

    public String getFirst() {
        return first;
    }
}

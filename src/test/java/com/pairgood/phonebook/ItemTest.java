package com.pairgood.phonebook;

import org.junit.Test;

import static org.junit.Assert.*;

public class ItemTest {

    @Test
    public void getFullName_ShouldDisplayLastCommaFirst() {
        Name name = new Name("first", "last");
        Item item = new Item(name, "test phone");

        assertEquals("last, first", item.getFullName());
    }

    @Test
    public void getFullName_WhenNullsProvided_ShouldDisplayNullCommaNull() {
        Name name = new Name(null, null);
        Item item = new Item(name, "test phone");

        assertEquals("null, null", item.getFullName());
    }

    @Test(expected = NullPointerException.class)
    public void getFullName_WhenNullName_ShouldThrowNullPointerException() {
        Name name = null;
        Item item = new Item(name, "test phone");

        item.getFullName();
    }
}
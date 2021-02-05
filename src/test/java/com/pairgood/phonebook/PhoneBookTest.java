package com.pairgood.phonebook;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertEquals;

public class PhoneBookTest {

    @Test
    public void listNames_ShouldListLastNamesInAlphabeticalOrder() {
        PhoneBook phoneBook = new PhoneBook();

        Item firstItem = new Item(new Name("BBFirst", "BBLast"), "111-222-3333");
        Item secondItem = new Item(new Name("CCFirst", "AALast"), "222-333-4444");
        Item thirdItem = new Item(new Name("AAFirst", "CCLast"), "333-444-5555");

        phoneBook.add(firstItem);
        phoneBook.add(secondItem);
        phoneBook.add(thirdItem);

        List<Item> items = phoneBook.listByLastName();

        assertEquals(3, items.size());

        assertEquals("AALast, CCFirst", items.get(0).getFullName());
        assertEquals("BBLast, BBFirst", items.get(1).getFullName());
        assertEquals("CCLast, AAFirst", items.get(2).getFullName());
    }


    @Test
    public void listNames_ShouldListTheSameLastNameByTheFirstNameInAlphabeticalOrder() {
        PhoneBook phoneBook = new PhoneBook();

        Item firstItem = new Item(new Name("BBFirst", "BBLast"), "111-222-3333");
        Item secondItem = new Item(new Name("CCFirst", "AALast"), "222-333-4444");
        Item thirdItem = new Item(new Name("AAFirst", "BBLast"), "333-444-5555");

        phoneBook.add(firstItem);
        phoneBook.add(secondItem);
        phoneBook.add(thirdItem);

        List<Item> items = phoneBook.listByLastName();

        assertEquals(3, items.size());

        assertEquals("AALast, CCFirst", items.get(0).getFullName());
        assertEquals("BBLast, AAFirst", items.get(1).getFullName());
        assertEquals("BBLast, BBFirst", items.get(2).getFullName());
    }
}

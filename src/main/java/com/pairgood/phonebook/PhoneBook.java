package com.pairgood.phonebook;

import com.pairgood.phonebook.sort.NameSorter;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class PhoneBook {

    private final List<Item> items;
    private final NameSorter nameSorter;

    public PhoneBook() {
        items = new ArrayList<>();
        nameSorter = new NameSorter();
    }

    public List<Item> listByLastName() {
        Collections.sort(items, nameSorter);
        return items;
    }

    public void add(Item item) {
        items.add(item);
    }
}

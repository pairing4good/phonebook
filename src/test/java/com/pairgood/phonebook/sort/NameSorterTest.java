package com.pairgood.phonebook.sort;

import com.pairgood.phonebook.Item;
import com.pairgood.phonebook.Name;
import org.junit.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.Assert.*;

public class NameSorterTest {

    @Test
    public void compare_WhenSameName_ShouldLeaveOrderTheSame() {
        Name firstName = new Name("test", "test");
        Name secondName = new Name("test", "test");

        List<Item> items = Arrays.asList(
                new Item(firstName, ""),
                new Item(secondName, ""));

        NameSorter nameSorter = new NameSorter();

        Collections.sort(items, nameSorter);

        assertSame(firstName, items.get(0).getName());
        assertSame(secondName, items.get(1).getName());
    }

    @Test
    public void compare_WhenAlreadyInAlphabeticalOrder_ShouldLeaveOrderTheSame() {
        Name firstName = new Name("atest", "atest");
        Name secondName = new Name("btest", "btest");

        List<Item> items = Arrays.asList(
                new Item(firstName, ""),
                new Item(secondName, ""));

        NameSorter nameSorter = new NameSorter();

        Collections.sort(items, nameSorter);

        assertSame(firstName, items.get(0).getName());
        assertSame(secondName, items.get(1).getName());
    }

    @Test
    public void compare_WhenLastNamesInReverseOrder_ShouldReorderNamesInAlphabeticalOrder() {
        Name firstName = new Name("btest", "btest");
        Name secondName = new Name("atest", "atest");

        List<Item> items = Arrays.asList(
                new Item(firstName, ""),
                new Item(secondName, ""));

        NameSorter nameSorter = new NameSorter();

        Collections.sort(items, nameSorter);

        assertSame(secondName, items.get(0).getName());
        assertSame(firstName, items.get(1).getName());
    }

    @Test
    public void compare_WhenLastNamesTheSameAndFirstNamesInReverseOrder_ShouldReorderFullNamesInAlphabeticalOrder() {
        Name firstName = new Name("btest", "btest");
        Name secondName = new Name("atest", "btest");

        List<Item> items = Arrays.asList(
                new Item(firstName, ""),
                new Item(secondName, ""));

        NameSorter nameSorter = new NameSorter();

        Collections.sort(items, nameSorter);

        assertSame(secondName, items.get(0).getName());
        assertSame(firstName, items.get(1).getName());
    }
}
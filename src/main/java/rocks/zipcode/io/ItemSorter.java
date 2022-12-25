package rocks.zipcode.io;

import java.util.Arrays;
import java.util.Comparator;

/**
 * @author leon on 30/01/2019.
 */
public class ItemSorter {
    Item[] itemsToSort;
    public ItemSorter(Item[] items) {
        this.itemsToSort = items;
    }

    public Item[] sort(Comparator<Item> comparator) {
        Arrays.sort(itemsToSort,comparator);
        return itemsToSort;
    }


}

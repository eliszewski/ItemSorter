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
        int i,j;
        Item temp;
        for (i = 0; i < this.itemsToSort.length - 1 ; i++) {
            boolean changed = false;
            for (j = 0; j < this.itemsToSort.length - i - 1 ; j++) {
                if(comparator.compare(this.itemsToSort[j],this.itemsToSort[j+1]) > 0){
                    temp = this.itemsToSort[j];
                    this.itemsToSort[j] = this.itemsToSort[j+1];
                    this.itemsToSort[j + 1] = temp;
                    changed = true;
                }
            }
            if(!changed) break;
        }
        return this.itemsToSort;
    }


}

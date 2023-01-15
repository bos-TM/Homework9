package Task2;

import java.util.Arrays;

public class MyList<T> implements IMyList{
    T[] items;

    public MyList() {
    }

    public MyList(T[] items) {
        this.items = items;
    }

    @Override
    public T[] Add(Object item) {
        T itemTemp = (T)item;
        T[] itemsList;
        if(this.items == null){
            items = (T[]) new Object[] {itemTemp};
        } else {
            itemsList = (T[]) new Object[items.length + 1];

            for (int i = 0; i < items.length; i++) {
                   itemsList[i] = items[i];
            }
            items = itemsList;
            items[items.length - 1] = itemTemp;
        }
        return items;
    }

    @Override
    public T Indexer(int index) {
        if(items == null || index >= items.length)
            return null;
        return items[index];
    }

    @Override
    public int NumberAllElements() {
        if(items == null)
            return 0;
        return items.length;
    }

    @Override
    public String toString() {
        return Arrays.toString(items);
    }
}

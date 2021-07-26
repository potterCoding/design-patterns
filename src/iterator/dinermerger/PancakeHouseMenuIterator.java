package iterator.dinermerger;

import java.util.List;

public class PancakeHouseMenuIterator implements Iterator<MenuItem> {

    List<MenuItem> items;
    int position = 0;

    public PancakeHouseMenuIterator(List<MenuItem> items) {
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        if (position >= items.size()) {
            return false;
        } else {
            return true;
        }
    }

    @Override
    public Object next() {
        MenuItem item = items.get(position);
        position = position + 1;
        return item;
    }
}

package N1;


import java.util.Collection;

public class BoundedWaitList<E> extends WaitList {
    private final int capacity;

    public BoundedWaitList(int capacity)
    {
        this.capacity = capacity;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public void add(Object element)
    {
        if (list.size() < capacity)
        {
            list.add(element);
        }
    }

    @Override
    public String toString()
    {
        return "BoundedWaitList{" +
                "capacity=" + capacity +
                ", list=" + list +
                '}';
    }
}

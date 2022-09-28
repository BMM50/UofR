import java.util.Collection;
import java.util.Iterator;

public class URArrayList<E> implements URList<E>, Iterable<E>{

    private Object[] elementList;
    private int size;

    public URArrayList()
    {
        elementList = new Object[0];
    }

    public URArrayList(int initialSize)
    {
        size = initialSize;
        if (size >= 0)
            elementList = new Object[size];
        else
            throw new IllegalArgumentException("Illegal Capacity: " + size);
    }

    /*public URArrayList(Collection<? extends E> c)
    {
        size = c.size();
        c.toArray();
        for (int i = 0; i < size; i++)
        {
            elementList[i] = c[i]; //ERROR
        }
    }*/

    @Override
    // Appends the specified element to the end of this list
    public boolean add(E e) 
    {
        add(elementList.length-1, e);
        return true;
    }

    @Override
    // Inserts the specified element at the specified position in this list
    public void add(int index, E element) 
    {
        Object[] newElementList = new Object[size++];
        for (int i = 0; i < newElementList.length; i++)
        {
            if (i == index)
            {
                newElementList[i] = elementList[i];
                i++;
            }
            else
                newElementList[i] = elementList[i];
        }

        for (int j = 0; j < elementList.length; j++)
            elementList[j] = newElementList[j];
    }

    @Override //UNFINISH
    // Appends all of the elements in the specified collection to the end of this list,
    // in the order that they are returned by the specified collection's iterator
    public boolean addAll(Collection<? extends E> c) {
        Object[] a = c.toArray();
        
        return true;
    }

    @Override //UNFINISH
    // Inserts all of the elements in the specified collection into this list
    // at the specified position
    public boolean addAll(int index, Collection<? extends E> c) {

        return false;
    }

    @Override
    // Removes all of the elements from this list
    public void clear() {
        for (int i = 0; i < size; i++)
            elementList[i] = null;
    }

    @Override
    // Returns true if this list contains the specified element.
    public boolean contains(Object o) {
        for (int i = 0; i < size; i++)
            if (elementList[i].equals(o))
                return true;

        return false;
    }

    @Override //UNFINISHED
    // Returns true if this list contains all of the elements of the specified collection
    public boolean containsAll(Collection<?> c) {

        return false;
    }

    @Override
    // Returns the element at the specified position in this list.
    public E get(int index) {
        return elementList[index];
    }

    @Override
    // Returns the index of the first occurrence of the specified element in this list,
    // or -1 if this list does not contain the element.
    public int indexOf(Object o) {

        return 0;
    }

    @Override
    // Returns true if this list contains no elements.
    public boolean isEmpty() {

        return false;
    }

    @Override
    // Returns an iterator over the elements in this list in proper sequence.
    public Iterator<E> iterator() {
        return this.iterator();
    }

    @Override
    // Removes the element at the specified position in this list
    public E remove(int index) {

        return null;
    }

    @Override
    // Removes the first occurrence of the specified element from this list,
    // if it is present
    public boolean remove(Object o) {

        return false;
    }

    @Override
    // Removes from this list all of its elements that are contained // in the specified collection 
    public boolean removeAll(Collection<?> c) {

        return false;
    }

    @Override
    // Replaces the element at the specified position in this list
    // with the specified element
    public E set(int index, E element) {

        return null;
    }

    @Override
    // Returns the number of elements in this list.
    public int size() {

        return 0;
    }

    @Override
    // Returns a view of the portion of this list
    // between the specified fromIndex, inclusive, and toIndex, exclusive.
    public URList<E> subList(int fromIndex, int toIndex) {

        return null;
    }

    @Override
    // Returns an array containing all of the elements in this list 
    // in proper sequence (from first to the last element).
    public Object[] toArray() {

        return null;
    }
    
    // Increases the capacity of this ArrayList instance, if necessary,
    // to ensure that it can hold at least the number of elements specified
    // by the minimum capacity argument.
    public void ensureCapacity(int minCapacity)
    {

    }


    // Returns the current capacity of the list
    public int getCapacity()
    {
        return -1;
    }

}

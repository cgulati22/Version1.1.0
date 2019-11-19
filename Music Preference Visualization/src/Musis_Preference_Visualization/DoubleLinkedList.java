package Musis_Preference_Visualization;

<<<<<<< HEAD


=======
>>>>>>> 8a892bf6ae55e919ff3a0e9c2ff630daa69a4305
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * This provides implementation for some of the LList methods.
 *
 * @author Mark Wiggans (mmw125)
 * @version 3/29/15
 * @author Eric Williamson
 * @version 10/30/15
 * @author maellis1
 * @version 11/1/15
<<<<<<< HEAD
 * @param <E>
 *            The type of object the class will store
 */
public class DoubleLinkedList<T> {
=======
 * @author Chirag Gulati(cgulati)
 * @version 11/18/19
 * @param <E>
 *            The type of object the class will store
 */
public class DoubleLinkedList<E> implements ListInterface<E> {
>>>>>>> 8a892bf6ae55e919ff3a0e9c2ff630daa69a4305

    /**
     * This represents a node in a doubly linked list. This node stores data, a
     * pointer to the node before it in the list, and a pointer to the node
     * after it in the list
     *
<<<<<<< HEAD
     * @param <T>
     *            This is the type of object that this class will store
     * @author Mark Wiggans (mmw125)
     * @version 4/14/2015
     */
    private static class Node<T> {
        private Node<T> next;
        private Node<T> previous;
        private T data;
=======
     * @param <E>
     *            This is the type of object that this class will store
     * @author Mark Wiggans (mmw125)
     * @version 4/14/2015
     * @author Chirag Gulati (cgulati)
     */
    private static class Node<E> {
        private Node<E> next;
        private Node<E> previous;
        private E data;
>>>>>>> 8a892bf6ae55e919ff3a0e9c2ff630daa69a4305


        /**
         * Creates a new node with the given data
         *
         * @param d
         *            the data to put inside the node
         */
<<<<<<< HEAD
        public Node(T d) {
=======
        public Node(E d) {
>>>>>>> 8a892bf6ae55e919ff3a0e9c2ff630daa69a4305
            data = d;
        }


        /**
         * Sets the node after this node
         *
         * @param n
         *            the node after this one
         */
<<<<<<< HEAD
        public void setNext(Node<T> n) {
=======
        public void setNext(Node<E> n) {
>>>>>>> 8a892bf6ae55e919ff3a0e9c2ff630daa69a4305
            next = n;
        }


        /**
         * Sets the node before this one
         *
         * @param n
         *            the node before this one
         */
<<<<<<< HEAD
        public void setPrevious(Node<T> n) {
=======
        public void setPrevious(Node<E> n) {
>>>>>>> 8a892bf6ae55e919ff3a0e9c2ff630daa69a4305
            previous = n;
        }


        /**
         * Gets the next node
         *
         * @return the next node
         */
<<<<<<< HEAD
        public Node<T> next() {
=======
        public Node<E> next() {
>>>>>>> 8a892bf6ae55e919ff3a0e9c2ff630daa69a4305
            return next;
        }


        /**
         * Gets the node before this one
         *
         * @return the node before this one
         */
<<<<<<< HEAD
        public Node<T> previous() {
=======
        public Node<E> previous() {
>>>>>>> 8a892bf6ae55e919ff3a0e9c2ff630daa69a4305
            return previous;
        }


        /**
         * Gets the data in the node
         *
         * @return the data in the node
         */
<<<<<<< HEAD
        public T getData() {
=======
        public E getData() {
>>>>>>> 8a892bf6ae55e919ff3a0e9c2ff630daa69a4305
            return data;
        }
    }

    /**
     * How many nodes are in the list
     */
    private int size;

    /**
     * The first node in the list. THIS IS A SENTINEL NODE AND AS SUCH DOES NOT
     * HOLD ANY DATA. REFER TO init()
     */
<<<<<<< HEAD
    private Node<T> head;
=======
    private Node<E> head;
>>>>>>> 8a892bf6ae55e919ff3a0e9c2ff630daa69a4305

    /**
     * The last node in the list. THIS IS A SENTINEL NODE AND AS SUCH DOES NOT
     * HOLD ANY DATA. REFER TO init()
     */
<<<<<<< HEAD
    private Node<T> tail;
=======
    private Node<E> tail;
>>>>>>> 8a892bf6ae55e919ff3a0e9c2ff630daa69a4305


    /**
     * Create a new DLList object.
     */
    public DoubleLinkedList() {
        init();
    }


    /**
     * Initializes the object to have the head and tail nodes
     */
    private void init() {
<<<<<<< HEAD
        head = new DoubleLinkedList.Node<T>(null);
        tail = new DoubleLinkedList.Node<T>(null);
=======
        head = new DoubleLinkedList.Node<E>(null);
        tail = new DoubleLinkedList.Node<E>(null);
>>>>>>> 8a892bf6ae55e919ff3a0e9c2ff630daa69a4305
        head.setNext(tail);
        tail.setPrevious(head);
        size = 0;
    }


    /**
     * Checks if the array is empty
     *
     * @return true if the array is empty
     */
    public boolean isEmpty() {
        return size == 0;
    }


    /**
     * Gets the number of elements in the list
     *
     * @return the number of elements
     */
    public int size() {
        return size;
    }


    /**
     * Removes all of the elements from the list
     */
    public void clear() {
        init();
    }


    /**
     * Checks if the list contains the given object
     *
     * @param obj
     *            the object to check for
     * @return true if it contains the object
     */
<<<<<<< HEAD
    public boolean contains(T obj) {
=======
    public boolean contains(E obj) {
>>>>>>> 8a892bf6ae55e919ff3a0e9c2ff630daa69a4305
        return lastIndexOf(obj) != -1;
    }


    /**
     * Gets the object at the given position
     *
     * @param index
     *            where the object is located
     * @return The object at the given position
     * @throws IndexOutOfBoundsException
     *             if there no node at the given index
     */
<<<<<<< HEAD
    public T get(int index) {
=======
    public E get(int index) {
>>>>>>> 8a892bf6ae55e919ff3a0e9c2ff630daa69a4305
        return getNodeAtIndex(index).getData();
    }


    /**
     * Adds a element to the end of the list
     *
     * @param newEntry
     *            the element to add to the end
     */
<<<<<<< HEAD
    public void add(T newEntry) {
=======
    public void add(E newEntry) {
>>>>>>> 8a892bf6ae55e919ff3a0e9c2ff630daa69a4305
        add(size(), newEntry);
    }


    /**
     * Adds the object to the position in the list
     *
     * @param index
     *            where to add the object
     * @param obj
     *            the object to add
     * @throws IndexOutOfBoundsException
     *             if index is less than zero or greater than size
     * @throws IllegalArgumentException
     *             if obj is null
     */
<<<<<<< HEAD
    public void add(int index, T obj) {
=======
    public void add(int index, E obj) {
>>>>>>> 8a892bf6ae55e919ff3a0e9c2ff630daa69a4305
        if (index < 0 || size < index) {
            throw new IndexOutOfBoundsException();
        }
        if (obj == null) {
            throw new IllegalArgumentException("Cannot add null "
                + "objects to a list");
        }

<<<<<<< HEAD
        Node<T> nodeAfter;
=======
        Node<E> nodeAfter;
>>>>>>> 8a892bf6ae55e919ff3a0e9c2ff630daa69a4305
        if (index == size) {
            nodeAfter = tail;
        }
        else {
            nodeAfter = getNodeAtIndex(index);
        }

<<<<<<< HEAD
        Node<T> addition = new Node<T>(obj);
=======
        Node<E> addition = new Node<E>(obj);
>>>>>>> 8a892bf6ae55e919ff3a0e9c2ff630daa69a4305
        addition.setPrevious(nodeAfter.previous());
        addition.setNext(nodeAfter);
        nodeAfter.previous().setNext(addition);
        nodeAfter.setPrevious(addition);
        size++;

    }


    /**
     * gets the node at that index
     * 
     * @param index
     * @return node at index
     */
<<<<<<< HEAD
    private Node<T> getNodeAtIndex(int index) {
=======
    private Node<E> getNodeAtIndex(int index) {
>>>>>>> 8a892bf6ae55e919ff3a0e9c2ff630daa69a4305
        if (index < 0 || size() <= index) {
            throw new IndexOutOfBoundsException("No element exists at "
                + index);
        }
<<<<<<< HEAD
        Node<T> current = head.next(); // as we have a sentinel node
=======
        Node<E> current = head.next(); // as we have a sentinel node
>>>>>>> 8a892bf6ae55e919ff3a0e9c2ff630daa69a4305
        for (int i = 0; i < index; i++) {
            current = current.next();
        }
        return current;
    }


    /**
     * Gets the last time the given object is in the list
     *
     * @param obj
     *            the object to look for
     * @return the last position of it. -1 If it is not in the list
     */
<<<<<<< HEAD
    public int lastIndexOf(T obj) {
=======
    public int lastIndexOf(E obj) {
>>>>>>> 8a892bf6ae55e919ff3a0e9c2ff630daa69a4305
        /*
         * We should go from the end of the list as then we an stop once we find
         * the first one
         */
<<<<<<< HEAD
        Node<T> current = tail.previous();
=======
        Node<E> current = tail.previous();
>>>>>>> 8a892bf6ae55e919ff3a0e9c2ff630daa69a4305
        for (int i = size() - 1; i >= 0; i--) {
            if (current.getData().equals(obj)) {
                return i;
            }
            current = current.previous();
        }
        return -1; // if we do not find it
    }


    /**
     * Removes the element at the specified index from the list
     *
     * @param index
     *            where the object is located
     * @throws IndexOutOfBoundsException
     *             if there is not an element at the index
     * @return true if successful
     */
    public boolean remove(int index) {
<<<<<<< HEAD
        Node<T> nodeToBeRemoved = getNodeAtIndex(index);
=======
        Node<E> nodeToBeRemoved = getNodeAtIndex(index);
>>>>>>> 8a892bf6ae55e919ff3a0e9c2ff630daa69a4305
        nodeToBeRemoved.previous().setNext(nodeToBeRemoved.next());
        nodeToBeRemoved.next().setPrevious(nodeToBeRemoved.previous());
        size--;
        return true;
    }


    /**
     * Removes the first object in the list that .equals(obj)
     *
     * @param obj
     *            the object to remove
     * @return true if the object was found and removed
     */

<<<<<<< HEAD
    public boolean remove(T obj) {
        Node<T> current = head.next();
=======
    public boolean remove(E obj) {
        Node<E> current = head.next();
>>>>>>> 8a892bf6ae55e919ff3a0e9c2ff630daa69a4305
        while (!current.equals(tail)) {
            if (current.getData().equals(obj)) {
                current.previous().setNext(current.next());
                current.next().setPrevious(current.previous());
                size--;
                return true;
            }
            current = current.next();
        }
        return false;
    }


    /**
     * Returns a string representation of the list If a list contains A, B, and
     * C, the following should be returned "{A, B, C}" (Without the quotations)
     *
     * @return a string representing the list
     */
    @Override
    public String toString() {
        StringBuilder builder = new StringBuilder("{");
        if (!isEmpty()) {
<<<<<<< HEAD
            Node<T> currNode = head.next();
            while (currNode != tail) {
                T element = currNode.getData();
=======
            Node<E> currNode = head.next();
            while (currNode != tail) {
                E element = currNode.getData();
>>>>>>> 8a892bf6ae55e919ff3a0e9c2ff630daa69a4305
                builder.append(element.toString());
                if (currNode.next != tail) {
                    builder.append(", ");
                }
                currNode = currNode.next();
            }
        }

        builder.append("}");
        return builder.toString();

    }


    /**
     * Iterator method creates Iterator object
     *
     * @return new Iterator object
     */
<<<<<<< HEAD
    public Iterator<T> iterator() {
        return new DLListIterator<T>();
    }


    private class DLListIterator<A> implements Iterator<T> {
=======
    public Iterator<E> iterator() {
        return new DLListIterator<E>();
    }


    private class DLListIterator<A> implements Iterator<E> {
>>>>>>> 8a892bf6ae55e919ff3a0e9c2ff630daa69a4305
        /**
         * Creates a new DLListIterator
         */
        private int position;
        private boolean nextThing;

        /**
         * Creates a new DLListIterator
         */
        public DLListIterator() {
            position = 0;
            nextThing = false;
        }


        /**
         * Checks if there are more elements in the list
         *
         * @return true if there are more elements in the list
         */
        @Override
        public boolean hasNext() {
            return position < size;
        }


        /**
         * Gets the next value in the list
         *
         * @return the next value
         * @throws NoSuchElementException
         *             if there are no nodes left in the list
         */
        @Override
<<<<<<< HEAD
        public T next() {
=======
        public E next() {
>>>>>>> 8a892bf6ae55e919ff3a0e9c2ff630daa69a4305
            if (this.hasNext()) {
                nextThing = true;
                position++;
                return get(position - 1);
            }
            else {
                throw new NoSuchElementException("Illegal call to next();"
                    + "iterator is after end of list,");
            }
        }


        /**
         * Removes the last object returned with next() from the list
         *
         * @throws IllegalStateException
         *             if next has not been called yet
         *             and if the element has already been removed
         */
        @Override
        public void remove() {
            if (nextThing) {
<<<<<<< HEAD
                Node<T> toRemove = getNodeAtIndex(position - 1);
=======
                Node<E> toRemove = getNodeAtIndex(position - 1);
>>>>>>> 8a892bf6ae55e919ff3a0e9c2ff630daa69a4305
                toRemove.previous().setNext(toRemove.next());
                toRemove.next().setPrevious(toRemove.previous());
                nextThing = false;
                position--;
                size--;
            }
            else {
                throw new IllegalStateException("Illegal call to remove();"
                    + "next() was not called.");
            }
        }
    }

}

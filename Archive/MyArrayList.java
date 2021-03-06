import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 * An implementation of MyList with an array (a longer exercise would be to
 * implement the List interface as is done in the class java.util.ArrayList: the
 * source of the ArrayList class is available from Sun. Check it out).
 */

public class MyArrayList<E> implements MyList<E> {

	// Use an array for the implementation
	private E[] items; 

	// Default capacity of the array
	private static final int DEFAULT_CAPACITY = 10;

	// Number of elements in the array
	private int size;

	/**
	 * Constructs a MyArrayList with a specified capacity
	 */
	public MyArrayList(int initialCapacity) {
		this.items = new Object[initialCapacity];
	}

	/**
	 * Constructs a MyArrayList with a default capacity
	 */
	public MyArrayList() {
		this.items = new Object[DEFAULT_CAPACITY];

	}

	/**
	 * Returns the number of elements in this list.
	 */
	public int size() {
	}

	/**
	 * Returns true if this list contains no elements.
	 */
	public boolean isEmpty() {
	}

	/**
	 * Appends the specified element to the end of this list
	 */
	public boolean add(E o) {
		// If there is no room in the array items
		// Make room for the new element

		// add the new element
	}

	/**
	 * Empties this List
	 */
	public void clear() {
	}

	/**
	 * Returns the element at the specified position in this list.
	 */
	public E get(int index) {
		if (index < 0 || index >= size()) throw new ArrayIndexOutOfBoundsException();

        return items[index];
	}

	/**
	 * Returns the index of the specified element (-1 if there is no match)
	 */
	public int indexOf(Object o) {
		// If o is null (look for a null element in the array)
		if (o == null) {
		} else // o is an object (use equals)
		{
		}

		// If we get here, o is not in the list
	}

	/**
	 * Returns true if this list contains the specified element.
	 */
	public boolean contains(Object o) {
		// easy with indexOf
	}

	/**
	 * Removes the element in the List at position index
	 */
	public boolean remove(int index) {
		int x = find(index);
        System.arraycopy(items, x + 1 , items, x, (items.length - 1) - x);
        items[items.length - 1] = null;
        size--;
	}

	/**
	 * Removes the element in the List at position index
	 */
	public boolean remove(Object o) {
		// easy with indexOf and remove
		int index = indexOf(o);
		if (index == -1) {
			return false;
		}
		remove(index);
		return true;
	}

	/**
	 * Adds the specified object at the specified location
	 */
	public boolean add(int index, E o) {

		// one way: add at the end and then shift the elements around
	}

	/**
	 * Is this List equal to the specified object?
	 */
public boolean equals(Object target, Object element)
    {
		if (target == null) {
			return element == null;
		} else {
			return target.equals(element);
		}
	}
	/**
	 * An inner class to define the iterator
	 */
	private class MyIterator implements Iterator<E> {
		private int index = 0;

		private MyArrayList<E> list;

		private int lastIndex = -1; // index of the object most recently visited

		// by next

		/**
		 * Create an iterator for a MyArrayList
		 */
		public MyIterator(MyArrayList<E> list) {
			// make a copy of the array
			E[] copy = Arrays.copyOf(array, size);
			// make a list and return an iterator
			return Arrays.asList(copy).listIterator();
		}

		/**
		 * Any element left in the list?
		 */
		public boolean hasNext() {
		}

		/**
		 * Returns the current element in the list and move to the next element
		 */
		public E next() {
		}

		/**
		 * Removes the last object returned by next
		 */
		public void remove() {
			MyArrayList.this.remove(--index); // reference the outer class

		}
	}

	/**
	 * Returns an iterator over the elements in this list in proper sequence.
	 * 
	 * @return an iterator over the elements in this list in proper sequence.
	 */
	public Iterator<E> iterator() {
	}
}

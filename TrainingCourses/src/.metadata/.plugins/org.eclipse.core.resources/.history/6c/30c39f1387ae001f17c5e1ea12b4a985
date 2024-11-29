//
//
//
//
package util;

import application.Employee;
import util.LinearNode;
import util.LinkedListADT;

//This class implements the ADT definition of a linked list using the same signatures. Note that we can add extra methods
//here once all of the methods listed in the ADT interface are included.

public class LinkedList<T> implements LinkedListADT<T> {

	private int count; // the current number of elements in the list
	private LinearNode<T> front; // pointer to the first element
	private LinearNode<T> last; // pointer to the last element

	
	public LinearNode<T> getFront() {
		return this.front;
	}
	// -----------------------------------------------------------------
	// Creates an empty list.
	// -----------------------------------------------------------------
	public LinkedList() {
		this.count = 0;
		this.last = null;
		this.front = null;
	}

	// Adds one element to the end of this list
	public void add(T element) {
		LinearNode<T> node = new LinearNode<T>(element);

		if (size() == 0) {
			this.last = node; // This is the last and the
			this.front = node; // first node
			this.count++;
		} // end if
		else {
			last.setNext(node); // add node to the end of the list
			last = node; // now make this the new last node.

			this.count++;
		} // end else
	}


	//rework this  to work for ADDING and REMOVING
	public boolean contains(T element) {
		boolean found = false;
		if (!isEmpty()) {
			for (LinearNode<T> current = this.front; current != null; current = current.getNext()) {
				if (current != null && current.getElement().equals(element)) {
					System.out.print("[ERROR] - duplicate employee number found\n");
					found = true; 
				}
			}
		}	
		return found;
	}



	// Removes and returns the first element from this list

	public T remove() {
		LinearNode<T> temp = null;
		T result = null;
		if (isEmpty()) {
			System.out.println("There are no nodes in the list");
		} // end if
		else {

			result = this.front.getElement();
			temp = this.front;
			this.front = this.front.getNext();
			temp.setNext(null); // dereference the original first element
			count--;
		} // end else
		return result;
	}




	//-------------------------------------------------------------
	//3. my own remove method
	public T remove(T element) {
		LinearNode<T> current = this.front;
		LinearNode<T> previous = this.front;
		T result = null;

		// Check if list is empty
		if (isEmpty()) {
			System.out.println("There are no nodes in the list");
			return null;
		}

		//If the FIRST node matches the element, have to use separate if input is first employee due to errors
		if (current.getElement().equals(element)) {
			result = current.getElement(); // Save the element to return it like temp
			this.front = current.getNext(); //go to next node 

			current.setNext(null); //dereference the first node so garbage collection deletes it!
			count--; 
			return result;
		}

		//search through list
		while (current != null) {
			if (current.getElement().equals(element)) {
				result = current.getElement(); //save element to return it like a temp

				//if removing a NON first element, then bypass to next node (SET previous to next, and next to get next)
				previous.setNext(current.getNext());

				current.setNext(null); //garbage collection
				count--;
				return result; // Return the removed element
			}

			// Move to the next node
			previous = current;  // previous will move with current
			current = current.getNext(); // current moves to the next node
		}

		// If no matching element was found
		return null;
	}
	//----------------------------------------------------------









	// Returns true if this list contains no elements
	public boolean isEmpty() {
		if (this.front == null)
			return true;
		else
			return false;
	}

	// this is used to find a specific element, eg: list.get 5, goes to 5th employee
	public T get(int i) {
		LinearNode<T> index = null;
		int counter = 1;

		for (index = this.front, counter = 1; index != null && counter <= 1; index = index.getNext()) {
			counter++;
		}
		if (index == null)
			return null;
		else
			return index.getElement();
	}

	// Returns the number of elements in this list
	public int size() {
		return this.count;
	}

	// Returns a string representation of this list

	public String toString() {
		LinearNode<T> current = null;
		String fullList = "";

		for (current = this.front; current != null; current = current.getNext()) {
			fullList = fullList + "\n" + current.getElement().toString();
		} // end for

		return fullList + "\n";
	}

}

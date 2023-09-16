public class MyLinkedBag <T> implements MyArrayBagInterface <T> {
       /* File: MyLinkedBag.java
 * By: Daniel Smirnoff
 * Date: 9/15/2023
 * Compile:
 * Usage: 
 * System: I think every system
 * Description: Basic LinkedBag class
 */
    private int numNodes = 0;
    public Node<T> firstNode;

    /*******************************************************************************************************/
    public MyLinkedBag() { //Constructor
        firstNode = null;
        numNodes = 0;
    }
    /*******************************************************************************************************/


    //Interface Methods------------------------------------------------------------------------------
    /*******************************************************************************************************/
    public int getCurrentSize() { //Gets length of list
        return numNodes;
    }

    /*******************************************************************************************************/
    public boolean isFull() { //Always empty
        return false;
    }
    /*******************************************************************************************************/

    public boolean isEmpty() { //checks if list is empty
        if(numNodes == 0) {
            return true;
        } else {
            return false;
        }
    }
    /*******************************************************************************************************/

    public boolean add(T newEntry) { //Adds a new node
        Node<T> newNode = new Node<T>(newEntry);
        if(isEmpty()) {
            firstNode = newNode;
        } else {
            newNode.next = firstNode;
            firstNode = newNode;
        }
        numNodes++;
        return true;
    }
    /*******************************************************************************************************/

    public T remove() { //Removes the first node
        Node<T> toRemove;
        toRemove = firstNode;
        firstNode = firstNode.next;
        return toRemove.data;
    }
    /*******************************************************************************************************/
    public boolean remove(T anEntry) { //Removes a specific Entry
        boolean found = false;
        Node<T> currentNode = firstNode;
        while(!found && currentNode.next != null) {
            if(currentNode.data.equals(anEntry)) {
                found = true;
                currentNode.data = firstNode.data;
                firstNode = firstNode.next;
            } else {
                currentNode = currentNode.next;
            }
        }
        return found;
    }
    /*******************************************************************************************************/
    public int findAndRemove(Object anEntry) {
        throw new UnsupportedOperationException("Unimplemented method 'findAndRemove'");
    }
    /*******************************************************************************************************/
    public MyArrayBag union(MyArrayBag otherBag) { //Not applied
        throw new UnsupportedOperationException("Unimplemented method 'union'");
    }
    /*******************************************************************************************************/
    public boolean contains(T anEntry) { //Check if tree contains node data
        boolean found = false;
        Node<T> currentNode = firstNode;
        while(!found && currentNode.next != null) {
            if(anEntry.equals(currentNode.data)) {
                found = true;
            } else {
                currentNode = currentNode.next;
            }
        }
        return found;
    }
    /*******************************************************************************************************/
    public int getMaxSize() { //Not Applied
        throw new UnsupportedOperationException("Unimplemented method 'getMaxSize'");
    }
    /*******************************************************************************************************/
    public T[] toArray() { //Converts to array
        Node<T> currentNode = firstNode;
        int index = 0;
        Object[] array = new Object[numNodes];
        while(true) {
            array[index] = currentNode.data;
            index++;

            if(currentNode.next == null) {
                return (T[])array;
            } else {
                currentNode = currentNode.next;
            }
        }
    }
    /*******************************************************************************************************/
    public MyArrayBag GetBag() { //Notapplied
        throw new UnsupportedOperationException("Unimplemented method 'GetBag'");
    }
    /*******************************************************************************************************/
    public Object[] Count() {//Not appplied
        throw new UnsupportedOperationException("Unimplemented method 'Count'");
    }
    /*******************************************************************************************************/
    public void PrintBag() {

    }
    /*******************************************************************************************************/

    



}

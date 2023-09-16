public class MyLinkedBag implements MyArrayBagInterface{

    private int numNodes = 0;
    public Node firstNode;

    public MyLinkedBag() {
        firstNode = null;
        numNodes = 0;
    }


    //Interface Methods------------------------------------------------------------------------------
    public int getCurrentSize() {
        return numNodes;
    }

    public boolean isFull() {
        throw new UnsupportedOperationException("Unimplemented method 'isFull'");
    }

    public boolean isEmpty() {
        if(numNodes == 0) {
            return true;
        } else {
            return false;
        }
    }

    public boolean add(Object newEntry) {
        Node newNode = new Node(newEntry);
        if(isEmpty()) {
            firstNode = newNode;
        } else {
            newNode.next = firstNode;
            firstNode = newNode;
        }
        numNodes++;
        return true;
    }

    public Object remove() {
        Object toRemove;
        toRemove = firstNode;
        firstNode = firstNode.next;
        return firstNode;
    }

    public boolean remove(Object anEntry) { //FIX
        Node currentNode = firstNode;
        while(currentNode.next != null) {
            if(currentNode.data == anEntry) {
                return true;
            } else {
                currentNode = currentNode.next;
            }
        }
        return false;
    }

    public int findAndRemove(Object anEntry) {
        throw new UnsupportedOperationException("Unimplemented method 'findAndRemove'");
    }

    public MyArrayBag union(MyArrayBag otherBag) {
        throw new UnsupportedOperationException("Unimplemented method 'union'");
    }

    public boolean contains(Object anEntry) { //FIX
        Node currentNode = firstNode;
        while(currentNode.next != null) {
            if(currentNode.data == anEntry) {
                return true;
            } else {
                currentNode = currentNode.next;
            }
        }
        return false;
    }

    public int getMaxSize() {
        throw new UnsupportedOperationException("Unimplemented method 'getMaxSize'");
    }

    public Object[] toArray() {
        Node currentNode = firstNode;
        int index = 0;
        Object[] array = new Object[numNodes];
        while(true) {
            array[index] = currentNode.data;
            index++;

            if(currentNode.next == null) {
                return array;
            } else {
                currentNode = currentNode.next;
            }
        }
    }

    public MyArrayBag GetBag() {
        throw new UnsupportedOperationException("Unimplemented method 'GetBag'");
    }

    public Object[] Count() {
        throw new UnsupportedOperationException("Unimplemented method 'Count'");
    }
    public void PrintBag() {
        
    }

    



}

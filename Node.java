public class Node {
    public Object data;
    public Node next;

    public Node() {
        data = null;
        next = null;
    }
    public Node(Object Data) {
        data = Data;
    }
    public Node(Object Data, Node Next) {
        data = Data;
        Next = next;
    }

    //Getters-------------------------
    public Object GetData() {
        return data;
    }
    public Node GetNext() {
        return next;
    }

    //Setters-------------------------
    public void SetData(Object Data) {
        data = Data;
    }
    public void SetNext(Node Next) {
        next = Next;
    }
}   

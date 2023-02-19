package linkedliststuff;
public class LinkedListStuff {
    public static void main(String[] args) {
        //every list element is a value 
        //AND where the next list element is
        //LinkedList l = new LinkedList();
        
        Deque st = new Deque();
        st.add("Bob");
        st.add("Alice");

        st.addLast("Tom");
        System.out.println(st.first);
    }
}
class Deque{ //double ended queue
    Node first, last;
    void add(String v){
        Node n = new Node(v);
        n.next = first;
        first = n;
    }
    void remove(){
        first = first.next;
    }
    void addLast(String v){
        //start at first, follow the arrows down until the end
        Node here = first;
        while(here.next != null){
            here = here.next;
        }
        here.next = new Node(v);
//        last.next = new Node(v);
//        last = last.next;
    }
}
class Node{
    String val; 
    Node next = null;
    //anything that we need to know when we create a node
    //should go in these parenthesis
    Node(String v){
        val = v;
    }

    @Override
    public String toString() {
        return val + "-->" + next;
    }
//recursion is a method that calls itself
    
    
    
}

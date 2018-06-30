package exam.prep;

public class NodeProcessor {


    // Füge einen Node am Ende der List hinzu
    public void addNodeAtEnd(Node head, Node newNode){
        Node p = head;
        while(p.next != null){
            p = p.next;
        }
        p.next = newNode;
    }

}

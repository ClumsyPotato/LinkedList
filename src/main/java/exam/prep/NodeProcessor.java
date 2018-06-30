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

    //Füge einen neuen Node in der richtigen Reihenfolge hinzu
    // Reihenfolge aufsteigend
    public void addNodeInOrder(Node head, Node newNode){
        Node p = head;
        Node prev = null;
        while(p.next != null ){
                if(p.data > newNode.data){     // jetziges element ist größer als das neue
                    if(p == head){      // element am anfang hinzufügen
                        newNode.next = head;
                        head = newNode;
                    }else{      // element in der mitte oder am ende
                        prev.next = newNode;
                        newNode.next = p;
                    }
                    prev = p;
                    p = p.next;

                }

        }

    }



}

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
    public Node addNodeInOrder(Node head, Node newNode) {
        Node p = head;
        Node prev = null;


        while (p != null) {
            if (p.data > newNode.data) {
                if (p == head) {      // element am anfang hinzufügen
                    newNode.next = head;
                    head = newNode;
                    break;
                } else {
                    // jetziges element ist größer als das neue
                    // element in der mitte oder am ende
                    prev.next = newNode;
                    newNode.next = p;
                }

            }
            if(p.next == null && p.data < newNode.data){ // Falls
                p.next = newNode;
            }
            prev = p;
            p = p.next;
        }
        return head;    // nur wenn man es als methode implementiert
    }


    // fügt node am anfang hinzu
    public Node addNodeAtBegining(Node head, Node newNode){
        newNode.next = head;
        head = newNode;
        return head; // nur wenn man es als methode implementiert
    }

    // fügt  neuen node rechts neben den node an stelle n hinzu
    // wobei n=0 genau am anfang bedeutet
    public Node addNotAtPosition(Node head, Node newNode, int n){
        Node p = head;
        Node temp = null;

        for(int i = 0;p != null && i < n; i++){
         //  temp = p;
            p = p.next;
        }
        if(p == head){
            newNode.next = head;
            head = newNode;
            return head;
        }
        if(p.next == null){
            p.next = newNode;
            return head;
        }
        temp = p.next.next;
        p.next = newNode;
        newNode.next = temp;
        return head;
    }




}

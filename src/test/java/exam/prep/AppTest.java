package exam.prep;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;
import sun.font.TrueTypeFont;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @Test
    public void addNodeTest(){
        NodeProcessor processor = new NodeProcessor();
        Node head = new Node(3);
        Node firstNewNode = new Node(8);

        // add first element
        processor.addNodeAtEnd(head,firstNewNode);
        assertTrue(head.next.data == 8);

        // add a second element
        Node secondNewNode = new Node (2);
        processor.addNodeAtEnd(head,secondNewNode);
        assertTrue(head.next.next.data == 2);

    }

    @Test
    public void addNodeInOrderTest(){
        NodeProcessor processor = new NodeProcessor();
        Node head = new Node(3);
        Node secondNode = new Node(5);
        Node thirdNode = new Node(4);
        Node forthNode = new Node(2);

       head = processor.addNodeInOrder(head,secondNode);
       head = processor.addNodeInOrder(head,thirdNode);
       head = processor.addNodeInOrder(head,forthNode);

        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);

        assertTrue(head.data == 2);
        assertTrue((head.next.data == 3));
        assertTrue(head.next.next.data ==4);
        assertTrue(head.next.next.next.data == 5);


    }

    @Test
    public void newTest(){
        assertTrue(true);
    }

    @Test
    public void addNodeAtBeginingTest(){
        NodeProcessor processor = new NodeProcessor();
        Node head = new Node(3);
        Node secondNode = new Node(5);
        Node thirdNode = new Node(4);

        head = processor.addNodeAtBegining(head,secondNode);
        assertTrue(head.data == secondNode.data);
        assertTrue(head == secondNode);
        head = processor.addNodeAtBegining(head,thirdNode);
        assertTrue(head.data == 4);

    }




    @Test
    public void addNodeAtPositionNTest(){
        NodeProcessor processor = new NodeProcessor();
        Node head = new Node(1);
        Node secondNode = new Node(2);
        Node thirdNode = new Node(3);
        Node forthNode = new Node (9);


        head = processor.addNodeAtBegining(head,secondNode);
        head = processor.addNodeAtBegining(head,thirdNode);

//        head = processor.addNotAtPosition(head,thirdNode,2);

        head = processor.addNotAtPosition(head,forthNode,1);

        System.out.println(head.data);
        System.out.println(head.next.data);
        System.out.println(head.next.next.data);
        System.out.println(head.next.next.next.data);
       // assertTrue(head.next.next.next.data == forthNode.data);


    }






}

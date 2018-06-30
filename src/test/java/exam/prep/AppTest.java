package exam.prep;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

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

}

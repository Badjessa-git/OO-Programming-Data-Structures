package cs2114;
import student.TestCase;

/**
 * @author Romeo
 * @version 2017/01/04
 *test class for {@link Lab08Deque}
 */
public class Lab08DequeTest extends TestCase{
    private Lab08Deque<Object> test;
    
    public void setUp() {
        test = new Lab08Deque<Object>();
    }
    
    /**
     * test method for {@link Lab08Deque#enqueueAtFront()}
     */
    public void testEnqueueAtFront() {
        assertEquals(0, test.size());
        assertNull(test.frontItem());
        test.enqueueAtFront(216);
        test.enqueueAtFront(46);
        assertEquals(2, test.size());
        assertEquals(46, test.frontItem());
    }
    
    /**
     * test method for {@link Lab08Deque#dequeueAtFront()}
     */
    public void testDequeueAtFront() {
       assertEquals(0, test.size());
       test.enqueueAtFront(216);
       test.enqueueAtFront(46);
       test.enqueueAtFront(14);
       assertEquals(3, test.size());
       assertEquals(14, test.dequeueAtFront());
       assertEquals(2, test.size());
    }
    
    /**
     * test method for {@link Lab08Deque#enqueueAtRear(Object)}
     */
    public void testEnqueueAtRear() {
        test.enqueueAtFront(46);
        test.enqueueAtRear(23);
        test.enqueueAtRear(02);
        test.enqueueAtRear(1);
        assertEquals(4, test.size());
    }
    
    /**
     * test method for {@link Lab08Deque#dequeueAtRear()}
     */
    public void testDequeueAtRear() {
        assertNull(test.rearItem());
        test.enqueueAtFront(46);
        test.enqueueAtRear(23);
        test.enqueueAtRear(2);
        test.enqueueAtRear(1);
        assertEquals(1, test.dequeueAtRear());
        assertEquals(3, test.size());
        assertEquals(2, test.rearItem());
    }
    
    /**
     * test method for {@link Lab08Deque#clear()}
     */
    public void testClear() {
        test.enqueueAtFront(46);
        test.enqueueAtRear(23);
        test.enqueueAtRear(02);
        test.enqueueAtRear(1);
        assertEquals(4, test.size());
        test.clear();
        assertEquals(0, test.size());
        assertNull(test.frontItem());
        assertNull(test.rearItem());
    }
}

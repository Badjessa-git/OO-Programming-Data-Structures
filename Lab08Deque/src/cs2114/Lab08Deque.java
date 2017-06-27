package cs2114;

/**
 * 
 * @author Romeo
 * @version 2017/01/4 
 * @param <E>
 */
public class Lab08Deque<E> extends DoubleLinkDeque<E> {
    private Node<E> head;
    private Node<E> tail;
    
    /**
     * Constructor
     */
    public Lab08Deque() {
        super();
        head = new Node<E>(null);
        tail = new Node<E>(null);
        head.setNext(tail);
        size = 0;
    }

    @Override
    public void enqueueAtFront(E value) {
        Node<E> front = new Node<E>(null);
        front.setData(value);
        head.setNext(front);
        front.setNext(head.getNext().getNext());
        size++;
    }

    @Override
    public E dequeueAtFront() {
        if (size == 0) {
            return null;
        }
        else {
           E it = head.getNext().getData();
           head.setNext(head.getNext().getNext());
           size--;
           return it;
        }
    }

    @Override
    public void enqueueAtRear(E value) {
        Node<E> rear = new Node<E>(null);
        rear.setData(value);
        tail.setPrevious(rear);
        rear.setPrevious(tail.getPrevious().getPrevious());
        size++;
        
    }

    @Override
    public E dequeueAtRear() {
        if (size == 0) {
            return null;
        }
        E it = tail.getPrevious().getData();
        tail.setPrevious(tail.getPrevious().getPrevious());
        size--;
        return it;
    }

    @Override
    public E frontItem() {
        if (size == 0) {
            return null;
        }
        return head.getNext().getData();
        
    }

    @Override
    public E rearItem() {
        if (size == 0) {
            return null;
        }
        return tail.getPrevious().getData();
    }

    @Override
    public void clear() {
        head.setNext(tail);
        size = 0;
    }

}
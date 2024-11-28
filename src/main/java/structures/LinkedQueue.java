package structures;

public class LinkedQueue<T> implements QueueInterface<T> {

    private QNode<T> first;
    private QNode<T> last;
    private int count;

    @Override
    public QueueInterface<T> enqueue(T elem) {
		this.last.next = new QNode<T>(elem);
		this.last = last.next;
        return this;
    }

    @Override
    public T dequeue() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public T peek() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        return false;
    }

    @Override
    public int size() {
        return count;
    }

    @Override
    public String toString() {
        // use StringBuilder because it's faster and more memory efficient
        StringBuilder result = new StringBuilder();
        result.append("[");
        // TODO: Write loop that goes through queue and adds the elements
        return result.append("]").toString();
    }
}

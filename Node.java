package linkedListPractice;

public class Node<D> {

    private D data;

    private Node<D> nextNode;

    public Node(D data) {
        this.data = data;
        //System.out.println("NODE-" + data);
    }

    public void setNextNode(Node<D> nextNode) {
        this.nextNode = nextNode;
    }

    public D getData() {
        return data;
    }

    public void setData(D data) {
        this.data = data;
    }

    public Node<D> getNextNode() {
        return nextNode;
    }
}
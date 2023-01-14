package linkedListPractice;

public class SimpleLinkedList<D> {

    public Node<D> headNode;

    public Node<D> tailNode;

    public Node<D> currNode;



    public boolean add(Node<D> nodeToBeAdded) {
        System.out.println("New Node added with data = " + nodeToBeAdded.getData());

        if (headNode == null) {
            headNode = nodeToBeAdded;// headNode pointiing to head
            System.out.println("Head node with data = " + nodeToBeAdded.getData());
        }

        tailNode = nodeToBeAdded;


        if (currNode != null) {
            currNode.setNextNode(nodeToBeAdded);
            System.out.println("Node with data " + currNode.getData() + " is connected to node with data "
                    + nodeToBeAdded.getData());
            System.out.println("as nextNode variable in " + currNode.getData()
                    + " node is pointing to newly added node that is node with data " + nodeToBeAdded.getData());
        }

        currNode = nodeToBeAdded;

        System.out.println("Tail node with data = " + nodeToBeAdded.getData());
        System.out.println("Current node with data = " + nodeToBeAdded.getData());
        System.out.println();
        System.out.println();
        return false;
    }

    public void iterate() {
        if(headNode == null) {
            System.out.println("There are no nodes in the list");
        } else {
            currNode = headNode;
            int i = 0;
            while(true) {
                System.out.println("Node" + i + " => " + currNode.getData());
                i++;
                if(currNode.getNextNode() == null) {
                    break;
                }
                currNode = currNode.getNextNode();
            }

            System.out.println("No of nodes present = " + i);

        }
    }


    public void remove(D data) {
        System.out.println("Remove node with data = " + data);
        if(headNode.getData() == data) {
            headNode = headNode.getNextNode();
        } else {
            currNode = headNode;
            while(true) {
                if(currNode.getNextNode().getData() == data) {
                    Node<D> tempNode = currNode.getNextNode();
                    currNode.setNextNode(tempNode.getNextNode());
                    tempNode.setNextNode(null);
                    break;
                } else {
                    currNode = currNode.getNextNode();
                }
            }
        }
    }

    public void remove(Node<D> nodeToBeRemoved) {
        System.out.println("Remove node with data = " + nodeToBeRemoved.getData());
        if (headNode == nodeToBeRemoved) {
            headNode = headNode.getNextNode();
        } else {
            currNode = headNode;
            while (true) {
                if (currNode.getNextNode() == nodeToBeRemoved) {
                    Node<D> tempNode = currNode.getNextNode();
                    currNode.setNextNode(tempNode.getNextNode());
                    tempNode.setNextNode(null);
                    break;
                } else {
                    currNode = currNode.getNextNode();
                }
            }
        }
    }
}

package linkedListPractice;

public class MainCreator {

    public static void main(String[] args) {

        SimpleLinkedList<Integer> simpleLinkedList = new SimpleLinkedList<>();

        Node<Integer> nodeOne = new Node<>(23);

        Node<Integer> nodeTwo = new Node<>(34);

        Node<Integer> nodeThree = new Node<>(55);

        simpleLinkedList.add(nodeOne);// first node gets added

        simpleLinkedList.add(nodeTwo);// second node gets added

        simpleLinkedList.add(nodeThree);// third node gets added

        simpleLinkedList.iterate();
        simpleLinkedList.remove(nodeTwo);
        simpleLinkedList.iterate();
    }

}
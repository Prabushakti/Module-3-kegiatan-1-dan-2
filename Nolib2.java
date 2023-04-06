public class Nolib2 {
    private static class Node {
        String data;
        Node next;
        Node(String data) {
            this.data = data;
        }
    }

    private Node head;
    private Node tail;

    public void queueExample() {
        enqueue("JAVA");
        enqueue("DotNet");
        enqueue("PHP");
        enqueue("HTML");
        System.out.println("Dequeue: " + dequeue());
        System.out.println("Peek: " + peek());
        System.out.println("Dequeue: " + dequeue());
        System.out.println("Peek: " + peek());
    }

    public void enqueue(String data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = newNode;
        }
    }

    public String dequeue() {
        if (head == null) {
            return null;
        }
        String data = head.data;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return data;
    }

    public String peek() {
        if (head == null) {
            return null;
        }
        return head.data;
    }

    public static void main(String[] args) {
        new Latihan_2().queueExample();
    }

}


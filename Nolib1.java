public class Nolib1 {
    private int top;
    private int capacity;
    private String[] array;

    public Nolib1(int capacity) {
        this.capacity = capacity;
        this.array = new String[capacity];
        this.top = -1;
    }

    public void push(String value) {
        if (isFull()) {
            throw new RuntimeException("STACK IS FULL");
        }
        array[++top] = value;
    }

    public String pop() {
        if (isEmpty()) {
            throw new RuntimeException("STACK IS EMPTY");
        }
        return array[top--];
    }

    public String peek() {
        if (isEmpty()) {
            throw new RuntimeException("STACK IS EMPTY");
        }
        return array[top];
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == capacity - 1;
    }

    public int search(String value) {
        for (int i = top; i >= 0; i--) {
            if (array[i].equals(value)) {
                return top - i + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        Nolib1 st = new Nolib1(5);
        st.push("AKU");
        st.push("ANAK");
        st.push("INDONESIA");

        System.out.println("Next : " + st.peek());

        st.push("RAYA");
        System.out.println(st.pop());
        st.push("!");

        int count = st.search("AKU");
        while (count != -1 && count > 1){
            st.pop();
            count--;
        }
        System.out.println(st.pop());
        st.isEmpty();
        System.out.println(st.isEmpty());
    }
}



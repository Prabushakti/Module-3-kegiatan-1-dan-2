import java.util.LinkedList;
import java.util.Queue;

import javax.sound.sampled.SourceDataLine;
public class Latihan_2 {
    public void queueExample(){
        Queue queue = new LinkedList();
        queue.add("JAVA");
        queue.add("DotNet");
        queue.offer("PHP");
        queue.offer("Html");
        System.out.println("Remove :" + queue.remove());
        System.out.println("Element :" + queue.element());
        System.out.println("Poll :" + queue.poll());
        System.out.println("Peek :" + queue.peek());
    }

    public static void main(String[] args) {
        new Latihan_2().queueExample();
    }
}



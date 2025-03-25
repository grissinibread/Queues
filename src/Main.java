import java.util.ArrayDeque;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        LinkedListQueue queue = new LinkedListQueue();
//        queue.enqueue(7);
//        queue.enqueue(8);
//        queue.enqueue(9);
//        queue.enqueue(1);
//        queue.dequeue();
//        System.out.println(queue.peak());
//        System.out.println(queue.size());
        System.out.println(queue.isEmpty());

        System.out.println(queue);
    }

//    public static void reverse(Queue<Integer> queue) {
//        Stack<Integer> stack = new Stack<>();
//
//        while (!queue.isEmpty()) {
//            stack.push(queue.remove());
//        }
//
//        while (!stack.isEmpty()) {
//            queue.add(stack.pop());
//        }
//    }
}
import java.util.ArrayDeque;
import java.util.Queue;

public class StackWithTwoQueues {
    Queue<Integer> first = new ArrayDeque<>();
    Queue<Integer> second = new ArrayDeque<>();

    //push
    public void push(int element) {
        first.add(element);
    }

    //pop
    public int pop() {
        return 0; // placeholder
    }

    //peek
    public int peek() {
        return 0; // placeholder
    }

    //size
    private int size() {
        return 0; // placeholder
    }

    //isEmpty
    private boolean isEmpty() {
        return true; // placeholder
    }
}
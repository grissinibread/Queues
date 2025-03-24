public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);


        queue.dequeue();
        queue.enqueue(60);
        queue.dequeue();
        queue.dequeue();

        System.out.println(queue);

        QueueStack queueStack = new QueueStack();

        queueStack.add(10);
        queueStack.add(20);
        queueStack.add(30);
        queueStack.add(40);
        queueStack.add(50);

        queueStack.pop();
        queueStack.add(60);
        queueStack.pop();
        queueStack.pop();

        System.out.println(queueStack);
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
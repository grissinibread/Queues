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

        System.out.println(queue);

        System.out.println(queue.peek());
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
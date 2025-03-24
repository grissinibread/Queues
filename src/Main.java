public class Main {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue();

        priorityQueue.insert(1);
        priorityQueue.insert(2);
        priorityQueue.insert(4);
        priorityQueue.insert(5);


        System.out.println(priorityQueue);
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
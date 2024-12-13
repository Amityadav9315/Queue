public class CircularMain {
    public static void main(String[] args) {
        CircularQueue circularQueue=new CircularQueue(5);
        circularQueue.enqueue(19);
        circularQueue.enqueue(50);
        circularQueue.enqueue(65);
        circularQueue.enqueue(76);
        circularQueue.enqueue(876);
        circularQueue.display();
        circularQueue.dequeue();
        circularQueue.display();
        circularQueue.dequeue();
        circularQueue.display();


    }
}

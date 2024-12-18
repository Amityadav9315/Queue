public class DequeueTest {
    public static void main(String[] args) {


        DeQueue deQueue=new DeQueue(5);
        deQueue.insertRear(23);
        deQueue.insertRear(45);
        deQueue.display();
        deQueue.insertFront(87);
        deQueue.insertRear(56);
        deQueue.display();
        deQueue.getFront();
        deQueue.display();
        deQueue.getRear();
        deQueue.display();
        deQueue.deleteFront();
        deQueue.display();
        System.out.println("size :"+deQueue.size());
        deQueue.insertFront(23);
        deQueue.deleteFront();

    }
}

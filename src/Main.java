//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        SimpleQueue simpleQueue=new SimpleQueue(5);
        simpleQueue.enqueue(200);
        simpleQueue.enqueue(500);
        simpleQueue.enqueue(300);
        simpleQueue.enqueue(876);
       // simpleQueue.peek();
        simpleQueue.display();
        System.out.println("Deleted element"+simpleQueue.dequeue());
        simpleQueue.display();

    }
}
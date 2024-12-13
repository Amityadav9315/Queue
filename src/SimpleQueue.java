public class SimpleQueue {

    private int[] queue;
    private int front;
    private int rear;
    private  int capacity;

    public SimpleQueue(int capacity){
        this .capacity=capacity;
        this.queue=new int[capacity];
        this.front=1;
        this.rear=-1;

    }
    //insertin data at the rear Enque
     public void enqueue(int data){
        if(rear==capacity-1){
            System.out.println("Queue is full");
            return;
        }
        rear++;
        queue[rear]=data;
         System.out.println(data+"this is inserted into the queue");

     }


}

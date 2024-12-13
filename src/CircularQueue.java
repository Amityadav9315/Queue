public class CircularQueue {
    private  int[]  queue;
    private int front;
    private  int rear;
    private int size;
    private int capacity;


    public CircularQueue(int capacity){
        queue=new int[capacity];
        front=0;
        rear=-1;
        size=0;
        this.capacity=capacity;

    }
    //Enque
    public void enqueue(int data){
        if(size==capacity){
            System.out.println("Queue is full");
            return;
        }

    }
}

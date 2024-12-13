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
         System.out.println(data+" is inserted into the queue");

     }
     //Deque: remove the element
    public  int dequeue(){
        if(front>rear){
            System.out.println("Queue is empty");
            return -1;

        }
        int data=queue[front];
        front++;
        return data;
    }


    //Peek operation(Last element)
    public int peek(){
        if (front > rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        return  queue[front];
    }
    //Display element

    }



}

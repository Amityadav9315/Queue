import java.util.Deque;

public class DeQueue {

    private  int[] arr;
    private int  capacity;  //max no of element
    private int front;
    private int rear;
      private int size; //current no of element

    public DeQueue(int capacity){
        this.capacity=capacity;
        arr=new int[this.capacity];
        front=-1;
        rear=-1;
        size=0;
    }
    public boolean isFull(){
        return size==capacity;




    }

    //check if queue is empty or not
    public boolean isEmpty(){
        return size==0;
    }
    public void insertFront(int data){
        //check : full
        if(isFull()){
            System.out.println("Queue is full");
            return;
        }
        if(isEmpty()){
            front=0;
            rear=0;
        }

        else if(front==0){
            front=capacity-1;
        }
        else{
            front--;
        }
        arr[front]=data;
        size++;
    }





}

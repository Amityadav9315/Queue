import java.util.Deque;

public class DeQueue {

    private int[] arr;
    private int capacity;  //max no of element
    private int front;
    private int rear;
    private int size; //current no of element

    public DeQueue(int capacity) {
        this.capacity = capacity;
        arr = new int[this.capacity];
        front = -1;
        rear = -1;
        size = 0;
    }

    public boolean isFull() {
        return size == capacity;


    }

    //check if queue is empty or not
    public boolean isEmpty() {
        return size == 0;
    }

    public void insertFront(int data) {
        //check : full
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (isEmpty()) {
            front = 0;
            rear = 0;
        } else if (front == 0) {
            front = capacity - 1;
        } else {
            front--;
        }
        arr[front] = data;
        size++;
    }

    //insertion at rear end
    public void insertRear(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (isEmpty()) {
            front = -1;
            rear = -1;

        } else if (rear == capacity - 1) {
            rear = 0;


        } else {
            rear++;
        }
        arr[rear] = data;
        size++;
    }

    //deletion at front end
    public int deleteFront() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int data = arr[front];
        if (front == rear) {
            rear = -1;
            front = -1;
        } else if (front == capacity - 1) {
            front = 0;
        } else {
            front++;
        }
        size--;
        return data;
    }

    //deletion from rear
    public int deleteRear(){
        if(isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
            int data=arr[rear];
        if(front==rear){
            front=-1;
            rear=-1;

            }
        else if(rear==0){
            rear=capacity-1;
        }
        else{
            rear--;
        }
        size--;
        return data;
    }

     public int getFront(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return  arr[rear];
     }
     public int getRear(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return -1;
        }
        return  arr[rear];
     }
     public void display(){
        if(isEmpty()){
            System.out.println("Queue is empty");
            return;

        }
        for(int i=0; i<size; i++ ){
            System.out.print(arr[(front+i)%capacity]+"\t");


         }
         System.out.println();

     }







}

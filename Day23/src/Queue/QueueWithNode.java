package Queue;

public class QueueWithNode {
	int size;
	Node front;
	Node rear;
	int  numElements;
		
	QueueWithNode(int size){
		this.size = size;
		this. numElements = 0;
		
	}
	
    public boolean isEmpty() {
        return front == null;
    }
    
    public boolean isFull() {
    	return  numElements == size;
    }
	class Node{
		int data;
		Node next;
		Node(int data){
			this.data = data;
		}
		
	}
	public void enqueue(int data) {
        if (isFull()) {
            System.out.println("The Queue is full");
            return;
        }

        Node newNode = new Node(data);
        if (isEmpty()) {
            front = newNode;
            rear = newNode;
        } else {
            rear.next = newNode;
            rear = newNode;
        }
        numElements++;
        System.out.println(data + " is added to the Queue");
    }
	
	public void dequeue() {
        if (isEmpty()) {
            System.out.println("The Queue is empty");
            return;
        }

        int removedData = front.data;
        front = front.next;
        if (front == null) {
            rear = null; 
        }
        numElements--;
        System.out.println(removedData + " is deleted from the Queue");
    }
	
	public void peek() {
        if (isEmpty()) {
            System.out.println("The Queue is empty");
            return;
        }
        System.out.println(front.data + " is at the front");
    }
	
	public void printQueue() {
        if (isEmpty()) {
            System.out.println("The Queue is empty");
            return;
        }

        Node current = front;
        System.out.print("Queue: ");
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println(); 
    }
	public static void main(String[] args) {
       
        QueueWithNode queue = new QueueWithNode(5);

       
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

    
        queue.printQueue();

      
        queue.enqueue(60);

       
        queue.peek(); 

     
        queue.dequeue(); 

        queue.printQueue(); 

}
}

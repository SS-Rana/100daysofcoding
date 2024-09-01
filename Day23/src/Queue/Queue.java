package Queue;

public class Queue {
	int size;
	int arr[];
	int rear;
	
	Queue(int size){
		this.size = size;
		arr = new int [size];
		rear = -1;
	}
	
	
	
	public void Enque(int data) {
		
		if(size-1 == rear) {
			System.out.println("The Queue is full");
			return;
		}
		
		this.arr[++rear] = data;
		System.out.println(data+" is add to the Queue");
		
	}
	
	public void Dequeu() {
		
		if(rear == -1) {
			System.out.println("The Queue is empty");
			return;
		}
		int removed = arr[0];
		for(int i=0; i<rear; i++) {
			arr[i]=arr[i+1];
		}
		rear--;
		System.out.println(removed+" is deleted from the Queue");
		
	}
	
	public void Peek() {
		if(rear == -1) {
			System.out.println("The Queue is empty");
			return;
		}
		System.out.println(arr[0]+" is at the front");
	}
	public void print() {
		if(rear == -1) {
			System.out.println("The Queue is empty");
			return;
		}
		System.out.printf("The Queue: ");
		for(int i=0; i<=rear; i++) {
			System.out.print(arr[i]+"  ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
      
        Queue queue = new Queue(5);
        
        
        queue.Enque(10);
        queue.Enque(20);
        queue.Enque(30);
        queue.Enque(40);
        queue.Enque(50);
        queue.Enque(60);
     
        queue.Peek();
        
        queue.Dequeu();
        queue.Dequeu();
        
        queue.Peek();
        queue.print();
       
    }
}


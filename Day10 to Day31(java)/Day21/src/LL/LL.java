package LL;

public class LL {
	Node head;
	Node tail;
	int size;
	LL(){
		size = 0;
	}
	public class Node{
		int data;
		Node next;
		Node prev;
		
		Node(int data){
			this.next = null;
			this.prev = null;
			this.data = data;	
			
		}
		
	}
		public void addFirst(int data) {
			Node newNode = new Node(data);
			size++;
			if(tail == null) {
				head = newNode;
				tail = newNode;
				return;
			}
			head.prev = newNode;
			newNode.next = head;
			head = newNode;
		}
		public void addLast(int data) {
			Node newNode = new Node(data);
			size++;
			if(head == null ) {
				head = newNode;
				tail = newNode;
				return;
			}
			tail.next = newNode;
			newNode.prev = tail;
			tail = newNode;
		}
		public void deleteFirst() {
			 if (head == null) {
		            return; 
		        }
		        if (head == tail) {
		            head = null;
		            tail = null;
		        } else {
		            head = head.next;
		            head.prev = null;
		        }
		        size--;
		}
		public void deleteLast() {
			 if (tail == null) {
		            return; 
		        }
		        if (head == tail) {
		            head = null;
		            tail = null;
		        } else {
		            tail = tail.prev;
		            tail.next = null;
		        }
		        size--;
		}
		public void forwardIterate() {
			Node newNode = head;
			if(head == null) {
				System.out.println("The List is empty");
				return;
			}
		
			while(newNode != null) {
				System.out.print(newNode.data + " --> ");
				newNode = newNode.next;
			}
			System.out.println(" null");
			
		}
		
		public void reverseIterate() {
			Node newNode = tail;
			if(tail == null) {
				System.out.println("The List is empty");
				return;
			}
			
			while(newNode != null) {
				System.out.print(newNode.data + " -->");
				newNode = newNode.prev;
			}
			System.out.println(" null");
		}
		public static void main(String[] args) {
			  LL list = new LL();
		        list.addFirst(10);
		        list.addLast(20);
		        list.addFirst(5);
		        list.forwardIterate();  
		        list.reverseIterate();  
		        list.deleteFirst();
		        list.forwardIterate(); 
		        list.deleteLast();
		        list.forwardIterate();  
		        list.deleteFirst();
		        list.forwardIterate(); 
		}
}

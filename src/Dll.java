//import java.util.*;
public class Dll {
	
	static void printList(Node head) {
		Node temp=head;
		while (temp!= null) {
			
			if (temp.next!=null)
			System.out.print(temp.data + "<=> ");
			else
				System.out.println(temp.data );
			
	 		temp=temp.next;
		}
		System.out.println();
	}
	static Node addNode(Node head, int n) {
		Node new_node=new Node(n);
		Node temp=head;
		if (head==null) return new_node;
		
		while (temp.next!=null) {
			temp=temp.next;
		}
		temp.next=new_node;
		new_node.prev=temp;
		
		return head;
	}
	static Node addAfter(Node head, int m, int n) {
		if (head==null) return head;
		Node temp=head;
		while (temp!= null && temp.data!=m) {
			temp=temp.next;
		}
		if (temp==null) {
			return head;
			
		}
		else {
			Node new_node1= new Node(n);
			new_node1.next=temp.next;
			if (temp!=null)
			temp.next.prev=new_node1;
			temp.next=new_node1;
			new_node1.prev=temp;
		}
		return head;
	}
	static Node addFirst(Node head, int n) {
		Node new_node=new Node(n);
		if (head==null) return new_node;
		
		new_node.next=head;
		head.prev=new_node;
		head=new_node;
		
		return head;
		
	}
	static Node deleteLast(Node head) {
		if (head==null || head.next==null) return null;
		Node temp=head, prev=null;
		while (temp.next!=null) {
			prev=temp;
			temp=temp.next;
		}
		prev.next=null;
		return head;
	}
	static Node deleteFirst(Node head) {
		if (head==null || head.next==null) {
			return null;
		}
		head.next=head;
		return head;
	}
	public static void main(String[] args) {
		Node head =null;
		head =addNode(head, 50);
		head =addNode(head, 60);
		head =addNode(head, 70);
		head =addNode(head, 90);
		head=addFirst(head, 10);
		head=addAfter(head, 70, 80);
		//head = deleteFirst(head);
		//head=deleteLast(head);
//		Node first = new Node (10);
//		Node second =new Node (20);
//		head =first;
//		first.next=second;
//		second.prev=first;
//		Node third=new Node(30);
//		third.prev=second;
//		second.next=third;
		
		printList(head);
	}

}

class Node {
	int data;
	Node next;
	Node prev;
	
	Node (int d){
		data=d;
		next=null;
		prev=null;
		
	}
	}
	

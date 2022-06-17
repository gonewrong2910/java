
public class PalindromeLL {
	class Node{
		int data;
		Node =next;
		
		
		Node (int d){
			d=data;
		next=null;
		
		}
		
	}
	
	static Node reverse(Node head) {
		Node prev=null;
		Node cur=head;
		while (cur!=null) {
			Node next=cur.next;
			cur.next=prev;
			prev=cur;
			cur=next;
		}
		return prev;
	}
    static Node findmiddle(Node  head) {
    	Node slow=head;
    	Node fast= head;
    	
    	while (slow.next!=null && fast.next.next!=null) {
    		fast=fast.next.next;
    		slow=slow.next;
    	}
    	return slow;
    }
	static boolean isPalindrome(Node head) {
		
		if (head==null || head.next==null) return null;
		
		Node middle=findmiddle(head);
		Node secondHalf= reverse(middle.next);
		Node firstHalf=head;
		
		while (secondHalf!=null) {
			if (firstHalf.val!= secondHalf.val)
				return false;
		
		firstHalf=firstHalf.next;
		secondHalf=secondHalf.next;
		
		}
		
		return  true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

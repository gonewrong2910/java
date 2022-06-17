 
public class LL1 {

	public Node removeNthFromEnd(Node head, int n) {
		if(head.next==null) return null;
		
		int size=0;
		Node cur=head;
		while(cur!=null) {
			cur=cur.next;
			size++;
			
		}
		if (n==size) {
			return head.next;
		}
		int indexTosearch=size-n;
		int i=1;
		Node prev=head;
		while (i<indexTosearch) {
			prev=prev.next;
			i++; 
			
		}
		prev.next=prev.next.next;
		return head;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

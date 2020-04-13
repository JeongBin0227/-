class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		this.val = x;
	}
}

public class ReverseLinkedList {
	public static void main(String[] args) {
		ListNode l1 =  new ListNode(1);
		l1.next = new ListNode(2);
		l1.next.next = new ListNode(3);
		
		printNode(l1);
		ListNode head = reverseList(l1);
		printNode(head);
	}
	public static ListNode reverseList(ListNode current) {
		ListNode prev = new ListNode(0);
        if(current == null) return null;
		ListNode value = new ListNode(current.val);
		current = current.next;
		while(current!=null) {
			ListNode tmp = new ListNode(current.val);
			tmp.next = value;
			value = tmp;
			current = current.next;
		}
		prev.next = value;
		return prev.next;
	}
	
	
	
	public static void printNode(ListNode head) {
		System.out.println("printNOde: ");
		while(head != null) {
			System.out.println(head.val);
			head = head.next;
		}
		System.out.println();
	}
}
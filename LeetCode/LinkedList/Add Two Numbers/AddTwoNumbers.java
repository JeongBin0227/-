
class ListNode{
	int val;
	ListNode next;
	ListNode(int x){
		this.val = x;
	}
}

public class AddTwoNumbers {
	public static void main(String[] args) {
		ListNode l1 = new ListNode(2);
		l1.next = new ListNode(4);
		l1.next.next = new ListNode(3);
		
		ListNode l2 = new ListNode(5);
		l2.next = new ListNode(6);
		l2.next.next = new ListNode(2);
		ListNode node = solve(l1, l2);
		while(node!=null) {
			System.out.println(node.val);
			node = node.next;
		}
	}
	
	public static ListNode solve(ListNode l1, ListNode l2) {
		ListNode newHead = new ListNode(0);
		ListNode p1 =l1, p2 =l2 , p3=newHead;
		int firstNum = 0;
		int firstTime = 0;
		int secondNum = 0;
		int secondTime = 0;
		int answerNum=0;
		while(p1!=null) {
			firstNum += p1.val*Math.pow(10,firstTime);
			p1 = p1.next;
			firstTime++;
			
		}
		while(p2!=null) {
			secondNum += p2.val*Math.pow(10,secondTime);
			p2 = p2.next;
			secondTime++;
			
		}
		answerNum= firstNum + secondNum;

		while(answerNum!=0) {

			p3 = new ListNode(answerNum%10);
			p3=p3.next;
			answerNum = answerNum/10;
		}
		
		return newHead.next;
		
	}
}
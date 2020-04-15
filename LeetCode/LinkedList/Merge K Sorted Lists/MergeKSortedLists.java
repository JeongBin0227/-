import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.*;

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        this.val = x;
    }
}

class MergeKSortedList {

    public static void main(String[] args) {
        ListNode l1 = new ListNode(1);
        l1.next = new ListNode(3);
        l1.next.next = new ListNode(5);

        ListNode l2 = new ListNode(2);
        l2.next = new ListNode(4);
        l2.next.next = new ListNode(6);

        ListNode l3 = new ListNode(7);
        l3.next = new ListNode(8);

        ListNode[] list = new ListNode[3];
        list[0] = l1.next;
        list[1] = l2;
        list[2] = l3;
        MergeKSortedList a = new MergeKSortedList();
        ListNode result = a.mergeKLists(list);
        System.out.println("====");
        while (result != null) {
            System.out.println(result.val);
            result = result.next;
        }
    }

    public ListNode mergeKLists(ListNode[] lists) {
        int length = lists.length;
        ListNode answer = new ListNode(0);
        ListNode tmp = answer;
        if(lists.length ==0 ) return null;
        while (lists[0] != null) {
            System.out.println("d");
            tmp.next = new ListNode(lists[0].val);
            tmp = tmp.next;
            lists[0] = lists[0].next;
        }

        for (int i = 1; i < length; i++) {
            while (lists[i] != null) {

                ListNode temp = answer;
                if(temp.next==null){
                    temp.next=lists[i];
                    break;
                }
                else {
                    while (temp.next != null) {
                        if (temp.next.val >= lists[i].val) {
                            ListNode tempCopy = new ListNode(lists[i].val);
                            tempCopy.next = temp.next;
                            temp.next = tempCopy;
                            lists[i] = lists[i].next;
                            break;
                        } else if (temp.next.next == null) {
                            ListNode tempCopy = new ListNode(lists[i].val);
                            temp.next.next = tempCopy;
                            lists[i] = lists[i].next;
                            break;
                        } else {
                            temp = temp.next;
                        }
                    }
                }
            }
        }
        return answer.next;
    }
}
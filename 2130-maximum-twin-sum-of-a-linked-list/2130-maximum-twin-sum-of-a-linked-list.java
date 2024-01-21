/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public int pairSum(ListNode head) {
        int n = 0;
        ListNode temp = head;

        while(temp != null){
            temp = temp.next;
            n++;
        }

        int[] a = new int[n];
        temp = head;
        int i = 0;

        while(temp != null){   
            a[i] = temp.val;         
            temp = temp.next;
            i++;
        }

        int max = 0;
        for(int in = 0 ; in < n/2 ; in++){
            if(max < (a[in] + a[n-in-1])){
                max = a[in] + a[n-in-1];
            }
        }
        return max;
    }
}
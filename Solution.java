import java.util.HashMap;

class Solution{

    /**
     * The following methods, i.e:
     *
     * 1. public int whereCycle(ListNode head)
     * 2. public boolean hasCycle(ListNode head)
     *
     * Uses the `ListNode` class as described on the Leetcode challenge:
     * https://leetcode.com/problems/linked-list-cycle/
     *
     * ListNode is briefly mentioned under Assumptions in the README.md
     *
     * The hasCycle() function passed the challenge requirements.
     */


    // return the index of the start of the cycle in the linked list
    // return -1 if no cycle exists
    public int whereCycle(ListNode head){

        if(head == null) return -1;

        // Do Not assume unique node values of `val`
        HashMap<ListNode,Integer> track = new HashMap<ListNode,Integer>();
        // keys as ListNode objects
        // values as indices starting from zero

        ListNode curr = head;

        int index = 0;

        while(curr.next != null){

            if( track.get(curr) == null ){

                track.put(curr, index);
                index++;

            }else{
                return curr.val;
            }
            curr = curr.next;

        }
        return -1;
    }

    // return true if the linked list contains a cycle
    public boolean hasCycle(ListNode head) {

        boolean result = whereCycle(head) == -1 ? false : true;
        return result;
    }

}

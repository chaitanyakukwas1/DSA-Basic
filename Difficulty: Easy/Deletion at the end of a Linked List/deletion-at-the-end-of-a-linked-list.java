/*
class Node
{
    int data;
    Node next;

    Node(int data)
    {
        this.data = data;
        this.next = next;
    }
}
*/

class Solution {
    public Node removeLastNode(Node head) {
        // code here
        Node curr = head;
        if(curr == null)
        {
            return null;
        }
        
        if(curr.next == null)
        {
            curr = null;
            return curr;
            
        }
        
        Node secondLast = head;
        while(secondLast.next.next != null){
            secondLast = secondLast.next;
        }
        secondLast.next = null;
        return head;
        
    }
}
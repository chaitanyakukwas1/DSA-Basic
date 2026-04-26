class Solution {
    public boolean isEven(Node head) {
        // code here
        int count = 0;
        
        Node curr = head;
        
        while(curr != null)
        {
            count++;
            curr = curr.next;
        }
        if(count % 2 == 0)
        {
            return true;
        }
        else{
            return false;
        }
    }
}
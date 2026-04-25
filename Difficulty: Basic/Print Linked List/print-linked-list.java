
class Solution {
    public ArrayList<Integer> printList(Node head) {
        // code here
        ArrayList<Integer>List = new ArrayList<>();
       Node temp = head;
       while(temp != null)
       {
           List.add(temp.data);
           temp = temp.next;
       }
       return List;
    }
}
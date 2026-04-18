class Solution {
    public int getSecondLargest(int[] arr) {
        
        int largest = -1;
        int secondLargest = -1;

        for (int x : arr) {
            
            if (x > largest) {
                secondLargest = largest;
                largest = x;
            } 
            else if (x > secondLargest && x != largest) {
                secondLargest = x;
            }
        }

        return secondLargest;
    }
}
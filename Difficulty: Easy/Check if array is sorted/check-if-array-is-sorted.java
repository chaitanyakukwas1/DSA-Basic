class Solution {
    public boolean isSorted(int[] arr) {
        // code here
        int temp = arr[0];
        
        for(int i = 1;i<arr.length;i++)
        {
            if(arr[i] < temp)
            {
                return false;
            }
            temp = arr[i];
        }
        return true;
    }
}
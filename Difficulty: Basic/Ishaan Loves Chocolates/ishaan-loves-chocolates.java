class Solution {
    public int chocolates(int n, int[] arr) {
        
        int left = 0;
        int right = n - 1;
        
        while(left < right)
        {
            if(arr[left] > arr[right])
                left++;
            else
                right--;
        }
        
        return arr[left];
    }
}
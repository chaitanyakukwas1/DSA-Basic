class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int left = 0;
        int right = arr.length-1;
        for(int i = 0;i<right;i++)
        {
            int temp = arr[right];
            arr[right] = arr[left];
            arr[left] = temp;
            left++;
            right--;
        }
    }
}
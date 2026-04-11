class Solution {
    public static int largest(int[] arr) {
        // code here
        int a = arr[0];
        for(int i=0;i<arr.length;i++)
        {
            if(a<arr[i])
            {
                a=arr[i];
            }
        }
        return a;
    }
}

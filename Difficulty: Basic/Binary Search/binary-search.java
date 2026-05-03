class Solution {
    public boolean binarySearch(List<Integer> arr, int k) {
        // code here
        int low = 0;
        int high = arr.size() - 1;
        while(low<=high)
        {
            int mid = low + (high - low)/2;
            if(arr.get(mid) == k)
            {
                return true;
            }
            if(arr.get(mid)< k)
            {
                low = mid+1;
            }
            else
            {
                high = mid - 1;
            }
        }
        return false;
        
    }
}
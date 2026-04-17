// User function Template for Java
class Solution {
    String reverseWithSpacesIntact(String S) {
        // your code here
        char[] arr = S.toCharArray();
        int i = 0;
        int j = arr.length-1;
        
        while(i<j)
        {
            if(arr[i] == ' ')
            {
                arr[i] = ' ';
                i++;
                
            }
            else if (arr[j] == ' ')
            {
                arr[j] = ' ';
                j--;
                
            }
            else
            {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            }
            
        }
        return new String(arr);
    }
}
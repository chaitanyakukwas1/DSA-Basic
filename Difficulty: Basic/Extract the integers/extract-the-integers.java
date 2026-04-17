// User function Template for Java
class Solution {
    ArrayList<String> extractIntegerWords(String s) {
        // code here
        ArrayList<String> result = new ArrayList<>();
        String temp = "";
        
        for(int i = 0; i < s.length(); i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                temp += s.charAt(i); // build number
            }
            else
            {
                if(!temp.equals(""))
                {
                    result.add(temp); // store number
                    temp = "";
                }
            }
        }
        
        // last number (important)
        if(!temp.equals(""))
        {
            result.add(temp);
        }
        
        return result;
    }
}
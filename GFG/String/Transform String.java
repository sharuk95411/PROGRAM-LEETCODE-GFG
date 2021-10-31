Logic is very simple and availabe in techidelight Hint-end se traverse start krege 
class Solution
{
    int transform (String first, String second)
    {
        // first is A String and Second is B String 
        if(isTransformable(first.toCharArray(), second.toCharArray()))
        {
          return(getMinimumOperations(first, second));  
        }
        else
        return -1;
        
    }
    public boolean isTransformable(char[] first, char[] second)
    {
        // if the length of both strings differs
        if (first.length != second.length) {
            return false;
        }
 
        Arrays.sort(first);
        Arrays.sort(second);
 
        // return true if both strings have the same set of characters
        return (Arrays.toString(first).equals(Arrays.toString(second)));
    }
    public int getMinimumOperations(String first, String second)
    {
        
        int count = 0;
        for (int i = first.length() - 1, j = i; i >= 0; i--, j--)
        {
            while (i >= 0 && first.charAt(i) != second.charAt(j))
            {
                i--;
                count++;
            }
        }
        return count;
    }
}
class Solution {
    public boolean isPalindrome(String s) {
    int i=0;
    
    String s1 = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
    int j=s1.length()-1;
    while(i<j)
    { 
       if(s1.charAt(i)!=s1.charAt(j))
       {
        return false;
        
       }
       i++;
        j--;
    }  
    return true;
}
}
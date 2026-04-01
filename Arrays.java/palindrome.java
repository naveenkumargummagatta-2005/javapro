// 
class palindrome {
    public boolean isPalindrome(String s) {
        
        s = s.toLowerCase().replaceAll("[^a-z0-9]", "");
        int i=0,j=s.length()-1;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                
                return false;
            }
            i++;
            j--;
        }
        return true;

        

    }
    public static void main(String[]args){
        String s="navee";
        palindrome obj = new palindrome();   
        boolean result = obj.isPalindrome(s);
  
        
        System.out.print(result);
    }
}
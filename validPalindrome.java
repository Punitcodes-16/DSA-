class Solution {
    public static boolean checkPalindrome(String s){
        int left =0;
        int right = s.length() - 1;
        while(left<right){
            if(s.charAt(left) != s.charAt(right)){
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    public boolean isPalindrome(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<s.length(); i++){
            char ch = s.charAt(i);
            if(Character.isLetter(ch) || Character.isDigit(ch)){
                sb.append(ch);
            }
        }
        String result = sb.toString();
        result = result.toLowerCase();
        if(checkPalindrome(result)){
            return true;
        }
        return false;
    }
        
    }
    public static void main(String[] args) {
        Solution solution = new Solution();
        String s = "A man, a plan, a canal: Panama";
        boolean result = solution.isPalindrome(s);
        System.out.println("Is palindrome: " + result);
    }
}
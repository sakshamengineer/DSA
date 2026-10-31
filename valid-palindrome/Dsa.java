class Solution {
    public boolean isPalindrome(String s) {
        int first = 0;
        int last = s.length()-1;
        while(first < last){
            while (first < last && !Character.isLetterOrDigit(s.charAt(first))){
                first++;
            }
            while(last > 0 && !Character.isLetterOrDigit(s.charAt(last))){
                last--;
            }
            if (first < last && Character.toLowerCase(s.charAt(first)) != Character.toLowerCase(s.charAt(last))){
                return false;
            }

            first++;
            last--;
        }
        return true;
    }
}
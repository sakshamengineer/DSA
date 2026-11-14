class Solution {

    private boolean check(int freq[], String s3){
        int copy[] = freq.clone();
        for(int i = 0; i < s3.length(); i++){
            copy[s3.charAt(i) - 'a']--;
        }

        for(int i = 0; i < s3.length(); i++){
            if (copy[s3.charAt(i) - 'a'] != 0){
                return false;
            }
        }

        return true;
    }

    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length()){
            return false;
        }
        int m = s1.length();
        int n = s2.length();

        int freq[] = new int[26];
        for(int i = 0; i < m; i++ ){
            freq[s1.charAt(i) - 'a']++;
        }

        int i = 0;
        int j = m-1;

        while(j<n){
            if (check(freq,s2.substring(i,j+1))){
                return true;
            }
            i++;
            j++;
        }

        return false;
    }
}
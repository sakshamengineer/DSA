class Solution {
    public boolean containsDuplicate(int[] nums) {
        Set <Integer> temp = new HashSet<>();
        for(int i:nums){
            if (temp.add(i) == false){
                return true;
            }
        }
        System.gc();
        return false;
    }
}
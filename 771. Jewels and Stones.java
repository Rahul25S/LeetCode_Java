class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int n=stones.length(),m=jewels.length(),count=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(jewels.charAt(i)==stones.charAt(j))
                count++;
            }            
        }
        return count;
    }
}

class Solution {
    public int romanToInt(String s) {
        int ans=0;
        int n=s.length();
    for (int i=0;i<n;i++) {
            int val = value(s.charAt(i));
            if (i+1<n && val<value(s.charAt(i+1))) {
                ans-=val;
            }
            else{
                ans+=val;
            }
        }
        return ans;
    }
    private int value(char c) {
        if (c == 'I') return 1;
        if (c == 'V') return 5;
        if (c == 'X') return 10;
        if (c == 'L') return 50;
        if (c == 'C') return 100;
        if (c == 'D') return 500;
        if (c == 'M') return 1000;
        return 0;
    }
}

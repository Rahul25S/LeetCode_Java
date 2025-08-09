class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int x=0,n=operations.length;
        for(int j=0;j<n;j++){
            if(operations[j].contains("++")){
                x++;
            }
            else{x--;}
        }
        return x;
    }
}

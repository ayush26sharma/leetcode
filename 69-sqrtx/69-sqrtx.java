class Solution {
    public int mySqrt(int x) {
        int low = 1;
        int high = x;
        while(low<high){
            int mid = (low+high)/2;
            if (mid<=x/mid && mid+1>x/(mid+1)) return mid;
            else if (mid>x/mid) high = mid;
            else low = mid;
        }
        return x;
    }
}
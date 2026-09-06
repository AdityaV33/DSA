class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int hi = arr.length-2;
        int lo = 1 ;
        while(lo<=hi){
            int mid = lo +  (hi-lo)/2;
            if(arr[mid]<arr[mid+1]&&arr[mid]>arr[mid-1]) lo = mid+1;
            else if(arr[mid]<arr[mid-1]&&arr[mid] >arr[mid+1]) hi = mid-1;
            else return mid;
        }
        return -1;
    }
}
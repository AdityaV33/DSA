class Solution {
    public int maximumSum(int[] arr) {

        int noDelete = arr[0];
        int oneDelete = Integer.MIN_VALUE;
        int ans = arr[0];

        for (int i = 1; i < arr.length; i++) {

            int prevNoDelete = noDelete;
            int prevOneDelete = oneDelete;

            // Standard Kadane vala 
            noDelete = Math.max(prevNoDelete + arr[i], arr[i]);

            // if prevonedelete is -inf add arr[i] if its not one is already deleted hence you have to add add arr[i];
            int v2;
            if (prevOneDelete == Integer.MIN_VALUE) {
                v2 = arr[i];
            } else {
                v2 = prevOneDelete + arr[i];
            }
                    
            // Either delete the current element,
            // or continue a subarray that already used its deletion. (basically ek delete ho chuka tha)
            oneDelete = Math.max(prevNoDelete, v2);

            ans = Math.max(ans, Math.max(noDelete, oneDelete));
        }

        return ans;
    }
}
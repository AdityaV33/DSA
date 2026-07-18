class Solution {
    public int trap(int[] height) {
        int n = height.length;

        if (n <= 1) return 0;

        int[] leftMax = getLeftMax(height);
        int[] rightMax = getRightMax(height);

        int sum = 0;

        for (int i = 0; i < n; i++) {
            sum += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return sum;
    }

    public int[] getLeftMax(int[] height) {
        int n = height.length;
        int[] leftMax = new int[n];

        leftMax[0] = height[0];

        for (int i = 1; i < n; i++) {
            leftMax[i] = Math.max(leftMax[i - 1], height[i]);
        }

        return leftMax;
    }

    public int[] getRightMax(int[] height) {
        int n = height.length;
        int[] rightMax = new int[n];

        rightMax[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightMax[i] = Math.max(rightMax[i + 1], height[i]);
        }

        return rightMax;
    }
}
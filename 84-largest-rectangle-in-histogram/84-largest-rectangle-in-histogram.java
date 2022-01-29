class Solution {
    public int largestRectangleArea(int[] heights) {
     if (heights == null || heights.length == 0) {
            return 0;
        }
        Stack<Integer> stack = new Stack<>();
        int ans = 0;
        int n = heights.length;
        for (int i = 0; i <= n; i++) {
            int height = i == n ? -1 : heights[i];
            while (!stack.isEmpty() && heights[stack.peek()] > height) {
                int leftBound = stack.pop();
                if (stack.isEmpty()) {
                    ans = Math.max(ans, i * heights[leftBound]);
                } else {
                    ans = Math.max(ans, (i - stack.peek() - 1) * heights[leftBound]);
                }
            }
            stack.push(i);
        }
        return ans;
        
    }
}
class Solution {
    public int maxArea(int[] height) {

        int left = 0;
        int right = height.length-1;

        int max = Integer.MIN_VALUE;
        

        while(left<right) {
            if(height[left] == height[right]){
               int result =  height[left] * (right-left);
               if(result>max){
                 max = result;
               }
               left++;
            }
            else if(height[left]>height[right]){
                int result = height[right] * (right-left);
                if(result>max){
                 max = result;
               }
               right--;
            }
            else if(height[left]<height[right]){
                int result = height[left] * (right-left);
                if(result>max){
                 max = result;
               }
               left++;
            }
        }
        return max;
    }
}

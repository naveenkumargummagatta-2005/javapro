class leetcode11 {
    public static int maxArea(int[] height) {
        int left=0;
        int right=height.length-1;
        int max_area=0;
        while(left<right){
            int width=right-left;
            int current_height=Math.min(height[left],height[right]);
            int area=width*current_height;
            if(area > max_area){
                max_area=area;
            }
            if(height[left] < height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return max_area;
    }
    public static void main(String[]args){
        int[] height={1,2,3,4,5,7,9};
        int result=maxArea(height);
        System.out.println(result);

    }
}
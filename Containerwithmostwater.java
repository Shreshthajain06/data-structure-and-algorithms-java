public class Containerwithmostwater {
public static int water(int[] height){
    int left=0;
    int right=height.length-1;
    int max=0;
    while(left<right){
    int h=Math.min(height[left],height[right]);
    int w=right-left;
    int area=h*w;
    max=Math.max(max,area);
    
        if(height[left]<height[right]){
           left++;
        }else{
            right--;
        }
    }return max;
}



    public static void main(String[] args) {
        int[] height={1,8,6,2,5,4,8,3,7};
        int ans=water(height);
        System.out.println(ans);
    }
}

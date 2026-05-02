public class canjump {
    public static boolean canJump(int nums[]){
        int maxreach=0;
        for(int i=0;i<nums.length;i++){
            if(i>maxreach){
                return false;
            }
            maxreach=Math.max(maxreach,i+nums[i]);
        }
        return true;
    }   
public static void main(String args[]){
    int nums[]={2,3,1,1,4};
    boolean maxjump=canJump(nums);
    System.out.println("Can we jump to the end of the array? ");
    System.out.println(maxjump);
} 
}

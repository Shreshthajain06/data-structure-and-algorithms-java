public class consecutiveones {
    public static int countones(int[] arr){
       int n=arr.length;
        int count =0;
        int max=0;
        for(int i=0;i<n;i++){
            if(arr[i]==1){
                count++;
                max=count;
            }else{
                count=0;
            }
    max=Math.max(max,count);}
        return max;
    }
    public static void main(String[] args) {
        
        int[] arr={1,2,3,1,1,3};
        int result=countones(arr);
        System.out.println(result);
        
    }
}

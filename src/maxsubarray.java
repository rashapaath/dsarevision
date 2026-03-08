import java.math.BigInteger;
public class maxsubarray {
    public static void main(String[] args){
        int[] arr={-2,-3,4,3,-1,-2,1,5,-3};
        System.out.println(brute(arr));
    }
    //tc=o(n*n*n)
    //sc=o(1)
    public static int brute(int[] arr){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<j;k++){
                    sum+=arr[k];
                }
                max=Math.max(max,sum);
            }
        }
        return max;
    }
    //tc=o(n*n)
    //sc=o(1)
    public static int better(int[] arr){
        int n=arr.length;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<n;j++){


                    sum+=arr[j];

                max=Math.max(max,sum);
            }
        }
        return max;
    }

    public static int kadanes(int[] arr){
        int sum=0,max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            max=Math.max(arr[i],sum);
            if(sum<0){
                sum=0;
            }
        }
        return max;
    }
}

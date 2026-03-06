import java.util.HashMap;
import java.util.Arrays;
public class twosum{
    public static void main(String[] args){
        int[] arr={2,5,6,8,11};
        int target=8;
        int[] index=twosumbrute(arr,target);
    }
    /*
    tc=o(n*n);
    sc=o(1);
     */
    public static int[] twosumbrute(int[] arr,int target){
        int[] index=new int[2];        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    index[0]=i;
                    index[1]=j;
                    return index;
                }
            }
        }
        return index;
    }
    //tc=o(n*1) oro(n*n)//tc=o(n*log(n))
    //sc=o(n)
    public static int[] twosumbetter(int[] arr,int target){
        int[] index=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(target-arr[i])){
                map.put(arr[i],i);
            }
            else{
                index[0]=i;
                index[1]=map.get(target-arr[i]);
                return index;
            }
        }
        return index;

    }
    //tc=o(n)
    //sc=o(n)
    public static int[] twosumoptimal(int[] arr,int target){
        int[] index=new int[2];
        int[] dup=arr;
        Arrays.sort(arr);
        int i=0;
        int j=arr.length-1;
        while(i<j){
            if(arr[i]+arr[j]>target){
                j--;

            }
            else if(arr[i]+arr[j]<target){
                i++;

            }
            else{
                index[0]=arr[i];
                index[1]=arr[j];
                break;
            }
        }
        for(int k=0;k<dup.length;k++){
            if(dup[k]==index[0]){
                index[0]=k;
                break;
            }
        }

        for(int k=0;k<dup.length;k++){
            if(dup[k]==index[1] && k!=index[0]){
                index[1]=k;
                break;
            }
        }
        return index;


    }
}
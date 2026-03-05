import java.util.HashMap;
public class twosum{
    public static void main(String[] args){
        int[] arr={2,6,5,8,11};
        int target=8;
        int[] index=twosumbrute(arr,target);
    }
    //tc=o(n*n)
    //sc=o(1)
    public static int[] twosumbrute(int[] arr,int target){
        int[] index=new int[2];
        for(int  i=0;i<arr.length;i++){
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


    public static int[] twosumbetter(int[] arr,int target){
        int[] index=new int[2];
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            if(!map.containsKey(target-map.get(arr[i]))){
                map.put(arr[i],i);

            }
            else{
                index[0]=i;
                index[1]=map.get(target-arr[i]);
            }

        }
        return index;

    }
    public static int[] twosumoptimal(int[] sum,int target)
}
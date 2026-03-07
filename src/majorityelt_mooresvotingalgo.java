import java.util.Arrays;
import java.util.HashMap;
public class majorityelt_mooresvotingalgo {
    public static void main(String[] arg){
        int[] arr={2,3,3,3,3,2,2};
        System.out.println(majorbrute(arr));
        System.out.println("Brute: " + majorbrute(arr));
        System.out.println("Better: " + majorbetter(arr));
        System.out.println("Optimal: " + majoroptimalmoore(arr));
    }
    //tc=o(n*n)
    //sc=o(1)
    public static int majorbrute(int[] arr){
        for(int i=0;i<arr.length;i++){
            int count=0;
            for(int j=0;j<arr.length;j++){
                if(arr[j]==arr[i]){
                    count++;
                }
            }
            if(count>arr.length/2){
                return arr[i];
            }
        }
        return -1;

    }
    //tc=o(n)oro(n*n)or(nlog(n))+o(k);
    //sc=o(k)
   public static  int majorbetter(int[] arr){
        //1)map declare
       HashMap<Integer,Integer> map=new HashMap<>();
        //2)add elements to map
        for(int i=0;i<arr.length;i++){
            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }
        //3)check map value>n/2
       for(int elt:map.keySet()){
           if(map.get(elt)>arr.length/2){
               return elt;
           }
       }
       return -1;

    }
    //tc=o(2n)
    //sc=o(1)
    public static int majoroptimalmoore(int[] arr){
        int n=arr.length;
        int elt=arr[0],count=0;
        for(int i=0;i<arr.length;i++){
            if(count==0){
                elt=arr[i];
                count=1;
            }
            if(arr[i]==elt){
                count++;
            }
            else{
                count--;
            }
        }
        int counta=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==elt){
                counta++;
            }
        }
        if(counta>n/2){
            return elt;
        }
        return -1;

    }
}

import java.util.ArrayList;
public class rearrangeelts {
    public static void main(String[] args){
        int[] arr={3,1,-2,-5,2,-4,-8};
        brute(arr);
        for(int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    //tc=o(2n)
    //sc=o(n)
    public static void brute(int[] arr){
        ArrayList<Integer> listpos=new ArrayList<>();
        ArrayList<Integer> listneg=new ArrayList<>();
        //1)filling arraylist
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
               listneg.add(arr[i]);
            }
            else{
                listpos.add(arr[i]);


            }
        }
        //putback toarr
        int i=0,p=0,n=0;
        while(p<listpos.size()&&n<listneg.size()){
            arr[i++]=listpos.get(p++);
            arr[i++]=listneg.get(n++);
        }
        while(p<listpos.size()){
            arr[i]=listpos.get(p++);
            i++;
        }
        while(n<listneg.size()){
            arr[i]=listneg.get(n++);
            i++;
        }

    }
    //tc=
    public static void optimal(int[] arr){
        int p=0;
        int n=1;
        int[] arr2=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                arr2[n]=arr[i];
                n+=2;
            }
            else{
                arr2[p]=arr[i];
                p+=2;
            }
        }
        arr=arr2;
    }
}

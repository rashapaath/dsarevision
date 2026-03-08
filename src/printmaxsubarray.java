import java.util.ArrayList;
public class printmaxsubarray {
    public static void main(String[] args){
        int[] arr={-2,-3,4,3,-1,-2,1,5,-3};
        int[] subarr=brute(arr);
        for(int elt:subarr){
            System.out.println(elt);
        }
        System.out.println();
        int[] subarr1=better(arr);
        for(int elt:subarr){
            System.out.println(elt);
        }
        System.out.println();
        int[] subarr2=kadanes(arr);
        for(int elt:subarr){
            System.out.println(elt);
        }
    }
    public static int[] brute(int[] arr){
        int n=arr.length;
        ArrayList<Integer> list=new ArrayList<>();
        int start=-1;
        int end=-1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            for(int j=i;j<n;j++){
                int sum=0;
                for(int k=i;k<=j;k++){
                    sum+=arr[k];
                }
                if(sum>max){
                    max=sum;
                    start=i;
                    end=j;
                }
            }
        }
        for(int k=start;k<=end;k++){
            list.add(arr[k]);
        }
        int[] subarr=new int[list.size()];
        for(int x=0;x<list.size();x++){
            subarr[x]=list.get(x);
        }


        return subarr;
    }
    public static int[] better(int[] arr){
        int n=arr.length;
        ArrayList<Integer> list=new ArrayList<>();
        int start=-1;
        int end=-1;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=i;j<n;j++){
                sum+=arr[j];
                if(sum>max){
                    max=sum;
                    start=i;
                    end=j;
                }
            }
        }
        for(int k=start;k<=end;k++){
            list.add(arr[k]);
        }
        int[] subarr=new int[list.size()];
        for(int x=0;x<list.size();x++){
            subarr[x]=list.get(x);
        }


        return subarr;
    }
    public static int[] kadanes(int[] arr){
        int n=arr.length;
        int sum=0,max=Integer.MIN_VALUE;
        int start=-1,as=-1,ae=-1;
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<n;i++){
            if(sum==0){start=i;}
            sum+=arr[i];
            if(sum>max){
                max=sum;
                as=start;
                ae=i;

            }
            if(sum<0){
                sum=0;
            }
        }
        for(int k=as;k<=ae;k++){
            list.add(arr[k]);
        }
        int[] subarr=new int[list.size()];
        for(int x=0;x<list.size();x++){
            subarr[x]=list.get(x);
        }
        return subarr;

    }

}

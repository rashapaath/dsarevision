import java.util.ArrayList;
public class dutchnational{
    public static void main(String[] args){
        int[] arr={0,1,2,1,0,1,2,1,2,0,0,0,1};
        brutemergesort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int[] arr1={0,1,2,1,0,1,2,1,2,0,0,0,1};
        bettercount(arr1);
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int[] arr2={0,1,2,1,0,1,2,1,2,0,0,0,1};
        dutchnattionalflag(arr2);
        System.out.println();
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    //tc=o((log(n))n)
    //sc=o(n)
    public static void  brutemergesort(int[] arr){
        mergesort(arr,0,arr.length-1);
    }
    public static void mergesort(int[] arr,int low,int high){
        //basecase
        if(low>=high){return;}
        //recursive
        int mid=(low+high)/2;
        mergesort(arr,low,mid);
        mergesort(arr,mid+1,high);
        merge(arr,low,mid,high);
    }
    public static void merge(int[] arr,int low,int mid,int high){
        //temp array to store sorted
        ArrayList<Integer> list=new ArrayList<>();

        //sorting
        int i=low;
        int j=mid+1;
        while(i<=mid && j<=high){
            if(arr[i]<=arr[j]){
                list.add(arr[i]);
                i++;
            }
            else{
                list.add(arr[j]);
                j++;
            }

        }
        while(i<=mid){
            list.add(arr[i]);
            i++;

        }
        while(j<=high){
            list.add(arr[j]);
            j++;
        }
        //putting sorted array back
        for(int k=low;k<=high;k++){
            arr[k]=list.get(k-low);

        }
    }
    //tc=o(2n)
    //sc=o(n)
    public static void bettercount(int[] arr){
        int count0=0,count1=0,count2=0,n=arr.length;
        for(int i=0;i<n;i++){
            if(arr[i]==0){
                count0++;
            }
            else if(arr[i]==1){
                count1++;
            }
            else if(arr[i]==2){
                count2++;
            }
            else{

            }
        }
        for(int i=0;i<=count0;i++){
                arr[i]=0;
        }
        for(int i=count0+1;i<count0+count1;i++){
            arr[i]=1;
        }
        for(int i=count0+count1+1;i<n;i++){
            arr[i]=2;
        }
    }

    //sc=o(n)
    //tc=o(1
    public static void dutchnattionalflag(int[] arr){
        //1)initialising pointers
        /*sorted
        0 to l0w-1=0;
        low to mid-1=1;
        unsorted
        mid to high
        sorted
        high+1 to n-1
         */
        int n=arr.length,low=0,mid=0,high=n-1;
        //2)algo
        while(mid<=high){
            if(arr[mid]==0){
                swap(arr,mid,low);
                low++;
                mid++;

            }
            else if(arr[mid]==1){
                mid++;//low at same initial mid

            }
            else if(arr[mid]==2){
                swap(arr,mid,high);
                high--;

            }
        }

    }
    public static void swap(int[] arr,int i,int j){
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }

}
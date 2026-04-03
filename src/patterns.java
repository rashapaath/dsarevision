public class patterns {
    public static void main(String[] args){
        pattern1(5);
        pattern2(5);
        pattern3(5);
        pattern4(5);
        pattern5(5);
        pattern6(5);
        pattern7(5);
        pattern8(5);
        pattern9(5);
        pattern10(5);
        pattern11(5);
        pattern12(5);
        pattern12b(5);
        pattern13(5);
        pattern14(5);
        pattern15(5);
        pattern16(5);
        pattern17(5);
        pattern18(5);
        pattern19(5);
        //imp part11,12,14,17



    }
    static void pattern1(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    static void pattern2(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    static void pattern3(int n){
        for(int i=0;i<=n;i++){
            for(int j=1;j<i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern4(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.println();
        }
    }
    static void pattern5(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    static void pattern6(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern7(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print('*');
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    static void pattern8(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    static void pattern9(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*i+1;j++){
                System.out.print('*');
            }
            for(int j=0;j<n-i-1;j++){
                System.out.print(" ");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int j=0;j<2*n-(2*i+1);j++){
                System.out.print('*');
            }
            System.out.println();
        }
    }
    static void pattern10(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<(i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<n-(i+1);j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    static void pattern11(int n){
        int pat=1;
        for(int i=0;i<n;i++){
            if(i%2!=0){pat=0;}else{
                pat=1;
            }
            for(int j=0;j<i+1;j++){
                System.out.print(pat);
                pat=1-pat;
            }
            System.out.println();
        }
    }
    static void pattern12(int n){
        int space=2*n-2;
        for(int i=0;i<n;i++){
            for(int j=1;j<=(i);j++){
                System.out.print(j);
            }
            for(int j=0;j<space;j++){
                System.out.print("?");
            }
            for(int j=i;j>=1;j--){
                System.out.print(j);
            }
            space-=2;
            System.out.println();
        }


    }
    static void pattern12b(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print(j);
            }
            for(int j=0;j<(2*n-(2*i+2));j++){
                System.out.print("");
            }
            for(int j=i+1;j>=1;j--){
                System.out.print(j);
            }
            System.out.println();
        }

    }
    static void pattern13(int n){
        int num=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print(num+" ");
                num++;
            }
            System.out.println();
        }
    }
    static void pattern14(int n){
        for(int i=0;i<n;i++){
            for(char j='A';j<='A'+i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern15(int n){
        for(int i=0;i<n;i++){
            for(char j='A';j<='A'+(n-i-1);j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    static void pattern16(int n){
        char c='A';
        for(int i=1;i<=n;i++){
            for(char j=1;j<=i;j++){
                System.out.print(c);
            }
            c++;
            System.out.println();
        }
    }
    static void pattern17(int n){
        for(int i=0;i<n;i++){
            char c='A';
            for(int j=0;j<n-i-1;j++){
                System.out.print("?");

            }
            for(int j=1;j<=(2*i+1);j++){
                System.out.print(c);
                if(j>(2*i)/2){
                    c--;
                }else{
                    c++;
                }
            }
            System.out.println();

        }

    }
    static void pattern18(int n){
        for(int i=0;i<n;i++){
            for(char c=(char)('E'-(i));c<='E';c++){
                System.out.print(c);
            }
            System.out.println();
        }
    }
    static void pattern19(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<(n-i);j++){
                System.out.print("*");
            }
            for(int j=0;j<(2*i);j++){
                System.out.print(" ");
            }
            for(int j=0;j<(n-i);j++){
                System.out.print("*");

            }
            System.out.println();
        }
        for(int i=0;i<n;i++){
            for(int j=0;j<i+1;j++){
                System.out.print("*");
            }
            for(int j=0;j<(2*(n-i-1));j++){
                System.out.print(" ");
            }
            for(int j=0;j<i+1;j++){
                System.out.print("*");

            }
            System.out.println();
        }

    }



}

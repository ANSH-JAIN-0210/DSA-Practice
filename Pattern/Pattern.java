public class Pattern {
    public static void main(String[] args) {
        gen_patt_1(5);
        gen_patt_2(5);
        gen_patt_3(5);
        gen_patt_4(5);
        gen_patt_5(5);
        gen_patt_6(5);
        gen_patt_7(5);
        gen_patt_8(5);
        gen_patt_9(4);
        gen_patt_10(5);
        gen_patt_11(5);
    }


//        **********
//        ****  ****
//        ***    ***
//        **      **
//        *        *
//        *        *
//        **      **
//        ***    ***
//        ****  ****
//        **********
    public static void gen_patt_11(int n){
        String[] arr = new String[2*n];
        for(int i = 1;i<=n;i++){
            String temp = "";
            for(int j = 1;j<=n+1-i;j++) temp = temp + "*";
            for(int sp = 2*(i-1);sp>0;sp--) temp = temp + " ";
            temp = temp + temp;
            arr[i-1] = temp;
            arr[2*n-i] = temp;
        }
        print_pattern(arr);
    }


//            *        *
//            **      **
//            * *    * *
//            *  *  *  *
//            *   **   *
//            *   **   *
//            *  *  *  *
//            * *    * *
//            **      **
//            *        *
    public static void gen_patt_10(int n){
        String[] arr = new String[2*n];
        int gap = -1;
        for(int i = 1;i<=n;i++){
            String temp = "*";
            for(int j = gap;j>0;j--){
                temp = temp + " ";
            }
            gap++;
            if(i > 1) temp = temp + "*";
            for(int sp = 1;sp<=2*n-2*i;sp++){
                temp = temp + " ";
            }
            temp = temp + temp;
            arr[i-1] = temp;
            arr[2*n-i] = temp;
        }
        print_pattern(arr);
    }




//             1 2 3 4  17 18 19 20
//             5 6 7  14 15 16
//             8 9  12 13
//             10 11
    public static void gen_patt_9(int n){
        String[] arr = new String[n];
        int f = 1;
        int l = n*(n+1);
        for(int i = 1;i<=n;i++){
            String temp = "";
            for(int sp = 0;sp<i-1;sp++) temp = temp + " ";
            for(int j = n+1-i;j>0;j--){
                temp = temp + f + " ";
                f++;
            }
             temp = temp + " ";
            for (int j = n+1-i;j>0;j--){
                temp = temp + (l-j+1) + " ";
            }
            l-=n+1-i;
            arr[i-1] = temp;
        }
        print_pattern(arr);
    }



//             *
//             * *
//             * * *
//             * * * *
//             * * * * *
//             * * * *
//             * * *
//             * *
//             *
    public static void gen_patt_8(int n){
        String[] arr = new String[2*n-1];
        for(int i = 1;i<=n;i++){
            String temp = "";
            for(int sp = 1;sp<=n-i;sp++) temp = temp + " ";
            for(int j = i;j>=1;j--) temp = temp + "* ";
            arr[i-1] = temp;
            arr[2*n-1-i] = temp;
        }
        print_pattern(arr);
    }





//               *        *
//               **      **
//               ***    ***
//               ****  ****
//               **********
//               ****  ****
//               ***    ***
//               **      **
//               *        *
    public static void gen_patt_7(int n){
        String[] arr = new String[2*n-1];
        for(int i = 1;i<=n;i++){
            String temp = "";
            for(int j = i;j>=1;j--) temp = temp + '*';
            for(int j = 0;j<2*n-2*i;j++) temp = temp + " ";
            for(int j = i;j>=1;j--) temp = temp + '*';
            arr[i-1] = temp;
            arr[2*n-1-i] = temp;
        }
        print_pattern(arr);
    }



//                    1
//                    2 1 2
//                    3 2 1 2 3
//                    4 3 2 1 2 3 4
//                    5 4 3 2 1 2 3 4 5
    public static void gen_patt_6(int n){
        String[] arr = new String[n];
        for(int i = 1;i<=n;i++){
            String temp = "";
            for(int sp = 1;sp<=n-i;sp++){
                temp = temp + "  ";
            }
            for(int j = i;j>0;j--){
                temp = temp +" "+ j;
            }
            for(int j = 2;j<=i;j++){
                temp = temp +" "+ j;
            }
            arr[i-1] = temp;
        }
        print_pattern(arr);
    }



//            4 4 4 4 4 4 4
//            4 3 3 3 3 3 4
//            4 3 2 2 2 3 4
//            4 3 2 1 2 3 4
//            4 3 2 2 2 3 4
//            4 3 3 3 3 3 4
//            4 4 4 4 4 4 4
    public static void gen_patt_5(int n){
        String[] arr = new String[2*n-1];
        int size = 2*n-1;
        for(int i = 0;i<size;i++){
            String temp = "";
            for(int j = 0;j<size;j++){
                int val = n - Math.min(Math.min(i,j),Math.min(size-1-j,size-1-i));
                temp = temp + val;
            }
            arr[i] = temp;
        }
        print_pattern(arr);
    }



//    E
//    D E
//    C D E
//    B C D E
//    A B C D E
    public static void gen_patt_4(int n){
        String[] arr = new String[n];
        for(int i = n;i>0;i--){
            String temp = "";
            for(int j = n-i;j>=0;j--){
                temp = temp + (char)(64+n-j);
            }
            arr[n-i] = temp;
        }
        print_pattern(arr);
    }



//    a
//    B c
//    D e F
//    g H i J
//    k L m N o
    public static void gen_patt_3(int n){
        if(n>6) return;
        String[] arr = new String[n];
        int num = 1;
        for(int i = 1;i<=n;i++){
            String temp = "";
            for(int j = 0;j<i;j++){
                if(num%2 == 0) temp = temp + (char)(64+num);
                else temp = temp + (char)(96+num);
                num++;
            }
            arr[i-1] = temp;
        }
        print_pattern(arr);
    }



//    E D C B A
//    D C B A
//    C B A
//    B A
//    A
    public static void gen_patt_2(int n){
        String[] arr = new String[n];
        for(int i = n;i>0;i--){
            String temp = "";
            for(int j = i;j>0;j--){
                temp = temp + (char)(64+j);
            }
            arr[n-i] = temp;
        }
        print_pattern(arr);
    }



//            1      1
//            12    21
//            123  321
//            12344321
    public static void gen_patt_1(int n){
        String[] arr = new String[n];
        for(int i = 1;i<=n;i++){
            String temp = "";
            for(int j = 1;j<=i;j++){
                temp = temp + j;
            }
            for(int j = 0;j<(n-i)*2;j++){
                temp = temp + ' ';
            }
            for(int j = i;j>=1;j--){
                temp = temp + j;
            }
            arr[i-1] = temp;
        }
        print_pattern(arr);
    }
    public static void print_pattern(String[] arr){
        for(int i = 0;i<arr.length;i++) System.out.println(arr[i]);
    }
}

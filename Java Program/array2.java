// import java.util.Scanner;

// public class array2{
//     public static void search(int marks[]){
//         int largest=Integer.MIN_VALUE;
//         int smallest=Integer.MAX_VALUE;
//         for(int i=0;i<marks.length;i++){
//             if(largest<marks[i]){
//             largest=marks[i];
//         }
//         if(smallest>marks[i]){
//         smallest=marks[i];
//     }
    
// }
// System.out.println(largest);
//     System.out.println(smallest);
//     }

// public static void main(String args[]){
//     int marks[]={1,2,3,4,5,6};
//     search(marks);
// }
// }

//  

// public class array2{
//     public static void reverse(int marks[]){
//         int first=0;
//         int last=marks.length-1;
//         while(first<last){
//             int temp=marks[last];
//             marks[last]=marks[first];
//             marks[first]=temp;
//             first++;
//             last--;
           
//         }

//     }


//     public static void main(String args[]){
//         int marks[]={1,2,3,4,5,6};
//         reverse(marks);
//         for(int i=0;i<marks.length;i++){
//             System.out.println(marks[i]);
            
//     }
// }
// }

// public class array2{
//     public static void find(int marks[]){
//         int smallest=Integer.MAX_VALUE;
//         int largest=Integer.MIN_VALUE;
//         for(int i=0;i<marks.length;i++){
//             if(smallest>marks[i]){
//                 smallest=marks[i];
//             }
//             if(largest<marks[i]){
//                 largest=marks[i];
//         }
//     }
//         System.out.println(smallest);
       
//       System.out.println(largest);
    
// }


// public static void main(String args[]){
//     int marks[]={1,2,3,4,5,6};
//     find(marks);
// }
// }

// 


// public class array2{
//     public static void sub(int marks[]){
//         int ms=Integer.MIN_VALUE;
//         int c=0;
//         for(int i=0;i<marks.length;i++){
//              c=c+marks[i];
//              if(c<0){
//                 c=0;
//              }
//              ms=Math.max(c, ms);
            
//         }
//         System.out.print(ms);
//     }

//     public static void main(String args[]){
//         int marks[]={-2,-3,4,-1,-2,1,5,-3};
//         sub(marks);
//     }
// }


// public class array2{
//     public static void abc(int marks[]){
//         int ms=Integer.MIN_VALUE;
//        // int c=0;
//         for(int i=0;i<marks.length;i++){
//             c=marks[i];
//             if(c<0){
//                 c=0;
//             }
//             ms=Math.max(c, ms);


//         }
//         System.out.print(ms);

//     }

//     public static void main(String[]){
//         int marks[]={-2,-3,4,-1,-2,1,5,-3};
//         abc(marks);
//     }
// }

//import java.util.*;
// public class array2{
//     public static int trapped(int marks[]){
//         int n=marks.length;
//         int leftmax[]=new int[n];
//         leftmax[0]=marks[0];
//         for(int i=1;i<n;i++){
//             leftmax[i]=Math.max(marks[i],leftmax[i-1]);

//             }

            
//             int rightmax[]=new int[n];
//             rightmax[n-1]=marks[n-1];
//             for(int i=n-1;i>=0;i--){
//                 rightmax[i]=Math.max(marks[i],rightmax[n+1]);
//             }
//             int trappewater=0;
//             for(int i=0;i<n;i++){
//                 int waterlevel=Math.min(rightmax[i],leftmax[i]);
//                 trappewater+=waterlevel-marks[i];
//             }
//             return trappewater;
            
//         }

//         public static void main(String args[]){
//             int marks[]={7,1,5,3,6,4};
//            int trappewater= trapped(marks);
//             System.out.println(trappewater);
            
//         }
//     }

    



public class array2 {
    public static int trapped(int marks[]) {
        int n = marks.length;
        int leftmax[] = new int[n];
        leftmax[0] = marks[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(marks[i], leftmax[i - 1]);
        }

        int rightmax[] = new int[n];
        rightmax[n - 1] = marks[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(marks[i], rightmax[i + 1]);
        }

        int trappewater = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(rightmax[i], leftmax[i]);
            trappewater += waterlevel - marks[i];
        }

        return trappewater;
    }

    public static void main(String args[]) {
        int marks[] = {7, 1, 5, 3, 6, 4};
        int trappewater = trapped(marks);
        System.out.println(trappewater);
    }
}

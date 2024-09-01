//import java.util.function.IntPredicate;

// public class binary {
//     public static boolean prime(int n){
//         for(int i=2;i<=n-1;i++){
//             if(n%i==0){
//                // System.out.println(i);
//                 return false;
//             }

//         }
//         return true;
//     }


//     public static void isprime(int n){
//         for(int i=2;i<n;i++){
//             if(prime(i)){
//             System.out.println(i+"");
//         }
       
//     }
//     System.out.println();

//     }


//     public static void main(String args[]){
//         isprime(20);
//     }
    
// }




// public class binary{
//     public static boolean prime(int n){
//         for(int i=2;i<=Math.sqrt(n);i++){
//         if(n%i==0){
//            // System.out.println(i);
//             return false;

//         }
//     }
//     return true;
// }

// public static void range(int s){
//     for(int i=2;i<=s-1;i++){
//         if(prime(i)){
//             System.out.println(i);

//         }
//     }
//     System.out.println();

// }

// public static void bin(int dec){
//     int pow=0;
//     int decno=0;
//     while(dec>0){
//         int lastDigit=dec%10;
//         decno=decno+(lastDigit*(int)Math.pow(2,pow));
//         pow++;
//         dec=dec/10;

//     }
//     System.out.println(dec+decno);
// }

// public static void main (String args[]){
//    // System.out.println(prime(20));
//   // range(10);
//   bin(101);
// }

// }


//code to convert decimal to binary
//int and void dono use kar skte hai isme.

// public class binary{
//     public static int sha(int n){
//         int pow=0;
//         int dec=0;
//         while(n>0){
//             int rem= n%2;
//             dec = dec+(rem*(int)Math.pow(10,pow));
//             pow++;
//             n=n/2;
//         }
//         System.out.println(n+dec);
//         return n+dec;
//     }


//     public static void main(String args[]){
//         sha(10);
//     }
// }



// public class binary{
//     public static boolean isEven(int n){
//         for(int i=1;i<=n;i++){
//             if(i%2==0){
//                 System.out.println(i);
//                 return false;
//             }
//         }
//         return true;
//     }

//     public static void main(String args[]){
//         System.out.println(isEven(20));
//     }
// }
    





// public class binaryfunction{
//   public static int binary(int n){
//     int pow=0;
//     int decimal=0;
//     while(n>0){
//     int lastDigit=n%10;
//     decimal=decimal+(lastDigit*(int)Math.pow(2, pow));
//     pow++;
//     n=n/10;
    
//   }
//   System.out.println(n+decimal);
//          return n+decimal;
//  // return decimal;
// }

// public static void main(String args[]){
//  // System.out.println(binary(20));
//  binary(1010);
// }
// }



// public class binaryfunction{
//   public static int find(int n){
//      int pow=0;
//     int decimal=0;
//      while(n>0){
//     int lastDigit=n%10;
//       decimal=decimal+(lastDigit*(int)Math.pow(2, pow));
//       pow++;
//       n=n/10;
//      }
//     // System.out.println(decimal+n);
//      return decimal;

//     }


//     public static void main(String args[]){
//       System.out.println(find(101));

//     }
// }
// import java.util.Scanner;

// public class array1{
//   public static void main(String args[]){
//   int marks[]=new int [70];
//   Scanner sc =new Scanner(System.in);

//  //use to find the length of array. 
// System.out.println(marks.length);
//   marks[0]=sc.nextInt();
//   marks[1]=sc.nextInt();
//   marks[2]=sc.nextInt();
//   System.out.println(marks[0]);
//   System.out.println(marks[1]);

// System.out.println(marks[2]);

// //update
// marks[2]=100;
// //seconfd method to update th marks .In arryswe can update -,+,/,* anything.
// marks[2]=marks[2]+1;
// System.out.println(marks[2]);
// }
// }

    
//passing array as argument

//import java.util.Scanner;




//update code.
// 



//linear search code

// public class array1{
//   public static int linearSearch(int number[],int key){
//     for(int i=0;i<=number.length;i++){
//       if(number[i] == key){
//         return i;
//       }
//     }
//     return -1;
//   }

//   public static void main(String args[]){
//     int number[]={1,2,3,4,5,6};
//     int key=5;
//    int index= linearSearch(number, key);
//    if(index == -1){
//     System.out.println("Not found ");
//    }
//    else{
//     System.out.println("found  at index= "  +index);
//    }
//   }
// }

//linear search also return in void form

// public class binaryfunction{
  //   public static void linearSearch(int number[],int key){
  //     for(int i=0;i<number.length;i++){
  //       if(number[i]==key){
  //         System.out.println(i);
  //       }
  //     }
  //   }
    

  //     public static void main(String args[]){
  //       int number[]={1,2,3,4,5,6};
  //       int key=5;
  //       linearSearch(number,key);
  //     }
  //   }

//int ya void ke jagah boolean bhi use kar skte hai'
//code for update.
  // public class array1{
//     public static void update(int marks[]){
//       for(int i=0;i<=marks.length;i++){
//         marks[i]=marks[i]+1;
//       }
//     }
  
//       public static void main(String args[]){
//         int marks[]={50,60,20};
//         update(marks);
  
//         //print marks
//         for(int i=0;i<=marks.length;i++){
//           System.out.println(marks[i]);
  
//         }
//         System.out.println();
  
//       }
  
//     }

//update code
// public class array1{
//         public static  void search(int marks[]){
//           for(int i=0;i<marks.length;i++){
//             marks[i]=marks[i]+1;
//               System.out.println(i);
            
//           }
//         }
      


//         public static void main(String args[]){
//           int marks[]={1,2};
//           search(marks);
//           for(int i=0;i<marks.length;i++){
//             System.out.println(marks[i]);
//           }
//           System.out.println(" ");
//           //(marks);
//         }
//       }
      
       
   
//code both for finding shortest andd longests number in array.
//  import java.util.*;
//  public class array1{
//    public static int find(int input[]){
//     // int largest = Integer.MIN_VALUE;
//      int smallest=Integer.MAX_VALUE;
//      for(int  i=0;i<input.length;i++){
//       // if(largest<input[i]){
//        //largest=input[i]; 
//      //  }  
     
//          if(smallest>input[i]){
//            smallest=input[i];
//          }
//        }
         
      
//       // System.out.println(smallest);
      
    
//      return smallest;
//    } 

//    public static void main(String args[]){
//      int input[]={3,4,1,6};
//      System.out.print(find(input));
//     // find(input);
    
    

//     }
   
//   }


//reverse of array

// public class array1{
//   public static void find(int marks[]){
//       int first=0, last=marks.length-1;
//       while(first<last){
//           int temp=marks[last];
//           marks[last]=marks[first];
//           marks[first]=temp;
//           first++;
//           last--;
//       }
      
//   }
  


//   public static void main(String args[]){
//       int marks[]={1,2,3,4};
//       find(marks);
//       for(int i=0;i<marks.length;i++){
//           System.out.println(marks[i]);
//       }
//   }
// }



//code for pairing of array.

// public class array1{
//   public static void pair(int number[]){
//  int totaltime=0;
//     for(int i=0;i<number.length;i++){
//       int c=number[i];
//       for(int j=i+1;j<number.length;j++){
//         System.out.println("("+ c+ ","+number[j]+")");
//    totaltime++;

//     }
//   }
// System.out.println(totaltime);
// }
//   public static void main(String args[]){
//     int number[]={1,2,3,4,5};
//     pair(number);
//   }

// }

// 

// 

// 
// public class array1{
//   public static void  pair(int number[]){
//     int tp=0;
//     for(int i=0;i<number.length;i++){
//       int c=number[i];
//       for(int j=i;j<number.length;j++){
//         //System.out.println("("+ c+ ","+number[j]+")");
//         System.out.println(number[j]);
//         tp++;

//       }
    //  System.out.println(" ");
    

   


    
  //Subarray code.
  //  public class array1{
  //    public static void Subarray(int number[]){
  //     int curr=0;
  //     int maxSum=Integer.MIN_VALUE;
  //      for(int i=0;i<number.length;i++){
  //           // int start=i;
  //            for(int j=i;j<number.length;j++){
  //              curr=0;

  //               // int end=j;
  //                for(int k=i;k<=j;k++){
  //                    curr+=number[k];
  //                }
  //                System.out.println(curr);
  //                if(maxSum<curr){
  //                 maxSum=curr;
  //                }
  
  //            }
                
  //        }
  //        System.out.println(maxSum);
  //    }
    
  //        public static void main(String arrgs[]){
  //            int number[]={2,4,6,8,10};
  //            Subarray(number);
  //        }
        
        
  //    }
    
    
  // 


//kadanes algorithm it is one of the easiest way to print max sub array.
// public class array1{
//   public static void kadanes(int number[]){
//     int ms=Integer.MIN_VALUE;
//     int cs=0;
//     for(int i=0;i<number.length;i++){
//       cs=cs+number[i];
//       if(cs<0){ 
//         cs=0;

//       }
//       ms=Math.max(cs, ms);
//     }
//     System.out.println(ms);


//   }

//   public static void main(String args[]){
//     int number[]={-2,-3,4,-1,-2,1,5,-3};
//    // int number[]={1};
//     kadanes(number);
//   }
// }

  


  //to find trapped water building or anything this this of question
  //can come with differnt name b-ut the logic will remain the same.
//   public class array1{
//     public static int trappedRainwater(int height[]){
//         int n=height.length;
//         //calculate left maxx boundary-array 
 //this are know as auxilary array 
          //so here we using 2 auixy array.
//         int leftMax[]=new int [n];
//         leftMax[0]=height[0];
//         for(int i=1;i<n;i++){
//             leftMax[i]=Math.max(height[i], leftMax[i-1]);
//         }

//         //calculate right maxx boundary-array
//         int rightMax[]=new int [n];
//         rightMax[n-1]=height[n-1];
//         for(int i=n-2;i>=0;i--){
//             rightMax[i]=Math.max(height[i], rightMax[i+1]);
//         }
//         int trappewater=0;
//         for(int i=0;i<n;i++){
//             int waterlevel=Math.min(leftMax[i], rightMax[i]);
//            trappewater += waterlevel-height[i];
        
//         //loop
//         //waterlevel=min(leftmax bound ,rightmax bound)
//         //trapped water  = waterlevel-height[i]

//     }
//     return trappewater;

// }


// public static void main(String args[]){
//     int height[]={4,2,0,6,3,2,5};
//     trappedRainwater(height);
//     System.out.println(trappedRainwater(height));
// }
// }

  // public class array1{
  //   public static int  Stock(int price[]){
  //       int n=price.length;
  //       int buyPrice=Integer.MAX_VALUE;
  //       int maxProfit=0;

  //       for(int i=0;i<n;i++){
  //           if(buyPrice<price[i]){
  //             //is me kya hai deko
  //               int profit=price[i]-buyPrice;
  //               maxProfit=Math.max(maxProfit, profit);
  //           }else{
  //               buyPrice=price[i]; 
  //           }
  //       }
  //       return maxProfit;
  //   }

  //   public static void main(String args[]){
  //       int price[]={7,1,5,3,6,4};
  //       System.out.println(Stock(price));
  //   }
  // }


// import java.util.*;
// import java.util.Scanner;



// public class array1{
//         public static void main(String args[]){
//             int marks[]=new int[100];
//             Scanner sc =new Scanner(System.in);
//             marks[1]=sc.nextInt();
//             System.out.println(marks[1]);
            
//         }

//     }

   
    
// public class array1{
//   public static int water(int marks[]){
//     int n=marks.length;
//     int leftmax[]=new int[n];
//     leftmax[0]=marks[0];
//     for(int i=1;i<n;i++){
//       leftmax[i]=Math.max(marks[i],leftmax[i-1]);
//     }
//     int rightmax[]=new int[n];
//     rightmax[n-1]=marks[n-1];
//     for(int i=n-2;i>=0;i--){
//       rightmax[i]=Math.max(marks[i],rightmax[i+1]);

//   }
//   int trappewater=0;
//   for(int i=0;i<n;i++){
//     int waterlevel=Math.min(rightmax[i],leftmax[i]);
//     trappewater+=waterlevel-marks[i];
//   }
//   return trappewater;
// }


// public static void main(String args[]){
//   int marks[]={4,2,0,6,3,2,5};
//   water(marks);
//   System.out.println(water(marks));
// }
// }


//stock market
// import java.util.*;

// public class array1 {
//     public static class Array1 {
//         public static int Stock(int prices[]) {
//             int buyPrice = Integer.MAX_VALUE;
//             int maxProfit = 0;

//             for (int i = 0; i < prices.length; i++) {
//                 if (buyPrice < prices[i]) {
//                     int profit = prices[i] - buyPrice;
//                     maxProfit = Math.max(maxProfit, profit);
//                 } else {
//                     buyPrice = prices[i];
//                 }
//             }

//             return maxProfit;
//         }
//     }

//     public static void main(String args[]) {
//         int prices[] = {7, 1, 5, 3, 6, 4};
//         int result = Array1.Stock(prices);
//         System.out.println("Max Profit: " + result);
//     }
// }

//binary search


public class array1{
  public static int sum(int a,int b){
    int add=a+b;
    return add;
  }

  public static void main(String args[]){
    int a=1;
    int b=2;
   int result =sum(a,b);
   System.out.println(result);
      }
}


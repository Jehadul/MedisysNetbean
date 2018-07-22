
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ExceptionHandling{

//    public static void main(String[] args) {
// 
//  int a, b, result;
// 
//  Scanner input = new Scanner(System.in);
//  System.out.println("Input two integers");
// 
//  a = input.nextInt();
//  b = input.nextInt();
// 
//  result = a / b;
// 
//  System.out.println("Result = " + result);
//  }
//}

        // try block
//  try {
//    result  = a / b;
//    System.out.println("Result = " + result);
//  }
// 
//  // catch block
// 
//  catch (ArithmeticException e) {
//    System.out.println("Exception caught: Division by zero.");
//  }
//  }
//}
//  try {
//         int a[] = new int[2];
//         System.out.println("Access element three :" + a[3]);
//      }catch(ArrayIndexOutOfBoundsException e) {
//         System.out.println("Exception thrown  :" + e);
//      }
//      System.out.println("Out of the block");
//   
//    
//
//String s=null;  
//try{
//System.out.println(s.length());//NullPointerException 
//}catch(NullPointerException e){
//    System.out.println("Exception caught" + e);
//}
//    
// }




//        {
//            try {
//                int arr[] = {1, 2};
//                arr[2] = 3 / 0;
//            } catch (ArithmeticException ae) {
//                System.out.println("divide by zero " + ae);
//            } catch (ArrayIndexOutOfBoundsException e) {
//                System.out.println("array index out of bound exception " + e);
//            }
//        }
//    }




//nested try catch

// {
//  try
//  {
//   int arr[]={5,0,1,2};
//   try
//   {
//    int x=arr[3]/arr[1];
//   }
//   catch(ArithmeticException ae)
//   {
//    System.out.println("divide by zero " + ae);
//   }
//   arr[4]=3;
//  }
//  catch(ArrayIndexOutOfBoundsException e)
//  {
//   System.out.println("array index out of bound exception " + e);
//  }
// }
//}


// Finally keyword
// try{  
//   int data=25/0;  
//   System.out.println(data);  
//  }  
//  catch(ArithmeticException e){System.out.println(e);}  
//  finally{System.out.println("finally block is always executed");}  
//  System.out.println("rest of the code...");  
//  }




// static void validate(int age){
//     if(age<18)
//      throw new ArithmeticException("not valid");
//     else
//      System.out.println("welcome to vote");
//   }
//   
//   public static void main(String args[]){
//      validate(14);
//      System.out.println("rest of the code...");
//  }
    
    
    
//  static void check() throws ArithmeticException
// {
//  System.out.println("Inside check function");
//  throw new ArithmeticException("demo");
// }
//
// public static void main(String args[])
// {
//  try
//  {
//   check();
//  }
//  catch(ArithmeticException e)
//  {
//   System.out.println("caught" + e);
//  }
    
    public static void main(String[] args){
    }
    
 }

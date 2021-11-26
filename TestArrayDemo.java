/* This is a sample test program which tests 
the ArrayListDemo class we built to make sure
the implemantion of our ArrayList returns correcct output
otherwise the test will tell us otherwise.
@Author- Abdiwahid Bishar Hajir */
import java.util.*;
public class TestArrayDemo{
   public static void main(String[] args){
      ArrayList<Integer> test = new ArrayList<>();
      ArrayListDemo listTest2 = new ArrayListDemo();
      addElements(test, listTest2);
      System.out.println();
      TestToString(test, listTest2);
      System.out.println();
      TestToString(test, listTest2);
      System.out.println();
      testIsEmptyMethod(test, listTest2);
      test.clear();
      listTest2.removeAll();
      System.out.println();
      System.out.println("After all elements in the list have been cleared ");
      testIsEmptyMethod(test, listTest2);
      System.out.println();
      addElements2(test, listTest2);
      System.out.println("List has been updated with new values");
      TestToString(test, listTest2);
      System.out.println();
      testGet(test, listTest2);
      System.out.println();
      testIsEmptyMethod(test, listTest2);
      
      
      
      
   
      
      
   }
   public static void TestToString(ArrayList<Integer> test, ArrayListDemo listTest2){
      System.out.println("Testing to String with list Size of " + test.size() + "....");
      if(!listTest2.toString().equalsIgnoreCase(test.toString())){
         System.out.print("Excepted toString to return " + test.toString() +
            " but got " + listTest2);
      }else{
         System.out.println("To String Test passed returned correct output");
      }
      System.out.println();
   }
   
   public static void addElements(ArrayList<Integer> test, ArrayListDemo other){
      test.add(10);
      test.add(15);
      test.add(30);
      other.add(10);
      other.add(15);
      other.add(30);
   
   }
   public static void addElements2(ArrayList<Integer> test, ArrayListDemo other){
      test.add(20);
      test.add(20);
      test.add(20);
      test.add(34);
      test.add(75);
      test.add(300);
      test.add(15);
      other.add(20);
      other.add(20);
      other.add(20);
      other.add(34);
      other.add(75);
      other.add(300);
      other.add(15);
   
   }
   
   public static void testGet(ArrayList<Integer> list, ArrayListDemo other){
      int correctGet = list.get(1);
      int otherInput = other.get(1);
      System.out.println("Testing get method at index " + 1 + " for the list size of " + list.size());
      if(otherInput != correctGet){
         System.out.println("Excpeted get method at index " + 1 + " to be " +
            correctGet + " " + "but was " + otherInput);
      }else{
         System.out.println("Get for index 1 returned the correct output");
      
      }
      System.out.println();
      int getIndex3 = list.get(2);
      int index3 = other.get(2);
      System.out.println("Testing get method at index " + 2);
      if(index3 != getIndex3){
         System.out.println("Excpeted get method at index " + 2 + " to be " +
            getIndex3 + " " + "but was " + index3);
      }else{
         System.out.println("Get for index 2 returned the correct output");
      
      }
   
   }
   
   public static void testIsEmptyMethod(ArrayList<Integer> list, ArrayListDemo other){
      boolean list1 = list.isEmpty();
      boolean otherList = other.isEmpty();
      if(otherList != list1){
         System.out.println("Excpeted is Empty Method to return " + list1 + " but got" + 
            " " + otherList +  " for a list which still contains " + list.size() + " elements");
      }else{
         System.out.println("Is empty returned the correct output for a list " + "with"+ 
            " " + list.size() + " elements still remaining");
      }
   
   }
   
}
   
   

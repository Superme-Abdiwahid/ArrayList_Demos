/*
This is a sample of an ArrayList Demo
class which is used to add and work with
objects of the array class in this quick demo
I create a class in which i write methods to define
and ArrayListDemo so when the clinets calls these 
methods they are able to work with an ArrayListDemo
similar to how they work with other types of 
List interface similar to an normal ArrayList.
Implements Comparble interface.
@Author Abdiwahid Bishar Hajir
*/
import java.util.*;
public class ArrayListDemo <E extends Comparable<E>> extends ArrayList<E> implements Comparable<ArrayListDemo>{
   private E[] elementData;
   private int size;
   
   /* Constructs an array of a given size defulat
   this is how big the size of the ArrayList Demo would be.*/ 
   public ArrayListDemo(){
      this(100);
   }
   
   /* Constructs an ArrayListDemo of the size
   specified by a client. When the clinet calls these
   they will be able to create an array list demo 
   of a given certain size they choose.*/
   public ArrayListDemo(int actualSize){
      elementData = (E[]) new Object[actualSize];
      size = 0;
   }
   
   /* pre: @throws  IllegalArgumentException if the client
   specfices and wants a letter a negative index
   The clinet calls this method to get the object
   at a  certain index in the list. This operation is fast*/
 
   public E get(int index){
      if(index < 0 ||index >= size){
         throw new IllegalArgumentException();
      }
      return elementData[index];
   
   }
   
   // WE WILL FIX NEXT TIME. HAVE TO DO 
   // OBJECT AND GENERICS Right know wont work
   
   
   /* This method returns a new ArrayListDemo
   which adds one list to another everything inside the list
   by index so for example index 1 of the first list gets added
   to index one of the other list we are adding everything too. 
   And returns this as a new ArrayList. If both list have different sizes
   the bigger lists elements gets added to 0. To make up for the 
   incomplete numbers at the indexs. */
  public ArrayListDemo<E> addEverything(ArrayListDemo<E> other){
      ArrayListDemo demo = new ArrayListDemo(other.elementData.length + elementData.length);;
      try{
         for(int i = 0; i < Math.max(other.elementData.length, elementData.length); ++i){
            demo.elementData[i] += elementData[i] + other.elementData[i];
         }
      }catch(ArrayIndexOutOfBoundsException e){
         e.printStackTrace();
      }
      demo.size += Math.max(this.size, other.size);
      //size += demo.size;
      return demo;
   }
   
   /* The clinet calls this method
   to find out the size of the ArrayList
   at the moment. Returns an int of the current list size */
   public int size() {
      return size;
   
   }
   
   /* The clinet calls this method
   to find out if the list is empty.
   return true if the list contains 0 elements
   return false otherwise.*/
   public boolean isEmpty(){
      return size == 0;
   }
   public String toString(){
      if (isEmpty()) {
         return "[]";
      } else {
         String result = "[" + elementData[0];
         for (int i = 1; i < size; i++) {
            result += ", " + elementData[i];
         }
         result += "]";
         return result;
      }
   }
   
   /* The clinet calls this method
   to be able to add elements to a list easier
   it takes the value the clinet wants to add to a 
   list and stores those accordinly.*/
   public boolean add(E value){
      elementData[size] = value;
      size++;
      return true;
   }
   
   /* The clinet calls this method
   to remove everything and clear everything from a list. It empties 
   out the list and its content.*/
   public void clear(){
      this.size = 0;
   }
   
   /* CompareTo method to be able to compare 
   list of each other to be able to sort accordinly.*/
   public int compareTo(ArrayListDemo other){
      return Integer.compare(this.elementData.length, other.elementData.length);
   }
   
    }

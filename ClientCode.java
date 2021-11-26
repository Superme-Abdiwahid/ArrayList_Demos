//@Author- Abdiwahid Bishar Hajir
public class ClientCode{
   public static void main(String[] args){
      ArrayListDemo list = new ArrayListDemo(200);
      ArrayListDemo demo = new ArrayListDemo(200);
      list.add(10);
      list.add(100);
      list.add(50);
      list.add(120);
      list.add(45);
      demo.add(40);
      demo.add(75);
      demo.add(120);
      demo.add(120);
      demo.add(45);
      demo.add(45);
      demo.add(45);
      System.out.println("First list before we add everything " + list);
      System.out.println("demo list before we add everything " + demo);
      ArrayListDemo demos =  list.addEverything(demo);
      System.out.println("New List after we added both list to each other " + demos);
      System.out.println("--------------------------------------");
      ArrayListDemo list2 = new ArrayListDemo(500);
      ArrayListDemo demo2 = new ArrayListDemo(500);
      list2.add(10);
      list2.add(15);
      list2.add(20);
      demo2.add(1);
      demo2.add(5);
      demo2.add(5);
      ArrayListDemo add = list2.addEverything(demo2);
      System.out.println("List2 before we add everything " + list2);
      System.out.println("demo2 before we add everything " + demo2);
      System.out.println("Full second list after a call on addEverything " + add);
      add.removeAll();
      System.out.println("The new list after a call on remove all is = to " + add);
   }

}

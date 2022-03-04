package AfterCoJava;

public class StaticConcept {

   //class variables
   String name;
   static int age;

   public void getName(){
       System.out.println("get name ");
   }
   public static void getValue(){
       System.out.println("get value");


   }

    public static void main(String[] args) {
       int u = 10;

       StaticConcept sc = new StaticConcept();
       //String s = sc.getName();



    }
}

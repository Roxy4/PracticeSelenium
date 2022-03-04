package AfterCoJava;

public class Employee {

    //class variables
    String name;
    int age;
    String role;
    int empId;
    boolean isPermanent;

    public static void main(String[] args) {

     //create the object of Employee
     //use new keyword

    Employee em = new Employee();
    Employee em1 = new Employee();

    em.name= "Modhi";
    em.age = 41;
    em.role = "Software Tester";
    em.empId = 1254;
    em.isPermanent= true;

    em1.name= "Rupali";
    em1.age = 30;
    em1.role = "Developer";
    em1.empId = 1047;
    em1.isPermanent= false;

    System.out.println(em.name + " " +em.age + " " + em.role+ " " + em.empId+ " " + em.isPermanent) ;
    System.out.println(em1.name + " " +em1.age + " " + em1.role+ " " + em1.empId+ " " + em1.isPermanent) ;





    }


}

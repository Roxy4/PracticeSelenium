package AfterCoJava.OOPsEncapsulations;

public class EmployeeTest {


    public static void main(String[] args) {
        Employee e = new Employee();

        e.name = "Emily";
        e.getCity();

        e.setAge(30);
        System.out.println(e.getAge());
    }
}

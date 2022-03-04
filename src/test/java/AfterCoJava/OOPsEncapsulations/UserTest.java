package AfterCoJava.OOPsEncapsulations;

public class UserTest {


    public static void main(String[] args) {
        User u1 = new User();

        u1.setName("Lorry");
        u1.setAge(40);
        u1.setPhone(31856988);
        System.out.println(u1.getName()+ " "+ u1.getAge()+ " "+ u1.getPhone());

        u1.getUserSalaryInfo();
    }
}

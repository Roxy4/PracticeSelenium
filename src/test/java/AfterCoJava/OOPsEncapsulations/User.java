package AfterCoJava.OOPsEncapsulations;

public class User {

    private String name;
    private  int age;
    private long phone;

    private void getUserSalary(){
        System.out.println("get user salary");
    }
     public void getUserSalaryInfo(){
        getUserSalary();

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public long getPhone() {
        return phone;
    }

    public void setPhone(long phone) {
        this.phone = phone;
    }

    public static void main(String[] args) {

    }
}

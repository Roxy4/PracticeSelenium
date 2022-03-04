package AfterCoJava;

public class UserClass {

    //class variables
    String name;
    String emailId;
    long phoneNumber;
    boolean isActive;

    //class methods.
    public String getUserNameOrderDetail(String userName) {
        if (userName.equals("Tony ")) {
            return "Apple MacBook";
        } else if (userName.equals("Hanna")) {
            return "Samsung S8";
        } else if (userName.equals("Gardner")) {
            return " MSbook";
        } else {
            System.out.println("username cannot be found " + userName);
        return "user not found";
        }
      }

       public long getUserPhoneNumber(String userName){

           if (userName.equals("Tony ")) {
               return 9841525;
           } else if (userName.equals("Hanna")) {
               return 14788888;
           } else if (userName.equals("Gardner")) {
               return 32587855;
           } else {
               System.out.println("username cannot be found " + userName);
               return -1;
           }
       }
    public static void main(String[] args) {

        UserClass uc = new UserClass();
        uc.name= "Tony";
        uc.phoneNumber = 984185974;


        String itemName = uc.getUserNameOrderDetail(uc.name);
        System.out.println(itemName);

        long phone = uc.getUserPhoneNumber(uc.name);
        System.out.println(phone);
    }
}

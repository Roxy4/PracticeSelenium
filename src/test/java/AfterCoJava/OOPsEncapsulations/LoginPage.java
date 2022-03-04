package AfterCoJava.OOPsEncapsulations;

public class LoginPage {


    public static void main(String[] args) {

        //Case 1: set the class variables with constructor
        //Credentials cr = new Credentials (" ramzee.com" , " admin123");

       // System.out.println(cr.getUsername());
        //System.out.println(cr.getPassword());

      // Case2: set the class variables with setter:
        Credentials cd = new Credentials( );

        cd.setUsername(" harry ");
        cd.setPassword(" orange123 ");

        System.out.println(cd.getUsername());
        System.out.println(cd.getPassword());


    }
}
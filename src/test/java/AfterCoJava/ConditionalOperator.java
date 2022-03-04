package AfterCoJava;

import java.sql.SQLOutput;

public class ConditionalOperator {

    public static void main(String[] args) {

        int a = 50;
        int b = 60;

        if (a>b){
            System.out.println("b is greater thn a");
        }
        else{
            System.out.println("a is  greater than b");
        }
         int total =200;
        int tax= 100;
        int finalAmount= total+ tax; //300

        int pendingAmount= 300;

        if(finalAmount == pendingAmount){
            System.out.println("bill is paid");
        }
        else{
            System.out.println("please the final amount.....");
        }
        // String Comparison
         String s1 = "This is Java";
         String s2 = "This is java";

        if(s1.equals(s2)){
            System.out.println("both are equal");
        }
        else{
            System.out.println("both are not equal");
        }
        if(s1.equalsIgnoreCase(s2)){
            System.out.println("both are equal");
        }
        else{
            System.out.println("both are not equal");
            System.out.println("both are not equal");
        }
         //  cross browser with selenium
                String browser = "Opera";

        if (browser.equals("Chrome")){
            System.out.println("launch Chrome");
        }
        else if (browser.equals("Firefox")){
            System.out.println("launch Firefox");
        }
        else if(browser.equals("IE")){
            System.out.println("launch IE ");
        }
        else{
            System.out.println("we don't support this browser " + browser);
        }

      //marks
         String studentName = "Ronny";

        if(studentName.equals("Harry")){
            int marks  =200;
        }
        else if(studentName.equals("Brett")){
            int marks = 80;
        }
        else if(studentName.equals("Nimesh")){
            int marks = 90;
        }
        else{
            System.out.println("This students is not available " + studentName );
        }

    }




}

package AfterCoJava;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class FunctionsInJava {

    //function and method are same concept
    //cannot create a function inside a function
    //data members of class; class varibles and class methods
    //void = cannot return anything
    //main method is void in nature because  inside the main method we never return the value.

    //1. Simple function; no input and no output
    public void test() {
        System.out.println("test method");
    }
    //2. no input but  some return;
    // return type  of below function is integer

    public int getNumber() {
        System.out.println("get Number");
        int d = 14;
        int g = 23;
        int t = d + g; // 37
        return t;
    }

    public String getTrainerName() {
        System.out.println("get trainer name");
        String st = "Bobby";
        return st;
    }

    //3. some input parameters and some return
    public int sum(int a, int b) {
        System.out.println("Sum method");
        int d = a + b;
        return d;
    }

    public int getMarks(String studentName) {
        System.out.println("get marks " + studentName);
        int marks = -1;

        if (studentName.equals("Bontty")) {
            marks = 95;
        } else if (studentName.equals("Tommy")) {
            marks = 85;
        } else if (studentName.equals("Nathan")) {
            marks = 90;
        } else {
            System.out.println("student name not found" + studentName);
        }
        return marks;
    }

    /**
     * This method returns integer
     * @return int
     */
    public int[] getStudentMarks() {
        System.out.println("get the students marks");
        int[] m = new int[5];
        m[0] = 25;
        m[1] = 30;
        m[2] = 40;
        m[3] = 50;
        m[4] = 60;

        return m;
    }

    /**
     * @param companyName
     * @return this method returns an ArrayList of String - returns employee list on the basis of company name.
     */

    public ArrayList<String> getEmployeeList(String companyName) {

        ArrayList<String> ar = new ArrayList<String>();

        if (companyName.equals("IBM")) {
            ar.add("Amanda");
            ar.add("Harry");
            ar.add("Rohit");
        } else if (companyName.equals("MS")) {
            ar.add("Farahan");
            ar.add("Kasmit");
        } else if (companyName.equals("Google")) {
            ar.add("Shyam");
        } else {
            System.out.println("company name not found " + companyName);
        }
        return ar;
    }

    public static void main(String[] args) {

        FunctionsInJava fj = new FunctionsInJava();
        fj.test();

        int num = fj.getNumber();
        System.out.println(num);

        //System.out.println(fj.getNumber());

        String s1 = fj.getTrainerName();
        System.out.println(s1);

        int sum1 = fj.sum(40, 50);
        System.out.println(sum1);

        int score = fj.getMarks("Bontty");
        System.out.println(score);


        int[] m = fj.getStudentMarks();
        System.out.println(m.length);

        for (int e = 0; e < m.length; e++) {
            System.out.println(m[e]);
        }

        ArrayList<String> EmpGoogleList = fj.getEmployeeList("Google");
        System.out.println(EmpGoogleList);

        ArrayList<String> EmpMSList=  fj.getEmployeeList("MS");
        System.out.println(EmpMSList);
        ArrayList<String> EmpIBMList= fj.getEmployeeList("IBM");
        System.out.println(EmpIBMList);
    }

}








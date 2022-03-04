package AfterCoJava;

public class IncrementalAndDecrementalMethod {

    public static void main(String[] args) {

        //BasicOperators
         int m = 0/8;
        System.out.println(m);

        //9/0 --Arithmatic Exception
        //
         int a = 20;
         int b = a % 2; //% is modulus operator
        System.out.println(b);

        int num = 21;
        if (num % 2== 0 ){
            System.out.println("even number");
        }
        else{
            System.out.println("odd number");
        }
        if(num>0){
            System.out.println("+ve number");
        }
        else if(num<0){
            System.out.println("-ve number");
        }
        else{
            System.out.println("num is 0");
        }

       //Ternary Operator : ? :
        int s = 15;
        String t = (s>10) ? "hello" :  "bye";
        System.out.println(t);

        int a1 = 60;
        int a2 = 50;
        int max;
        max = (a1>a2) ? a1 : a2;
        System.out.println("max number is : " + max);

        String browser = "firefox";

        String x1 = (browser.equals("chrome")) ? "launch chrome" : " launch ff";
        System.out.println("The browser name is " +  browser);

    // !=not equals to
     String name = "Tammy";

     if(!name.equals("Tammy")) {
         System.out.println("name is :  " + name );
     }
     else {
         System.out.println("failed");
     }





    }


}




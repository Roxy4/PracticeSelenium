package AfterCoJava;

public class SwitchCaseStatement {
    public static void main(String[] args) {

        //while loop
        ///print 1 to 10 using while loop
        int i = 1; //initialization
        while (i <= 10) { //conditional
            System.out.println(i);
            i++; // incremental/decremental
        }
        System.out.println("------------");
        //print 10 to 1 using while loop

        int n = 1;
        while (n >= 1) {
            System.out.println(n);
            n--;
        }
        System.out.println(" -------while loop ---------");
        //for loop : 1 to 10

        for (int p = 1; p <= 10; p++) {
            System.out.println(p);
        }
        System.out.println("----even numbers-------");
        //even numbers between 1 to 10. // 2 4 6 8 10
        for (int even = 2; even <= 10; even = even + 2) {
            System.out.println(even);
        }

        System.out.println("------odd numbers-------");
        //odd numbers between 1 to 10 //1 3 5 7 9
        for (int odd = 1; odd<= 10; odd=odd+2) {
            System.out.println(odd);
        }
        System.out.println("------for loop wit if condition-----");
        //for with if;
         for(int h= 1; h<=10; h++){

             if(h% 2== 0){
                 System.out.println(h);
             }
         }





            System.out.println(" ------do while------");
            // do-while
            int t = 10;
            do {
                System.out.println(t);
                t--;
            }
            while (t >= 1);


        }
    }



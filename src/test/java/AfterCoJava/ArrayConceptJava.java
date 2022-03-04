package AfterCoJava;

import java.util.ArrayList;

public class ArrayConceptJava {

    public static void main(String[] args) {

        //limitations of array
        // static array; size of array is fixed
        // it can store only similar types of data
        // to solve these limitations --we use ArrayList(Dynamic Array)


        int[] a = new int[4];
        a[0] = 100;
        a[1] = 200;
        a[2] = 300;
        a[3] = 400;
        System.out.println(a[1] + a[3] + a[2] + a[0]);
        System.out.println(a[1] + a[2]);

        //Higest index(HI)= length(l)- 1 =3
        //length =4
        // HI= length -1 = 3
        // LI = 0
        //

        System.out.println(a.length);

        for (int i = 0; i < a.length; i++) {
        System.out.println(a[i]);
    }
        //char array;
        char[] c = new char[2];
        System.out.println(c[0] + c[1]); //0

        //boolean array;
        boolean[] b = new boolean[4];
        System.out.println(b[2]);//false

        //String array
        String[] s = new String[4];
        s[0] = "Python";
        s[1] = "Java";
        s[2] = "C#";
        s[3] = "Ruby";
        System.out.println(s[0] + s[1] + s[2]);//null

        //Object Array/Static

        Object[] o = new Object[5];
        o[0] = "Molly";
        o[1] = 32;
        o[2] = 14.33;
        o[3] = true;
        o[4] = 'M';
        for (int t = 0; t < o.length; t++) {
            System.out.println(o[t]);
        }

        // al.size is used for arrayList
        // al.length is used for static array

        ArrayList al = new ArrayList();
        System.out.println(al.size());

        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        al.add(50);
        al.add(60);
        System.out.println(al.size());

        // print all the values of arraylist: for loop

        for (int y = 0; y < al.size(); y++) {
        System.out.println(al.get(y));
    }

        //ArrayList with integers
    ArrayList<Integer> at = new ArrayList<Integer>();
        at.add(800);
        at.add(600);
        at.add(300);
        at.add(1400);
        //for(int l =0; l<at.size; l++){

        }
// ArrayList with object
        ArrayList<Object> ra = new ArrayList<Object>();
        //ra.add("Ronny");
        //ra.add(33);
        //ra.add('M');
        //ra.add(true);






    }





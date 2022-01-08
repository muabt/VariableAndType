public class App {
    static String global = "global variable";

    public static void main(String[] args) {
        // String str;
        //str = "Data type";
        String str = "Data type";
        System.out.println(str);
        System.out.println(global);
        sum();
        final double PI = 3.14;
        System.out.println(PI);
        System.out.println("Name\t008");
        System.out.println("Xoa d\b008");

        //bien nguyen thuy
        short s = 10;           // -32768 - >32767
        int i = 10;             //-2^31 -> 2^31-1
        long l = 1000000000;    //-2^63 -> 2^63-1
        long l2 = 100L;
        float f = 3.1f;
        double d = 5.7;         //double d = 5.7d;
        char c = 'a';           // ki tu chi chua 1 chu dat trong nhay don
        char c2 = '5';
        char c3 = 65;   //'A'        // hieu 65 la vi tri cua ki tu trong bang ma ASCII vd la ki tu 'A'
        boolean b1 = true;
        boolean b2 = false;

        //bien tham chieu
        Integer ref_i = 100;

//        int a = 100;
//        int b = 200;
//        System.out.println("a = " + a + ", b = " + b);
//        swap(a,b);
//        System.out.println("a = " + a + ", b = " + b);

 //   }
//    static void swap(int a, int b) {
//        int tmp = a;
//        a = b;
//        b = tmp;
//
//        System.out.println("Swap: a = " + a + ", b = " + b);
//    }

    Integer a = 100;
    Integer b = 200;
        System.out.println("a = "+a +", b = "+b);

    swap(a, b);
        System.out.println("a = "+a +", b = "+b);

        SimpleSeason sse = SimpleSeason.AUTUMN;
        System.out.println(sse);

        Season se = Season.SPRING;
        System.out.println(se);
}
       static void swap(Integer a, Integer b) {
//        Integer tmp = a;
//        a = b;
//        b = tmp;
//
//       System.out.println("Swap: a = " + a + ", b = " + b);
           a = 99;
    }

    public static void sum(){
        System.out.println(global);
    }
}

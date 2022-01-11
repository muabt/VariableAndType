import java.util.Scanner;

public class EntryPoint {
    public static void main (String[] args) {

        //Thay giao chua bai tap
        //Bai 4: nhap nam sinh va tinh tuoi
        /*Scanner scanner = new Scanner(System.in);

        Integer birthYear = scanner.nextInt();
        Integer currentYear = 2021;
        Integer age = currentYear - birthYear;
        System.out.println(age);*/

        //Bai 5: Nhap 2 so tinh tong, hieu, tich, thuong
        /*  int a = 5;
        int b = 6;
        int sum = a + b;
        int sub = a - b;
        int mul = a * b;
        int div = a / b;

        System.out.println("The result is:");
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(mul);
        System.out.println(div);*/

        //Bai 6: Nhap ten san pham, so luong, don gia. Tinh tien va thue GTGT
      /*  int amount = 5;
        int price = 12000;
        final float vatRate = 10/100.0f;

        int total = amount * price;
        int vat = (int)(total * vatRate);
        System.out.println(total);
        System.out.println(vat);*/

        //Bai 7: Nhap diem thi va he so 3 mon. Tinh diem trung binh
      /*  int math = 8;
        int mathFactor = 2;
        int physic = 7;
        int physicFactor = 1;
        int chemical = 9;
        int chemicalFactor = 1;

        int finalScore = (math * mathFactor + physic * physicFactor + chemical * chemicalFactor) / (mathFactor+physicFactor+chemicalFactor);
        System.out.println(finalScore);*/

        //Bai 8: Nhap ban kinh, tinh chu vi va dien tich hinh tron

       /* int r = 5;
        final double PI = 3.14159;
        double C = 2 * r * PI;
        double S = PI * r * r;
        System.out.println(C);
        System.out.println(S);*/

        //Bai 9: Nhap so xe va tinh so nut
        int licensePlate = 60660;
        int a0 = licensePlate / 10000;
        int a1 = (licensePlate / 1000) % 10;
        int a2 = (licensePlate / 100) % 10;
        int a3 = (licensePlate / 10) % 10;
        int a4 = licensePlate % 10;

        int sum = a0 + a1 + a2 + a3 + a4;
        int point = sum % 10;
        System.out.println(point);

        //Bai 10: Nhap so va tinh Min, max
       /* int a = 5;
        int b = 6;
        int min = Math.min(a,b);
        int max = Math.max(a,b);*/






    }

}

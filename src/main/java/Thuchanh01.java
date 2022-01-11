import java.awt.*;
import java.util.Calendar;

//Tu lam bai tap ve nha
//Bai 4: Nhap nam sinh va tinh tuoi
public class Thuchanh01 {
    public static void main(String[] args) {
        //Bai 4: Nhap nam sinh va tinh tuoi
      /*  int  namsinh = 1987;
        Calendar instance  = Calendar.getInstance();
        int year = instance.get(Calendar.YEAR);
        int tuoi = year - namsinh;
        System.out.println(tuoi);*/

        //Bai 5: Nhap 2 so va tinh Tong, hieu, tich va thuong
       /* int a = 180;
        int b = 9;
        int tong = a + b;
        int hieu = a - b;
        int tich = a * b;
        int thuong = a/b;
        System.out.println("Tong:" + tong);
        System.out.println("Hieu:" + hieu);
        System.out.println("Tich:" + tich);
        System.out.println("Thuong:" + thuong);*/

        //Bai 6: Nhap ten san pham, so luong, don gia. Tinh tien va thue GTGT
        /*String tenSP;
        int soluong = 8;
        int dongia = 39000;
        int tien = soluong * dongia;
        int thueGTGT = 10* tien/100;
        System.out.println(tien);
        System.out.println(thueGTGT);*/


        //Bai 7: Nhap diem thi vaf he so 3 mon va tinh trung binh
       /* int diemToan = 9;
        int diemLy = 8;
        double diemHoa = 8.5;
        int hsToan = 2;
        int hsLy = 1;
        int hsHoa = 1;
        double diemTB = (diemToan*hsToan + diemLy*hsLy + diemHoa*hsHoa)/4;
        System.out.println(diemTB);*/


        //Bai 8: Nhap ban kinh duong tron. Tinh chu vi va dien tich
       /* double r = 15;
        double C = 2*Math.PI*r;
        double A = Math.PI*r*r;
        System.out.println("Bán kính hình tròn:" + C);
        System.out.println("Diện tích hình tròn:" + A);*/

        //Bài 9: Nhap so xe. Cho biet xe của ban có mấy nút?
        /*String str = "99K106066";
        System.out.print("So nut cua bien so xe la:" + countWords(str));

    }

    private static int countWords(String input) {
        if (input == null) {
            return -1;
        }
        int count = 0;
        int size = input.length();
        boolean notCounted = true;
        for (int i = 0; i < size; i++) {
            if (notCounted) {
                count++;
                notCounted = false;
            } else {
                notCounted = true;

            }
        }
        return count;
    }*/

        //Bai 10: Nhap vao 2 so nguyen. Tinh min va max cuar hai so do
        int a = 39;
        int b = 58;
        int min = Math.min(a, b);
        int max = Math.max(a, b);
        System.out.println("Min cua a va b:" + min);
        System.out.println("Max cua a va b:" + max);
    }
}





import java.util.Scanner;

public class Employee {
    int maNhanVien;
    String hoten;
    double luongcb;
    double phuCap;
// NHAP THONG TIN
    public void nhap(){
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap ma nv: ");
        maNhanVien = input.nextInt();
        System.out.print("Nhap ten: ");
        hoten = input.next();
        System.out.print("Nhap luongcb: ");
        luongcb=input.nextDouble();
        System.out.print("Nhap phu cap: ");
        phuCap=input.nextDouble();
    }
// HIEN THI THONG TIN
    public void hienthi(){
        System.out.printf("Ma nhan vien: %d%n"
                         +"Ten nhan vien la: %s%n"
                         +"luongcb: %.0f%n"
                         +"Phu cap: %.0f%n",maNhanVien,hoten,luongcb,phuCap);
    }
// TINH LUONG
    public void tinhLuong(double luongcb, double phuCap){
        double luong = (luongcb + phuCap) - (luongcb + phuCap) * 0.1;
        System.out.printf("luong nhan duoc la: %.0f%n",luong);
    }
}

import java.util.Scanner;

public class PhanSo {
    private int tuSo;
    private int mauSo;

    // Hàm tạo không tham số, khởi tạo phân số 1/2
    public PhanSo() {
        this.tuSo = 1;
        this.mauSo = 2;
    }

    // Hàm tạo 2 tham số
    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    // Hàm tạo sao chép
    public PhanSo(PhanSo ps) {
        this.tuSo = ps.tuSo;
        this.mauSo = ps.mauSo;
    }

    // Phương thức nhập phân số
    public void nhapPhanSo() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap tu so: ");
        tuSo = sc.nextInt();
        System.out.print("Nhap mau so: ");
        mauSo = sc.nextInt();
    }

    // Phương thức hiển thị phân số
    public void hienThi() {
        System.out.println(this.tuSo + "/" + this.mauSo);
    }

    // Các phương thức cộng, trừ, nhân, chia, rút gọn, nghịch đảo, phủ định
    //puclic phanSo cong(
    public void cong(PhanSo ps) {
        int tu = this.tuSo * ps.mauSo + this.mauSo * ps.tuSo;
        int mau = this.mauSo * ps.mauSo;
        PhanSo congPhanSo = new PhanSo(tu,mau);
        congPhanSo.rutGon();
        System.out.println("Tong 2 phan so la: "+congPhanSo.tuSo + "/" + congPhanSo.mauSo);
    }

    // Phương thức trừ phân số
    public void tru(PhanSo ps) {
        int tu = this.tuSo * ps.mauSo - this.mauSo * ps.tuSo;
        int mau = this.mauSo * ps.mauSo;
        PhanSo truPhanSo = new PhanSo(tu,mau);
        truPhanSo.rutGon();
        System.out.println("Hieu 2 phan so la: "+truPhanSo.tuSo + "/" + truPhanSo.mauSo);
    }

    // Phương thức nhân phân số
    public void nhan(PhanSo ps) {
        int tu = this.tuSo * ps.tuSo;
        int mau = this.mauSo * ps.mauSo;
        PhanSo nhanPhanSo = new PhanSo(tu,mau);
        nhanPhanSo.rutGon();
        System.out.println("Tich 2 phan so la: "+nhanPhanSo.tuSo + "/" + nhanPhanSo.mauSo);
    }

    // Phương thức chia phân số
    public void chia(PhanSo ps) {
        int tu = this.tuSo * ps.mauSo;
        int mau = this.mauSo * ps.tuSo;
        PhanSo chiaPhanSo = new PhanSo(tu,mau);
        chiaPhanSo.rutGon();
        System.out.println("Thuong 2 phan so la: "+ chiaPhanSo.tuSo + "/" + chiaPhanSo.mauSo);
    }

    // Phương thức nghịch đảo phân số
    public void nghichDao() {
        PhanSo nghichDaoPhanSo = new PhanSo(this.mauSo, this.tuSo);
        System.out.println("Phan so nghich dao la: "+ nghichDaoPhanSo.tuSo + "/" + nghichDaoPhanSo.mauSo);
    }

    // Phương thức phủ định phân số
    public void phuDinh() {
        PhanSo phuDinhPhanSo;
        phuDinhPhanSo = new PhanSo(-this.tuSo, this.mauSo);
        System.out.println("Phan so phu dinh la: "+ phuDinhPhanSo.tuSo + "/" + phuDinhPhanSo.mauSo);
    }

    // Phương thức rút gọn phân số
    private int gcd(int a, int b) {
        if (b == 0) return a;
        return gcd(b, a % b);
    }
    public void rutGon() {
        int gcd = gcd(this.tuSo, this.mauSo);
        this.tuSo /= gcd;
        this.mauSo /= gcd;
    }
    public void phanSoRutGon(){
        PhanSo rutGonPhanSo = new PhanSo(this.tuSo,this.mauSo);
        rutGonPhanSo.rutGon();
        System.out.println("Phan so rut gon la: "+ rutGonPhanSo.tuSo + "/" + rutGonPhanSo.mauSo);
    }
}

import java.util.Scanner;

public class Accoun {
    private int maTaiKhoan;
    private String tenDangNhap;
    private String matKhau;
    private String hoTen;
    private int namSinh;
//DANG KY
    public void dangKi(){
        Scanner sc = new Scanner(System.in);
        System.out.println("VUI LONG NHAP THONG  TIN!");
        System.out.print("Nhap ma tai khoan: ");
        maTaiKhoan = sc.nextInt();
        System.out.print("nhap ten dang nhap: ");
        tenDangNhap = sc.next();
        System.out.print("Nhap mat khau: ");
        matKhau = sc.next();
        System.out.print("nhap ho ten: ");
        hoTen = sc.next();
        System.out.print("Nhap nam sinh: ");
        namSinh = sc.nextInt();
        System.out.println("Ban da dang ki thanh cong!!!");
    }
// DANG NHAP
    public boolean dangNhap(){
        boolean lap = true;
        boolean dung = true;
        int lanThu = 0;
        while(lap) {
            Scanner sc = new Scanner(System.in);
            System.out.print("Mhap ten dang nhap: ");
            String tdn = sc.nextLine();
            System.out.print("Mhap mat khau: ");
            String mk = sc.nextLine();
            if (tdn.equals(this.tenDangNhap) && mk.equals(this.matKhau)) {
                System.out.println("Ban da dang nhap thanh cong!");
                lap =false;
            } else {
                lanThu++;
                System.out.println("Tên đăng nhập hoặc mật khẩu không đúng.");
                if (lanThu >= 3) {
                    System.out.println("Bạn đã nhập sai quá 3 lần.");
                    dung = false;
                    break;
                }
            }
        }
        return dung;
    }
// XEM THONG TIN
    public void xemThongTin(){
        System.out.println("Vui long dang nhap de xem thong tin!");
        if(dangNhap()){
            System.out.println("Ma tai khoan cua ban la: "+maTaiKhoan);
            System.out.println("Ten ban la: "+hoTen);
            System.out.println("Nam sinh cua ban la: "+namSinh);
            System.out.println("Ten dang nhap: "+tenDangNhap);
        }
    }
// SUA THONG TIN
    public void suaThongTin(){
        String tenMoi;
        int namSinhMoi;
        String tdnMoi;
        String mkMoi;
        Scanner sc=new Scanner(System.in);
        System.out.println("Vui long dang nhap de sua thong tin!");
        if(dangNhap()){
            boolean lap = true;
            while (lap){
                System.out.println("SUA THONG TIN !!");
                System.out.println("1. Ten dang nhap");
                System.out.println("2. Mat khau dang nhap.");
                System.out.println("3. Ho ten moi.");
                System.out.println("4. Nam sinh moi");
                System.out.println("5. Exit ");
                System.out.println("Ban muon sua thong tin nao: ");
                int chon = sc.nextInt();
                switch (chon){
                    case 1:
                        System.out.print("Nhap ten dang nhap moi: ");
                        tdnMoi = sc.next();
                        tenDangNhap = tdnMoi;
                        System.out.println("Sua thanh cong!");
                        break;
                    case 2:
                        System.out.print("Nhap mk moi: ");
                        mkMoi = sc.next();
                        matKhau=mkMoi;
                        System.out.println("Sua thanh cong!");
                        break;
                    case 3:
                        System.out.print("Nhap ho ten moi: ");
                        tenMoi=sc.next();
                        hoTen=tenMoi;
                        System.out.println("Sua thanh cong!");
                        break;
                    case 4:
                        System.out.print("Nhap nam sinh moi:");
                        namSinhMoi=sc.nextInt();
                        namSinh=namSinhMoi;
                        System.out.println("Sua thanh cong!");
                        break;
                    case 5:
                        lap =false;
                        break;
                    default:
                        System.out.println("Chon khong hop le!!!");
                }
            }
        }
    }
}

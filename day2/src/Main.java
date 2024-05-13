import java.util.Scanner;

public class Main {
// MENU BAI 1
    public static void menuBai1(){
        Scanner sc=new Scanner(System.in);
        Employee nv1=new Employee();
        boolean lap = true;
        do{
            System.out.println("BAI 1:");
            System.out.println("1. Nhap thong tin");
            System.out.println("2. Hien thi thong tin");
            System.out.println("3. Hien thi luong");
            System.out.println("4. Exit");
            System.out.print("Moi chon: ");
            int chon = sc.nextInt();
            switch (chon){
                case 1:
                    nv1.nhap();
                    break;
                case 2:
                    nv1.hienthi();
                    break;
                case 3:
                    nv1.tinhLuong(nv1.luongcb, nv1.phuCap);
                    break;
                case 4:
                    lap = false;
                    break;
                default:
                    System.out.println("Chon khong hop le!!!");
            }
        }while (lap);
    }
// MENU BAI 2
    public static void menuBai2(){
        Scanner sc=new Scanner(System.in);
        PhanSo ps1 = new PhanSo();
        PhanSo ps2 = new PhanSo();
        boolean lap = true;
        do{
            System.out.println("BAI 2:");
            System.out.println("1. Nhap phan so");
            System.out.println("2. Hien thi phan so");
            System.out.println("3. cong, tru, nhan, chia");
            System.out.println("4. rut gon, nghich dao, phu dinh");
            System.out.println("5. Exit");
            System.out.print("Moi chon: ");
            int chon = sc.nextInt();
            switch (chon){
                case 1:
                    System.out.println("Nhap phan so 1!");
                    ps1.nhapPhanSo();
                    System.out.println("Nhap phan so 2!");
                    ps2.nhapPhanSo();
                    break;
                case 2:
                    System.out.print("Phan so 1 la: ");
                    ps1.hienThi();
                    System.out.print("Phan so 2 la: ");
                    ps2.hienThi();
                    break;
                case 3:
                    ps1.cong(ps2);
                    ps1.tru(ps2);
                    ps1.nhan(ps2);
                    ps1.chia(ps2);
                    break;
                case 4:
                    boolean loop = true;
                    do{
                        System.out.println("CHON PHAN SO MUON THUC HIEN!");
                        System.out.println("1. Phan so 1");
                        System.out.println("2. Phan so 2");
                        System.out.print("Moi chon: ");
                        int chose = sc.nextInt();
                        switch (chose){
                            case 1:
                                ps1.nghichDao();
                                ps1.phuDinh();
                                ps1.phanSoRutGon();
                                loop = false;
                                break;
                            case 2:
                                ps2.nghichDao();
                                ps2.phuDinh();
                                ps2.phanSoRutGon();
                                loop = false;
                                break;
                            default:
                                System.out.println("Chon khong hop le!!!");
                        }
                    }while (loop);
                    break;
                case 5:
                    lap = false;
                    break;
                default:
                    System.out.println("Chon khong hop le!!!");
            }
        }while (lap);
    }
// MENU BAI 3
    public static void menuBai3(){
        Scanner sc=new Scanner(System.in);
        Accoun ac1= new Accoun();
        boolean lap = true;
        do{
            System.out.println("BAI 3:");
            System.out.println("1. Dang ky");
            System.out.println("2. Dang nhap");
            System.out.println("3. Xem thong tin");
            System.out.println("4. Sua thong tin");
            System.out.println("5. Exit");
            System.out.print("Moi chon: ");
            int chon = sc.nextInt();
            switch (chon){
                case 1:
                    ac1.dangKi();
                    break;
                case 2:
                    ac1.dangNhap();
                    break;
                case 3:
                    ac1.xemThongTin();
                    break;
                case 4:
                    ac1.suaThongTin();
                    break;
                case 5:
                    lap = false;
                    break;
                default:
                    System.out.println("Chon khong hop le!!!");
            }
        }while (lap);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean lap = true;
        do{
            System.out.println("MENU BAI");
            System.out.println("1. Quan ly nhan vien");
            System.out.println("2. Phan mem phan so");
            System.out.println("3. Quan ly tai khoan");
            System.out.println("4. Exit");
            System.out.print("Moi chon: ");
            int chon = sc.nextInt();
            switch (chon){
                case 1:
                    menuBai1();
                    break;
                case 2:
                    menuBai2();
                    break;
                case 3:
                    menuBai3();
                    break;
                case 4:
                    lap = false;
                    break;
                default:
                    System.out.println("Chon khong hop le!!!");
            }
        }while (lap);
    }
}
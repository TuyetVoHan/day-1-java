/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package day1;
import java.util.*;
/**
 *
 * @author Cuong
 */
public class Day1 {

    public static int theTichLapPhuong(int x){
        return x*x*x;
    }
    public static int tienDien(int x){
        int tien = 0;
        if(x > 0 && x <=50){
            tien = x*1000;
        } else if (x > 50) {
            tien = 50000 + (x-50)*1200;
        } else {
            System.out.println("So dien khong hop le!!!");
        }
        return tien;
    }
    public static void bangCuuChuong (){
        for (int i = 2; i < 10; i++){
            System.out.printf("%n");
            for(int j = 1; j < 11; j++){
                System.out.printf("%d x %d = %d%n",i,j,i*j);
            }
        }
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);

        boolean lap = true;
        while (lap){
            System.out.println(
                      "+---------------------------------------------------------------+\n"
                    + "| 1. Tinh the tich hinh lap phuong                              |\n"
                    + "| 2: Tinh tien dien                                             |\n"
                    + "| 3: In bang cuu chuong                                         |\n"
                    + "| 4: exit                                                       |\n"
                    + "+---------------------------------------------------------------+");
            System.out.print("Chon chuc nang: ");
            int chon = sc.nextInt();
            switch(chon){
                case 1:
                    System.out.print("Nhap canh hinh lap phuong: ");
                    int canh = sc.nextInt();
                    System.out.printf("The tich hinh lap phuong la: %d%n", theTichLapPhuong(canh));
                    break;
                case 2:
                    System.out.print("Nhap so dien: ");
                    int soDien = sc.nextInt();
                    System.out.printf("So tien phai dong la: %d%n", tienDien(soDien));
                    break;
                case 3:
                    System.out.println("Bang cuu chuong la: ");
                    bangCuuChuong();
                    break;
                case 4:
                    lap = false;
            }
        }
        
    }
    
}

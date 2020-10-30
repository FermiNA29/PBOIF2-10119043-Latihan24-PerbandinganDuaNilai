/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119043.latihan24.perbandinganduanilai;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA      : FERMI NAUFAL AKBAR
 * NIM       : 10119043
 * KELAS     : IF2
 * DESKRIPSI : Program Perbandingan Dua Nilai
 */
public class PBOIF210119043Latihan24PerbandinganDuaNilai {

    /**
     * @param args the command line arguments
     */
    
    public static void bandingAngka() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nilai pertama : ");
        int nilai1 = scanner.nextInt();
        System.out.print("Masukan nilai kedua : ");
        int nilai2 = scanner.nextInt();
        
        if(nilai1 > nilai2)
            System.out.println("Hasil : " + nilai1 + " lebih besar dari " + nilai2);
        else
            System.out.println("Hasil : " + nilai2 + " lebih besar dari " + nilai1);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        String ulang;
        System.out.println("========Program Perbandingan Nilai========");
        do {
            bandingAngka();
            System.out.print("Ulangi aktifitas? (Ya/Tidak)");
            ulang = scanner.nextLine();
            if(ulang.equals("ya"))
                    ulang = "Ya";
            System.out.println();
        } while(ulang.equals("Ya"));
        System.out.println();
        System.out.println("---------------------------------");
        System.out.println("Developed by : Fermi Naufal Akbar");
        
    }
    
}

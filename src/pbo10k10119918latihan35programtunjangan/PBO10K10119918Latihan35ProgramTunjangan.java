/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan35programtunjangan;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Andreas Suryadi
 * KELAS    : IF-10K
 * NIM      : 10119918
 * Deskripsi Program : Menampilkan hasil perhitungan tunjangan gaji menggunakan
 * sistem OOP
 *
 */

public class PBO10K10119918Latihan35ProgramTunjangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        Tunjangan tunjangan = new Tunjangan();
        
        System.out.println("===========Program Tunjangan===========");
        
        System.out.print("Berapa gaji pokok anda perbulan?: Rp. ");
        tunjangan.gajiPokok = scanner.nextDouble();
        
        System.out.print("Status Anda? (Menikah/Belum)    : ");
        tunjangan.status = scanner.next();
        
        tunjangan.hitungTunjangan();
    }
    
}

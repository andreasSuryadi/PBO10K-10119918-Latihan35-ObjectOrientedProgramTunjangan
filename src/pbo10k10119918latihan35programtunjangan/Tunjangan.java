/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10k10119918latihan35programtunjangan;

/**
 *
 * @author andreas
 */
public class Tunjangan {
    public double gajiPokok;
    public String status;
    private double tunjangan = 0;
    private double totalGaji = 0;
    
    public void hitungTunjangan () {
        status = status.toLowerCase();
        if (status.equals("menikah")) {
            tunjangan = gajiPokok * 35 / 100;
        }
        
        totalGaji = gajiPokok + tunjangan;
        
        System.out.println("\n========Hasil Perhitungan Gaji Anda========");
        System.out.printf("Gaji Pokok \t\t : %.1f %n", gajiPokok);
        System.out.printf("Tunjangan \t\t : %.1f %n", tunjangan);
        System.out.printf("Total Gaji \t\t : %.1f %n", totalGaji);
    }
}

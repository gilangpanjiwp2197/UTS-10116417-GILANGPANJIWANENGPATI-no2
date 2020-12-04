/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uts.pkg10116417.gilangpanjiwanengpati.no2;
import java.util.Scanner;

/**
 *
 * @author 
 *  NAMA        : GILANG PANJI WANENG PATI
 *  KELAS       : PBO2
 *  NIM         : 10116417
 *  DESKRIPSI   : BERISI TENTANG PROGRAM TABUNGAN
 */
public class UTS10116417GILANGPANJIWANENGPATINo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Scanner scan = new Scanner(System.in);
        Tabungan tabungan = new Tabungan();
        
        // var
        int kredit;
        
        System.out.print("===Program Penarikan Uang====\n");
        System.out.printf("Masukkan Saldo Awal : "); tabungan.Tabungan(scan.nextInt());
        System.out.printf("Jumlah uang yang diambil : "); kredit = scan.nextInt();
        System.out.printf("Saldo Anda Sekarang : %d\n",tabungan.ambilUang(kredit));
        
    }
    
}

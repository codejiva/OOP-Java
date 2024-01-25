/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modul2;

/**
 *
 * @author codejiva
 */
public class MahasiswaMain3 {
    public static void main(String[] args){
        Mahasiswa2 s1 = new Mahasiswa2();
        Mahasiswa2 s2 = new Mahasiswa2();
        
        // inisialisasi variabel
        s1.nim = 222212833;
        s2.nim = 222212222;
        s1.nama = "Rambati Lumbung Pardja";
        s2.nama = "Code Jiva";
        
        // println
        System.out.println(s1.nim + " " + s1.nama);
        System.out.println(s2.nim + " " + s2.nama);
    }
}

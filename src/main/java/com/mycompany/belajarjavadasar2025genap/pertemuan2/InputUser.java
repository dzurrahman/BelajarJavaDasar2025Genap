/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.belajarjavadasar2025genap.pertemuan2;

import java.util.Scanner;

/**
 *
 * @author dzuro
 */
public class InputUser {
    
    public static void main(String[] args) {
        // 2. Membuat Objek Scanner
        Scanner input = new Scanner(System.in);
        
        // Deklarasi variabel
        String nama;
        int umur;
        
        // Proses Input
        System.out.print("Masukkan Nama Anda: ");
        nama = input.nextLine(); // nextLine() untuk menangkap 1 baris teks (bisa ada spasi)
        
        System.out.print("Masukkan Umur Anda: ");
        umur = input.nextInt(); // nextInt() khusus untuk angka bulat
        
        // Proses Output
        System.out.println("\n--- Hasil Output ---");
        System.out.println("Halo, " + nama + "!");
        System.out.println("Tahun depan umur Anda akan menjadi " + (umur + 1) + " tahun.");
        
        // Menutup Scanner (Praktik yang baik)
        input.close();
    }
}

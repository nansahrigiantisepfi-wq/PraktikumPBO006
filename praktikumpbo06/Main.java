/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpbo06;

/**
 *
 * @author Hype AMD
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static final String NAMA_FILE = "laporan_nilai.txt";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        List<Siswa> daftarSiswa = new ArrayList<>();

        try {
            System.out.print("Masukkan jumlah siswa: ");
            int jumlah = Integer.parseInt(input.nextLine().trim());

            for (int i = 1; i <= jumlah; i++) {
                System.out.println("\nData siswa ke-" + i);
                System.out.print("Nama  : ");
                String nama = input.nextLine().trim();

                System.out.print("Nilai : ");
                double nilai = Double.parseDouble(input.nextLine().trim());

                daftarSiswa.add(new Siswa(nama, nilai));
            }

            LaporanWriter.tulis(daftarSiswa, NAMA_FILE);   // Langkah 1
            LaporanReader.tampilkan(NAMA_FILE);            // Langkah 2

        } catch (NumberFormatException e) {
            System.out.println("Input tidak valid, masukkan angka yang benar.");
        } finally {
            input.close();
        }
    }
}
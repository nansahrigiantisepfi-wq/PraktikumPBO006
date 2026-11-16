/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpbo06;

/**
 *
 * @author Hype AMD
 */
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LaporanReader {

    public static void tampilkan(String namaFile) {
        System.out.println("\n===== ISI FILE " + namaFile + " =====");

        try (BufferedReader reader = new BufferedReader(new FileReader(namaFile))) {
            String baris;
            while ((baris = reader.readLine()) != null) {
                System.out.println(baris);
            }
        } catch (IOException e) {
            System.out.println("Gagal membaca file: " + e.getMessage());
        }
    }
}


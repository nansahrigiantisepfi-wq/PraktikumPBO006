/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpbo06;

/**
 *
 * @author Hype AMD
 */
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class LaporanWriter {

    public static void tulis(List<Siswa> daftarSiswa, String namaFile) {
        double total = 0;
        int lulus = 0;
        int tidakLulus = 0;

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(namaFile))) {
            writer.write("=== LAPORAN NILAI SISWA ===");
            writer.newLine();
            writer.write(String.format("%-4s %-25s %-8s %-12s", "No", "Nama", "Nilai", "Status"));
            writer.newLine();
            writer.write("-------------------------------------------------------");
            writer.newLine();

            int no = 1;
            for (Siswa s : daftarSiswa) {
                writer.write(String.format("%-4d %-25s %-8.2f %-12s",
                        no++, s.getNama(), s.getNilai(), s.getStatus()));
                writer.newLine();

                total += s.getNilai();
                if (s.isLulus()) {
                    lulus++;
                } else {
                    tidakLulus++;
                }
            }

            double rataRata = daftarSiswa.isEmpty() ? 0 : total / daftarSiswa.size();

            writer.write("-------------------------------------------------------");
            writer.newLine();
            writer.write("RINGKASAN");
            writer.newLine();
            writer.write(String.format("Rata-rata nilai kelas : %.2f", rataRata));
            writer.newLine();
            writer.write("Jumlah siswa lulus    : " + lulus);
            writer.newLine();
            writer.write("Jumlah tidak lulus    : " + tidakLulus);
            writer.newLine();

            System.out.println("\nData berhasil ditulis ke " + namaFile);

        } catch (IOException e) {
            System.out.println("Gagal menulis file: " + e.getMessage());
        }
    }
}
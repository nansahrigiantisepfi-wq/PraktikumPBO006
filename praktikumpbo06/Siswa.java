/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package praktikumpbo06;

/**
 *
 * @author Hype AMD
 */
public class Siswa {
    public static final double BATAS_LULUS = 70.0;

    private String nama;
    private double nilai;

    public Siswa(String nama, double nilai) {
        this.nama = nama;
        this.nilai = nilai;
    }

    public String getNama() {
        return nama;
    }

    public double getNilai() {
        return nilai;
    }

    public boolean isLulus() {
        return nilai >= BATAS_LULUS;
    }

    public String getStatus() {
        return isLulus() ? "Lulus" : "Tidak Lulus";
    }
}
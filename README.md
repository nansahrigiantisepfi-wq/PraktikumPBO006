# PraktikumPBO006
# Program Manajemen Nilai Siswa (Java)

Program Java sederhana berbasis konsol untuk mengelola data nilai siswa. Program membaca data dari keyboard, menyimpannya ke file teks `laporan_nilai.txt`, lalu membaca kembali file tersebut dan menampilkannya di layar.

## Fitur

- Input jumlah siswa, nama, dan nilai melalui konsol (`Scanner`)
- Penentuan status kelulusan otomatis:
  - Nilai >= 70 : **Lulus**
  - Nilai < 70 : **Tidak Lulus**
- Penulisan laporan ke file `laporan_nilai.txt` (`FileWriter` dan `BufferedWriter`)
- Ringkasan di akhir laporan: rata-rata nilai kelas, jumlah siswa lulus, dan jumlah siswa tidak lulus
- Pembacaan file baris demi baris (`FileReader` dan `BufferedReader`) lalu ditampilkan ke konsol
- Penanganan error dengan `try-catch` dan `try-with-resources`, sehingga stream otomatis tertutup

## Struktur Project

```
.
├── Siswa.java          # Menyimpan data siswa dan menentukan status kelulusan
├── LaporanWriter.java  # Menulis data dan ringkasan ke laporan_nilai.txt
├── LaporanReader.java  # Membaca laporan_nilai.txt dan menampilkannya ke konsol
├── Main.java           # Input dari konsol dan alur utama program
└── README.md
```

| File | Fungsi |
|------|--------|
| `Siswa.java` | Menyimpan nama dan nilai, serta menentukan status Lulus/Tidak Lulus |
| `LaporanWriter.java` | Menulis tiap data siswa dan ringkasan ke file teks |
| `LaporanReader.java` | Membaca isi file teks dengan `readLine()` sampai `null` |
| `Main.java` | Membaca input pengguna dan memanggil writer lalu reader |

## Prasyarat

- Java Development Kit (JDK) 8 atau lebih baru

Cek versi Java Anda dengan:

```bash
java -version
```

## Cara Menjalankan

1. Clone repository ini:
   ```bash
   git clone https://github.com/[username]/[nama-repository].git
   cd [nama-repository]
   ```
2. Compile semua file:
   ```bash
   javac *.java
   ```
3. Jalankan program:
   ```bash
   java Main
   ```

## Contoh Penggunaan

**Input di konsol:**

```
Masukkan jumlah siswa: 3

Data siswa ke-1
Nama  : Budi
Nilai : 85

Data siswa ke-2
Nama  : Sari
Nilai : 60.5

Data siswa ke-3
Nama  : Andi
Nilai : 75
```

**Output di konsol (isi file yang dibaca kembali):**

```
Data berhasil ditulis ke laporan_nilai.txt

===== ISI FILE laporan_nilai.txt =====
=== LAPORAN NILAI SISWA ===
No   Nama                      Nilai    Status
-------------------------------------------------------
1    Budi                      85.00    Lulus
2    Sari                      60.50    Tidak Lulus
3    Andi                      75.00    Lulus
-------------------------------------------------------
RINGKASAN
Rata-rata nilai kelas : 73.50
Jumlah siswa lulus    : 2
Jumlah tidak lulus    : 1
```

File `laporan_nilai.txt` akan dibuat otomatis di folder tempat program dijalankan.

## Alur Program

1. Pengguna memasukkan jumlah siswa.
2. Untuk tiap siswa, pengguna memasukkan nama dan nilai.
3. Program menentukan status kelulusan tiap siswa.
4. Data siswa dan ringkasan ditulis ke `laporan_nilai.txt`.
5. File dibuka kembali dan isinya ditampilkan ke konsol.

## Penanganan Error

- `IOException`: ditangani dengan `try-catch` pada proses baca dan tulis file.
- `NumberFormatException`: muncul jika jumlah siswa atau nilai yang dimasukkan bukan angka, dan program menampilkan pesan error.
- Resource management: `BufferedWriter` dan `BufferedReader` memakai `try-with-resources` sehingga selalu ditutup otomatis.

## Konsep yang Digunakan

- Input konsol dengan `Scanner`
- File I/O: `FileWriter`, `BufferedWriter`, `FileReader`, `BufferedReader`
- Exception handling: `try-catch`, `try-with-resources`
- Collection: `ArrayList`
- Percabangan dan perulangan

## Informasi Pembuat

- Nama : SEPFI NANGSAN RIGIANTI
- NIM :L-0325013
- Kelas :INFORMATIKA 3B
- Mata Kuliah : Pemrograman Berorientasi Objek

# Looping — Latihan Java

Repositori pembelajaran pemrograman dasar: mengubah pseudocode menjadi program Java dengan input, percabangan, dan perulangan `for`.

## Materi

| Program | Yang dipelajari |
| --- | --- |
| `src/fibonacci.java` | Membentuk deret Fibonacci melalui pembaruan dua nilai pada setiap iterasi. |
| `src/JumlahAkarKuadrat.java` | Menggunakan akumulator untuk menjumlahkan kuadrat, akar kuadrat, dan kebalikan data selain nol. |
| `src/PersamaanDuaAkar.java` | Menghitung diskriminan dan dua akar real, lalu membuat tabel nilai fungsi dengan langkah 0,25. |
| `src/Resistor.java` | Menghitung tahanan total seri atau paralel dengan perulangan dan percabangan. |

Berkas tanpa ekstensi di `src/` berisi pseudocode pendamping. `src/Main.java` adalah contoh awal bawaan IntelliJ IDEA yang mencetak angka 1–5.

## Menjalankan latihan

Empat program latihan menggunakan sintaks yang kompatibel dengan JDK 8 atau lebih baru. Pastikan `java` dan `javac` tersedia, lalu jalankan dari folder repositori:

```sh
mkdir -p out
javac -d out src/fibonacci.java src/JumlahAkarKuadrat.java src/PersamaanDuaAkar.java src/Resistor.java
java -cp out fibonacci
```

Ganti `fibonacci` dengan `JumlahAkarKuadrat`, `PersamaanDuaAkar`, atau `Resistor` untuk menjalankan latihan lain. Nama kelas peka huruf besar dan kecil.

`Main.java` menggunakan compact source file dan `IO.println`, sehingga membutuhkan JDK 25 atau lebih baru. Jalankan terpisah dengan `java src/Main.java`.

Buka [visualisasi-matematika.html](visualisasi-matematika.html) di browser untuk mencoba rumus dan melihat langkah perhitungannya. Halaman ini dapat dibuka langsung tanpa server.

## Catatan pembelajaran

1. **Pahami tiga bagian `for`:** nilai awal, syarat melanjutkan, dan perubahan nilai. Contohnya, `for (int i = 1; i <= n; i++)` mengulang sebanyak `n` kali jika `n > 0`.
2. **Mulai akumulator penjumlahan dari nol.** Pada tiap putaran, tambahkan hasil perhitungan data saat ini ke total sebelumnya.
3. **Perhatikan urutan pembaruan variabel.** Pada Fibonacci, `secondFibonacci` diisi suku baru, lalu `firstFibonacci = secondFibonacci - firstFibonacci` menghasilkan nilai suku sebelumnya. Coba telusuri nilainya di kertas.
4. **Pisahkan rumus dan syarat berlakunya.** Akar kuadrat real membutuhkan data nonnegatif, kebalikan membutuhkan nilai bukan nol, dan rumus persamaan kuadrat membutuhkan `a != 0`.
5. **Gunakan tanda kurung pada rumus.** Pembagian seluruh pembilang akar kuadrat harus ditulis `(-b ± Math.sqrt(D)) / (2 * a)`; tanda `±` diimplementasikan sebagai dua ekspresi terpisah.
6. **Bandingkan pseudocode dengan kode Java.** Cari pasangan `INPUT` dengan `Scanner`, `OUTPUT` dengan `System.out`, serta `FOR` dan `IF` dengan struktur Java.

### Contoh untuk dicoba

| Latihan | Input berurutan | Hasil utama |
| --- | --- | --- |
| Fibonacci | `7` | `1,1,2,3,5,8,13,` |
| Kuadrat, akar, kebalikan | `3`, lalu `1 4 9` | Jumlah kuadrat `98`, jumlah akar `6`, jumlah kebalikan sekitar `1.361111`. |
| Persamaan kuadrat | `1 -3 2` | Akar `1` dan `2`; tabel x bertambah `0.25`. |
| Resistor seri | `1`, `2`, lalu `100 200` | Total tahanan `300 Ω`. |
| Resistor paralel | `2`, `2`, lalu `100 100` | Total tahanan `50 Ω`. |

### Batasan latihan dan ide pengembangan

- Input diharapkan berupa angka yang sesuai. Input nonnumerik belum ditangani dan jumlah data pada latihan penjumlahan belum divalidasi agar positif.
- Fibonacci memakai `int`: hasil benar sampai suku ke-46; suku berikutnya mengalami overflow. Coba kembangkan dengan `long` atau `BigInteger`.
- Program resistor mengasumsikan setiap tahanan lebih dari nol; validasi nilai tersebut belum diterapkan di program Java.
- Jika ada data negatif, jumlah akar seluruh data dinyatakan tidak terdefinisi dalam bilangan real. Nilai nol dilewati pada penjumlahan kebalikan.
- Tabel persamaan kuadrat hanya dibuat saat `D > 0`. Akar terbesar tercetak jika tercapai oleh langkah `0.25`; operasi `double` juga dapat memiliki galat pembulatan.
- Visualisasi browser membatasi input dan jumlah tampilan agar nyaman dipelajari; batas tersebut tidak selalu diterapkan pada program Java.

Gunakan contoh ini untuk memahami alur program, lalu coba ubah input, telusuri setiap iterasi, dan tambahkan validasi sendiri.

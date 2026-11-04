import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        // Dua nilai awal ini menghasilkan deret Fibonacci yang dimulai dari 1, 1.
        int jumlahDeret, firstFibonacci = 1, secondFibonacci = 0, fibonacci;
        // Scanner digunakan untuk membaca jumlah suku dari keyboard.
        Scanner userInput = new Scanner(System.in);

        System.out.println("Masukkan banyak suku Fibonacci");
        jumlahDeret = userInput.nextInt();

        // Tampilkan pesan jika jumlah suku tidak valid.
        if (jumlahDeret <= 0) {
            System.out.println("Jumlah deret tidak boleh kurang dari atau sama dengan 0");
        }

        // Perulangan berjalan sebanyak jumlahDeret; untuk nilai <= 0, tidak berjalan.
        // Dengan tipe int, suku yang dicetak masih benar sampai suku ke-46.
        for (int i = 0; i < jumlahDeret; i++) {
            // Hitung suku baru dengan menjumlahkan dua nilai yang tersimpan.
            fibonacci = firstFibonacci + secondFibonacci;

            // Simpan suku baru ke secondFibonacci.
            secondFibonacci = fibonacci;
            // Suku baru dikurangi firstFibonacci lama menghasilkan secondFibonacci lama.
            // Nilai tersebut menjadi firstFibonacci untuk perulangan berikutnya.
            firstFibonacci = secondFibonacci - firstFibonacci;

            // Cetak suku yang baru dihitung, diikuti tanda koma.
            System.out.print(fibonacci + ",");
        }
    }
}

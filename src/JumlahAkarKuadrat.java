import java.util.Scanner;

public class JumlahAkarKuadrat {
    public static void main(String[] args) {
        // Scanner digunakan untuk membaca jumlah data dan nilai setiap data dari keyboard.
        Scanner userInput = new Scanner(System.in);

        // Ketiga penampung dimulai dari 0 karena nilainya akan dijumlahkan.
        double jumlahKuadrat = 0, jumlahAkar = 0, jumlahKebalikan = 0;
        // Penanda ini menjadi true jika ditemukan setidaknya satu data negatif.
        boolean adaNegatif = false;

        System.out.print("Masukkan jumlah data: ");
        int amountOfData = userInput.nextInt();

        // Ulangi pembacaan data dari data ke-1 sampai sejumlah amountOfData.
        for (int i = 1; i <= amountOfData; i++) {
            System.out.printf("Masukkan nilai data ke-%d%n", i);
            double data = userInput.nextDouble();

            // Jumlahkan kuadrat setiap data, termasuk data negatif dan nol.
            jumlahKuadrat = jumlahKuadrat + (data * data);

            // Akar kuadrat dalam bilangan real hanya dihitung untuk data >= 0.
            if (data >= 0) {
                jumlahAkar = jumlahAkar + Math.sqrt(data);
            } else {
                adaNegatif = true;
            }

            // Lewati data nol agar tidak terjadi pembagian dengan nol.
            if (data != 0) {
                jumlahKebalikan = jumlahKebalikan + (1 / data);
            }
        }

        // Tampilkan hasil penjumlahan kuadrat seluruh data.
        System.out.println("Jumlah kuadrat data = " + jumlahKuadrat);

        // Jika ada data negatif, jumlah akar seluruh data tidak terdefinisi dalam bilangan real.
        if (adaNegatif) {
            System.out.println("Jumlah akar tidak terdefinisi dalam bilangan real");
        } else {
            System.out.println("Jumlah akar data = " + jumlahAkar);
        }

        // Hasil ini adalah jumlah kebalikan data selain nol, bukan rata-rata harmonik.
        System.out.println("Jumlah kebalikan data selain nol = " + jumlahKebalikan);
    }
}

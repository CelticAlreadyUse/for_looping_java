import java.util.Scanner;

public class PersamaanDuaAkar {
    public static void main(String[] args) {
        // Scanner membaca koefisien persamaan y = ax^2 + bx + c dari keyboard.
        Scanner userInput = new Scanner(System.in);
        System.out.println("Masukkan nilai a, b, dan c secara berurutan:");
        double a = userInput.nextDouble();
        double b = userInput.nextDouble();
        double c = userInput.nextDouble();

        // Jika a = 0, persamaan bukan persamaan kuadrat dan rumus akar tidak digunakan.
        if (a == 0) {
            System.out.println("Bukan persamaan kuadrat");
        } else {
            // Diskriminan menentukan apakah persamaan memiliki dua akar real berbeda.
            double D = (b * b) - (4 * a * c);

            if (D > 0) {
                // penyebut harus (2 * a) agar seluruh pembilang dibagi 2a.
                double akar1 = (-b - Math.sqrt(D)) / (2 * a);
                double akar2 = (-b + Math.sqrt(D)) / (2 * a);

                // Urutkan akar agar perulangan tetap berjalan ketika a negatif.
                double x1 = Math.min(akar1, akar2);
                double x2 = Math.max(akar1, akar2);

                System.out.printf("Dari persamaan y = %s X x^2 + %s X x + %s%n", a, b, c);
                System.out.printf("Akar-akarnya adalah %s dan %s.%n", x1, x2);
                System.out.println("Nilai y untuk beberapa x antara akar pertama dan kedua adalah");
                System.out.println("=========================================================");
                System.out.printf("x                                     y = %s X x^2 + %s X x + %s%n", a, b, c);

                // Gunakan x terpisah agar nilai kedua akar tidak berubah.
                // Naikkan x sebesar 0.25 selama nilainya tidak melebihi akar terbesar.
                // Catatan: x2 ikut dicetak hanya jika tercapai oleh langkah tersebut.
                for (double x = x1; x <= x2; x += 0.25) {
                    double y = (a * x * x) + (b * x) + c;
                    System.out.printf("%s                           %s%n", x, y);
                }
                System.out.println("=========================================================");
            } else {
                // D = 0 berarti akar real kembar; D < 0 berarti tidak ada akar real.
                // Sesuai pseudocode, tabel nilai y hanya dihitung jika D > 0.
                System.out.println("Nilai y tidak dihitung karena D <= 0");
            }
        }
    }
}

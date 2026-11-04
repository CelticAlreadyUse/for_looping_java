import java.util.Scanner;

public class Resistor {
    public static void main(String[] args){
        // Scanner digunakan untuk membaca input dari keyboard.
        Scanner inputUser = new Scanner(System.in);
        // userOption menyimpan pilihan susunan, sedangkan n menyimpan jumlah resistor.
        int userOption, n;
        // resistor menyimpan tahanan yang sedang dibaca (dalam ohm).
        // resistorAmount menampung jumlah tahanan seri atau jumlah kebalikan tahanan paralel.
        // Nilai awalnya 0 karena akan ditambah pada setiap perulangan.
        double resistor,resistorAmount = 0,totalResistance;
        // Baca pilihan susunan dan jumlah resistor yang akan dihitung.
        System.out.println("Pilih susunan: 1. Seri, 2. Paralel");
        userOption = inputUser.nextInt();
        System.out.println("Masukkan jumlah resistor:");
        n = inputUser.nextInt();

        // Pilihan harus 1 atau 2, dan jumlah resistor harus lebih dari 0.
        if ((userOption != 1 && userOption != 2) || n <= 0){
            System.out.println("Pilihan atau jumlah resistor tidak valid");
        }else{

            // Baca nilai tahanan setiap resistor, dari resistor ke-1 sampai ke-n.
            for (int i = 1; i <= n; i++) {
                System.out.println("Masukkan tahanan resistor ke-"+i);
                resistor = inputUser.nextDouble();
                if(userOption == 1){
                    // Seri: jumlahkan semua tahanan, yaitu R1 + R2 + ... + Rn.
                    resistorAmount = resistorAmount + resistor;
                }else{
                    // Paralel: jumlahkan kebalikan setiap tahanan, yaitu 1/R1 + ... + 1/Rn.
                    // Rumus ini mengasumsikan nilai tahanan yang dimasukkan lebih dari 0.
                    resistorAmount = resistorAmount + (1/resistor);
                }
            }
            if(userOption == 1 ){
                // Total tahanan seri langsung menggunakan hasil penjumlahan.
                totalResistance =  resistorAmount;
            }else{
                // Total tahanan paralel adalah kebalikan dari jumlah kebalikan tahanan.
                totalResistance = 1/resistorAmount;
            }
            // Tampilkan hasil akhir dalam ohm.
            System.out.println("Total Tahanan: "+ totalResistance);
        }
    }
}

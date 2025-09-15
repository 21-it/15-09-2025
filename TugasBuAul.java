import java.util.Scanner;

public class TugasBuAul {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== MENU PROGRAM ===");
            System.out.println("1. Hitung Total Harga Belanja");
            System.out.println("2. Permainan Tebak Angka");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = input.nextInt();

            switch (pilihan) {
                case 1:
                    hitungTotalBelanja(input);
                    break;
                case 2:
                    tebakAngka(input);
                    break;
                case 0:
                    System.out.println("Terima kasih! Program selesai.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, coba lagi.");
            }
        } while (pilihan != 0);

        input.close();
    }

    // Program 1: Hitung total harga belanja dengan while
    public static void hitungTotalBelanja(Scanner input) {
        double harga;
        double total = 0;

        System.out.println("\nMasukkan harga buku (ketik 0 untuk selesai):");
        harga = input.nextDouble();

        while (harga != 0) {
            total += harga;
            System.out.println("Masukkan harga buku (ketik 0 untuk selesai):");
            harga = input.nextDouble();
        }

        System.out.println("Total harga seluruh buku: Rp " + total);
    }

    // Program 2: Tebak angka dengan do-while
    public static void tebakAngka(Scanner input) {
        int angkaRahasia = 7;  
        int tebakan;

        System.out.println("\nPermainan Tebak Angka (1 - 10)");
        do {
            System.out.print("Masukkan tebakan Anda: ");
            tebakan = input.nextInt();

            if (tebakan < angkaRahasia) {
                System.out.println("Terlalu kecil! Coba lagi.");
            } else if (tebakan > angkaRahasia) {
                System.out.println("Terlalu besar! Coba lagi.");
            } else {
                System.out.println("Selamat! Tebakan Anda benar.");
            }
        } while (tebakan != angkaRahasia);
    }
}

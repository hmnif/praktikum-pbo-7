// author :
// Muhammad Hanif
// 2210631170084
// 3C - Informatika

import java.util.Scanner;

public class tokoUncle {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    String[][] Barang = { { "u01", "u02", "u03", "u04", "u05" }, { "Baju", "Celana", "Jaket", "Tas", "Sepatu" } };
    int[] hargaBarang = { 55000, 200000, 150000, 100000, 350000 };

    System.out.println("Selamat datang di toko Uncle");
    System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
    System.out.println("Kode\tBarang\t\tHarga");
    System.out.println("================================");
    for (int i = 0; i < Barang[0].length; i++) {
      System.out.println(Barang[0][i] + "\t" + Barang[1][i] + "\t\t" + hargaBarang[i]);
    }
    System.out.println("================================");

    System.out.print("Input jumlah pembelian : ");
    int jmlhPembelian = input.nextInt();
    input.nextLine();

    String kodeBarang[] = new String[jmlhPembelian];
    int banyak[] = new int[jmlhPembelian];
    int[] totalHargaPerItem = new int[jmlhPembelian];
    int totalHarga = 0;

    for (int i = 0; i < jmlhPembelian; i++) {
      System.out.println("\nBarang ke " + (i + 1));
      System.out.print("Input kode barang : ");
      kodeBarang[i] = input.nextLine();

      int indeks = -1;
      for (int j = 0; j < Barang[0].length; j++) {
        if (kodeBarang[i].equals(Barang[0][j])) {
          indeks = j;
          break;
        }
      }

      if (indeks != -1) {
        System.out.print("Banyak : ");
        banyak[i] = input.nextInt();
        input.nextLine();
        totalHargaPerItem[i] = banyak[i] * hargaBarang[indeks];
      } else {
        System.out.println("Kode barang tidak tersedia!");
        i--;
      }
    }

    System.out.println("\nTabel pembelian");
    System.out.println("Kode\tBarang\t\tHarga\t\tBanyak\tJumlah Bayar");
    System.out.println("===========================================================");
    for (int i = 0; i < jmlhPembelian; i++) {
      int indeks = -1;
      for (int j = 0; j < Barang[0].length; j++) {
        if (kodeBarang[i].equals(Barang[0][j])) {
          indeks = j;
          break;
        }
      }
      if (indeks != -1) {
        System.out.println(kodeBarang[i] + "\t" + Barang[1][indeks] + "\t\t" + hargaBarang[indeks] + "\t\t" + banyak[i]
            + "\t" + totalHargaPerItem[i]);
        totalHarga += totalHargaPerItem[i];
      }
    }
    System.out.println("===========================================================");
    System.out.println("Jumlah Pembayaran : \t\t\t\t" + totalHarga);
    System.out.println("===========================================================");
  }
}

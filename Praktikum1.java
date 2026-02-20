/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package praktikum1;

import java.util.Scanner;

public class Praktikum1 {
 public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in); // Membuat objek Scanner untuk menerima input
        
        int[] data = new int[10]; // Membuat array bertipe integer dengan ukuran 10
        int jumlahGanjil = 0; // Variabel untuk menyimpan total nilai bilangan ganjil
        int banyakGanjil = 0; // Variabel untuk menghitung jumlah bilangan ganjil
        
       
        for (int i = 0; i < data.length; i++) { // Loop dari indeks 0 sampai 9
            System.out.print("Masukkan bilangan ke-" + (i + 1) + ": "); // Menampilkan pesan input
            data[i] = input.nextInt(); // Menyimpan input ke dalam array
        }
        
        // Perulangan untuk mengecek dan menjumlahkan bilangan ganjil
        for (int i = 0; i < data.length; i++) { // Loop untuk membaca isi array
            if (data[i] % 2 != 0) { // Mengecek apakah bilangan ganjil (sisa bagi 2 tidak sama dengan 0)
                jumlahGanjil += data[i]; // Menambahkan nilai ganjil ke total jumlahGanjil
                banyakGanjil++; // Menambah hitungan jumlah bilangan ganjil
            }
        }
        
        // Mengecek apakah ada bilangan ganjil yang ditemukan
        if (banyakGanjil > 0) { // Jika ada minimal satu bilangan ganjil
            double rataRata = (double) jumlahGanjil / banyakGanjil; // Menghitung rata-rata (dikonversi ke double)
            System.out.println("Rata-rata bilangan ganjil: " + rataRata); // Menampilkan hasil rata-rata
        } else { // Jika tidak ada bilangan ganjil
            System.out.println("Tidak ada bilangan ganjil dalam array."); // Menampilkan pesan
        }
        
        input.close();
    }
}

    
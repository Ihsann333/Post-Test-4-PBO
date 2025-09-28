/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package main;

import java.util.Scanner;
import service.service;

/**
 *
 * @author loq
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        service serv = new service();
        int opsi;

        do {
            System.out.println("\n=== Menu ===");
            System.out.println("1. Tambah Data");
            System.out.println("2. Lihat Data");
            System.out.println("3. Update Data");
            System.out.println("4. Hapus Data");
            System.out.println("5. Cari Data");
            System.out.println("6. Keluar");
            System.out.print("Pilih: ");
            opsi = input.nextInt();
            input.nextLine();

            switch (opsi) {
                case 1 -> serv.create();
                case 2 -> serv.read();
                case 3 -> serv.update();
                case 4 -> serv.delete();
                case 5 -> serv.search();
            }
        } while (opsi != 6);

        input.close();
    }
}
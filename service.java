/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package service;

/**
 *
 * @author loq
 */
import java.util.ArrayList;
import java.util.Scanner;
import model.*;

public class service implements OperasiCRUD {
    private ArrayList<model> coworkerList = new ArrayList<>();
    private Scanner scanner = new Scanner(System.in);

    public service() {
        coworkerList.add(new RuangMeeting("C101", "Ruang Meeting", 10));
        coworkerList.add(new RuangMeeting("C102", "Ruang Meeting", 20));
        coworkerList.add(new RuangAcara("C103", "Ruang Acara", 50));
    }

    @Override
    public void create() {
        System.out.print("Masukkan kode: ");
        String kode = scanner.nextLine();
        System.out.print("Masukkan nama: ");
        String nama = scanner.nextLine();
        System.out.print("Masukkan kapasitas: ");
        int kapasitas = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Tipe (1=Meeting,2=Acara): ");
        int tipe = scanner.nextInt();
        scanner.nextLine();

        if (tipe == 1) {
            coworkerList.add(new RuangMeeting(kode, nama, kapasitas));
        } else {
            coworkerList.add(new RuangAcara(kode, nama, kapasitas));
        }
        System.out.println("Data berhasil ditambahkan!");
    }

    public void search() {
        System.out.print("Masukkan kata kunci pencarian (kode/nama): ");
        String keyword = scanner.nextLine();
        search(keyword); // panggil versi overload
    }

    public void search(String keyword) {
        boolean found = false;
        for (model ruang : coworkerList) {
            if (ruang.getKode().toLowerCase().contains(keyword.toLowerCase()) ||
                ruang.getNama().toLowerCase().contains(keyword.toLowerCase())) {
                System.out.println(ruang);
                found = true;
            }
        }
        if (!found) {
            System.out.println("Data tidak ditemukan.");
        }
    }

    @Override
    public void read() {
        if (coworkerList.isEmpty()) {
            System.out.println("Data kosong!");
        } else {
            for (int i = 0; i < coworkerList.size(); i++) {
                System.out.println((i + 1) + ". " + coworkerList.get(i));
            }
        }
    }

    @Override
    public void update() {
        read();
        System.out.print("Pilih nomor yang ingin diupdate: ");
        int idx = scanner.nextInt();
        scanner.nextLine();
        if (idx < 1 || idx > coworkerList.size()) return;

        model ruang = coworkerList.get(idx - 1);
        System.out.print("Nama baru: ");
        ruang.setNama(scanner.nextLine());
        System.out.print("Kapasitas baru: ");
        ruang.setKapasitas(scanner.nextInt());
        scanner.nextLine();
        System.out.println("Data berhasil diupdate!");
    }

    @Override
    public void delete() {
        read();
        System.out.print("Pilih nomor yang ingin dihapus: ");
        int idx = scanner.nextInt();
        scanner.nextLine();
        if (idx < 1 || idx > coworkerList.size()) return;

        coworkerList.remove(idx - 1);
        System.out.println("Data berhasil dihapus!");
    }

    @Override
    public void create(String kode, String nama) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
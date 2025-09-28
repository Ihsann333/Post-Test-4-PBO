/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author loq
 */

public abstract class model {
    private String kode;
    private String nama;
    private int kapasitas;

    public model(String kode, String nama, int kapasitas) {
        this.kode = kode;
        this.nama = nama;
        this.kapasitas = kapasitas;
    }

    public String getKode() { return kode; }
    public void setKode(String kode) { this.kode = kode; }

    public String getNama() { return nama; }
    public void setNama(String nama) { this.nama = nama; }

    public int getKapasitas() { return kapasitas; }
    public void setKapasitas(int kapasitas) { this.kapasitas = kapasitas; }

    public abstract String getTipe();

    @Override
    public String toString() {
        return String.format("[%s] %s (kapasitas %d orang) - %s",
                kode, nama, kapasitas, getTipe());
    }
}

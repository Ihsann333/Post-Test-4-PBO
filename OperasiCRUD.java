/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package service;

/**
 *
 * @author loq
 */
public interface OperasiCRUD {
    void create();
    void create(String kode, String nama);
    void read();
    void update();
    void delete();
}

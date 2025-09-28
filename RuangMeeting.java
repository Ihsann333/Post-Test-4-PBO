/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author loq
 */

public class RuangMeeting extends model {
    public RuangMeeting(String kode, String nama, int kapasitas) {
        super(kode, nama, kapasitas);
    }
    @Override
    public String getTipe() { return "Ruang Meeting"; }
}
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.sql.*;

/**
 *
 * @author Asus
 */
public class CRUD {

    private Double km, cm, m;
    private PreparedStatement psmt;
    private Connection koneksi;
    private String query;

    //menyambungkan ke database
    public CRUD() {
        Koneksi conn = new Koneksi();
        koneksi = conn.getKoneksi();
    }

    
    //membuat setter dan getter
    public void setkmToM(Double km1) {
        this.km = km1;
    }

    public Double getkmToM() {
        return km;
    }

    public void setkmToCm(Double km2) {
        this.km = km2;
    }

    public Double getkmToCm() {
        return km;
    }

    public void setmToKm(Double m1) {
        this.m = m1;
    }

    public Double getmToKm() {
        return m;
    }

    public void setmToCm(Double m2) {
        this.m = m2;
    }

    public Double getmToCm() {
        return m;
    }

    public void setcmToKm(Double cm1) {
        this.cm = cm1;
    }

    public Double getcmToKm() {
        return cm;
    }

    public void setcmToM(Double cm2) {
        this.cm = cm2;
    }

    public Double getcmToM() {
        return m;
    }

    //membuat fungsi insert data
    public void simpanData(Double km1, Double km2, Double m1, Double m2, Double cm1, Double cm2) {
        query = "insert into konvers (?, ?, ?, ?, ?, ?)";
        try {
            psmt.setDouble(1, km1);
            psmt.setDouble(2, km2);
            psmt.setDouble(3, m1);
            psmt.setDouble(4, m2);
            psmt.setDouble(5, cm1);
            psmt.setDouble(6, m2);
            psmt.executeUpdate();
            psmt.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
    }
}

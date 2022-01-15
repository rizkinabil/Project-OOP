/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BE.TestTaker;

/**
 *
 * @author Madluke
 */
public class Questions {
    private int IdSoal;
    private String Soal, Opsi1, Opsi2, Opsi3, Opsi4, Jawaban;

    public Questions(int IdSoal, String Soal, String Opsi1, String Opsi2, String Opsi3, String Opsi4, String Jawaban) {
        this.IdSoal = IdSoal;
        this.Soal = Soal;
        this.Opsi1 = Opsi1;
        this.Opsi2 = Opsi2;
        this.Opsi3 = Opsi3;
        this.Opsi4 = Opsi4;
        this.Jawaban = Jawaban;
    }
    
    

    public int getIdSoal() {
        return IdSoal;
    }

    public void setIdSoal(int IdSoal) {
        this.IdSoal = IdSoal;
    }

    public String getSoal() {
        return Soal;
    }

    public void setSoal(String Soal) {
        this.Soal = Soal;
    }

    public String getOpsi1() {
        return Opsi1;
    }

    public void setOpsi1(String Opsi1) {
        this.Opsi1 = Opsi1;
    }

    public String getOpsi2() {
        return Opsi2;
    }

    public void setOpsi2(String Opsi2) {
        this.Opsi2 = Opsi2;
    }

    public String getOpsi3() {
        return Opsi3;
    }

    public void setOpsi3(String Opsi3) {
        this.Opsi3 = Opsi3;
    }

    public String getOpsi4() {
        return Opsi4;
    }

    public void setOpsi4(String Opsi4) {
        this.Opsi4 = Opsi4;
    }

    public String getJawaban() {
        return Jawaban;
    }

    public void setJawaban(String Jawaban) {
        this.Jawaban = Jawaban;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BE.role;

/**
 *
 * @author Madluke
 */
public class TestTaker extends User{
    private int IdTestTaker;
    private String Nama, JenisKelamin, Email;

    public TestTaker(int IdTestTaker, String Nama, String JenisKelamin, String Email, String Role) {
        super(Role);
        this.IdTestTaker = IdTestTaker;
        this.Nama = Nama;
        this.JenisKelamin = JenisKelamin;
        this.Email = Email;
    }
    

    public int getIdTestTaker() {
        return IdTestTaker;
    }

    public void setIdTestTaker(int IdTestTaker) {
        this.IdTestTaker = IdTestTaker;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getJenisKelamin() {
        return JenisKelamin;
    }

    public void setJenisKelamin(String JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
}

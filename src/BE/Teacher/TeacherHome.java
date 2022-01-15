package BE.Teacher;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Madluke
 */
public class TeacherHome implements LihatSoal, LihatTestTaker{
    private int IdTestTaker;
    private String NamaTest, JenisKelaminTest, EmailTest;

    public TeacherHome(int IdTestTaker, String NamaTest, String JenisKelaminTest, String EmailTest) {
        this.IdTestTaker = IdTestTaker;
        this.NamaTest = NamaTest;
        this.JenisKelaminTest = JenisKelaminTest;
        this.EmailTest = EmailTest;
    }

    public int getIdTestTaker() {
        return IdTestTaker;
    }

    public void setIdTestTaker(int IdTestTaker) {
        this.IdTestTaker = IdTestTaker;
    }

    public String getNamaTest() {
        return NamaTest;
    }

    public void setNamaTest(String NamaTest) {
        this.NamaTest = NamaTest;
    }

    public String getJenisKelaminTest() {
        return JenisKelaminTest;
    }

    public void setJenisKelaminTest(String JenisKelaminTest) {
        this.JenisKelaminTest = JenisKelaminTest;
    }

    public String getEmailTest() {
        return EmailTest;
    }

    public void setEmailTest(String EmailTest) {
        this.EmailTest = EmailTest;
    }
    
    public void LihatSoal(){
        
    }
    
    public void LihatTestTaker(){
        
    }
    
    
}

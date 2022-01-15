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
public class Admin extends User{
    private int IdAdmin;
    private String Nama, Username, Password, SecQuestion, SecAnswer;

    public Admin(int IdAdmin, String Nama, String Username, String Password, String SecQuestion, String SecAnswer, String Role) {
        super(Role);
        this.IdAdmin = IdAdmin;
        this.Nama = Nama;
        this.Username = Username;
        this.Password = Password;
        this.SecQuestion = SecQuestion;
        this.SecAnswer = SecAnswer;
    }
    
    

    public int getIdAdmin() {
        return IdAdmin;
    }

    public void setIdAdmin(int IdAdmin) {
        this.IdAdmin = IdAdmin;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getUsername() {
        return Username;
    }

    public void setUsername(String Username) {
        this.Username = Username;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public String getSecQuestion() {
        return SecQuestion;
    }

    public void setSecQuestion(String SecQuestion) {
        this.SecQuestion = SecQuestion;
    }

    public String getSecAnswer() {
        return SecAnswer;
    }

    public void setSecAnswer(String SecAnswer) {
        this.SecAnswer = SecAnswer;
    }
    
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BE.Admin;

/**
 *
 * @author Madluke
 */
public class AdminHome implements LihatTeacher, Pengaturan{
    private int IdT;
    private String NamaT, UsernameT, PassT;

    public AdminHome(int IdT, String NamaT, String UsernameT, String PassT) {
        this.IdT = IdT;
        this.NamaT = NamaT;
        this.UsernameT = UsernameT;
        this.PassT = PassT;
    }

    public int getIdT() {
        return IdT;
    }

    public void setIdT(int IdT) {
        this.IdT = IdT;
    }

    public String getNamaT() {
        return NamaT;
    }

    public void setNamaT(String NamaT) {
        this.NamaT = NamaT;
    }

    public String getUsernameT() {
        return UsernameT;
    }

    public void setUsernameT(String UsernameT) {
        this.UsernameT = UsernameT;
    }

    public String getPassT() {
        return PassT;
    }

    public void setPassT(String PassT) {
        this.PassT = PassT;
    }
    
    public void LihatTeacher(){
        
    }
    
    public void Pengaturan(){
        
    }
    
    
}

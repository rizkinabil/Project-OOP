/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BE.Admin;

import connection.connect_db;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import BE.role.Teacher;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
/**
 *
 * @author Madluke
 */
public class AdminHome implements LihatTeacher, Pengaturan{
Connection con = null;
Statement st = null;
PreparedStatement ps = null;
ResultSet rs = null;
    
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
    
    public void TambahTeacher(){
        
        try {
            Connection con = connect_db.getCon();
            ps = con.prepareStatement("insert into teacher values(?,?,?,?)");
            ps.setInt(1, IdT);
            ps.setString(2, NamaT);
            ps.setString(3, UsernameT);
            ps.setString(4, PassT);
            
            
            ps.execute();

        }catch (SQLException e) {
            
        }finally{
            try {
                ps.close();
            } catch (SQLException e) {
                
            }
        }
    }
    
    public void EditTeacher(){
        
//        try {
//            Connection con = connect_db.getCon();
//            ps = con.prepareStatement("")
//            
//        }
        
    }
    
    public void DeleteTeacher(){
        
        try {
            Connection con = connect_db.getCon();
            ps = con.prepareStatement("delete from teacher where IdTeacher=?");
            ps.setInt(1, IdT);

            //upadte query
            ps.executeUpdate();
            JFrame jf = new JFrame();
            jf.setAlwaysOnTop(true);
            JOptionPane.showMessageDialog(jf, "Successfully deleted");
            // close and re call the same page
        } catch (SQLException e) {
            JFrame jf = new JFrame();
        }
    }
    
    public void LihatTeacher(){
//        Connection con = null;
//        Statement st = null;
//        ResultSet rs = null;
//        
//        try {
//            con = connect_db.getCon();
//            st = con.createStatement();
//            rs = st.executeQuery("SELECT * from teacher");
//            
//            DefaultTableModel tabelTeacher = (DefaultTableModel) 
//            
//        } catch (){
//            
//        }
        
    }
    
    public void Pengaturan(){
        
    }
    
    
}

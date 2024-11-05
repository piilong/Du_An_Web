/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dao;

import context.DbContext;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import model.TaiKhoan;

/**
 *
 * @author ADMIN
 */
public class TaiKhoanDAO {
    Connection conn;
    PreparedStatement ps;
    ResultSet rs;
    
    // Phương thức kiểm tra thông tin tài khoản
    public TaiKhoan checkLogin(String username, String password) {
        TaiKhoan kq = null;
        String sql = "select * from TaiKhoan where username=? and password=?";
        conn = DbContext.getConnection();
        try {
            ps = conn.prepareStatement(sql);
            ps.setString(1,username);
            ps.setString(2,password);
            rs = ps.executeQuery();
            if (rs.next()) {
                kq = new TaiKhoan(rs.getString(1),rs.getString(2));
            }
        } catch (Exception ex) {
            System.out.println("Loi:" + ex.toString());
        }
        return kq;
    }
    public static void main(String[] args) {
        TaiKhoanDAO tkDAO = new TaiKhoanDAO();
        TaiKhoan tk = tkDAO.checkLogin("admin", "admin");
        if(tk!=null){
            System.out.println("Thành công");
        } else {
            System.out.println("Thất bại");
        }
    }
}

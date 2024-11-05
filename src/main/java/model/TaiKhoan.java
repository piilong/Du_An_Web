/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author ADMIN
 */
public class TaiKhoan {
    private String username;
    private String password;

    public TaiKhoan() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public TaiKhoan(String username, String password) {
        this.username = username;
        this.password = password;
    }

    @Override
    public String toString() {
        return "TaiKhoan{" + "username=" + username + ", password=" + password + '}';
    }
    
    
}
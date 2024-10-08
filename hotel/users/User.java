/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package hotel.users;

import hotel.reservasi.Kamar;

/**
 *
 * @author LG
 */
public class User {
    protected String username;
    protected String password;
    
    //Constructor
    public User(String username, String password){
        this.username = username;
        this.password = password;
    }
    
    private int stringSama(String str1, String str2){
        if (str1.length() != str2.length()){
            return 0;
        }
        for (int i = 0; i < str1.length(); i++){
            if (str1.charAt(i) != str2.charAt(i)){
                return 0;
            }
        }
        return 1;
    }
    
    //Method untuk login
    public int login(String username, String password){
        if (stringSama(this.username, username) == 1 && stringSama(this.password, password) == 1){
            return 1; //Berhasil login
        }
        return 0; //Gagal login
    }
    
    public String getUsername(){
        return username;
    }
}
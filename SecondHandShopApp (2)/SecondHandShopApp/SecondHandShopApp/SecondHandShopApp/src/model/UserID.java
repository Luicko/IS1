/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Familia
 */
public class UserID {
    private String id;
    
    public UserID(String user){
        int value = (int)(Math.random() * 1000 + 1);
        this.id = user + value;
    }

    public String getID(){
    	return id;
    }
}

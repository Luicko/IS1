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
public class ProductID {
    private String id;
    
    public ProductID(String prod, String owner){
        int value = (int)(Math.random() * 1000 + 1);
        this.id = prod + value + owner;
    }

    public String getID(){
    	return id;
    }
}

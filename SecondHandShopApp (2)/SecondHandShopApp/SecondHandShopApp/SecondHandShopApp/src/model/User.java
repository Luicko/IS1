/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;


import java.util.ArrayList;
/**
 *
 * @author Familia
 */
public class User {
    private UserID userID;
    private String firstName;
    private String surName;
    private String email;
    private Address address;
    private String password;
    private ArrayList<CardDetails> cardList;
    private ArrayList<Purchase> purchaseHist;
    private ArrayList<Product> products;
    private Selled sellHist;
    
    
    public User(String firstName, String surName, String email, String password,
        String street, int houseNumber, String city, String ZIPCode, String country){
        this.firstName=firstName;
        this.surName=surName;
        address = new Address(street, houseNumber, city, ZIPCode, country);
        setEmail(email);
        setPassword(password);
        this.userID = new UserID(email);
        this.cardList = new ArrayList<CardDetails>();
        this.products = new ArrayList<Product>();
        this.purchaseHist = new ArrayList<Purchase>();
        
    }
    
    //Setters
    void setEmail(String email){
        this.email=email;
    }
    void setPassword(String password){
        this.password=password;
    }

    public String getName(){
        return firstName+" "+surName;
    }
    
    public String getEmail(){
        return email;
    }

    public boolean correctPassword(String pass){
        return this.password.equals(pass);
    }

    public String getUserId(){
        return userID.getID();
    }
    
    public void addCard(String cardNo, String expDate){
        CardDetails newCard=new CardDetails(cardNo, expDate);
        cardList.add(newCard);
    }

    public void offerProduct(String name, float price, String description, String image, Category cate){
        Product newProduct= new Product(this, name, price, description, image, cate);
        products.add(newProduct);
    }

    public ArrayList getProducts(){
        return this.products;
    }

    public void removeProduct(Product prod){
        products.remove(prod);
    }
}

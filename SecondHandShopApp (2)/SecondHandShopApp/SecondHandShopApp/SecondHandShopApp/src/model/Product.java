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
public class Product {
    private float price; 
    private ProductID productId;
    private String description;
    private String image;
    private User owner;
    private String name;
    private Category cate;
    
    public Product(User user, String name, float price, String description, String image, Category cate){
        this.price = price;
        this.description = description;
        this.image = image;
        this.owner = user;
        this.cate = cate;
        this.productId = new ProductID(name, owner.getName());
    }

    public String getProductId(){
        return productId.getID();
    }

    public User getProductOwner(){
        return owner;
    }

    public Category getCategory(){
        return cate;
    }

    public void setCategory(Category cate){
        this.cate = cate;
    }
}

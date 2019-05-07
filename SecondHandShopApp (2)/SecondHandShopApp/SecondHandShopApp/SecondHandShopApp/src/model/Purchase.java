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
public class Purchase {
    private OperationState operationState;
    private Address shippingAddress;
    private UserID userId;
    private float price;
    private Product product;
    
        public Purchase(Product boughtProduct, Address shippingAddress, float price){
        this.price = price;
        this.shippingAddress = shippingAddress;
        this.product = boughtProduct;
        
    }
        


}

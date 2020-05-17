/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solenus.fantasytrade;

/**
 *
 * @author Chris
 */
public class Goods 
{
    private String name;
    private int quantity;
    public int weight;
    
    
    public String getName()
    {
        return name;
    }
    
    public int getQuantity()
    {
        return quantity;
    }
    
    public void setQuantity(int q)
    {
        quantity=q;
    }
    
    public int getWeight()
    {
        return weight;
    }
    
    
    
}

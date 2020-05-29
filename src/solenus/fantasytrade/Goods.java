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
    private double quantity;
    public double weight;

    //The type of units the good is sold in, like kilograms, bushels, tons, etc.
    public String units;
    
    
    public String getName()
    {
        return name;
    }
    
    public double getQuantity()
    {
        return quantity;
    }
    
    public void setQuantity(double q)
    {
        quantity=q;
    }
    
    public double getWeight()
    {
        return weight;
    }
    
    public String getUnits()
    {
        return units;
    }
    
    
    
}

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
public class Need 
{
    /**
     * 
     * @param s The good needed
     * @param d The amount the society would like to have
     */
    public Need(String s, double d)
    {
        goodNeeded = s;
        amountNeeded = d;
    }
    
    
    private String goodNeeded;
    private double amountNeeded;

    /**
     * @return the goodNeeded
     */
    public String getGoodNeeded() {
        return goodNeeded;
    }

    /**
     * @param goodNeeded the goodNeeded to set
     */
    public void setGoodNeeded(String goodNeeded) {
        this.goodNeeded = goodNeeded;
    }

    /**
     * @return the amountNeeded
     */
    public double getAmountNeeded() {
        return amountNeeded;
    }

    /**
     * @param amountNeeded the amountNeeded to set
     */
    public void setAmountNeeded(double amountNeeded) {
        this.amountNeeded = amountNeeded;
    }

}

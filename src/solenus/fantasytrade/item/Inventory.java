/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solenus.fantasytrade.item;

import java.util.ArrayList;

/**
 *
 * @author Chris
 */
public class Inventory 
{
    private double gold;
    private ArrayList<Item> items;
    
    public Inventory()
    {
        gold = 0;
        items = new ArrayList<>();
    }
    
    public void addItem(Item i)
    {
        items.add(i);
    }
    
    public void removeItem(Item i)
    {
        if(items.remove(i));
    }
    
    /**
     * @param g the amount of gold to add. Negative numbers remove gold.
     */
    public void addGold(double g)
    {
        gold += g;
    }

}

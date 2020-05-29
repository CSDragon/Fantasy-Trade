/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solenus.fantasytrade;

import java.util.ArrayList;

/**
 *
 * @author Chris
 */
public class Item 
{
    
    /**
     * unique ID for the next item generated.
     */
    private static int baseID = 0;
    
    private static ArrayList<Item> allItems;

    /**
     * Unique ID for each item generated.
     */
    public final int uniqueID;
    
    /**
     * Item's name
     */
    public final String name;
    
    /**
     * Base value of the item for 
     */
    public final double baseValue;
    
    /**
     * Base weight per unit sold.
     */
    public final double weight;
    
    /**
     * The type of units to measure 1 of the object. For instance, Kilograms, Liters, Bushels, Gallons, etc
     */
    public final String unitType;
    
    public Item(String _name, double _value, double _weight, String _unitType)
    {
        if(allItems == null)
            allItems = new ArrayList<>();
        
        uniqueID = baseID;
        baseID++;

        name = _name;
        baseValue = _value;
        weight = _weight;
        unitType = _unitType;
        
        allItems.add(this);
    }
    
    /**
     * Finds an item by name (Needs improvement)
     * @param n Name of the item to look for
     * @return The item, or Null
     */
    public static Item getItemByName(String n)
    {
        for(int i = 0; i<allItems.size(); i++)
        {
            if(allItems.get(i).name.equals(n))
                return allItems.get(i);
        }
        return null;
    }

    
}

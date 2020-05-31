/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solenus.fantasytrade;

import java.util.HashMap;

/**
 *
 * @author Chris
 */
public class ItemDefinition 
{
    
    /**
     * unique ID for the next item generated.
     */
    private static int baseID;
    
    private static HashMap<String, ItemDefinition> allItems;
    private static HashMap<Integer, String> itemNameIDMap;

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
    
    /**
     * 
     * @param _name Name of the item
     * @param _value Base value of the item
     * @param _weight Base weight per unit of measurement. (Assumed to be Pounds or Kilograms uniformly)
     * @param _unitType Unit this object is measured in. (Weight per Gallons, per Bushels...per chair, etc) Mostly flavor text. 
     */
    private ItemDefinition(String _name, double _value, double _weight, String _unitType)
    {
        //initialize this item's id
        uniqueID = baseID;
        baseID++;

        //initialize fields
        name = _name;
        baseValue = _value;
        weight = _weight;
        unitType = _unitType;
    }
    
    public static ItemDefinition CreateItemDefinition(String _name, double _value, double _weight, String _unitType)
    {
        //If this is the first item, initialize the list
        if(allItems == null)
        {
            baseID = 0;
            allItems = new HashMap<>();
            itemNameIDMap = new HashMap<>();
        }
        
        //if an item with that name already exists, ignore 
        if(allItems.get(_name) != null)
            return allItems.get(_name);
        
        //Create the Item
        ItemDefinition i = new ItemDefinition(_name, _value, _weight, _unitType);
        
        //add item to the all items list
        allItems.put(_name, i);
        itemNameIDMap.put(i.uniqueID, _name);
        
        return i;
    }
    
    /**
     * Finds an item with the given name
     * @param n Name of the item to look for
     * @return The item, or Null
     */
    public static ItemDefinition getItemDefinitionByName(String n)
    {
        return allItems.get(n);
    }
    
    /**
     * Gets an item by ID (NEEDS TESTING)
     * @param id The ID of the item.
     * @return The Item with that ID
     */
    public static ItemDefinition getItemDefinitionByID(int id)
    {
        String name = itemNameIDMap.get(id);
        if(name == null)
            return null;
        return allItems.get(name);
    }

    
}

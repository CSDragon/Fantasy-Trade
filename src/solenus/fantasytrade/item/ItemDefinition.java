/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solenus.fantasytrade.item;

import java.util.HashMap;

/**
 *
 * @author Chris
 */
public class ItemDefinition 
{
    //Degradation interpolation. 
    public static final int DEGRADATION_LINEAR = 0;
    public static final int DEGRADATION_EXPONENTIAL = 1;
    public static final int DEGRADATION_LOGARITHMIC = 2;
    /**
     * S-Curve. Swaps at the halfway point.
     */
    public static final int DEGRADATION_SCURVE = 3;
    /**
     * Technically not relevant, but might as well have it.
     */
    public static final int DEGRADATION_NONE = 4; 
    
    
    
    //unique ID for the next item generated.
    private static int baseID;
    
    //item maps
    private static HashMap<String, ItemDefinition> allItems;
    private static HashMap<Integer, String> itemNameIDMap;

    //<editor-fold desc="fields">
    
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
     * The units, but plural.
     */
    public final String unitTypePlural;
    
    /**
     * The type of item: IE, Luxury, Commodity, Raw Materials, Supplies. May replace with a list of tags. 
     */
    public final String itemType;
    
    /**
    * How long it will take for this item to degrade completely.
    * -1 = never expires.
    */
    public final double shelfLife;
    
    /**
     * The way that the quality degrades. 0 for linear, 1 for exponential, 2 for logarithmic, 3 for s curve
     */
    public final int degradationType;
    
    
    //</editor-fold>
    
    /**
     * PRIVATE constructor. Items should be created by the method ItemDefinition.CreateItemDefinition
     * @param _name Name of the item
     * @param _value Base value of the item
     * @param _weight Base weight per unit of measurement. (Assumed to be Pounds or Kilograms uniformly)
     * @param _unitType Unit this object is measured in. (Weight per Gallons, per Bushels...per chair, etc) Mostly flavor text.
     * @param _unitTypePlural The unit type but plural (optional). If NULL it will append an 's' to the unitType.
     */
    private ItemDefinition(String _name, double _value, double _weight, String _unitType, String _unitTypePlural, String _itemType, double _shelfLife, int _degradationType)
    {
        //initialize this item's id
        uniqueID = baseID;
        baseID++;

        //initialize fields
        name = _name;
        baseValue = _value;
        weight = _weight;
        unitType = _unitType;
        
        if(_unitTypePlural == null)
            unitTypePlural = unitType + "s";
        else
            unitTypePlural = _unitTypePlural;
        
        itemType = _itemType;
        
        shelfLife = _shelfLife;
        degradationType = _degradationType;
        
    }
    
    /**
     * Static method for creating items and cataloging them properly within the tools to 
     * @param _name
     * @param _value
     * @param _weight
     * @param _unitType
     * @param _unitTypePlural
     * @param _itemType
     * @param _shelfLife
     * @param _degradationType
     * @return 
     */
    public static ItemDefinition CreateItemDefinition(String _name, double _value, double _weight, String _unitType, String _unitTypePlural, String _itemType, double _shelfLife, int _degradationType)
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
        ItemDefinition i = new ItemDefinition(_name, _value, _weight, _unitType, _unitTypePlural, _itemType, _shelfLife, _degradationType);
        
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

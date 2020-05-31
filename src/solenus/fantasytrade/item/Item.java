/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solenus.fantasytrade.item;


/**
 *
 * @author Chris
 */
public class Item 
{
    private ItemDefinition def;
    private double count;
    private double quality;
    private double condition;
    
    /**
     * Default constructor
     * @param _def The item definition of the item
     * @param _count How much of this item is there (units defined in the definition)
     * @param _quality How high quality the item is. Higher quality sells for more and lasts longer.
     * @param _condition How degraded the item is.
     */
    public Item(ItemDefinition _def, double _count, double _quality, double _condition)
    {
        def = _def;
        count = _count;
        quality = _quality;
        condition = _condition;
    }
    
    /**
     * 
     * @param name The name of the item. If no Item Definition exists, a blank one will be created.
     * @param _count How much of this item is there (units defined in the definition)
     * @param _quality How high quality the item is. Higher quality sells for more and lasts longer.
     * @param _condition How degraded the item is.
     */
    public Item(String name, double _count, double _quality, double _condition)
    {
        this(ItemDefinition.getItemDefinitionByName(name), _count, _quality, _condition);
        
        if(def == null)
            def = ItemDefinition.CreateItemDefinition(name, 0, 0, "unkown", "unknown", "unknown", -1, 0);
    }
    
    
    
    
    
    //<editor-fold desc="Getters and Setters">
    
    public double getCount()
    {
        return count;
    }
    
    public void getCount(double c)
    {
        count = c;
    }
    
    public double getQuality()
    {
        return quality;
    }
    
    public void setQuality(double c)
    {
        quality = c;
    }
    
    public ItemDefinition getDefinition()
    {
        return def;
    }

    /**
     * @return the condition
     */
    public double getCondition() {
        return condition;
    }

    /**
     * @param condition the condition to set
     */
    public void setCondition(double condition) {
        this.condition = condition;
    }
    
    //</editor-fold>
}

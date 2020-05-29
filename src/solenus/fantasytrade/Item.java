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
public class Item 
{
    public final String name;
    public final double baseValue;
    public final double weight;
    
    public Item(String _name, double _value, double _weight)
    {
        name = _name;
        baseValue = _value;
        weight = _weight;
    }
    
}

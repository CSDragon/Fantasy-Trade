/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package solenus.fantasytrade;

import solenus.fantasytrade.item.ItemDefinition;

/**
 *
 * @author Chris
 */
public class FantasyTrade 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        ItemTest();
        
        
        
    }
    
    
    
    public static void ItemTest()
    {
        for(int i = 0; i<100; i++)
            ItemDefinition.CreateItemDefinition("test"+i, 0, 0, "butts", null, "none", -1, ItemDefinition.DEGRADATION_LINEAR);
        
        System.out.println(ItemDefinition.getItemDefinitionByName("test95").unitTypePlural);
        //for(int i = 0; i<95; i++)
        //    System.out.println(ItemDefinition.getItemDefinitionByID(i).name);
        
    }
    
}

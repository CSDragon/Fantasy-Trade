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
public class Inventory 
{
    //NEEDS WORK: Better sorting list//
    private ArrayList<Goods> goods;
    
    /**
     * Finds a good in the inventory by name
     * NEEDS WORK: This is horribly inefficient, but in theory there should be no more than 20 goods so the O(n^x) is not that bad
     * @param name The name of the good
     * @return The good, or null if the good is not there
     */
    public Goods getGoodByName(String name)
    {
        for(int i = 0; i<goods.size(); i++)
        {
            if(goods.get(i).getName().equals(name))
            {
                return goods.get(i);
            }
        }
        return null;
    }
}

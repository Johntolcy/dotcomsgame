/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package game;

import java.util.*;

/**
 *
 * @author Administrator
 */
public class DotCom {

    private ArrayList<String> locationsCells;
    private String name;

    public void setName(String n) {
        name = n;
    }

    public void setLocationCells(ArrayList<String> loc) {
        locationsCells = loc;
    }

    public String checkYourself(String userInput) {
        String result = "miss";
        int index = locationsCells.indexOf(userInput);
        if (index >= 0) {
            locationsCells.remove(index);
            if (locationsCells.isEmpty()) {
                result = "kill";
                System.out.println("Ouch!You sunk" + name + '.');
            } else {
                result = "hit";
            }
        }
        return result;
    }
}

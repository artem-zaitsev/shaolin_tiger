/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.retam.shaolintiger.Exercises;

import com.retam.shaolintiger.IExercises.IExercises;

/**
 *
 * @author key
 */
public class Fobao implements IExercises{
    private double count; // количество
    private int result;
    
    public Fobao() {
        // some code
    }
    
    @Override
    public void setCount(double n){
        count = n;
    }   
      
    @Override
    public int getResult(){
        if(result == 0) {
            result = reckonResult();
        }
        if(result > 10) result = 10;
        return result;
    }
    
    //reckon
    private int reckonResult() {
        if (count <= 12) {
            result = (int)((count - 1) / 2.3 + 1);
        } else if (count > 12) {
            result = (int)((count - 1) / 2.3);
        }

        if (count < 1) {
            result = 0;
        } else if (count == 1) {
            result = 1;
        } else if (count > 23) {
            result = 10;
        }
        return result; // working?
    }
}

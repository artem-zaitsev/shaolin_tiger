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
 * Скакалка
 */
public class Rope implements IExercises{
    private double count; // количество
    private int result;
    
    public Rope() {
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
        result = (int) ((count - 1) / 10);
        if (count >= 100) {
            result = 10;
        } else if (count <= 10) {
            result = 0;
        }
        return result; // working?
    }
}

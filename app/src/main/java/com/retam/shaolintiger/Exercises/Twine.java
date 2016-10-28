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
 * Шпагат
 */
public class Twine implements IExercises{
    private double count; // количество
    private int result;
    
    public Twine() {
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
        if ((count!=5)&&(count!=20)) {
		result = (int) (count/3);
	} else {
		result = (int) ((count+1)/3);
		}
        return result; // working?
    }
}

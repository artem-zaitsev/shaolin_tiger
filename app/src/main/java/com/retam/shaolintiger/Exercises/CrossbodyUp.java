/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.retam.shaolintiger.Exercises;

import com.retam.shaolintiger.IExercises.IExercises;
import com.retam.shaolintiger.persons.Pupil;

/**
 *
 * @author key
 * верхний пресс
 */
public class CrossbodyUp implements IExercises {

    private double count; // количество
    private int result = 0;
    private Pupil pup;

    public CrossbodyUp(Pupil p) {
        // some code
        pup = p;
    }

    @Override
    public void setCount(double n) {
        count = n;
    }

    @Override
    public int getResult() {
        if(result == 0) {
            result = reckonResult();
        }
        if(result > 10) result = 10;
        return result;
    }

    /**
     *@return
     */
    public int reckonResult() {
        // some code of reckon
        // maybe take from c++ project
        switch (pup.getCategory()) {
            case EXTRA_KIDS: {

            }
            case KIDS: {
                for (int i = 12; i <= 29; i++) {
                    if (count < 12) {
                        result = 0;
                        break;
                    }

                    if (count > 29) {
                        result = 10;
                        break;
                    }
                    if (i % 2 == 0) {
                        result++;
                    }
                    if (count == i) {
                        break;
                    }
                }
                break;
            }
            case EXTRA_YOUNG: {

            }
            case YOUNG: {
            }
            case JUNIOR: {
                for (int i = 15; i <= 32; i++) {
                    if (count < 15) {
                        result = 0;
                        break;
                    }

                    if (count > 32) {
                        result = 10;
                        break;
                    }
                    if ((i % 2) != 0) {
                        result++;
                    }
                    if (count == i) {
                        break;
                    }
                }
                break;
            }
            case TEEN: {

            }
            case ADULT: {
                for (int i = 17; i < 34; i++) {
                    if (count < 17) {
                        result = 0;
                        break;
                    }

                    if (count > 34) {
                        result = 10;
                        break;
                    }
                    if ((i % 2)!=0) {
                        result++;
                    }
                    if (count == i) {
                        break;
                    }
                }
                break;
            }
            default: break; // write display a message!
        }
        return result; // working?
    }
}

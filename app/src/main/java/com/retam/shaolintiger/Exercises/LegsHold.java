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
 * @author key Удержание ног а весу
 */
public class LegsHold implements IExercises {

    private double count; // количество
    private int result = 0;
    private Pupil pup;

    public LegsHold(Pupil p) {
        // some code
        pup = p;
    }

    @Override
    public void setCount(double n) {
        count = n;
    }

    @Override
    public int getResult() {
        result = reckonResult();
        if(result > 10) result = 10;
        return result;
    }

    /**
     *
     * @return
     */
    public int reckonResult() {
        // some code of reckon
        // maybe take from c++ project
        if (result == 0) {
            switch (pup.getCategory()) {
                case EXTRA_KIDS: {

                }
                case KIDS: {
                }
                case EXTRA_YOUNG: {

                }
                case YOUNG: {
                }
                case JUNIOR: {

                }
                case TEEN: {

                }
                case ADULT: {
                    for (int i = 30; i < 120; i++) {
                        if (count <= 30) {
                            result = 0;
                            break;
                        }
                        if (count > 120) {
                            result = 10;
                            break;
                        }
                        if ((i % 10) == 1) {
                            result++;
                        }
                        if (count == i) {
                            break;
                        }
                    }
                    break;
                }
                default: // write display a message!
            }
        }
        return result;
    }
}

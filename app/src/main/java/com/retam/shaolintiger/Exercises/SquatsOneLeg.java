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
 * @author key приседания на 1 ноге
 */
public class SquatsOneLeg implements IExercises {

    private double count; // количество
    private int result = 0;
    private Pupil pup;

    public SquatsOneLeg(Pupil p) {
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
     *
     * @param pup
     * @return
     */
    public int reckonResult() {
        // some code of reckon
        // maybe take from c++ project
        switch (pup.getCategory()) {
            case EXTRA_KIDS: {
                for (int i = 1; i <= 10; i++) {
                    if (count < 1) {
                        result = 0;
                        break;
                    }
                    if (count == 1) {
                        result = 2;
                    }
                    result++;

                    if (i == 4) {
                        result = 4;
                    }

                    if (count == i) {
                        break;
                    }

                }
                break;
            }
            case KIDS: {
                for (int i = 1; i <= 12; i++) {
                    if (count < 1) {
                        result = 0;
                        break;
                    }
                    if (count == 1) {
                        result = 1;
                        break;
                    }
                    result++;

                    if (i == 6) {         // delay at 1
                        result = 5;
                    }

                    if (i == 10) {        // delay at 1
                        result = 9;
                    }

                    if (count == i) {
                        break;
                    }

                }
                break;
            }
            case EXTRA_YOUNG: {
                for (int i = 1; i <= 14; i++) {
                    if (count < 1) {
                        result = 0;
                        break;
                    }
                    if (count == 1) {
                        result = 1;
                    }
                    result++;

                    if (i == 3) {         // delay at 1
                        result = 2;
                    }

                    if (i == 6) {         // delay at 1
                        result = 4;
                    }

                    if (i == 9) {        // delay at 1
                        result = 6;
                    }

                    if (i == 12) {        // delay at 1
                        result = 8;
                    }

                    if (count == i) {
                        break;
                    }

                }
                break;
            }
            case YOUNG: {

            }
            case JUNIOR: {

            }
            case TEEN: {

            }
            case ADULT: {
                for (int i = 3; i <= 30; i++) {
                    if (count < 3) {
                        result = 0;
                        break;
                    }
                    if (count == 4) {
                        result = 1;
                    }

                    if (i % 3 == 0) {
                        result++;
                    }
                    if (count == 27) {
                        result = 9;
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

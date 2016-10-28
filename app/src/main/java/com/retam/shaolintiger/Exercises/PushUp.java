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
 * @author key Отжимания
 */
public class PushUp implements IExercises {

    private double count; // количество
    private int result = 0;
    private Pupil pup;

    public PushUp(Pupil p) {
        // some code
        pup = p;
    }

    @Override
    public void setCount(double n) {
        count = n;
    }

    @Override
    public int getResult() {
        if (result == 0) {
            result = reckonResult();
        }
        if (result > 10) {
            result = 10;
        }
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

            }
            case KIDS: {
            }
            case EXTRA_YOUNG: {
                if (pup.getSex() == 'm' || pup.getSex() == 'M'
                        || pup.getSex() == 'м' || pup.getSex() == 'М') {
                    for (int i = 5; i < 50; i++) {
                        if (count < 5) {
                            result = 0;
                            break;
                        }
                        if ((i % 5) == 0) {
                            result++;
                        }
                        if (count == i) {
                            break;
                        }

                    }
                } else {
                    for (int i = 4; i <= 40; i++) {
                        if (count < 4) {
                            result = 0;
                            break;
                        }
                        if ((i % 4) == 0) {
                            result++;
                        }
                        if (count == i) {
                            break;
                        }

                    }
                }
                break;
            }
            case YOUNG: {

            }
            case JUNIOR: {

                if (pup.getSex() == 'm' || pup.getSex() == 'M'
                        || pup.getSex() == 'м' || pup.getSex() == 'М') {
                    for (int i = 8; i < 40; i++) {
                        if (count < 8) {
                            result = 0;
                            break;
                        }
                        if (i % 4 != 0) {
                            result++;
                        }
                        if (count == i) {
                            break;
                        }

                    }
                } else {
                    for (int i = 3; i <= 30; i++) {
                        if (count < 4) {
                            result = 0;
                            break;
                        }
                        if (count >= 4 && count <= 6) {
                            result = 1;
                            break;
                        }
                        if (count >= 7 && count <= 8) {
                            result = 2;
                            break;
                        }
                        if (i % 3 == 0) {
                            result++;
                        }
                        if (count == 8) {
                            result = 3;
                        }
                        if (count == i) {
                            break;
                        }

                    }
                    break;
                }
            }
            case TEEN: {

            }
            case ADULT: {
                if (pup.getSex() == 'm' || pup.getSex() == 'M'
                        || pup.getSex() == 'м' || pup.getSex() == 'М') {
                    for (int i = 5; i < 44; i++) {
                        if (count < 5) {
                            result = 0;
                            break;
                        }
                        if ((i % 5) == 0) {
                            result++;
                        }
                        if (count >= 35 && (i % 3 == 0) && (i >= 37)) {
                            //i = 36;
                            result++;
                        }
                        if (count == i) {
                            break;
                        }

                    }
                } else {
                    for (int i = 4; i < 34; i++) {
                        if (count < 4) {
                            result = 0;
                            break;
                        }
                        if (i % 3 != 0) {
                            result++;
                        }
                        if (count == 6) {
                            result = 1;
                        }
                        if (count == i) {
                            break;
                        }
                    }
                }
                break;
            }
            default:
                break; // write display a message!
        }
        return result; // working?
    }
}

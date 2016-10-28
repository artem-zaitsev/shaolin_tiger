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
 * @author key вис
 */
public class Hanging implements IExercises {

    private double count; // количество
    private int result;
    private Pupil pup;

    public Hanging(Pupil p) {
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

    //reckon
    public int reckonResult() {
        switch (pup.getCategory()) {
            case EXTRA_KIDS:
            case KIDS: {
                result = (int) (count / 2);
                if (count > 19) {
                    result = 10;
                } else if (count < 2) {
                    result = 0;
                }
                break;
            }
            case EXTRA_YOUNG: {
                if (pup.getSex() == 'm' || pup.getSex() == 'M'
                        || pup.getSex() == 'м' || pup.getSex() == 'М'){
                    result = (int) (count / 4);
                    if (count > 39) {
                        result = 10;
                    } else if (count < 4) {
                        result = 0;
                    }
                } else // female
                {
                    result = (int) (count / 3);
                    if (count > 30) {
                        result = 10;
                    } else if (count < 4) {
                        result = 0;
                    }
                }
                break;
            }
            case YOUNG: {
                if (pup.getSex() == 'm' || pup.getSex() == 'M'
                        || pup.getSex() == 'м' || pup.getSex() == 'М') {
                    result = (int) (count / 5);
                    if (count > 49) {
                        result = 10;
                    } else if (count < 5) {
                        result = 0;
                    }
                } else {
                    result = (int) (count / 4);
                    if (count > 30) {
                        result = 10;
                    } else if (count < 5) {
                        result = 0;
                    }
                }
                break;
            }
            case JUNIOR: {
                if (pup.getSex() == 'm' || pup.getSex() == 'M'
                        || pup.getSex() == 'м' || pup.getSex() == 'М') {
                    result = (int) (count / 5);
                    if (count > 49) {
                        result = 10;
                    } else if (count < 5) {
                        result = 0;
                    }
                } else {
                    result = (int) (count / 4);
                    if (count > 30) {
                        result = 10;
                    } else if (count < 5) {
                        result = 0;
                    }
                }
                break;
            }
            case TEEN: {
                if (pup.getSex() == 'm' || pup.getSex() == 'M'
                        || pup.getSex() == 'м' || pup.getSex() == 'М') {
                    result = (int) (count / 5);
                    if (count > 49) {
                        result = 10;
                    } else if (count < 5) {
                        result = 0;
                    }
                } else {
                    result = (int) (count / 4);
                    if (count > 30) {
                        result = 10;
                    } else if (count < 5) {
                        result = 0;
                    }
                }
                break;
            }
            case ADULT: {
                if (pup.getSex() == 'm' || pup.getSex() == 'M'
                        || pup.getSex() == 'м' || pup.getSex() == 'М') {
                    result = (int) (count / 5);
                    if (count > 49) {
                        result = 10;
                    } else if (count < 5) {
                        result = 0;
                    }
                } else {
                    result = (int) (count / 4);
                    if (count > 30) {
                        result = 10;
                    } else if (count < 5) {
                        result = 0;
                    }
                }
                break;
            }
            default:
                break; // write some default
        }
        return result; // working?
    }

}

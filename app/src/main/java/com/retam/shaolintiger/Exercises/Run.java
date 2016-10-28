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
 * @author key Бег челночный
 */
public class Run implements IExercises {

    private double count; // количество
    private double result;
    private Pupil pup;

    public Run(Pupil p) {
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
        return (int) result;
    }

    //reckon
    public int reckonResult() {
        switch (pup.getCategory()) {
            case EXTRA_KIDS: {

            }
            case KIDS: {
                result = (14.29 - count) / 0.39 + 2;
                if (count > 14.5) {
                    result = 0;
                }
                if (count <= 14.5 && count >= 14.3) {
                    result = 1;
                }
                if (count < 11.1) {
                    result = 10;
                }
                break;
            }
            case EXTRA_YOUNG: {
                if (pup.getSex() == 'm' || pup.getSex() == 'M'
                        || pup.getSex() == 'м' || pup.getSex() == 'М'){
                    result = (13.79 - count) / 0.39 + 2;
                    if (count > 14.1) {
                        result = 0;
                    }
                    if (count <= 14.1 && count >= 13.8) {
                        result = 1;
                    }
                    if (count < 10.6) {
                        result = 10;
                    }
                } else // female
                {
                    result = (14.79 - count) / 0.39 + 2;
                    if (count > 15.1) {
                        result = 0;
                    }
                    if (count <= 15.1 && count >= 14.8) {
                        result = 1;
                    }
                    if (count < 11.6) {
                        result = 10;
                    }
                }
                break;
            }
            case YOUNG: {
                if (pup.getSex() == 'm' || pup.getSex() == 'M'
                        || pup.getSex() == 'м' || pup.getSex() == 'М') {
                    result = (24.09 - count) / 0.49 + 2;
                    if (count > 24.5) {
                        result = 0;
                    }
                    if (count <= 24.5 && count >= 24.1) {
                        result = 1;
                    }
                    if (count < 20.1) {
                        result = 10;
                    }
                } else {
                    result = (26.09 - count) / 0.49 + 2;
                    if (count > 26.6) {
                        result = 0;
                    }
                    if (count <= 26.6 && count >= 26.1) {
                        result = 1;
                    }
                    if (count < 22) {
                        result = 10;
                    }
                }
                break;
            }
            case JUNIOR: {
                if (pup.getSex() == 'm' || pup.getSex() == 'M'
                        || pup.getSex() == 'м' || pup.getSex() == 'М') {
                    result = (24.09 - count) / 0.49 + 2;
                    if (count > 24.5) {
                        result = 0;
                    }
                    if (count <= 24.5 && count >= 24.1) {
                        result = 1;
                    }
                    if (count < 20.1) {
                        result = 10;
                    }
                } else {
                    result = (26.09 - count) / 0.49 + 2;
                    if (count > 26.6) {
                        result = 0;
                    }
                    if (count <= 26.6 && count >= 26.1) {
                        result = 1;
                    }
                    if (count < 22) {
                        result = 10;
                    }
                }
                break;
            }
            case TEEN: {
                if (pup.getSex() == 'm' || pup.getSex() == 'M'
                        || pup.getSex() == 'м' || pup.getSex() == 'М') {
                    result = (24.09 - count) / 0.49 + 2;
                    if (count > 24.5) {
                        result = 0;
                    }
                    if (count <= 24.5 && count >= 24.1) {
                        result = 1;
                    }
                    if (count < 20.1) {
                        result = 10;
                    }

                } else {
                    result = (26.09 - count) / 0.49 + 2;
                    if (count > 26.6) {
                        result = 0;
                    }
                    if (count <= 26.6 && count >= 26.1) {
                        result = 1;
                    }
                    if (count < 22) {
                        result = 10;
                    }
                }
                break;
            }
            case ADULT: {
                if (pup.getSex() == 'm' || pup.getSex() == 'M'
                        || pup.getSex() == 'м' || pup.getSex() == 'М') {
                    result = (24.09 - count) / 0.49 + 2;
                    if (count > 24.5) {
                        result = 0;
                    }
                    if (count <= 24.5 && count >= 24.1) {
                        result = 1;
                    }
                    if (count < 20.1) {
                        result = 10;
                    }

                } else {
                    result = (26.09 - count) / 0.49 + 2;
                    if (count > 26.6) {
                        result = 0;
                    }
                    if (count <= 26.6 && count >= 26.1) {
                        result = 1;
                    }
                    if (count < 22) {
                        result = 10;
                    }
                }
                break;
            }
            default: // write some default
        }
        return (int) result; // working?
    }
}

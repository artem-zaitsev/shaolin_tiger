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
 */
public class Squats implements IExercises {

    private double count; // количество
    private int result = 0;
    private Pupil pup;

    public Squats(Pupil p) {
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
                for (int i = 20; i <= 38; i++) {
                    if (count < 20) {
                        result = 0;
                        break;
                    }
                    if (count > 37) {
                        result = 10;
                        break;
                    }
                    if ((i % 2) == 0) {
                        result++;
                    }
                    if (count == i) {
                        break;
                    }
                }
                break;
            }
            case EXTRA_YOUNG: {
                if (count < 14) {
                    result = 0;
                }
                if (count >= 14 && count <= 28) {
                    int c = 3; // счетчик
                    for (int i = 14; i <= 28; i++) {
                        if (c == 3) { // на каждый третий повышаем result на ед.
                            result++;
                            c = 0;
                        }
                        if (i == count) {
                            break;
                        }
                        c++;
                    }
                    //result = (int) ((count - 14 + 1) / 3);
                } else if (count > 28) {
                    result = (int) ((count - 29) / 2 + 6);
                }

                if (count > 35) {
                    result = 10;
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
                if (count < 11) {
                    result = 0;
                }
                if (count >= 11 && count <= 13) {
                    result = 1;
                }
                if (count >= 14 && count <= 18) {
                    result = 2;
                }
                if (count >= 19 && count <= 27) {
                    result = 2;
                    int c = 4; // счетчик
                    for (int i = 19; i <= 27; i++) { // 27 , чтоб сошлось с таблицей, успел бы добить до значения
                        if (c == 4) { // на каждый третий повышаем result на ед.
                            result++;
                            c = 0;
                        }
                        if (i == count) {
                            break;
                        }
                        c++;
                    }
                    if (count == 26) result = 5;
                    //result = (int) ((count - 14 + 1) / 3);
                }
                if (count == 28) {
                    result = 6;
                }
                //result = (int) ((count - 11) / 3);
                if (count >= 29) {
                    result = (int) (count - 23);
                }

                if (count > 32) {
                    result = 10;
                }
                break;
            }
            default:
                break; // write display a message!
        }
        return result; // working?
    }

}

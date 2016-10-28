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

//Подтягивания
public class Pulls implements IExercises {

    private double count; // количество
    private int result;
    private Pupil pup;

    public Pulls(Pupil p) {
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
                result = (int) (count * 2);
                if (count > 4) {
                    result = 10;
                }
                break;
            }
            case KIDS: {
                result = (int) (count + 2);
                if (count <= 2) {
                    result = (int) (count * 2);
                }
                if (count > 7) {
                    result = 10;
                }
                break;
            }
            case EXTRA_YOUNG: {
                if (pup.getSex() == 'm' || pup.getSex() == 'M'
                        || pup.getSex() == 'м' || pup.getSex() == 'М') {
                    result = (int) (count + 1);
                    if (count < 1) {
                        result = 0;
                    }

                    if (count > 8) {
                        result = 10;
                    }
                } else // female
                {
                    result = (int) (count + 3);
                    if (count < 1) {
                        result = 0;
                    }
                    if (count <= 2 && count >= 1) {
                        result = (int) (count + 1);
                    }
                    if (count == 3) {
                        result = 5;
                    }

                    if (count > 6) {
                        result = 10;
                    }
                }
                break;
            }
            case YOUNG: {
                if (pup.getSex() == 'm' || pup.getSex() == 'M'
                        || pup.getSex() == 'м' || pup.getSex() == 'М') {
                    for (int i = 1; i <= 12; i++) {
                        if (count < 1) {
                            result = 0;
                            break;
                        }
                        if (count == 1) {
                            result = 1;
                        }
                        result++;

                        if (i == 4) {         // delay at 1
                            result = 3;
                        }

                        if (i == 6) {         // delay at 1
                            result = 4;
                        }

                        if (count == i) {
                            break;
                        }

                    }

                } else {
                    result = (int) (count + 3);
                    if (count < 1) {
                        result = 0;
                    }
                    if (count <= 2 && count >= 1) {
                        result = (int) (count + 1);
                    }
                    if (count == 3) {
                        result = 5;
                    }

                    if (count > 6) {
                        result = 10;
                    }
                }
                break;
            }
            case JUNIOR: {
                if (pup.getSex() == 'm' || pup.getSex() == 'M'
                        || pup.getSex() == 'м' || pup.getSex() == 'М') {
                    for (int i = 2; i <= 14; i++) {
                        if (count < 2) {
                            result = 0;
                            break;
                        }

                        result++;

                        if (count == 2) {
                            result = 1;
                        }

                        if (i == 5) {         // delay at 1
                            result = 3;
                        }

                        if (i == 8) {         // delay at 1
                            result = 5;
                        }

                        if (i == 10) {         // delay at 1
                            result = 6;
                        }

                        if (count == i) {
                            break;
                        }

                    }

                } else {
                    result = (int) (count + 2);
                    if (count < 1) {
                        result = 0;
                    }
                    if (count <= 2 && count >= 1) {
                        result = (int) (count + 1);
                    }
                    if (count == 3) {
                        result = 5;
                    }

                    if (count > 7) {
                        result = 10;
                    }

                }
                break;
            }
            case TEEN: {
                if (pup.getSex() == 'm' || pup.getSex() == 'M'
                        || pup.getSex() == 'м' || pup.getSex() == 'М') {
                    for (int i = 2; i <= 16; i++) {
                        if (count < 2) {
                            result = 0;
                            break;
                        }

                        if (count == 2) {
                            result = 1;
                        }

                        if (i == 3) {         // delay at 1
                            result = 2;
                        }

                        if (i == 7) {         // delay at 1
                            result = 4;
                        }

                        if (i == 10) {         // delay at 1
                            result = 6;
                        }

                        if (i == 12) {         // delay at 1
                            result = 7;
                        }

                        if (count == i) {
                            break;
                        }
                        
                        result++;
                    }
                } else {
                    result = (int) (count + 2);
                    if (count < 1) {
                        result = 0;
                    }
                    if (count <= 2 && count >= 1) {
                        result = (int) (count + 1);
                    }
                    if (count == 3) {
                        result = 5;
                    }

                    if (count > 7) {
                        result = 10;
                    }

                }
                break;
            }
            case ADULT: {
                if (pup.getSex() == 'm' || pup.getSex() == 'M'
                        || pup.getSex() == 'м' || pup.getSex() == 'М') {
                    for (int i = 2; i <= 15; i++) {
                        if (count < 2) {
                            result = 0;
                            break;
                        }

                        if (count > 17) {
                            result = 10;
                            break;
                        }

                        result++;

                        if (count == 2) {
                            result = 1;
                        }

                        if (i == 6) {         // delay at 1
                            result = 4;
                        }

                        if (i == 8) {         // delay at 1
                            result = 5;
                        }

                        if (i == 10) {         // delay at 1
                            result = 6;
                        }

                        if (i == 12) {         // delay at 1
                            result = 7;
                        }

                        if (i == 14) {         // delay at 1
                            result = 8;
                        }

                        if (count == i) {
                            break;
                        }

                    }

                } else {
                    result = (int) (count + 2);
                    if (count < 1) {
                        result = 0;
                    }
                    if (count <= 2 && count >= 1) {
                        result = (int) (count + 1);
                    }
                    if (count == 3) {
                        result = 5;
                    }

                    if (count > 7) {
                        result = 10;
                    }

                }
                break;
            }
            default: break;  // write display a message!
        }
        return result; // working?
    }

}

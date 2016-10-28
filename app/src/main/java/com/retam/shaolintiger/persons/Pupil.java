/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.retam.shaolintiger.persons;

import com.retam.shaolintiger.IExercises.IExercises;
import java.util.ArrayList;
import com.retam.shaolintiger.Category.Category;
import com.retam.shaolintiger.Exercises.*;
import java.util.Iterator;

/**
 *
 * @author key
 */
public class Pupil {

    private String name;
    private int birth_year;
    private Category ctg; // year category (see at Category package)
    private char sex; // m or f;
    private int result;
    private int[] res = new int[13] ;
    private ArrayList counts; // 13 values of events
    private String trName;
    private IExercises exs;
    private double weight;
    private double height;
    private final int THIS_YEAR = 2016;

    public Pupil(String n, int year, char s, String tr) {
        name = n; 
        birth_year = year;
        sex = s;
        trName = tr;
        
        // initialize ArrayList
        counts = new ArrayList(13);// see!
        counts.add(new Pulls(this));
        counts.add(new Hanging(this));
        counts.add(new Hanging(this));
        counts.add(new Run(this));
        counts.add(new Rope());
        counts.add(new Twine());
        counts.add(new Fobao());
        counts.add(new CrossbodyUp(this));
        counts.add(new LegsHold(this));
        counts.add(new PushUp(this));
        counts.add(new Squats(this));
        counts.add(new SquatsOneLeg(this));
        counts.add(new SquatsOneLeg(this));
        //end of initialization

        calcCategory();
        
    }

    public String getName() {
        return name;
    }

    public int getYear() {
        return birth_year;
    }

    public int getResult() {
        return result;
    }
    
    //get trainer
    public String getTrainerName() {
        return trName;
    }
    // get results from array
    public int getEvenRes(int k) { 
        return res[k];
    }
     
    // get counts of even exercise ( now get result like getEvenRes)
    // but works not right!!!
    public String getCounts() {
        String results = new String();
        for(Iterator i = counts.iterator(); i.hasNext();) {
            exs = (IExercises) i.next();
            //System.out.print(exs.getResult() + " ");
            results=results.concat(exs.getResult() + " ");
        }
        return results;
    } 

    public Category getCategory() {
        return ctg;
    }

    public char getSex() {
        return sex;
    }
    
    // Get Information about Pupil
    public String getInformation(){
      return "\n Name: " + this.name +
              "\n Year: " + this.birth_year +
              "\n Sex: " + this.sex +
              "\n Trainer: " + this.trName +
              "\n Result: " + this.result;
    }

    public void setName(String n) {
        name = n;
    }

    public void setBirthYear(int year) {
        birth_year = year;
        calcCategory();
    }
    
    public void setSex(char s) {
        sex = s;
    }
    
    public void setTrainer(String tr) {
        trName = tr;
    }

    public void setResult(ArrayList r) {
        // setting results from ArrayList
        Iterator i = r.iterator();
        for (Iterator it = counts.iterator(); it.hasNext();) {
            exs = (IExercises) it.next();
            exs.setCount((Double) i.next());
        } 
    }
    public void reckonResults() {
        // write some code...
        // calculate, reckon results of every exercises 
        int i = 0;
        for (Iterator it = counts.iterator(); it.hasNext();) {
            exs = (IExercises) it.next();
            res[i++] = exs.getResult();           
        }
        for(int x:res) {
            result+=x;
        }
    }
    
    private void calcCategory() {
        switch (THIS_YEAR - birth_year) {
            case 3:
            case 4:
            case 5:
            case 6: {
                ctg = Category.EXTRA_KIDS;
                break;
            }
            case 7:
            case 8: {
                ctg = Category.KIDS;
                break;
            }
            case 9:
            case 10: {
                ctg = Category.EXTRA_YOUNG;
                break;
            }
            case 11:
            case 12: {
                ctg = Category.YOUNG;
                break;
            }
            case 13:
            case 14: {
                ctg = Category.JUNIOR;
                break;
            }
            case 15:
            case 16: {
                ctg = Category.TEEN;
                break;
            }
            case 17:
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 24:
            case 25:
            default: {
                ctg = Category.ADULT;
                break;
            }
        }
    }
}

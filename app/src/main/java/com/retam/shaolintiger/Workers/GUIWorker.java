/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.retam.shaolintiger.Workers;

import static com.retam.shaolintiger.Helpers.StringTo.StringToDouble;
import java.util.ArrayList;
import java.util.Iterator;

import com.retam.shaolintiger.MainActivity;
import android.support.*;
import android.widget.EditText;

import com.retam.shaolintiger.R;
import com.retam.shaolintiger.persons.Pupil;

/**
 *
 * @author key
 */
public class GUIWorker {
    private Pupil pup;
    private final MainActivity app;
    
    public GUIWorker(MainActivity a) {
        app = a;
    }
    public void setPupil(Pupil p) {
        pup = p;
    }

    public ArrayList<Double> setCounts(ArrayList<String> l) {
        ArrayList<Double> r = new ArrayList<>(13);
        for(Iterator i = l.iterator();i.hasNext();) {
            r.add(Double.parseDouble((String)i.next()));
        }
        return r;
    }
    
}

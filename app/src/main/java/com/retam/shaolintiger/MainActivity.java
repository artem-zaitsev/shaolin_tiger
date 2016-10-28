package com.retam.shaolintiger;

import android.content.Intent;
import android.os.Bundle;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.retam.shaolintiger.Helpers.StringTo;
import com.retam.shaolintiger.Workers.GUIWorker;
import com.retam.shaolintiger.persons.Pupil;

import java.util.ArrayList;
import java.util.Iterator;

public class MainActivity extends AppCompatActivity implements
        SwipeFragment.OnPageChangeListener {


    private static final int NUM_PAGES = 14;
    private ViewPager mPager;
    private PagerAdapter mPagerAdapter;
    private ArrayList<String> inputs;
    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pager_layout);

        intent = getIntent();
        inputs = new ArrayList<>(13);
        mPager = (ViewPager) findViewById(R.id.pager);
        mPagerAdapter = new SwipePagerAdapter(getSupportFragmentManager());
        mPager.setAdapter(mPagerAdapter);
        mPager.addOnPageChangeListener(new ViewPager.SimpleOnPageChangeListener() {
            @Override
            public void onPageSelected(int position) {
                int pos = position; // local variable for position
                if (position == 0) pos = 1;
                if (inputs.size() <= (pos - 1)) {
                    inputs.add(pos - 1, ((SwipePagerAdapter) mPagerAdapter).getCurItem(pos - 1).getInput());

                } else {
                    inputs.set(pos - 1, ((SwipePagerAdapter) mPagerAdapter).getCurItem(pos - 1).getInput());
                }
                /*Toast.makeText(getApplicationContext(),"Page: " + (pos-1) + " Value: " +
                        ((SwipePagerAdapter)mPagerAdapter).getCurItem(pos-1).getInput(),Toast.LENGTH_SHORT).show();
                        */
            }
        });

    }

    @Override
    public void onPageChange(SwipeFragment sf, int page) {
        inputs.add(page, sf.getInput());
        //Toast.makeText(getApplicationContext(),"Value: " + sf.getInput(),
        //          Toast.LENGTH_SHORT).show();
    }

    //OnClick Event for reckBtn
    public void giveResult(View view) {
        GUIWorker gw = new GUIWorker(this);
        if (!isNullFields() && !inputs.isEmpty()) {
            Pupil pup = new Pupil(intent.getStringExtra("name"), Integer.parseInt(intent.getStringExtra("year")),
                    intent.getStringExtra("sex").charAt(0), intent.getStringExtra("coach"));
            pup.setResult(gw.setCounts(inputs));
            pup.reckonResults();
            TextView tv = (TextView) findViewById(R.id.textRes);
            tv.setText("Результат: " + pup.getResult());
            TextView info = (TextView) findViewById(R.id.resultInfoTextView);
            info.setText("Ученик(ца) " + pup.getName() + ", год рождения " + pup.getYear() +
                    ", тренер " + pup.getTrainerName() + ".");

            Button return_btn = (Button) findViewById(R.id.returnButton);
            return_btn.setVisibility(View.VISIBLE);

            Button reck_btn = (Button) findViewById(R.id.reckBtn);
            reck_btn.setEnabled(false);

        } else {
            //nothing
            Toast t = Toast.makeText(this.getApplicationContext(),
                    "Ошибка! Не все поля заполнены, проверьте.",
                    Toast.LENGTH_SHORT);
            t.show();
        }
    }

    public void returnToLaunchActivity(View view) {
        finish();
    }

    public boolean isNullFields() {
        int c = 0;

        //ed = (EditText)findViewById(R.id.editExc);
        for (Iterator i = inputs.iterator(); i.hasNext(); ) {
            c = (i.next().toString().equals("null")) ? c + 1 : c;
        }


        return (c > 0);
    }

    public void setInputs(String inp) {
        inputs.add(inp);
    }


    @Override
    public void onBackPressed() {
        if (mPager.getCurrentItem() == 0) {
            // If the user is currently looking at the first step, allow the system to handle the
            // Back button. This calls finish() on this activity and pops the back stack.
            super.onBackPressed();
        } else {
            // Otherwise, select the previous step.
            mPager.setCurrentItem(mPager.getCurrentItem() - 1);
        }
    }

    private class SwipePagerAdapter extends FragmentStatePagerAdapter {
        private ArrayList<SwipeFragment> swipeFragments = new ArrayList<>(13);

        public SwipePagerAdapter(FragmentManager fm) {
            super(fm);
        }

        @Override
        public Fragment getItem(int position) {
            SwipeFragment sf = SwipeFragment.create(position);
            //pos = position;
            if (swipeFragments.size() <= position) {
                swipeFragments.add(position, sf);
                return sf;
            } else {
                return swipeFragments.get(position);
            }
        }

        public SwipeFragment getCurItem(int pos) {
            return swipeFragments.get(pos);
        }

        @Override
        public int getCount() {
            return NUM_PAGES;
        }
    }
}

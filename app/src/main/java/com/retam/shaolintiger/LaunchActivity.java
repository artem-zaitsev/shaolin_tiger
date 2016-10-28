package com.retam.shaolintiger;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

import java.util.ArrayList;

public class LaunchActivity extends AppCompatActivity {

    public static ArrayList<String> KEYS = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        KEYS.add("name");
        KEYS.add("year");
        KEYS.add("coach");
        KEYS.add("sex");
    }

    public void confirmButtonOnClick(View view) {
        int[] ids = {R.id.nameEditText,
                R.id.yearEditText,
                R.id.trainerEditText};
        boolean isNull = true;
        EditText editText;
        Switch sex_switch = (Switch) findViewById(R.id.sexSwitch);
        Intent intent = new Intent(this, MainActivity.class);
        for (int i = 0; i < ids.length; i++) {
            editText = (EditText) findViewById(ids[i]);
            String s = editText.getText().toString();
            if (s.equals("") || s.length() == 0) {
                isNull = true;
                Toast.makeText(this, "Заполните все поля!", Toast.LENGTH_SHORT).show();
                return;
            } else {
                isNull = false;
                intent.putExtra(KEYS.get(i), s);
            }
        }
        if (sex_switch.isChecked()) {
            intent.putExtra(KEYS.get(3), sex_switch.getTextOn().toString());
        } else intent.putExtra(KEYS.get(3), sex_switch.getTextOff().toString());
        if (!isNull) startActivity(intent);

    }
}

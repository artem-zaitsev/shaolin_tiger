package com.retam.shaolintiger;


import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;


public class SwipeFragment extends Fragment {

    public static final String ARG_PAGE = "page", ARG_INPUT = "input";
    private int page_numb;
    private int id;
    private final int[] text = {R.string.pulls,
            R.string.hanging,
            R.string.hanging,
            R.string.run,
            R.string.rope,
            R.string.twine,
            R.string.fobao,
            R.string.csbody,
            R.string.legs_hold,
            R.string.push_ups,
            R.string.squats,
            R.string.sq_one,
            R.string.sq_one,
            R.string.res};
    private final int[] image_ids = {R.drawable.pull_up,
            R.drawable.hang_left,
            R.drawable.hang_right,
            R.drawable.run,
            R.drawable.rope,
            R.drawable.stretch,
            R.drawable.fobao,
            R.drawable.crossbody,
            R.drawable.leg_raises,
            R.drawable.push_ups,
            R.drawable.air_squat,
            R.drawable.pistol_squat,
            R.drawable.pistol_squat};
    private EditText editText;


    //A constructor for SwipeFragment
    public static SwipeFragment create(int pageNumb) {
        SwipeFragment f = new SwipeFragment();
        Bundle args = new Bundle();
        args.putInt(SwipeFragment.ARG_PAGE, pageNumb);
        f.setArguments(args);
        return f;
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        page_numb = getArguments().getInt(ARG_PAGE);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        ViewGroup rootView = (ViewGroup) inflater.inflate(
                R.layout.fragment_swipe, container, false);

        if (page_numb < 13) {
            ImageView imageView = (ImageView) rootView.findViewById(R.id.imageView);
            imageView.setImageResource(image_ids[page_numb]);
        }

        editText = (EditText) rootView.findViewById(R.id.editExc);

        TextView tv = (TextView) rootView.findViewById(R.id.name_exc);
        tv.setText(text[page_numb]);

        if (page_numb == 13) {
            rootView = (ViewGroup) inflater.inflate(
                    R.layout.result_layout, container, false);
        }

        return rootView;
    }

    public String getInput() {
        String s;
        s = (editText.getText().toString().length() != 0 ||
                !editText.getText().toString().equals("")) ?
                editText.getText().toString() : "null";
        return s;
    }


}

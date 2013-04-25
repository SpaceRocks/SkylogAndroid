package com.bunnyfish.skylog.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.bunnyfish.skylog.R;

public class DummySectionFragment extends Fragment{
    /**
     * The fragment argument representing the section number for this
     * fragment.
     */
    public static final String ARG_SECTION_NUMBER = "section_number";

    
    public DummySectionFragment(){}
    
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
//        setContentView(R.layout.base);
        
//        final Button button = (Button) getActivity().findViewById(R.id.buttonz);
//        button.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                // Perform action on click
//            }
//        });

        TextView textView = new TextView(getActivity());
        textView.setGravity(Gravity.CENTER);
        textView.setText(Integer.toString(getArguments().getInt(ARG_SECTION_NUMBER)));
        return textView;
    }

    public void slideit() {
    }


}


package com.example.lab9;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioGroup;
import android.widget.TextView;

public class BlankFragment extends Fragment {

    private static final int YES = 0;
    private static final int NO = 1;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_simple, container, false);

        final View rootView = inflater.inflate(R.layout.fragment_blank, container, false);
        final RadioGroup radioGroup = rootView.findViewById(R.id.radio_group);

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup group, int checkedId) {
                View radioButton = radioGroup.findViewById(checkedId);
                int index = radioGroup.indexOfChild(radioButton);
                TextView textView = rootView.findViewById(R.id.fragment_header);
                switch (index) {
                    case YES: // User chose "Yes." textView.setText(R.string.yes_message); break;
                    case NO: // User chose "No." textView.setText(R.string.no_message); break;
                    default: // No choice made.
// Do nothing. break;
                }
            }
        });
        return rootView;
    }
}
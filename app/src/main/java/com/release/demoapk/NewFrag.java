package com.release.demoapk;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class NewFrag extends Fragment {
    TextView text;

    public NewFrag() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View v = inflater.inflate(R.layout.fragment_new, container, false);


        text = v.findViewById(R.id.text);

        text.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getContext(), MainActivity.class));
            }
        });


        // Create new fragment and transaction
//        Fragment newFragment = new ExampleFragment();
//        FragmentTransaction transaction = getFragmentManager().beginTransaction();
//
//// Replace whatever is in the fragment_container view with this fragment,
//// and add the transaction to the back stack
//        transaction.replace(R.id.fragment_container, newFragment);
//        transaction.addToBackStack(null);
//
//// Commit the transaction
//        transaction.commit();


        return v;
    }
}
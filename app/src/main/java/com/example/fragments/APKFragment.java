package com.example.fragments;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;


/**
 * A simple {@link Fragment} subclass.
 */
public class APKFragment extends Fragment {

    public APKFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_a_p_k, container, false);

        final LinearLayout bt_yt = view.findViewById(R.id.bt_yt);
        final LinearLayout bt_ig = view.findViewById(R.id.bt_ig);
        final LinearLayout bt_wp = view.findViewById(R.id.bt_wp);

        bt_ig.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent instagram = getContext().getPackageManager().getLaunchIntentForPackage("com.instagram.android");
                startActivity(instagram);
            }
        });
        bt_yt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent youtube = getContext().getPackageManager().getLaunchIntentForPackage("com.google.android.youtube");
                startActivity(youtube);
            }
        });
        bt_wp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent whatsapp = getContext().getPackageManager().getLaunchIntentForPackage("com.whatsapp");
                startActivity(whatsapp);

            }
        });

        return view;
    }
}

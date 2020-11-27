package com.example.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.EditText;


/**
 * A simple {@link Fragment} subclass.
 */
public class SitioFragment extends Fragment {

    public SitioFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_sitio, container, false);

        final EditText etUrl = view.findViewById(R.id.et_url);
        final Button bt_ir = view.findViewById(R.id.bt_ir);
        final WebView webView = view.findViewById(R.id.webView);

        bt_ir.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                String url = "http://"+ etUrl.getText().toString();
                webView.loadUrl(url);
            }
        });

        return view;
    }
}

package com.example.fragments;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.provider.MediaStore;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class FotoFragment extends Fragment {
    ImageButton camara;
    ImageView imagen;
    int CAMARA_REQUEST_CODE = 0;

    public FotoFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment


        View view = inflater.inflate(R.layout.fragment_foto, container, false);

        camara = view.findViewById(R.id.imageButton2);
        imagen = view.findViewById(R.id.Imagen_view);

        camara.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){

                opencamara();

            }
        });


        return view;
    }
    public void opencamara() {
        Intent intent = new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
        startActivityForResult(intent,CAMARA_REQUEST_CODE);

    }
    @Override
    public void  onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode,resultCode,data);
        if (resultCode == Activity.RESULT_OK ){
            Bitmap bp = (Bitmap) data.getExtras().get("data");
            imagen.setImageBitmap(bp);
        }
    }

}

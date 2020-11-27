package com.example.fragments;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class CalculadoraFragment extends Fragment {

    Button btnsuma, btnresta, btnmultiplicacion, btndivision, btnlimpiar;
    Button btnporcentaje, btnraiz, btnfactorial, btnpotencia;
    Button btnsen, btncos, btntan, btnctg;
    EditText txtnum1, txtnum2;
    TextView txtresultado;


    public CalculadoraFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_calculadora, container, false);

         txtnum1 = view.findViewById(R.id.numero1);
         txtnum2 = view.findViewById(R.id.numero2);
         txtresultado =  view.findViewById(R.id.resultado);

        //Operaciones básicas
        btnsuma = view.findViewById(R.id.btnsuma);
        btnresta = view.findViewById(R.id.btnresta);
        btnmultiplicacion = view.findViewById(R.id.btnmultiplicacion);
        btndivision = view.findViewById(R.id.btndivision);

        //Operaciones Avanzadas
        btnporcentaje =view.findViewById(R.id.btnporcentaje);
        btnraiz =view.findViewById(R.id.btnraiz);
        btnpotencia =view.findViewById(R.id.btnpotencia);
        btnfactorial =view.findViewById(R.id.btnfactorial);

        //Operaciones Trignonometricas

        btnsen =view.findViewById(R.id.btnsen);
        btncos =view.findViewById(R.id.btncos);
        btntan =view.findViewById(R.id.btntan);
        btnctg =view.findViewById(R.id.btnctg);

        btnlimpiar = view.findViewById(R.id.btnlimpiar);

        btnsuma.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                double numero1 = Double.parseDouble(txtnum1.getText().toString());
                double numero2 = Double.parseDouble(txtnum2.getText().toString());

                double resultado = numero1 + numero2;

                txtresultado.setText("El resultado es: " + resultado);
            }
        });
        btnresta.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                double numero1 = Double.parseDouble(txtnum1.getText().toString());
                double numero2 = Double.parseDouble(txtnum2.getText().toString());

                double resultado = numero1 - numero2;

                txtresultado.setText("El resultado es: " + resultado);
            }
        });
        btnmultiplicacion.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                double numero1 = Double.parseDouble(txtnum1.getText().toString());
                double numero2 = Double.parseDouble(txtnum2.getText().toString());

                double resultado = numero1 * numero2;

                txtresultado.setText("El resultado es: " + resultado);
            }
        });

        btndivision.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                double numero1 = Double.parseDouble(txtnum1.getText().toString());
                double numero2 = Double.parseDouble(txtnum2.getText().toString());

                double resultado = numero1 / numero2;

                txtresultado.setText("El resultado es: " + resultado);
            }
        });

        //operaciones avanzadas
        btnporcentaje.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                double numero1 = Double.parseDouble(txtnum1.getText().toString());
                double numero2 = Double.parseDouble(txtnum2.getText().toString());

                double resultado = numero2*(numero1/100.0);

                txtresultado.setText("El resultado es: " + resultado);
            }
        });

        btnraiz.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                double numero1 = Double.parseDouble(txtnum1.getText().toString());

                double resultado = Math.sqrt(numero1);

                txtresultado.setText("El resultado es: " + resultado);
            }
        });

        btnfactorial.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                double numero1 = Double.parseDouble(txtnum1.getText().toString());
                double resultado = 1;
                for(double i=numero1; i>=1; i--){
                    resultado=resultado*i;
                }

                txtresultado.setText("El resultado es: " + resultado);
            }
        });

        btnpotencia.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                double numero1 = Double.parseDouble(txtnum1.getText().toString());
                double numero2 = Double.parseDouble(txtnum2.getText().toString());

                double resultado = Math.pow(numero1,numero2);

                txtresultado.setText("El resultado es: " + resultado);
            }
        });

        btnsen.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                double numero1 = Double.parseDouble(txtnum1.getText().toString());

                double rad=Math.toRadians(numero1);
                double resultado = (Math.sin(rad));

                txtresultado.setText("El resultado es: " + resultado);
            }
        });

        btncos.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                double numero1 = Double.parseDouble(txtnum1.getText().toString());

                double rad=Math.toRadians(numero1);
                double resultado = (Math.cos(rad));

                txtresultado.setText("El resultado es: " + resultado);
            }
        });

        btntan.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                double numero1 = Double.parseDouble(txtnum1.getText().toString());

                double rad=Math.toRadians(numero1);
                double resultado = (Math.tan(rad));

                txtresultado.setText("El resultado es: " + resultado);
            }
        });

        btnctg.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                double numero1 = Double.parseDouble(txtnum1.getText().toString());

                double angulo=(Math.atan(numero1));
                double resultado=Math.toDegrees(angulo);


                txtresultado.setText("El resultado es: " + resultado);
            }
        });

        btnlimpiar.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                txtnum1.setText("");
                txtnum1.invalidate();
                txtnum2.setText("");
                txtnum2.invalidate();
                txtresultado.setText("");
                txtresultado.invalidate();
            }
        });
        return view;
    }
}

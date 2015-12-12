package com.siyah.myapplication.Fragment;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.siyah.myapplication.R;

import java.text.NumberFormat;

/**
 * Created by siyah-pc on 12.12.2015.
 */
public class Sekil5Fragment extends android.app.Fragment {

    Button coz;
    EditText T;
    EditText jSon;
    EditText a;
    EditText Stress;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.sekil5_sayfa, container, false);

        coz=(Button) v.findViewById(R.id.button5);
        a = (EditText) v.findViewById(R.id.editText19);
        T = (EditText) v.findViewById(R.id.editText20);
        jSon = (EditText) v.findViewById(R.id.editText21);
        Stress = (EditText) v.findViewById(R.id.editText22);

        coz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(a.getText().toString().equals("")  || T.getText().toString().equals("")  )
                {
                    Toast.makeText(getActivity().getApplicationContext(), "Gerekli yerleri doldurun.", Toast.LENGTH_SHORT).show();
                }
                else
                {
                double a1 = Double.valueOf(String.valueOf(a.getText()));
                double T1 = Double.valueOf(String.valueOf(T.getText()));

                double j = (Math.pow(a1,4)*Math.sqrt(3))/80;
                double St = (20*T1)/Math.pow(a1,3);

                NumberFormat nf = NumberFormat.getInstance();
                nf.setMaximumFractionDigits(4);
                String S = nf.format(j);
                String S2 = nf.format(St);

                jSon.setText(String.valueOf(S));
                Stress.setText(String.valueOf(S2));

                InputMethodManager imm = (InputMethodManager)getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(v.getWindowToken(), 0);

                }
            }
        });


        return v;
    }
}

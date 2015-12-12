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
public class Sekil8Fragment extends android.app.Fragment {

    EditText U;
    EditText A;
    EditText t;
    EditText T;
    EditText j;
    EditText St;
    Button coz;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.sekil8_sayfa, container, false);

        U = (EditText) v.findViewById(R.id.editText32);
        A = (EditText) v.findViewById(R.id.editText37);
        t = (EditText) v.findViewById(R.id.editText38);
        T = (EditText) v.findViewById(R.id.editText34);
        j = (EditText) v.findViewById(R.id.editText35);
        St = (EditText) v.findViewById(R.id.editText36);
        coz = (Button) v.findViewById(R.id.button8);

        coz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(A.getText().toString().equals("")  || T.getText().toString().equals("") ||U.getText().toString().equals("") )
                {
                    Toast.makeText(getActivity().getApplicationContext(), "Gerekli yerleri doldurun.", Toast.LENGTH_SHORT).show();
                }
                else
                {
                double U1 = Double.valueOf(String.valueOf(U.getText()));
                double A1 = Double.valueOf(String.valueOf(A.getText()));
                double t1 = Double.valueOf(String.valueOf(t.getText()));
                double T1 = Double.valueOf(String.valueOf(T.getText()));

                double j1 = (4*Math.pow(A1,2)*t1)/U1;
                double St1 = T1/(2*t1*A1);

                NumberFormat nf = NumberFormat.getInstance();
                nf.setMaximumFractionDigits(4);
                String S = nf.format(j1);
                String S2 = nf.format(St1);

                j.setText(String.valueOf(S));
                St.setText(String.valueOf(S2));


                InputMethodManager imm = (InputMethodManager)getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(v.getWindowToken(), 0);

            }
            }
        });


        return v;
    }
}

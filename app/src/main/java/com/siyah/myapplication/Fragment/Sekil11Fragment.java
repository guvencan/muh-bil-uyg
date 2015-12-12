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
public class Sekil11Fragment extends android.app.Fragment {

    EditText U;
    EditText t;
    EditText T;
    EditText j;
    EditText St;
    Button coz;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.sekil11_sayfa, container, false);

        U = (EditText) v.findViewById(R.id.editText53);
        t = (EditText) v.findViewById(R.id.editText54);
        T = (EditText) v.findViewById(R.id.editText55);
        j = (EditText) v.findViewById(R.id.editText56);
        St = (EditText) v.findViewById(R.id.editText57);
        coz = (Button) v.findViewById(R.id.button11);

        coz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(U.getText().toString().equals("")  || T.getText().toString().equals("") ||t.getText().toString().equals("") )
                {
                    Toast.makeText(getActivity().getApplicationContext(), "Gerekli yerleri doldurun.", Toast.LENGTH_SHORT).show();
                }
                else
                {
                double UU = Double.valueOf(String.valueOf(U.getText()));
                double tt = Double.valueOf(String.valueOf(t.getText()));
                double TT = Double.valueOf(String.valueOf(T.getText()));

                double j1 = UU*Math.pow(tt,2)/3;
                double Sta = (TT*((3*UU)+(1.8*tt)))/(Math.pow(UU,2)*Math.pow(tt,2));


                NumberFormat nf = NumberFormat.getInstance();
                nf.setMaximumFractionDigits(4);
                String S = nf.format(j1);
                String S2 = nf.format(Sta);


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

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
public class Sekil10Fragment extends android.app.Fragment {

    EditText a;
    EditText b;
    EditText t;
    EditText t1;
    EditText T;
    EditText j;
    EditText Sta;
    EditText Stb;
    Button coz;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.sekil10_sayfa, container, false);

        a = (EditText) v.findViewById(R.id.editText45);
        b = (EditText) v.findViewById(R.id.editText46);
        t = (EditText) v.findViewById(R.id.editText47);
        t1 = (EditText) v.findViewById(R.id.editText48);
        T = (EditText) v.findViewById(R.id.editText49);
        j = (EditText) v.findViewById(R.id.editText50);
        Sta = (EditText) v.findViewById(R.id.editText51);
        Stb = (EditText) v.findViewById(R.id.editText52);
        coz = (Button) v.findViewById(R.id.button10);

        coz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if(a.getText().toString().equals("")  || T.getText().toString().equals("") ||b.getText().toString().equals("")
                        ||t.getText().toString().equals("") ||t1.getText().toString().equals(""))
                {
                    Toast.makeText(getActivity().getApplicationContext(), "Gerekli yerleri doldurun.", Toast.LENGTH_SHORT).show();
                }
                else
                {
                double aa = Double.valueOf(String.valueOf(a.getText()));
                double bb = Double.valueOf(String.valueOf(b.getText()));
                double tt = Double.valueOf(String.valueOf(t.getText()));
                double tt1 = Double.valueOf(String.valueOf(t1.getText()));
                double TT = Double.valueOf(String.valueOf(T.getText()));

                double j1 = (2*tt*tt1*Math.pow((aa-2),2)*Math.pow((bb-tt1),2))/((aa*tt)+(bb*tt1)-Math.pow(tt,2)-Math.pow(tt1,2));
                double Staa = TT/(2*tt*(aa-tt)*bb-tt1);
                double Stbb = TT/(2*tt1*(aa-tt)*bb-tt1);

                NumberFormat nf = NumberFormat.getInstance();
                nf.setMaximumFractionDigits(4);
                String S = nf.format(j1);
                String S2 = nf.format(Staa);
                String S3 = nf.format(Stbb);

                j.setText(String.valueOf(S));
                Sta.setText(String.valueOf(S2));
                Stb.setText(String.valueOf(S3));

                InputMethodManager imm = (InputMethodManager)getActivity().getSystemService(Context.INPUT_METHOD_SERVICE);
                imm.hideSoftInputFromWindow(v.getWindowToken(), 0);

            }
            }
        });


        return v;
    }
}

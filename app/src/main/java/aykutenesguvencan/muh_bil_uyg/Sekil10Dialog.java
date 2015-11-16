package aykutenesguvencan.muh_bil_uyg;

import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;

import java.text.NumberFormat;

/**
 * Created by Aykutt on 7.11.2015.
 */
public class Sekil10Dialog extends DialogFragment {

    EditText a;
    EditText b;
    EditText t;
    EditText t1;
    EditText T;
    EditText j;
    EditText Sta;
    EditText Stb;
    Button coz;

    public static Sekil2Dialog newInstance() {
        Sekil2Dialog dialog = new Sekil2Dialog();
        dialog.setStyle(DialogFragment.STYLE_NORMAL, R.style.AppTheme);

        return dialog;
    }

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        if(getDialog() != null) {
            getDialog().getWindow().addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            getDialog().getWindow().setLayout(LinearLayout.LayoutParams.MATCH_PARENT,
                    LinearLayout.LayoutParams.MATCH_PARENT);
        }
    }

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
            }
        });


        return v;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        Dialog dialog = super.onCreateDialog(savedInstanceState);
        dialog.requestWindowFeature(Window.FEATURE_NO_TITLE);

        return dialog;
    }
}

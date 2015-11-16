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
public class Sekil8Dialog extends DialogFragment {

    EditText U;
    EditText A;
    EditText t;
    EditText T;
    EditText j;
    EditText St;
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

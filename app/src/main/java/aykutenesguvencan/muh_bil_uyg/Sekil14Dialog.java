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
 * Created by Aykutt on 8.11.2015.
 */
public class Sekil14Dialog extends DialogFragment {
    EditText T;
    EditText j;
    EditText St;
    Button coz;


    public static Sekil14Dialog newInstance() {
        Sekil14Dialog dialog = new Sekil14Dialog();
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
        View v = inflater.inflate(R.layout.sekil14_sayfa, container, false);

        final EditText[] hhler = new  EditText[2];
        final EditText[] bbler = new  EditText[2];

        hhler[0] = (EditText) v.findViewById(R.id.editText69);
        hhler[1] = (EditText) v.findViewById(R.id.editText72);
        bbler[0] = (EditText) v.findViewById(R.id.editText76);
        bbler[1] = (EditText) v.findViewById(R.id.editText77);
        T = (EditText) v.findViewById(R.id.editText78);
        j = (EditText) v.findViewById(R.id.editText79);
        St = (EditText) v.findViewById(R.id.editText80);
        coz = (Button) v.findViewById(R.id.button14);

        final double[] hler = new  double[2];
        final double[] bler = new  double[2];

        coz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0 ; i < 2; i++) {
                    hler[i] = Double.valueOf(String.valueOf(hhler[i].getText()));
                    bler[i] = Double.valueOf(String.valueOf(bbler[i].getText()));
                }

                double TT = Double.valueOf(String.valueOf(T.getText()));

                double j1 = 0 , St1 = 0;

                for (int m = 0 ; m < 2; m++) {
                    double n = Math.pow(bler[m],3)*hler[m];
                    j1 = j1 + n;
                }
                j1 = (1.12/3)*j1;

                St1 = (TT*bler[1])/j1;

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

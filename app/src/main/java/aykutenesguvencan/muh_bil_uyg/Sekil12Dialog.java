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
public class Sekil12Dialog extends DialogFragment {

    EditText T;
    EditText j;
    EditText St;
    Button coz;

    public static Sekil12Dialog newInstance() {
        Sekil12Dialog dialog = new Sekil12Dialog();
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
        View v = inflater.inflate(R.layout.sekil12_sayfa, container, false);

        final EditText[] hhler = new  EditText[3];
        final EditText[] bbler = new  EditText[3];

        hhler[0] = (EditText) v.findViewById(R.id.editText58);
        hhler[1] = (EditText) v.findViewById(R.id.editText59);
        hhler[2] = (EditText) v.findViewById(R.id.editText60);
        bbler[0] = (EditText) v.findViewById(R.id.editText61);
        bbler[1] = (EditText) v.findViewById(R.id.editText62);
        bbler[2] = (EditText) v.findViewById(R.id.editText63);
        T = (EditText) v.findViewById(R.id.editText64);
        j = (EditText) v.findViewById(R.id.editText65);
        St = (EditText) v.findViewById(R.id.editText66);
        coz = (Button) v.findViewById(R.id.button12);
        final double[] hler = new  double[3];
        final double[] bler = new  double[3];

        coz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                for (int i = 0 ; i < 3; i++) {
                    hler[i] = Double.valueOf(String.valueOf(hhler[i].getText()));
                    bler[i] = Double.valueOf(String.valueOf(bbler[i].getText()));
                }

                double TT = Double.valueOf(String.valueOf(T.getText()));

                double j1 = 0 , St1 = 0;

                for (int m = 0 ; m < 3; m++) {
                    double n = Math.pow(bler[m],3)*hler[m];
                    j1 = j1 + n;
                }
                j1 = j1*(1.3/3);

                St1 = (TT*bler[2])/j1;

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

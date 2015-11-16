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
public class Sekil4Dialog extends DialogFragment {

    EditText a;
    EditText b;
    EditText T;
    EditText Stress;
    EditText j;
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
        View v = inflater.inflate(R.layout.sekil4_sayfa, container, false);

        coz = (Button) v.findViewById(R.id.button4);
        a = (EditText) v.findViewById(R.id.editText14);
        b = (EditText) v.findViewById(R.id.editText15);
        T = (EditText) v.findViewById(R.id.editText16);
        j = (EditText) v.findViewById(R.id.editText17);
        Stress = (EditText) v.findViewById(R.id.editText18);

        coz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double a1 = Double.valueOf(String.valueOf(a.getText()));
                double b1 = Double.valueOf(String.valueOf(b.getText()));
                double T1 = Double.valueOf(String.valueOf(T.getText()));

                double jUs = a1*Math.pow(b1,3)*((16/3)-(3.36*(b1/a1)*(1-(Math.pow(b1,4)/(12*Math.pow(a1,4))))));
                double St = ((3*T1)/(8*a1*Math.pow(b1,2)))*(1+(0.6095*(b1/a1))+(0.8865*(Math.pow(b1/a1,2)))-(1.8023*(Math.pow(b1/a1,3)))+(0.91*Math.pow(b1/a1,4)));

                NumberFormat nf = NumberFormat.getInstance();
                nf.setMaximumFractionDigits(4);
                String S = nf.format(jUs);
                String S2 = nf.format(St);

                j.setText(String.valueOf(S));
                Stress.setText(String.valueOf(S2));
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

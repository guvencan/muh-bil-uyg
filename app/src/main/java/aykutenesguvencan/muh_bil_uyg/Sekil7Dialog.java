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
import android.widget.Switch;

import java.text.NumberFormat;

/**
 * Created by Aykutt on 7.11.2015.
 */
public class Sekil7Dialog extends DialogFragment {

    EditText kenar;
    EditText T;
    EditText j;
    EditText St;
    Button coz;
    Switch sw;

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
        View v = inflater.inflate(R.layout.sekil7_sayfa, container, false);

        kenar = (EditText) v.findViewById(R.id.editText28);
        T = (EditText) v.findViewById(R.id.editText29);
        j =(EditText) v.findViewById(R.id.editText30);
        St =(EditText) v.findViewById(R.id.editText31);
        coz = (Button) v.findViewById(R.id.button7) ;
        sw = (Switch) v.findViewById(R.id.switch2);

        coz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                double k = Double.valueOf(String.valueOf(kenar.getText()));
                double T1 = Double.valueOf(String.valueOf(T.getText()));
                double j1;
                double Stress;

                if (sw.isChecked()){
                    j1 = 0.0649*Math.pow(k,4);
                    Stress = 8.157*(T1/Math.pow(k,3));
                }
                else{
                    j1 = 0.1154*Math.pow(k,4);
                    Stress = 5.297*(T1/Math.pow(k,3));
                }

                NumberFormat nf = NumberFormat.getInstance();
                nf.setMaximumFractionDigits(4);
                String S = nf.format(j1);
                String S2 = nf.format(Stress);

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

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
public class Sekil1Dialog extends DialogFragment{

    Button coz;
    EditText T;
    EditText jSon;
    EditText r;
    EditText Stress;


    public static Sekil1Dialog newInstance() {
        Sekil1Dialog dialog = new Sekil1Dialog();
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
        View v = inflater.inflate(R.layout.sekil1_sayfa, container, false);



         coz=(Button) v.findViewById(R.id.button);
         r = (EditText) v.findViewById(R.id.editText);
         T = (EditText) v.findViewById(R.id.editText2);
         jSon = (EditText) v.findViewById(R.id.editText3);
         Stress = (EditText) v.findViewById(R.id.editText4);

        coz.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               double r1 = Double.valueOf(String.valueOf(r.getText()));
               double T1 = Double.valueOf(String.valueOf(T.getText()));

               double j = (Math.PI*Math.pow(r1,4))/2;
               double St = (2*T1)/(Math.PI*Math.pow(r1,3));

               NumberFormat nf = NumberFormat.getInstance();
               nf.setMaximumFractionDigits(4);
               String S = nf.format(j);
               String S2 = nf.format(St);

               jSon.setText(String.valueOf(S));
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

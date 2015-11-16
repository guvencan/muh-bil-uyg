package aykutenesguvencan.muh_bil_uyg;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

/**
 * Created by Aykutt on 17.10.2015.
 */
public class OzelAdapter extends BaseAdapter {

    private LayoutInflater mInflater;
    private List<Sekil>     mSekilListesi;

    public OzelAdapter(Activity activity, List<Sekil> sekiller) {
        //XML'i alıp View'a çevirecek inflater'ı örnekleyelim
        mInflater = (LayoutInflater) activity.getSystemService(
                Context.LAYOUT_INFLATER_SERVICE);
        //gösterilecek listeyi de alalım
        mSekilListesi = sekiller;
    }

    @Override
    public int getCount() {
        return mSekilListesi.size();
    }

    @Override
    public Object getItem(int position) {
        return mSekilListesi.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View satirView;

        satirView = mInflater.inflate(R.layout.satir_layout, null);
        TextView textView =
                (TextView) satirView.findViewById(R.id.sekilAd);
        ImageView imageView =
                (ImageView) satirView.findViewById(R.id.simge);

        Sekil sekil = mSekilListesi.get(position);

        textView.setText(sekil.getSekilAd());

        switch (sekil.getSekilId()){
            case 1:imageView.setImageResource(R.drawable.sekil1main);break;
            case 2:imageView.setImageResource(R.drawable.sekil02main);break;
            case 3:imageView.setImageResource(R.drawable.sekil3main);break;
            case 4:imageView.setImageResource(R.drawable.sekil4main);break;
            case 5:imageView.setImageResource(R.drawable.sekil5main);break;
            case 6:imageView.setImageResource(R.drawable.sekil6main);break;
            case 7:imageView.setImageResource(R.drawable.sekil7main);break;
            case 8:imageView.setImageResource(R.drawable.sekil8main);break;
            case 9:imageView.setImageResource(R.drawable.sekil9main);break;
            case 10:imageView.setImageResource(R.drawable.sekil10main);break;
            case 11:imageView.setImageResource(R.drawable.sekil11main);break;
            case 12:imageView.setImageResource(R.drawable.sekil12main);break;
            case 13:imageView.setImageResource(R.drawable.sekil13main);break;
            case 14:imageView.setImageResource(R.drawable.sekil14main);break;
            case 15:imageView.setImageResource(R.drawable.sekil15main);break;
            case 16:imageView.setImageResource(R.drawable.sekil16main);break;
        }

        return satirView;
    }
}

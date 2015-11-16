package aykutenesguvencan.muh_bil_uyg;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;


public class MainActivity extends AppCompatActivity {

    final List<Sekil> sekiller=new ArrayList<Sekil>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        sekiller.add(new Sekil("Katı Dairesel Plaka", 1));
        sekiller.add(new Sekil("Katı Eliptik Plaka" , 2));
        sekiller.add(new Sekil("Katı Kare Plaka" , 3));
        sekiller.add(new Sekil("Katı Dikdörtgen Plaka" , 4));
        sekiller.add(new Sekil("Katı Eşkenar Üçgen Plaka" , 5));
        sekiller.add(new Sekil("Katı İkizkenar Üçgen Plaka" , 6));
        sekiller.add(new Sekil("Katı Altıgen Plaka" , 7));
        sekiller.add(new Sekil("Eş Kalınlıkta İnce Tüp" , 8));
        sekiller.add(new Sekil("İçi Boş Eliptik Plaka" , 9));
        sekiller.add(new Sekil("İnce Çeperli İçi Boş Dikdörtgen Plaka" , 10));
        sekiller.add(new Sekil("Eş Kalınlıkta İnce Açık Tüp" , 11));
        sekiller.add(new Sekil("H Şekilli Plaka" , 12));
        sekiller.add(new Sekil("L Şekilli Plaka" , 13));
        sekiller.add(new Sekil("T Şekilli Plaka" , 14));
        sekiller.add(new Sekil("U Şekilli Plaka" , 15));
        sekiller.add(new Sekil("Artı Şekilli Plaka" , 16));

        final ListView listemiz = (ListView) findViewById(R.id.liste);
            OzelAdapter adaptorumuz=new OzelAdapter(this, sekiller);
            listemiz.setAdapter(adaptorumuz);

        final ListView listem = (ListView) findViewById(R.id.liste);
        listem.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position) {
                    case 0:
                        /* setContentView(R.layout.sekil1_sayfa); */
                        Sekil1Dialog sekil1Dialog = new Sekil1Dialog();
                        sekil1Dialog.show(getFragmentManager(),"");
                        break;
                    case 1:
                        //setContentView(R.layout.sekil2_sayfa);
                        Sekil2Dialog sekil2Dialog = new Sekil2Dialog();
                        sekil2Dialog.show(getFragmentManager(),"");
                        break;
                    case 2:
                        //setContentView(R.layout.sekil3_sayfa);
                        Sekil3Dialog sekil3Dialog = new Sekil3Dialog();
                        sekil3Dialog.show(getFragmentManager(),"");
                        break;
                    case 3:
                        //setContentView(R.layout.sekil4_sayfa);
                        Sekil4Dialog sekil4Dialog = new Sekil4Dialog();
                        sekil4Dialog.show(getFragmentManager(),"");
                        break;
                    case 4:
                        //setContentView(R.layout.sekil5_sayfa);
                        Sekil5Dialog sekil5Dialog = new Sekil5Dialog();
                        sekil5Dialog.show(getFragmentManager(),"");
                        break;
                    case 5:
                        //setContentView(R.layout.sekil6_sayfa);
                        Sekil6Dialog sekil6Dialog = new Sekil6Dialog();
                        sekil6Dialog.show(getFragmentManager(),"");
                        break;
                    case 6:
                        //setContentView(R.layout.sekil7_sayfa);
                        Sekil7Dialog sekil7Dialog = new Sekil7Dialog();
                        sekil7Dialog.show(getFragmentManager(),"");
                        break;
                    case 7:
                        //setContentView(R.layout.sekil8_sayfa);
                        Sekil8Dialog sekil8Dialog = new Sekil8Dialog();
                        sekil8Dialog.show(getFragmentManager(),"");
                        break;
                    case 8:
                        //setContentView(R.layout.sekil9_sayfa);
                        Sekil9Dialog sekil9Dialog = new Sekil9Dialog();
                        sekil9Dialog.show(getFragmentManager(),"");
                        break;
                    case 9:
                        //setContentView(R.layout.sekil10_sayfa);
                        Sekil10Dialog sekil10Dialog = new Sekil10Dialog();
                        sekil10Dialog.show(getFragmentManager(),"");
                        break;
                    case 10:
                        //setContentView(R.layout.sekil11_sayfa);
                        Sekil11Dialog sekil11Dialog = new Sekil11Dialog();
                        sekil11Dialog.show(getFragmentManager(),"");
                        break;
                    case 11:
                        //setContentView(R.layout.sekil12_sayfa);
                        Sekil12Dialog sekil12Dialog = new Sekil12Dialog();
                        sekil12Dialog.show(getFragmentManager(),"");
                        break;
                    case 12:
                        //setContentView(R.layout.sekil13_sayfa);
                        Sekil13Dialog sekil13Dialog = new Sekil13Dialog();
                        sekil13Dialog.show(getFragmentManager(),"");
                        break;
                    case 13:
                        //setContentView(R.layout.sekil14_sayfa);
                        Sekil14Dialog sekil14Dialog = new Sekil14Dialog();
                        sekil14Dialog.show(getFragmentManager(),"");
                        break;
                    case 14:
                        //setContentView(R.layout.sekil15_sayfa);
                        Sekil15Dialog sekil15Dialog = new Sekil15Dialog();
                        sekil15Dialog.show(getFragmentManager(),"");
                        break;
                    case 15:
                        //setContentView(R.layout.sekil16_sayfa);
                        Sekil16Dialog sekil16Dialog = new Sekil16Dialog();
                        sekil16Dialog.show(getFragmentManager(),"");
                        break;


                }
            }

        });

    }





    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }







}

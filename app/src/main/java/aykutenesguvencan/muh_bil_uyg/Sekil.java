package aykutenesguvencan.muh_bil_uyg;

/**
 * Created by Aykutt on 17.10.2015.
 */
public class Sekil {

    private String  sekilAd;
    private int sekilId;

    public Sekil(String s, int i) {
        this.sekilAd = s;
        this.sekilId = i;
    }

    public String getSekilAd() {
        return sekilAd;
    }

    public void setSekilAd(String sekilAd) {
        this.sekilAd = sekilAd;
    }

    public int getSekilId() {
        return sekilId;
    }

    public void setSekilId(int sekilId) {
        this.sekilId = sekilId;
    }
}


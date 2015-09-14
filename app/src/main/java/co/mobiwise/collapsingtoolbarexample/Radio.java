package co.mobiwise.collapsingtoolbarexample;

/**
 * Created by mertsimsek on 14/09/15.
 */
public class Radio {

    String radioName;

    int radioArt;

    String radioDial;

    public Radio(String radioName, int radioArt, String radioDial) {
        this.radioName = radioName;
        this.radioArt = radioArt;
        this.radioDial = radioDial;
    }

    public String getRadioName() {
        return radioName;
    }

    public void setRadioName(String radioName) {
        this.radioName = radioName;
    }

    public int getRadioArt() {
        return radioArt;
    }

    public void setRadioArt(int radioArt) {
        this.radioArt = radioArt;
    }

    public String getRadioDial() {
        return radioDial;
    }

    public void setRadioDial(String radioDial) {
        this.radioDial = radioDial;
    }

}

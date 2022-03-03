package si.feri.opj.joksovic.models;

import si.feri.opj.joksovic.helpers.Kraj;

public class BalvanskiCenter extends PlezalniCenter {
    boolean moznostRazsiritve;

    public BalvanskiCenter() {

    }

    public BalvanskiCenter(String naziv, String email, String telefon, Kraj kraj) {
        super(naziv, email, telefon, kraj);
    }

    public BalvanskiCenter(String naziv, int kapaciteta) {
        super(naziv, kapaciteta);
    }

    @Override
    public int vrniKapaciteto() {
        if (this.moznostRazsiritve) {
            return super.getPlezalneSmeri().length * 2;
        }
        return super.getPlezalneSmeri().length;
    }

    public boolean isMoznostRazsiritve() {return this.moznostRazsiritve;}

    public void setMoznostRazsiritve(boolean moznostRazsiritve) {this.moznostRazsiritve = moznostRazsiritve;}
}

package si.feri.opj.joksovic.models;

import si.feri.opj.joksovic.helpers.Kraj;

public class VisinskiCenter extends PlezalniCenter {
    public VisinskiCenter() {
    }

    public VisinskiCenter(String naziv, String email, String telefon, Kraj kraj) {
        super(naziv, email, telefon, kraj);
    }

    public VisinskiCenter(String naziv, int kapaciteta) {
        super(naziv, kapaciteta);
    }

    @Override
    public int vrniKapaciteto() {
        return super.getPlezalneSmeri().length;
    }
}

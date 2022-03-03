package si.feri.opj.joksovic.models;

import si.feri.opj.joksovic.helpers.Kraj;
import si.feri.opj.joksovic.helpers.Lokacija;
import si.feri.opj.joksovic.helpers.PlezalnaSmer;
import si.feri.opj.joksovic.helpers.TipSmeri;

import java.util.Arrays;

public abstract class PlezalniCenter extends Lokacija {

    private String email;
    private String telefon;

    public PlezalniCenter() {

    }

    public PlezalniCenter(String naziv, Kraj kraj) {
        super(naziv, kraj);
    }

    public PlezalniCenter(String naziv, String email, String telefon, Kraj kraj) {
        this(naziv, kraj);
        this.telefon = telefon;
        this.email = email;
    }

    public PlezalniCenter(String naziv, int kapaciteta) {
        super(naziv);
        super.setPlezalneSmeri(new PlezalnaSmer[kapaciteta]);
    }

    public void ustvariSmer(PlezalnaSmer smer) {
        for (int i = 0; i < super.getPlezalneSmeri().length; i++) {
            if (super.getPlezalneSmeri()[i] == null) {
                super.getPlezalneSmeri()[i] = smer;
                return;
            }
        }
    }

    public void razdriSmer() {
        Arrays.fill(super.getPlezalneSmeri(), null);
    }

    public double vrniZasedenost() {
        double counter = 0;
        for (PlezalnaSmer ps : super.getPlezalneSmeri()) {
            if (ps != null) {
                counter++;
            }
        }
        return (counter / super.getPlezalneSmeri().length) * 100;
    }

    public abstract int vrniKapaciteto();

    /**
     * Getter for the PlezalniCenter's name attribute
     *
     * @return String <b>naziv</b> containing the name of the PlezalniCenter
     */


    public String getEmail() {
        return email;
    }

    /**
     * Setter for the PlezalniCenter's name attribute
     *
     * @param email String which will become the email of the PlezalniCenter
     */

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Getter for the PlezalniCenter's name attribute
     *
     * @return String <b>telefon</b> containing the phone number of the PlezalniCenter
     */

    public String getTelefon() {
        return telefon;
    }

    /**
     * Setter for the PlezalniCenter's phone number attribute
     *
     * @param telefon String which will become the phone number of the PlezalniCenter
     */

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }


    /**
     * Override of the default toString() method
     *
     * @return PlezalniCenter object parsed as a printable String
     */
    @Override
    public String toString() {
        return "PlezalniCenter{" + "email='" + email + '\'' + ", telefon='" + telefon + '\'' + "} " + super.toString();
    }
}


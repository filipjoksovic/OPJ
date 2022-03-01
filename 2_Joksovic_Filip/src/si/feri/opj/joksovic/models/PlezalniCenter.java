package si.feri.opj.joksovic.models;

import si.feri.opj.joksovic.helpers.Kraj;

public class PlezalniCenter {
    private String naziv;
    private String email;
    private String telefon;
    private Kraj kraj;

    /**
     * Default constructor
     * Sets all values to their defaults
     */
    private PlezalniCenter() {

    }

    /**
     * PlezalniCenter constructor which sets the values of <i>naziv</i> and <i>email</i> attributes
     *
     * @param naziv String containing the PlezalniCenter's name
     * @param email String containing the PlezalniCenter's email
     */
    private PlezalniCenter(String naziv, String email) {
        this.naziv = naziv;
        this.email = email;
    }

    /**
     * PlezalniCenter constructor which sets the values of <i>naziv</i> and <i>email</i> attributes
     *
     * @param naziv   String containing the PlezalniCenter's name
     * @param email   String containing the PlezalniCenter's email
     * @param telefon String containing the PlezalniCenter's phone number
     * @param kraj    Instance of a Kraj class
     */
    public PlezalniCenter(String naziv, String email, String telefon, Kraj kraj) {
        this(naziv, email);
        this.telefon = telefon;
        this.kraj = kraj;
    }

    /**
     * Getter for the PlezalniCenter's name attribute
     *
     * @return String <b>naziv</b> containing the name of the PlezalniCenter
     */
    public String getNaziv() {
        return naziv;
    }

    /**
     * Setter for the PlezalniCenter's name attribute
     *
     * @param naziv String which will become the name of the PlezalniCenter
     */
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

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
     * Getter for the PlezalniCenter's location attribute
     *
     * @return Instance of the class <b>Kraj</b> containing the location of the PlezalniCenter
     */

    public Kraj getKraj() {
        return kraj;
    }

    /**
     * Setter for the PlezalniCenter's location attribute
     *
     * @param kraj Instance of the class <b>Kraj</b> which will become the location of the PlezalniCenter
     */

    public void setKraj(Kraj kraj) {
        this.kraj = kraj;
    }

    /**
     * Override of the default toString() method
     *
     * @return PlezalniCenter object parsed as a printable String
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PlezalniCenter{");
        sb.append("naziv='").append(naziv).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", telefon='").append(telefon).append('\'');
        sb.append(", kraj=").append(kraj);
        sb.append('}');
        return sb.toString();
    }
}


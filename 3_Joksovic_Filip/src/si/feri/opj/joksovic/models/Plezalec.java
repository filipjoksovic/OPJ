package si.feri.opj.joksovic.models;

/**
 * Plezalec class
 * Contains first and last name as parameters, as well as licence number
 *
 * @author Filip Joksovic
 * @since 24-2-2022
 */
public class Plezalec {

    private String ime;
    private String priimek;
    private String stevilkaLicence;

    /**
     * Default constructor
     * Sets all values to their defaults
     */
    public Plezalec() {
    }

    /**
     * Constructor which sets the climber's first and last name, without the licence number
     *
     * @param ime     First name of the climber
     * @param priimek Last name of the climber
     */
    public Plezalec(String ime, String priimek) {
        this.priimek = priimek;
        this.ime = ime;
    }

    /**
     * Constructor which sets the climber's first name, last name and licence number
     *
     * @param ime             First name of the climber, String
     * @param priimek         Last name of the climber, String
     * @param stevilkaLicence Climber's license number, String for the possibility of custom formatting
     */
    public Plezalec(String ime, String priimek, String stevilkaLicence) {
        this(ime, priimek);
        this.stevilkaLicence = stevilkaLicence;
    }

    /**
     * Getter for the climber's last name
     *
     * @return String containing the climber's last name
     */
    public String getPriimek() {
        return priimek;
    }

    /**
     * Setter for the climber's last name
     *
     * @param priimek String which will become the climber's last name
     */
    public void setPriimek(String priimek) {
        this.priimek = priimek;
    }

    /**
     * Getter for the climber's first name
     *
     * @return String containing the climber's first name
     */
    public String getIme() {
        return ime;
    }

    /**
     * Setter for the climber's first name
     *
     * @param ime String which will become the climber's first name
     */
    public void setIme(String ime) {
        this.ime = ime;
    }

    /**
     * Getter for the climber's license number
     *
     * @return String containing the climber's license number
     */
    public String getStevilkaLicence() {
        return stevilkaLicence;
    }

    /**
     * Setter for the climber's license
     *
     * @param stevilkaLicence String which will become the climber's license number
     */
    public void setStevilkaLicence(String stevilkaLicence) {
        this.stevilkaLicence = stevilkaLicence;
    }

    /**
     * Override of the default toString method
     *
     * @return Plezalec object parsed as a printable String
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Plezalec{");
        sb.append("priimek='").append(priimek).append('\'');
        sb.append(", ime='").append(ime).append('\'');
        sb.append(", stevilkaLicence='").append(stevilkaLicence).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

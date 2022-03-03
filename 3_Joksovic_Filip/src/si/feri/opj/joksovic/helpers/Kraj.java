package si.feri.opj.joksovic.helpers;

/**
 * Kraj class, contains the name of the location as well as  the country
 *
 * @author Joksovic Filip
 * @since 24-2-2022
 */

public class Kraj {
    private String kraj;
    private String drzava;

    /**
     * Default constructor
     * Sets all values to their defaults
     */
    public Kraj() {

    }

    /**
     * Constructor which sets the value of attributes <i>kraj</i> and <i>drzava</i> of Kraj's instance to their given values
     *
     * @param kraj   String containing the name of the Kraj instance
     * @param drzava String containing the country of the Kraj instance
     */
    public Kraj(String kraj, String drzava) {
        this.kraj = kraj;
        this.drzava = drzava;
    }

    /**
     * Getter for the Kraj's <i>drzava</i> attribute
     *
     * @return String containing the name of the Kraj's <i>drzava</i> attribute
     */
    public String getDrzava() {
        return drzava;
    }

    /**
     * Setter for the Kraj's <i>drzava</i> attribute
     *
     * @param drzava String value containing the name of the Kraj's <i>drzava</i> attribute
     */
    public void setDrzava(String drzava) {
        this.drzava = drzava;
    }

    /**
     * Getter for the Kraj's <i>kraj</i> attribute
     *
     * @return String containing the name of the Kraj's <i>kraj</i> attribute
     */
    public String getKraj() {
        return kraj;
    }

    /**
     * Setter for the Kraj's <i>kraj</i> attribute
     *
     * @param kraj String value containing the name of the Kraj's <i>kraj</i> attribute
     */
    public void setKraj(String kraj) {
        this.kraj = kraj;
    }

    /**
     * Override of the default toString() method
     *
     * @return Kraj object parsed as a printable String
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Kraj{");
        sb.append("kraj='").append(kraj).append('\'');
        sb.append(", drzava='").append(drzava).append('\'');
        sb.append('}');
        return sb.toString();
    }
}


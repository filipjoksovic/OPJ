package si.feri.opj.joksovic.models;

import si.feri.opj.joksovic.helpers.Kraj;
import si.feri.opj.joksovic.helpers.PlezalnaSmer;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class Plezalisce {
    private String naziv;
    private Kraj kraj;
    private boolean jeUrejeno;
    private PlezalnaSmer[] plezalneSmeri = new PlezalnaSmer[15];

    /**
     * Default constructor
     * Sets all values to their defaults
     */
    public Plezalisce() {

    }

    /**
     * Constructor which sets the Plezalisce object's <i>naziv</i> and <i>kraj</i> properties
     *
     * @param naziv String containing the Plezalisce's name attribute
     * @param kraj  Instance of a Kraj class
     */
    public Plezalisce(String naziv, Kraj kraj) {
        this.naziv = naziv;
        this.kraj = kraj;
    }

    /**
     * Constructor which sets the Plezalisce object's <i>naziv</i>, <i>kraj</i> and jeUrejeno properties
     *
     * @param naziv     String containing the Plezalisce's name attribute
     * @param kraj      Instance of a Kraj class
     * @param jeUrejeno Boolean value representing the readiness of the Plezalisce
     */
    public Plezalisce(String naziv, Kraj kraj, boolean jeUrejeno) {
        this(naziv, kraj);
        this.jeUrejeno = jeUrejeno;
    }

    /**
     * Getter for the Plezalisce's <i>naziv</i> attribute
     *
     * @return String containing the value of Plezalisce's <i>naziv</i> attribute
     */
    public String getNaziv() {
        return naziv;
    }

    /**
     * Setter for the Plezalisce's first name
     *
     * @param naziv String which will become the Plezalisce's name
     */
    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    /**
     * Getter for the Plezalisce's <i>kraj</i> attribute
     *
     * @return Object of the class <b>Kraj</b>
     */
    public Kraj getKraj() {
        return kraj;
    }

    /**
     * Setter for the Plezalisce's <i>kraj</i> attribute
     *
     * @param kraj Object of a class Kraj
     */
    public void setKraj(Kraj kraj) {
        this.kraj = kraj;
    }

    /**
     * Getter for the Plezalisce's <i>jeUrejeno</i> attribute
     *
     * @return Boolean value representing the value of Plezalisce's jeUrejeno attribute
     */
    public boolean isJeUrejeno() {
        return jeUrejeno;
    }

    /**
     * Setter for the Plezalisce's <i>jeUrejeno</i> attribute
     *
     * @param jeUrejeno Boolean true/false value
     */
    public void setJeUrejeno(boolean jeUrejeno) {
        this.jeUrejeno = jeUrejeno;
    }

    /**
     * Getter for the Plezalisce's <i>plezalneSmeri</i> attribute
     *
     * @return Array of PlezalnaSmer objects
     */
    public PlezalnaSmer[] getPlezalneSmeri() {
        return plezalneSmeri;
    }

    /**
     * Setter for the Plezalisce's <i>plezalneSmeri</i> attribute
     *
     * @param plezalneSmeri Array of PlezalnaSmer objects
     */
    public void setPlezalneSmeri(PlezalnaSmer[] plezalneSmeri) {
        this.plezalneSmeri = plezalneSmeri;
    }

    /**
     * Method which compares the current date to the given PlezalnaSmer instance
     *
     * @param ps PlezalnaSmer instance
     * @return Boolean true/false value depending on if the ps lastView attribute is less/more than 30 days from the current date
     */
    public boolean smerUrejena(PlezalnaSmer ps) {
        LocalDate beforeDate = ps.getLastView().minusDays(30);
        LocalDate currentDate = LocalDate.now();
        long days = ChronoUnit.DAYS.between(beforeDate, currentDate);
        if (days <= 30) {
            return true;
        }
        return false;
    }

    /**
     * Method to add a new PlezalnaSmer instance into the plezalneSmeri array.
     * Finds first null element in the plezalneSmeri array and sets the value to the PlezalnaSmer instance
     * If no null elements in the array are found, nothing happes as the element cannot be inserted
     *
     * @param noviSmer PlezalnaSmer instance which will be inserted into the array if possible
     * @return Boolean true/false value depending on if the element is successfully inserted into the array or not
     */
    public boolean dodajPlezalnoSmer(PlezalnaSmer noviSmer) {
        for (int i = 0; i < plezalneSmeri.length; i++) {
            if (plezalneSmeri[i] == null) {
                plezalneSmeri[i] = noviSmer;
                return true;
            }
        }
        return false;
    }

    /**
     * Removes a PlezalnaSmer instance from the plezalneSmeri array by the PlezalnSmer instance, utilizing the overriden .equals() methods
     *
     * @param noviSmer PlezalnaSmer instance that needs to be removed. Can be either a reference to a PlezalnaSmer variable or a whole new instance created
     */
    public void odstraniPlezalnoSmer(PlezalnaSmer noviSmer) {
        for (int i = 0; i < plezalneSmeri.length; i++) {
            if (plezalneSmeri[i] != null && plezalneSmeri[i].equals(noviSmer)) {
                plezalneSmeri[i] = null;
                return;
            }
        }
    }

    /**
     * Removes a PlezalnaSmer instance from the plezalneSmeri array by the oznaka attribute of the PlezalnaSmer.oznaka attribute
     *
     * @param oznaka Integer value representing the value of the oznaka attribute of the PlezalnaSmer attribute
     * @return Boolean true/false value depending on if an element was removed
     */
    public boolean odstraniPlezalnoSmer(int oznaka) {
        for (int i = 0; i < plezalneSmeri.length; i++) {
            if (plezalneSmeri[i] != null && plezalneSmeri[i].getOznaka() == oznaka) {
                plezalneSmeri[i] = null;
                return true;
            }
        }
        return false;
    }

    /**
     * Iterates through the Plezalisce object's plezalneSmeri array to check the number of non-null values in the 15-element array
     * Since a standard Array was used insted of an ArrayList, iteration is the only way to go I guess. :)
     *
     * @return Integer value representing the number of non-null values in the plezalneSmeri attribute
     */
    public int vrniSteviloSmeri() {
        int count = 0;
        for (PlezalnaSmer smer : plezalneSmeri) {
            if (smer != null) {
                count++;
            }
        }
        return count;
    }

    /**
     * Iteration through Plezalisce's plezalneSmeri array of PlezalnaSmer objects,
     * to check if the PlezalnaSmer instance with a certain oznaka attribute
     * exists in the array
     *
     * @param oznaka Integer value of the PlezalnaSmer's oznaka attribute
     * @return Boolean true/false value depending on the existence of the
     * PlezalnaSmer instance with the given oznaka attribute
     */
    public boolean smerObstaja(int oznaka) {
        for (PlezalnaSmer plezalnaSmer : plezalneSmeri) {
            if (plezalnaSmer != null && plezalnaSmer.getOznaka() == oznaka) {
                return true;
            }
        }
        return false;
    }

    /**
     * Override of the default toString() method
     *
     * @return Plezalisce object parsed to a printable String
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Plezalisce{\n");
        sb.append("naziv='").append(naziv).append('\'');
        sb.append(",\nkraj=").append(kraj);
        sb.append(",\njeUrejeno=").append(jeUrejeno);
        sb.append(",\nplezalneSmeri=").append(Arrays.toString(plezalneSmeri));
        sb.append("}\n");
        return sb.toString();
    }
}

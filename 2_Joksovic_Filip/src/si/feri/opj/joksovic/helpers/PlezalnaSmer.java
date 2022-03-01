package si.feri.opj.joksovic.helpers;

import java.time.LocalDate;

/**
 * PlezalnaSmer Class
 */

public class PlezalnaSmer {

    private int oznaka;
    private String ime;
    private String tezavnost;
    private LocalDate lastView;

    /**
     * Default constructor for PlezalnaSmer class which sets all attributes to their default values
     */
    private PlezalnaSmer() {

    }

    /**
     * PlezalnaSmer constructor which sets the values of <i>oznaka</i> and <i>lastView</i> attributes
     *
     * @param oznaka   Integer value representing the ID of the PlezalnaSmer object
     * @param lastView LocalDate value representing the date of the PlezalnaSmer's last view
     */
    private PlezalnaSmer(int oznaka, LocalDate lastView) {
        this.oznaka = oznaka;
        this.lastView = lastView;
    }

    /**
     * PlezalnaSmer constructor which sets the values of all attributes to their determined values
     *
     * @param oznaka    Integer value representing the ID of the PlezalnaSmer's <i>oznaka</i> attribute
     * @param ime       LocalDate value representing the date of the PlezalnaSmer's <i>last</i> view
     * @param tezavnost String value representing the value of the PlezalnaSmer's <i>tezavnost</i> attribute
     * @param lastView  LocalDate value representing the value of the PlezalnaSmer's <i>lastView</i> attribute
     */
    public PlezalnaSmer(int oznaka, String ime, String tezavnost, LocalDate lastView) {
        this(oznaka, lastView);
        this.ime = ime;
        this.tezavnost = tezavnost;
    }

    /**
     * Getter for the PlezalnaSmer's <i>oznaka</i> attribute
     *
     * @return Integer value representing the value of PlezalnaSmer's <i>oznaka</i> attribute
     */
    public int getOznaka() {
        return oznaka;
    }

    /**
     * Setter for the PlezalnaSmer's <i>oznaka</i> attribute
     *
     * @param oznaka Integer value which will become the PlezalnaSmer's <i>oznaka</i> value
     */
    public void setOznaka(int oznaka) {
        this.oznaka = oznaka;
    }

    /**
     * Getter for the PlezalnaSmer's <i>ime</i> attribute
     *
     * @return Integer value representing the value of PlezalnaSmer's <i>oznaka</i> attribute
     */
    public String getIme() {
        return ime;
    }

    /**
     * Setter for the PlezalnaSmer's <i>ime</i> attribute
     *
     * @param ime Integer value which will become the PlezalnaSmer's <i>oznaka</i> value
     */
    public void setIme(String ime) {
        this.ime = ime;
    }

    /**
     * Getter for the PlezalnaSmer's <i>tezavnost</i> attribute
     *
     * @return String representing the value of PlezalnaSmer's <i>tezavnost</i> attribute
     */
    public String getTezavnost() {
        return tezavnost;
    }

    /**
     * Setter for the PlezalnaSmer's <i>tezavnost</i> attribute
     *
     * @param tezavnost A String which will become the PlezalnaSmer's <i>tezavnost</i> value
     */
    public void setTezavnost(String tezavnost) {
        this.tezavnost = tezavnost;
    }

    /**
     * Getter for the PlezalnaSmer's <i>lastView</i> attribute
     *
     * @return LocalDate instance representing the value of PlezalnaSmer's <i>lastView</i> attribute
     */
    public LocalDate getLastView() {
        return lastView;
    }

    /**
     * Setter for the PlezalnaSmer's <i>lastView</i> attribute
     *
     * @param lastView LocalDate instance which will become the PlezalnaSmer's <i>lastView</i> value
     */
    public void setLastView(LocalDate lastView) {
        this.lastView = lastView;
    }

    /**
     * Override of the default toString() method
     *
     * @return PlezalnaSmer object parsed as a printable String
     */
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("PlezalnaSmer{");
        sb.append("oznaka=").append(oznaka);
        sb.append(", ime='").append(ime).append('\'');
        sb.append(", tezavnost='").append(tezavnost).append('\'');
        sb.append(", lastView=").append(lastView);
        sb.append('}');
        return sb.toString();
    }

    /**
     * Override of the default equals(Object o) method
     *
     * @param o PlezalnaSmer instance
     * @return Boolean value depending if the all object properties match/if the objects are the same
     */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlezalnaSmer that = (PlezalnaSmer) o;
        return oznaka == that.oznaka && ime.equals(that.ime) && tezavnost.equals(that.tezavnost) && lastView.equals(that.lastView);
    }

}



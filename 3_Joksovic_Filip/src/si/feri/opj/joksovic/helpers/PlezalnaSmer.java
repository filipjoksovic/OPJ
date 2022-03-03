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
    private TipSmeri ts;

    private PlezalnaSmer() {

    }

    private PlezalnaSmer(int oznaka, LocalDate lastView) {
        this.oznaka = oznaka;
        this.lastView = lastView;
    }


    public PlezalnaSmer(int oznaka, String ime, String tezavnost, LocalDate lastView) {
        this(oznaka, lastView);
        this.ime = ime;
        this.tezavnost = tezavnost;
    }


    public int getOznaka() {
        return oznaka;
    }


    public void setOznaka(int oznaka) {
        this.oznaka = oznaka;
    }

    public String getIme() {
        return ime;
    }


    public void setIme(String ime) {
        this.ime = ime;
    }


    public String getTezavnost() {
        return tezavnost;
    }


    public void setTezavnost(String tezavnost) {
        this.tezavnost = tezavnost;
    }


    public LocalDate getLastView() {
        return lastView;
    }


    public void setLastView(LocalDate lastView) {
        this.lastView = lastView;
    }

    public TipSmeri getTs() {
        return this.ts;
    }

    public void setTs(TipSmeri ts) {
        this.ts = ts;
    }

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


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PlezalnaSmer that = (PlezalnaSmer) o;
        return oznaka == that.oznaka && ime.equals(that.ime) && tezavnost.equals(that.tezavnost) && lastView.equals(that.lastView);
    }

}



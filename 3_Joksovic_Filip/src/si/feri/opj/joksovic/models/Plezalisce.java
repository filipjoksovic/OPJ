package si.feri.opj.joksovic.models;

import si.feri.opj.joksovic.helpers.Kraj;
import si.feri.opj.joksovic.helpers.Lokacija;
import si.feri.opj.joksovic.helpers.PlezalnaSmer;
import si.feri.opj.joksovic.helpers.TipSmeri;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Arrays;

public class Plezalisce extends Lokacija {
    private boolean jeUrejeno;

    public Plezalisce() {

    }


    public Plezalisce(String naziv, Kraj kraj) {
        super(naziv, kraj);
    }


    public Plezalisce(String naziv, Kraj kraj, boolean jeUrejeno) {
        this(naziv, kraj);
        this.jeUrejeno = jeUrejeno;
    }


    public boolean isJeUrejeno() {
        return jeUrejeno;
    }


    public void setJeUrejeno(boolean jeUrejeno) {
        this.jeUrejeno = jeUrejeno;
    }


    public boolean smerUrejena(PlezalnaSmer ps) {
        LocalDate beforeDate = ps.getLastView().minusDays(30);
        LocalDate currentDate = LocalDate.now();
        long days = ChronoUnit.DAYS.between(beforeDate, currentDate);
        return days <= 30;
    }


    public boolean dodajPlezalnoSmer(PlezalnaSmer noviSmer) {
        try {
            for (int i = 0; i < super.getPlezalneSmeri().length; i++) {
                if (super.getPlezalneSmeri()[i] == null) {
                    super.getPlezalneSmeri()[i] = noviSmer;
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println("Metoda dodajPlezalno smer se ne more poklicati ker PlezalnaSmer polje ni inicijalirizano.");
            return false;
        }
        return false;
    }

    public void odstraniPlezalnoSmer(PlezalnaSmer noviSmer) {
        try {
            for (int i = 0; i < super.getPlezalneSmeri().length; i++) {
                if (super.getPlezalneSmeri()[i] != null && super.getPlezalneSmeri()[i].equals(noviSmer)) {
                    super.getPlezalneSmeri()[i] = null;
                    return;
                }
            }
        } catch (Exception e) {
            System.out.println("Metoda odstraniPlezalnoSmer se ne more poklicati ker polje PlezalnaSmer ni inicijalizirano.");
        }
    }

    public boolean odstraniPlezalnoSmer(int oznaka) {
        try {
            for (int i = 0; i < super.getPlezalneSmeri().length; i++) {
                if (super.getPlezalneSmeri()[i] != null && super.getPlezalneSmeri()[i].getOznaka() == oznaka) {
                    super.getPlezalneSmeri()[i] = null;
                    return true;
                }
            }
        } catch (Exception e) {
            System.out.println("Metoda odstraniPlezalnoSmer se ne more izvesti ker polje PlezalnaSmer[] ni inicijalizirano.");
        }
        return false;
    }

    public int vrniSteviloSmeri() {
        try {
            int count = 0;
            for (PlezalnaSmer smer : super.getPlezalneSmeri()) {
                if (smer != null) {
                    count++;
                }
            }
            return count;
        } catch (Exception e) {
            System.out.println("Metoda vrniSteviloSmeri se ne more izvesti ker je polje PlezalnaSmer[] neinicijalizirano.");
            return 0;
        }
    }

    public boolean smerObstaja(int oznaka) {
        try {
            for (PlezalnaSmer plezalnaSmer : super.getPlezalneSmeri()) {
                if (plezalnaSmer != null && plezalnaSmer.getOznaka() == oznaka) {
                    return true;
                }
            }
            return false;
        } catch (Exception e) {
            System.out.println("Metoda smerObstaja se ne more izvesti ker je polje PlezalnaSmer[] neinicijalizirano.");
            return false;
        }
    }

    /**
     * Override of the default toString() method
     *
     * @return Plezalisce object parsed to a printable String
     */
    @Override
    public String toString() {
        return "Plezalisce{" + "jeUrejeno=" + jeUrejeno + "} " + super.toString();
    }
}

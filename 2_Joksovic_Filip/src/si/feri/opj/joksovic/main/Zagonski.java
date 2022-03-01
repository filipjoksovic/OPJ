package si.feri.opj.joksovic.main;

import java.time.LocalDate;

import si.feri.opj.joksovic.helpers.Kraj;
import si.feri.opj.joksovic.models.Plezalec;
import si.feri.opj.joksovic.models.Plezalisce;
import si.feri.opj.joksovic.helpers.PlezalnaSmer;
import si.feri.opj.joksovic.models.PlezalniCenter;

/**
 * Main program for running the second excercise for the Objektno Programiranje v Javi course
 * Fakulteta za elektrotehniku, racunalnistvo in informatiku
 *
 * @author Joksovic Filip
 * @version 1.0.0
 * @since 24-2-2022
 */

public class Zagonski {

    public static void main(String[] args) {
        //initialized objects
        Kraj k1 = new Kraj("Maribor", "Slovenija");
        Kraj k2 = new Kraj("Ljubljana", "Slovenija");

        PlezalnaSmer ps1 = new PlezalnaSmer(1, "Ime 1", "Tezavnost 1", LocalDate.now().minusDays(30));
        PlezalnaSmer ps2 = new PlezalnaSmer(2, "Ime 2", "Tezavnost 2", LocalDate.now());
        PlezalnaSmer ps3 = new PlezalnaSmer(3, "Ime 3", "Tezavnost 3", LocalDate.of(1999, 2, 15));

        Plezalec plezalec1 = new Plezalec("Ime 1", "Priimek 1");
        Plezalec plezalec2 = new Plezalec();
        Plezalec plezalec3 = new Plezalec("Ime 3", "Priimek 2", "123456789");

        Plezalisce plezalisce1 = new Plezalisce("Ime plezalisca 1", k1);
        Plezalisce plezalisce2 = new Plezalisce("Ime plezalisca 2", k2, true);

        PlezalniCenter pc1 = new PlezalniCenter("Naziv 1", "email@email.com", "+38651789648", k1);
        PlezalniCenter pc2 = new PlezalniCenter("Naziv 2", "email2@email.com", "+38669957055", k2);

        //printing object properties
        System.out.println("Izpis Kraj objektov");
        System.out.println(k1);
        System.out.println(k2);
        System.out.println("---------------------");

        System.out.println("Izpis PlezalnaSmer objektov");
        System.out.println(ps1);
        System.out.println(ps2);
        System.out.println(ps3);
        System.out.println("------------------------------");

        System.out.println("Izpis Plezalec objektov");
        System.out.println(plezalec1);
        System.out.println(plezalec2);
        System.out.println(plezalec3);
        System.out.println("-------------------------");

        System.out.println("Izpis Plezalisce objektov");
        System.out.println(plezalisce1);
        System.out.println(plezalisce2);
        System.out.println("---------------------------");

        System.out.println("Izpis PlezalniCenter objektov");
        System.out.println(pc1);
        System.out.println(pc2);
        System.out.println("-------------------------------");

        //demonstrating Plezalisce's methods
        plezalisce1.dodajPlezalnoSmer(ps1);
        plezalisce1.dodajPlezalnoSmer(ps2);

        plezalisce2.dodajPlezalnoSmer(ps3);
        System.out.println("Po dodajanju PlezalnaSmer objektov");
        System.out.println("Izpis Plezalisce objektov");
        System.out.println(plezalisce1);
        System.out.println(plezalisce2);
        System.out.println("---------------------------");

        System.out.println("Odstranitev po objektu");
        plezalisce1.odstraniPlezalnoSmer(ps1);
        System.out.println("Izpis Plezalisce objektov");
        System.out.println(plezalisce1);
        System.out.println(plezalisce2);
        System.out.println("---------------------------");

        System.out.println("Odstranitev po int oznaki");
        plezalisce1.odstraniPlezalnoSmer(1);
        System.out.println("Izpis Plezalisce objektov");
        System.out.println(plezalisce1);
        System.out.println(plezalisce2);
        System.out.println("---------------------------");

        System.out.println("steviloSmeri za plezalisce1: " + plezalisce1.vrniSteviloSmeri());
        System.out.println("steviloSmeri za plezalisce2: " + plezalisce2.vrniSteviloSmeri());
        System.out.println("---------------------------");

        System.out.println("Preverjanje ali obstaja smer z oznako 3:");
        System.out.println("plezalisce1: " + plezalisce1.smerObstaja(3));
        System.out.println("plezalisce2: " + plezalisce2.smerObstaja(3));

    }
}

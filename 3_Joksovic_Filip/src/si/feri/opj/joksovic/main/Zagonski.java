package si.feri.opj.joksovic.main;

import java.time.LocalDate;

import si.feri.opj.joksovic.helpers.Kraj;
import si.feri.opj.joksovic.helpers.Lokacija;
import si.feri.opj.joksovic.helpers.TipSmeri;
import si.feri.opj.joksovic.models.*;
import si.feri.opj.joksovic.helpers.PlezalnaSmer;

/**
 * Main program for running the second excercise for the Objektno Programiranje v Javi course
 * Fakulteta za elektrotehniku, racunalnistvo in informatiku
 *
 * @author Joksovic Filip
 * @version 1.0.0
 * @since 24-2-2022
 */

public class Zagonski {
    //this is just so code doesn't look ugly if i wanna revert back, ignore
    void naloga_2() {
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

//        PlezalniCenter pc1 = new PlezalniCenter("Naziv 1", "email@email.com", "+38651789648", k1);
//        PlezalniCenter pc2 = new PlezalniCenter("Naziv 2", "email2@email.com", "+38669957055", k2);

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

//        System.out.println("Izpis PlezalniCenter objektov");
//        System.out.println(pc1);
//        System.out.println(pc2);
//        System.out.println("-------------------------------");

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
        BalvanskiCenter bs = new BalvanskiCenter("Tekst", 10);
        VisinskiCenter vs = new VisinskiCenter();
    }

    public static void main(String[] args) {

        BalvanskiCenter bs = new BalvanskiCenter("Naziv balvanskega centra", 10);
        VisinskiCenter vs = new VisinskiCenter("Naziv visinskega centra", 10);
        vs.setEmail("email@email.com");
        vs.setTs(TipSmeri.VISINSKA);
        vs.setKraj(new Kraj("Maribor", "Slovenija"));
        vs.setTelefon("+38151789648");

        PlezalnaSmer ps1 = new PlezalnaSmer(1, "Ime 1", "Tezavnost 1", LocalDate.of(1999, 2, 13));
        PlezalnaSmer ps2 = new PlezalnaSmer(2, "Ime 2", "Tezavnost 2", LocalDate.of(2010, 4, 20));
        PlezalnaSmer ps3 = new PlezalnaSmer(3, "Ime 3", "Tezavnost 3", LocalDate.of(2021, 3, 21));
        PlezalnaSmer ps4 = new PlezalnaSmer(4, "Ime 4", "Tezavnost 4", LocalDate.of(2022, 1, 1));

        ps1.setTs(TipSmeri.BALVAN);
        ps2.setTs(TipSmeri.VISINSKA);
        ps3.setTs(TipSmeri.KOMBINACIJA);

        System.out.println("Prikaz TipSmeri vrednosti za PlezalnaSmer objektov:");
        System.out.println("ps1: " + ps1.getTs());
        System.out.println("ps2: " + ps2.getTs());
        System.out.println("ps3: " + ps3.getTs());
        System.out.println("ps4: " + ps4.getTs());

        bs.ustvariSmer(ps1);
        bs.ustvariSmer(ps2);

        vs.ustvariSmer(ps3);
        vs.ustvariSmer(ps4);

        System.out.println("Kapaciteto balvanskega centra za moznostRazsiritve = false: " + bs.vrniKapaciteto());
        bs.setMoznostRazsiritve(true);
        System.out.println("Kapaciteto balvanskega centra za moznostRazsiritve = true: " + bs.vrniKapaciteto());

        System.out.println("Zasedenost balvanskega centra prej klica razdriSmer metode: " + bs.vrniZasedenost() + "%");
        bs.razdriSmer();
        System.out.println("Zasedenost balvanskega centra po klicu razdriSmer metode: " + bs.vrniZasedenost() + "%");

        System.out.println("\nPrikaz zasebnih objektov:");
        System.out.println("\nBalvanskiCenter:");
        System.out.println(bs);

        System.out.println("\nVisinskiCenter:");
        System.out.println(vs);
    }
}

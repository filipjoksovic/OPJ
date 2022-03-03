package si.feri.opj.joksovic.helpers;

import java.util.Arrays;

public class Lokacija {
    private String naziv;
    private Kraj kraj;
    private TipSmeri ts;
    private PlezalnaSmer[] plezalneSmeri;

    public Lokacija(){

    }
    public Lokacija(String naziv){
        this.naziv = naziv;
    }
    public Lokacija(String naziv, Kraj kraj){
        this.naziv = naziv;
        this.kraj = kraj;
    }

    public String getNaziv(){return this.naziv;}

    public Kraj getKraj(){return this.kraj;}

    public TipSmeri getTs(){return this.ts;}

    public PlezalnaSmer[] getPlezalneSmeri(){return this.plezalneSmeri;}


    public void setNaziv(String naziv){this.naziv = naziv;}

    public void setKraj(Kraj kraj){this.kraj = kraj;}

    public void setTs(TipSmeri ts){this.ts=ts;}

    public void setPlezalneSmeri(PlezalnaSmer[] ps){this.plezalneSmeri = ps;}

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Lokacija{");
        sb.append("naziv='").append(naziv).append('\'');
        sb.append(", kraj=").append(kraj);
        sb.append(", ts=").append(ts);
        sb.append(", plezalneSmeri=").append(Arrays.toString(plezalneSmeri));
        sb.append('}');
        return sb.toString();
    }
}

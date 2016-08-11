
public class Nappula {

    private Ruutu paikka;
    private String arvo;
    private String vari;

    public Nappula(String arvo) {
        this.arvo = arvo;
    }

    public void setPaikka(Ruutu paikka) {
        this.paikka = paikka;
    }

    public void setArvo(String arvo) {
        this.arvo = arvo;
    }

    public void setVari(String vari) {
        this.vari = vari;
    }

    public Ruutu getRuutu() {
        return paikka;
    }

    public String getArvo() {
        return arvo;
    }
    
    public String getVari() {
        return vari;
    }

    public String toString() {
        return arvo;
    }

}

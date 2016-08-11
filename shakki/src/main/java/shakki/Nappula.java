package shakki;


public class Nappula {

    private String arvo;
    private String vari;

    public Nappula(String arvo) {
        this.arvo = arvo;
    }
    
    public void setArvo(String arvo) {
        this.arvo = arvo;
    }

    public void setVari(String vari) {
        this.vari = vari;
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

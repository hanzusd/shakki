
public class Ruutu {

    private int vertical;
    private int horizontal;
    private Nappula nappula;
    private String ruudunArvo;

    public Ruutu(int x, int y) {
        this.horizontal = x;
        this.vertical = y;
        this.ruudunArvo = " ";
    }

    public void lisaaNappula(Nappula nappula) {
        this.nappula = nappula;
        this.ruudunArvo = nappula.getArvo();
    }

    public void poistaNappula() {
        this.ruudunArvo = " ";
    }

    public void siirraNappula(Ruutu mihin) {
        mihin.lisaaNappula(nappula);
    }

    public boolean saakoLiikkua(Saannot saannot, Ruutu mistä, Ruutu mihin) {
        if (mistä.nappula.getArvo().equals("s")) {

            if (saannot.saakoSotilasLiikkua(mistä, mihin) == true) {
                return true;
            }
        } else if (mistä.nappula.getArvo().equals("t")) {
            if (saannot.saakoTorniLiikkua(mistä, mihin) == true) {
                return true;
            }
        }
        return false;
    }

    public boolean onNappula() {
        if (nappula.getArvo().equals(" ")) {
            return false;
        }
        return true;
    }

    public int getX() {
        return horizontal;
    }

    public int getY() {
        return vertical;
    }

    public boolean equals(Ruutu ruutu) {
        if (ruutu == null) {
            return false;
        }
        if (this.getX() != ruutu.getX() || this.getY() != ruutu.getY()) {
            return false;
        }
        return true;
    }

    public String toString() {
        return "| " + ruudunArvo + " ";
    }

}

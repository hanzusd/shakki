package shakki;


import java.util.ArrayList;
import java.util.List;

public class Kentta {
    public List<Ruutu> kentta;
    public Saannot saannot;

    public Kentta() {
        this.saannot = new Saannot();
        this.kentta = new ArrayList<>();
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                kentta.add(new Ruutu(j, i));
            }
        }
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                if (i == 2 || i == 7) {
                    for (Ruutu ruutu : kentta) {
                        if (ruutu.getY() == i) {
                            ruutu.lisaaNappula(new Nappula("s"));
                        }
                    }
                }
                if (i == 1 || i == 8) {
                    for (Ruutu ruutu : kentta) {
                        if (ruutu.getY() == i && (ruutu.getX() == 1 || ruutu.getX() == 8)) {
                            ruutu.lisaaNappula(new Nappula("t"));
                        } else if (ruutu.getY() == i && (ruutu.getX() == 2 || ruutu.getX() == 7)) {
                            ruutu.lisaaNappula(new Nappula("h"));
                        } else if (ruutu.getY() == i && (ruutu.getX() == 3 || ruutu.getX() == 6)) {
                            ruutu.lisaaNappula(new Nappula("l"));
                        } else if (ruutu.getY() == i && ruutu.getX() == 4) {
                            ruutu.lisaaNappula(new Nappula("K"));
                        } else if (ruutu.getY() == i && ruutu.getX() == 5) {
                            ruutu.lisaaNappula(new Nappula("k"));
                        }
                    }
                }
            }
        }
    }

    public void liikuta(int x1, int y1, int x2, int y2) {
        for (Ruutu mista : kentta) {
            if (mista.equals(new Ruutu(x1, y1))) {
                for (Ruutu mihin : kentta) {
                    if (mihin.equals(new Ruutu(x2, y2))) {
                        if (mista.saakoLiikkua(saannot, mista, mihin)) {
                            mista.siirraNappula(mihin);
                            mista.poistaNappula();
                        }
                    }
                }
            }
        }
    }

    public String toString() {
        String asia = "";
        for (int i = 1; i < 9; i++) {
            for (Ruutu ruutu : kentta) {
                if (ruutu.getY() == i) {
                    asia += ruutu.toString();
                }
            }
            asia += "| \n";
        }
        return asia;
    }
}


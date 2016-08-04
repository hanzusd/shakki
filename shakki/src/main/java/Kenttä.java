
import java.util.ArrayList;
import java.util.List;

public class Kenttä {

    public List<Nappula> kenttä;

    public Kenttä() {
        this.kenttä = new ArrayList<>();
 
        for (int i = 1; i < 9; i++) {
            for (int j = 1; j < 9; j++) {
                if (i == 1 || i == 2 || i == 7 || i == 8) {
                    kenttä.add(new Nappula(j, i));
                }
            }
        }

    }
    
    public String toString() {
        String asia = "";
        for (int i = 1; i < 9; i++) {
            for (Nappula nappula : kenttä) {
            if ((nappula.getPaikka()).getY() == i) {
            asia += "x ";
            }
        }
        asia += "\n";
        }
        return asia;
    }

}

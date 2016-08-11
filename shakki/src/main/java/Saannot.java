


public class Saannot {

    public boolean saakoSotilasLiikkua(Ruutu mista, Ruutu mihin) {
        if ((mihin.getY() == (mista.getY() + 1) && mihin.getX() == mista.getX())
                || (mihin.getY() == (mista.getY() - 1) && mihin.getX() == mista.getX())) {
            return true;
        }
        if (mista.getY() == 2 || mista.getY() == 7) {
            if (mihin.getY() == (mista.getY() + 2) && mihin.getX() == mista.getX()) {
                return true;
            }
        } else if (mihin.onNappula()
                && ((mihin.getY() == (mista.getY() + 1) || (mihin.getY() == (mista.getY() - 1))))
                && ((mihin.getX() == (mista.getX() - 1)) || (mihin.getX() == (mista.getX() + 1)))) {
            return true;
        }
        return false;
    }

    public boolean saakoTorniLiikkua(Ruutu mista, Ruutu mihin) {
        for (int i = 1; i < 9; i++) {
            if ((mihin.getX() == (mista.getX() + i) && mihin.getY() == mista.getY())
                    || mihin.getX() == mista.getX() && mihin.getY() == (mista.getY() + i)) {
                return true;
            }
        }
        return false;
    }

}

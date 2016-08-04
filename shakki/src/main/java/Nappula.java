
public class Nappula {
    private Ruutu paikka;
    private String arvo;
    
    public Nappula(int x, int y) {
        this.arvo = arvo;
        this.paikka = new Ruutu(x, y);
    }
    
    public Ruutu liikuta(int i, int j) {
        this.paikka = new Ruutu(i, j);
        return paikka;
    }
    
    public boolean saakoLiikkua() {
        return true;
    }
    
    public Ruutu getPaikka() {
        return paikka;
    }
    
    public String toString() {
        return paikka.toString();
    }
    
}

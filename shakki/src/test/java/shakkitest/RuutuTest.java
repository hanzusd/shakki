package shakkitest;



import shakki.Ruutu;
import shakki.Nappula;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Hansu
 */
public class RuutuTest {
    
    public RuutuTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }
    
    @Test
    public void konstruktoriAsettaaOikeanXKoordinaatin() {
        Ruutu ruutu = new Ruutu(1, 2);
        int vastaus = ruutu.getX();
        
        assertEquals(1, vastaus);
    }
    
    @Test
    public void konstruktoriAsettaaOikeanYKoordinaatin() {
        Ruutu ruutu = new Ruutu(1, 4);
        int vastaus = ruutu.getY();
        
        assertEquals(4, vastaus);
    }
    
    @Test
    public void konstruktoriAsettaaOikeanRuudunArvon() {
        Ruutu ruutu = new Ruutu(1, 1);
        String vastaus = ruutu.getRuudunArvo();
        
        assertEquals(" ", vastaus);
    }
    
    @Test
    public void lisaaNappulaLisaaOikein() {
        Ruutu ruutu = new Ruutu(1, 1);
        Nappula nappula = new Nappula("zzz");
        ruutu.lisaaNappula(nappula);
        String vastaus = ruutu.getRuudunArvo();
        
        assertEquals("zzz", vastaus);
    }
    
    @Test
    public void poistaNappulaPoistaaOikein() {
        Ruutu ruutu = new Ruutu(1, 1);
        Nappula nappula = new Nappula("zzz");
        ruutu.lisaaNappula(nappula);
        ruutu.poistaNappula();
        String vastaus = ruutu.getRuudunArvo();
        
        assertEquals(" ", vastaus);
    }
    
    @Test
    public void onNappulaTunnistaaNappulan() {
        Ruutu ruutu = new Ruutu(1, 1);
        Ruutu ruutu2 = new Ruutu(2, 4);
        Nappula nappula = new Nappula("zzz");
        ruutu.lisaaNappula(nappula);
        boolean vastaus = ruutu.onNappula();
        
        assertEquals(true, vastaus);
    }
    
    @Test
    public void onNappulaTunnistaaEiNappulaa() {
        Ruutu ruutu = new Ruutu(1, 1);
        Ruutu ruutu2 = new Ruutu(2, 4);
        Nappula nappula = new Nappula("zzz");
        ruutu2.lisaaNappula(nappula);
        boolean vastaus = ruutu.onNappula();
        
        assertEquals(false, vastaus);
    }

    @Test
    public void equalsMetodiTunnistaaSamat() {
        Ruutu ruutu1 = new Ruutu(1, 1);
        Ruutu ruutu2 = new Ruutu(1, 1);
        boolean vastaus = ruutu1.equals(ruutu2);
        
        assertEquals(true, vastaus);
    }
    
    @Test
    public void equalsMetodiTunnistaaEri() {
        Ruutu ruutu1 = new Ruutu(1, 1);
        Ruutu ruutu2 = new Ruutu(1, 2);
        boolean vastaus = ruutu1.equals(ruutu2);
        
        assertEquals(false, vastaus);
    }
    
    @Test
    public void toStringAntaaOikein() {
        Ruutu ruutu = new Ruutu(1, 1);
        String vastaus = ruutu.toString();
        
        assertEquals("|   ", vastaus);
    }
   
}

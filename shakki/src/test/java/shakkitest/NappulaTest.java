package shakkitest;


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
public class NappulaTest {
    
    public NappulaTest() {
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
    public void konstruktoriAsettaaArvon() {
       Nappula nappula = new Nappula("aijai");
       String oikein = nappula.getArvo();
       
       assertEquals("aijai", oikein);  
    }
    
    @Test
    public void setVariAsettaaOikein() {
        Nappula nappula = new Nappula("x");
        nappula.setVari("valkoinen");
        String oikein = nappula.getVari();
        
        assertEquals("valkoinen", oikein);
    }
    
    @Test
    public void toStringAntaaOikein() {
        Nappula nappula = new Nappula("x");
        String oikein = nappula.toString();
        
        assertEquals("x", oikein);
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}

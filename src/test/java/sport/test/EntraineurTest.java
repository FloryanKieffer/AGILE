package sport.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import sport.main.Entraineur;
import sport.main.Equipe;

public class EntraineurTest extends TestCase {
    private Equipe psg;
    private Equipe lyon;
    private Equipe marseille;
    private Entraineur celine;
    private Entraineur doe;
    private Entraineur floryan;

    public EntraineurTest() {}

    @Before
    public void setUp() // throws java.lang.Exception
    {
        psg = new Equipe();
        lyon = new Equipe();
        marseille = new Equipe();
        floryan = new Entraineur();
        doe = new Entraineur();
        celine = new Entraineur();
    }

  
    @After
    public void tearDown() {}

    @Test
    public void testPerformance() {
        psg.setPoints(1);
        celine.setEquipe(psg);
        celine.performance();
        assertEquals("Mauvais", celine.getPerf());
        lyon.setPoints(2);
        doe.setEquipe(lyon);
        doe.performance();
        assertEquals("Moyen", doe.getPerf());
        marseille.setPoints(3);
        floryan.setEquipe(marseille);
        floryan.performance();
        assertEquals("Bon", floryan.getPerf());
    }

    @Test
    public void testAjouterEquipe() {
        celine.setEquipe(lyon);
        assertEquals(1, celine.getHistorique().size());
        celine.ajouterEquipe(psg);
        assertEquals(2, celine.getHistorique().size());
        celine.setEquipe(marseille);
        assertEquals(3, celine.getHistorique().size());
        floryan.setEquipe(marseille);
        floryan.ajouterEquipe(psg);
        assertEquals(2, floryan.getHistorique().size());
    }

    @Test
    public void testSupprimerEquipe() {
        celine.setEquipe(lyon);
        celine.ajouterEquipe(psg);
        celine.setEquipe(marseille);
        celine.supprimerEquipe(lyon);
        assertEquals(2, celine.getHistorique().size());
        celine.supprimerEquipe(psg);
        assertEquals(1, celine.getHistorique().size());
        celine.supprimerEquipe(marseille);
        assertEquals(0, celine.getHistorique().size());
        floryan.setEquipe(marseille);
        Equipe psg = new Equipe();
        floryan.ajouterEquipe(psg);
        floryan.supprimerEquipe(marseille);
        assertEquals(1, floryan.getHistorique().size());
    }

    @Test
    public void testEquals() {
        assertEquals(celine, doe);
        celine.ajouterEquipe(psg);
        assertNotSame(celine, doe);
        doe.ajouterEquipe(psg);
        assertEquals(celine, doe);
        celine.setPerf("Bon");
        assertNotSame(celine, doe);
        doe.setPerf("Bon");
        assertEquals(celine, doe);
    }
}

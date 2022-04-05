package sport.test;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import junit.framework.TestCase;
import sport.main.Equipe;


public class EquipeTest extends TestCase {

	// Définissez ici les variables d'instance nécessaires à vos engagements;
    // Vous pouvez également les saisir automatiquement du présentoir
    // à l'aide du menu contextuel "Présentoir --> Engagements".
    // Notez cependant que ce dernier ne peut saisir les objets primitifs
    // du présentoir (les objets sans constructeur, comme int, float, etc.).
    Equipe psg;
    Equipe lyon;
    Equipe marseille;
    /**
     * Constructeur de la classe-test EquipeTest
     */
    public EquipeTest()
    {
    }

    /**
     * Met en place les engagements.
     *
     * Méthode appelée avant chaque appel de méthode de test.
     */
    @Before
    public void setUp() // throws java.lang.Exception
    {
        // Initialisez ici vos engagements
        psg = new Equipe();
        lyon = new Equipe();
        marseille = new Equipe();
    }

    /**
     * Supprime les engagements
     *
     * Méthode appelée après chaque appel de méthode de test.
     */
    @After
    public void tearDown() {}

    @Test
    public void testMatch()
    {
        assertEquals(0, psg.getPointsCumul());
        assertEquals(0, lyon.getPointsCumul());
        Equipe.match(psg, 2, lyon, 1);
        assertEquals(3, psg.getPointsCumul());
        assertEquals(0, lyon.getPointsCumul());
        Equipe.match(psg, 2, lyon, 2);
        assertEquals(4, psg.getPointsCumul());
        assertEquals(1, lyon.getPointsCumul());
        Equipe.match(psg, 4, marseille, 0);
        assertEquals(7, psg.getPointsCumul());
        assertEquals(0, marseille.getPointsCumul());
    }
}
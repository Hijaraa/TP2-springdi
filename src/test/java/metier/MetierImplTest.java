package metier;

import dao.IDao;
import org.junit.Assert;
import org.junit.Test;

public class MetierImplTest {

    @Test
    public void testCalcul() {
        // Implémentation fictive de IDao
        IDao dao = new IDao() {
            @Override
            public double getValue() {
                return 10.0;
            }
        };

        // Création de MetierImpl et injection manuelle
        MetierImpl metier = new MetierImpl();
        metier.setDao(dao);

        // Vérification du résultat
        double result = metier.calcul();
        Assert.assertEquals(20.0, result, 0.001);
    }
}

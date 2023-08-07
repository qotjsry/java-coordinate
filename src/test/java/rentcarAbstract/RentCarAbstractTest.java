package rentcarAbstract;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import rentcarAbstract.Avante;
import rentcarAbstract.K5;
import rentcarAbstract.RentCompany;
import rentcarAbstract.Sonata;

public class RentCarAbstractTest {
    private static final String NEWLINE = System.getProperty("line.separator");
    @Test
    public void reportTest() throws Exception {
        RentCompany company = RentCompany.create();
        company.addCar(new Sonata(150));
        company.addCar(new K5(260));
        company.addCar(new Sonata(120));
        company.addCar(new Avante(300));
        company.addCar(new K5(390));
        String repost = company.generateReport();
        Assertions.assertThat(repost).isEqualTo(
                "Sonata : 15리터" +NEWLINE+
                        "K5 : 20리터" +NEWLINE+
                        "Sonata : 12리터" +NEWLINE+
                        "Avante : 20리터" +NEWLINE+
                        "K5 : 30리터" +NEWLINE);
    }

}

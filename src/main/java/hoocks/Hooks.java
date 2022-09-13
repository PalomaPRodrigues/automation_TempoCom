package hoocks;



import drive.DriverFactory;
import io.cucumber.java.After;
import io.cucumber.java.Scenario;
import io.cucumber.java.Before;

import static drive.DriverFactory.encerraDriver;

public class Hooks {
    @Before
    public static void inicializaBrowser(Scenario teste) {
        System.out.println("inicio do teste: " + teste.getName());
    }


    @After
    public static void finalizarTeste(Scenario teste) {
        new DriverFactory().screenshot(String.valueOf(teste.getStatus()), teste.getName());
        System.out.println("Teste finalizado. Status de Teste: " + teste.getStatus());
        encerraDriver();
    }
}

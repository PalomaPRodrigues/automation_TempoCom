package pageObjects.buscaTemperatura;

import Utils.EnviarEmail;
import drive.DriverFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class BuscaTemperaturaLogic extends DriverFactory {
    private BuscaTemperaturaPage buscaTemperaturaPage;
    private EnviarEmail enviarEmail;

    public BuscaTemperaturaLogic() {
        buscaTemperaturaPage = new BuscaTemperaturaPage();
        enviarEmail = new EnviarEmail();
    }

    public void navega() {
        navega("https://www.tempo.com/");
        tempoDeEspera(20);
    }

    public void btnAceita() {
        Actions actions = new Actions(driver);
        WebElement searchBtn = driver.findElement(buscaTemperaturaPage.getBtnAceita());
        actions.click(searchBtn).build().perform();
    }

    public void clicaBuscar() {
        buscaTemperaturaPage.getCmpBusca().findElement(driver).click();
    }

    public void preenchecidade(String cidade) {
        WebElement pesquisa = driver.findElement((buscaTemperaturaPage.getCmpCidade()));
        buscaTemperaturaPage.getCmpCidade().findElement(driver).sendKeys(cidade);
        pesquisa.sendKeys(Keys.ENTER);
        tempoDeEspera(5000);
    }

    public void selecionaPeriodo() {
        tempoDeEspera(500);
        buscaTemperaturaPage.getSltperiodo().findElement(driver).click();
    }

    public void clicaPdf() {
        buscaTemperaturaPage.getBtnPdf().findElement(driver).click();
        tempoDeEspera(700);
    }
    public void enviaEmail() {
        enviarEmail.envioEmail();
    }

}

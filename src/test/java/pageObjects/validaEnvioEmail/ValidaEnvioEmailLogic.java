package pageObjects.validaEnvioEmail;

import drive.DriverFactory;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
public class ValidaEnvioEmailLogic extends DriverFactory {
    private ValidaEnvioEmailPage validaEnvioEmailPage;

    public ValidaEnvioEmailLogic(){
        validaEnvioEmailPage = new ValidaEnvioEmailPage();
    }

    public void navega(){
        navega("https://mail.google.com/mail");
    }

    public void preencheEmail(String email){
        validaEnvioEmailPage.getCmpEmail().findElement(driver).sendKeys(email);
        tempoDeEspera(500);
    }

    public void clicaAvancar(){
        validaEnvioEmailPage.getBtnAvancar().findElement(driver).click();
        tempoDeEspera(5000);
    }

    public void preencheSenha(String senha){
        validaEnvioEmailPage.getCmpSenha().findElement(driver).sendKeys(senha);
        tempoDeEspera(5000);
    }

    public void clicaAvanca() {
        validaEnvioEmailPage.getBtnAvanca().findElement(driver).click();
        tempoDeEspera(6000);
    }

    public void validoMsg(String msgFinal) {
        String cmpValidacao = String.format(validaEnvioEmailPage.getTxtVisivel(), msgFinal);
        tempoDeEspera(2000);
        WebElement xpathMsg = driver.findElement(By.xpath(cmpValidacao));
        Assert.assertTrue(xpathMsg.isDisplayed());
    }
}

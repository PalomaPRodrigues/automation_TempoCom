package pageObjects.validaEnvioEmail;

import org.openqa.selenium.By;

public class ValidaEnvioEmailPage {

    private String txtVisivel = "(//*[contains(text(),'%1$s')])[4]";
    private By cmpEmail = By.xpath("//input[@type ='email']");

    private By btnAvancar = By.xpath("(//span[@class='VfPpkd-vQzf8d'])[2]");

    private By cmpSenha = By.xpath("//input[@type='password']");

    private By btnAvanca = By.xpath("(//span[@jsname='V67aGc'])[2]");

    private By btnLerEmail = By.xpath("//tr[@class='zA zE byw']");

    public By getCmpEmail() {
        return cmpEmail;
    }
    public By getBtnAvancar() {
        return btnAvancar;
    }
    public By getCmpSenha() {
        return cmpSenha;
    }
    public By getBtnAvanca() {
        return btnAvanca;
    }
    public By getBtnLerEmail() {
        return btnLerEmail;
    }
    public String getTxtVisivel() {
        return txtVisivel;
    }
}

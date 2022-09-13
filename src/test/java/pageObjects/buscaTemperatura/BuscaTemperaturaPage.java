package pageObjects.buscaTemperatura;

import org.openqa.selenium.By;

public class BuscaTemperaturaPage {

    private By btnAceita = By.xpath("//span[@class='textFoot'][2]/./input[@id='sendOpGdpr']");

    private By cmpBusca = By.id("buscador");

    private By cmpCidade = By.xpath("//input[@id='search_pc']");

    private By sltperiodo = By.xpath("//a[@title ='8 - 14 dias']");

    private By btnPdf = By.xpath("//a[@class='efectPDF']");

    public By getBtnAceita() {
        return btnAceita;
    }
    public By getCmpBusca() {
        return cmpBusca;
    }
    public By getCmpCidade() {
        return cmpCidade;
    }
    public By getSltperiodo() {
        return sltperiodo;
    }
    public By getBtnPdf() {
        return btnPdf;
    }

}
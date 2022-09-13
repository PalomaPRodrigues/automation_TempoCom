package pageObjects.buscaTemperatura;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;


public class BuscaTemperaturaSteps {
    private BuscaTemperaturaLogic buscaTemperaturaLogic;

    public BuscaTemperaturaSteps() {
        buscaTemperaturaLogic = new BuscaTemperaturaLogic();
    }

    @Dado("que acesso a pagina home do site")
    public void que_acesso_a_pagina_home_do_site() {
        buscaTemperaturaLogic.navega();
    }

    @Dado("clico em aceitar")
    public void clico_em_aceitar() {
        buscaTemperaturaLogic.btnAceita();
    }

    @Dado("clico no campo buscar")
    public void clico_no_campo_buscar() {
        buscaTemperaturaLogic.clicaBuscar();
    }

    @E("preencho o nome da cidade {string}")
    public void preencho_o_nome_da_cidade(String cidade) {
        buscaTemperaturaLogic.preenchecidade(cidade);
    }

    @Quando("seleciono o periodo de pesquisa")
    public void seleciono_o_periodo_de_pesquisa() {
        buscaTemperaturaLogic.selecionaPeriodo();
    }

    @Quando("clico em pdf")
    public void clico_em_pdf() {
        buscaTemperaturaLogic.clicaPdf();
    }

    @Entao("envio o email com a previsão do tempo")
    public void envio_o_email_com_a_previsão_do_tempo() {
        buscaTemperaturaLogic.enviaEmail();
    }

}


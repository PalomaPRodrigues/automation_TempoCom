package pageObjects.validaEnvioEmail;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.E;
import io.cucumber.java.pt.Entao;
import io.cucumber.java.pt.Quando;

public class ValidaEnvioEmailStep {

    private ValidaEnvioEmailLogic validaEnvioEmailLogic;

    public ValidaEnvioEmailStep(){
        validaEnvioEmailLogic = new ValidaEnvioEmailLogic();
    }
    @Dado("que acesso a pagina de login")
    public void que_acesso_a_pagina_de_login() {
        validaEnvioEmailLogic.navega();
    }
    @E("preencho email {string}")
    public void preencho_email(String email) {
        validaEnvioEmailLogic.preencheEmail(email);
    }
    @E("clico em Avancar")
    public void clico_em_avancar() {
        validaEnvioEmailLogic.clicaAvancar();
    }
    @E("preencho senha {string}")
    public void preencho_senha(String senha) {
        validaEnvioEmailLogic.preencheSenha(senha);
    }
    @E("clico em Avanca")
    public void clico_em_avanca() {
        validaEnvioEmailLogic.clicaAvanca();
    }
    @Quando("clico no email de Previsão do tempo")
    public void clico_no_email_de_previsão_do_tempo() {
        validaEnvioEmailLogic.clicaEmail();
    }
    @Entao("valido que o recebimento do email {string}")
    public void valido_que_o_recebimento_do_email(String msgFinal) {
        validaEnvioEmailLogic.validoMsg(msgFinal);
    }
}

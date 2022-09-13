package Utils;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.EmailAttachment;
import org.apache.commons.mail.HtmlEmail;

public class EnviarEmail {

    public String envioEmail() {


        HtmlEmail email = new HtmlEmail();

        String usuario = "paloma.gpedro@gmail.com";
        String senha = "wpgklqeydrnnisce";
        String destinatario = "testesenvioemailtemperatura@gmail.com";

        email.setDebug(true);
        email.setHostName("smtp.gmail.com");
        email.setSmtpPort(465);

        email.setStartTLSEnabled(true);
        email.setAuthenticator(new DefaultAuthenticator(usuario, senha));
        email.setSSLOnConnect(true);

        try {

            email.setFrom(usuario, "Tempo.Com");
            email.setSubject("Previsão do Tempo");
            email.setSentDate(new java.util.Date());
            email.setMsg("Olá Bom dia! Segue em anexo a previsão do tempo de 8-14 dias");

            EmailAttachment anexo = new EmailAttachment();
            anexo.setPath("C:\\Users\\paloma.rodrigues\\Downloads\\O Tempo em -Sorocaba.pdf");
            anexo.setDescription("attachement");
            anexo.setName("O Tempo em -Sorocaba.pdf");
            email.attach(anexo);

            email.addTo(destinatario);

            email.send();
            System.out.println("Email enviado com sucesso");
        } catch (Exception e) {
            e.printStackTrace();

        }

        return usuario;
    }
}

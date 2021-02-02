package com.company.bibliotecaemail;

import org.apache.commons.mail.DefaultAuthenticator;
import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;


public class UsandoBibliotecaEmail {

    public static void main (String [] args) throws EmailException {


            Email email = new SimpleEmail();
            //smtp é o servidor do smtp do gmail
            email.setHostName("smtp.googlemail.com");
            //setSmtpPort(465) é a porta do servidor
            email.setSmtpPort(465);
            email.setAuthenticator(new DefaultAuthenticator("digitalnotebook8", "cursologicajava77"));
            email.setSSLOnConnect(true);
            email.setFrom("digitalnotebook8@gmail.com");
            email.setSubject("Aula sobre uso de bibliotecas e libraries");
            email.setMsg("Isto é um teste... :-)");
            email.addTo("simoneperiodista3@gmail.com");
            email.send();
            System.out.println("Fim");
    }
}

package org.coi.ilon.config;

import org.coi.ilon.client.SoapClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

@Configuration
public class SoapConfig {

    @Bean
    public Jaxb2Marshaller marshaller(){
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("org.coi.ilon.proxyclasses");
        return marshaller;
    }

    @Bean
    @Primary
    public SoapClient soappClient(Jaxb2Marshaller marshaller){
        SoapClient soappClient = new SoapClient();
        soappClient.setDefaultUri("http://166.239.253.242:8787/WSDL/v4.0/iLON100.wsdl");
        soappClient.setMarshaller(marshaller);
        soappClient.setUnmarshaller(marshaller);
        return soappClient;
    }

}

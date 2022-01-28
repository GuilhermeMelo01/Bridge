package com.company.bridge.platforms;

public class FacebookLive implements IPlatforms{

    public FacebookLive(){
        configureRMTP();
        System.out.println("Facebook: Transmissao Iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("Facebook: Conta autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("Facebook: Autorizando aplicaçao");
    }
}

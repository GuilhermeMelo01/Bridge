package com.company.bridge.platforms;

public class YouTube implements IPlatforms{
    public YouTube(){
        configureRMTP();
        System.out.println("YouTube: Transmissao Iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("YouTube: Conta autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("YouTube: Autorizando aplicaçao");
    }
}

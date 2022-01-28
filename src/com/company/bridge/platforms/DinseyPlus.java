package com.company.bridge.platforms;

public class DinseyPlus implements IPlatforms{

    public DinseyPlus(){
        configureRMTP();
        System.out.println("DinseyPlus: Transmissao Iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("DinseyPlus: Conta autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("DinseyPlus: Autorizando aplicaçao");
    }
}

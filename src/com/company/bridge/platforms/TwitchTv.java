package com.company.bridge.platforms;

public class TwitchTv implements IPlatforms{
    public TwitchTv(){
        configureRMTP();
        System.out.println("TwitchTv: Transmissao Iniciada");
    }

    @Override
    public void configureRMTP() {
        authToken();
        System.out.println("TwitchTv: Conta autorizada");
    }

    @Override
    public void authToken() {
        System.out.println("TwitchTv: Autorizando aplicaçao");
    }
}

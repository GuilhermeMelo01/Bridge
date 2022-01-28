package com.company.bridge.transmissions;

import com.company.bridge.platforms.IPlatforms;

public class Live implements ITransmission {

    protected IPlatforms iPlatforms;

    public Live() {

    }

    public Live(IPlatforms iPlatforms) {
        this.iPlatforms = iPlatforms;
    }

    @Override
    public void broadcasting() {
        System.out.println("Iniciando a Transmissao!  ");
    }

    @Override
    public void result() {
        System.out.println("**** ON AIR ****");
    }
}

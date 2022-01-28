package com.company.bridge.transmissions;

import com.company.bridge.platforms.IPlatforms;

public class AdvanceLive extends Live{

    public AdvanceLive(IPlatforms iPlatforms){
        super.iPlatforms = iPlatforms;
    }

    public void subTitles(){
        System.out.println("Legendas ativadas na transmissao");
    }

    public void comments(){
        System.out.println("Comentarios liberados na live");
    }

}

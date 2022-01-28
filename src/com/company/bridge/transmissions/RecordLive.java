package com.company.bridge.transmissions;

import com.company.bridge.platforms.IPlatforms;

public class RecordLive extends Live{

    protected IPlatforms iPlatforms;

    public RecordLive(IPlatforms iPlatforms){
        super.iPlatforms = iPlatforms;
    }

    public void record(){
        System.out.println("Gravando a Live...");
    }
}

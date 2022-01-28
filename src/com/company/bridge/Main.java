package com.company.bridge;

import com.company.bridge.platforms.FacebookLive;
import com.company.bridge.platforms.IPlatforms;
import com.company.bridge.platforms.TwitchTv;
import com.company.bridge.platforms.YouTube;
import com.company.bridge.transmissions.AdvanceLive;
import com.company.bridge.transmissions.RecordLive;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        startLive(new YouTube());
        startLive(new FacebookLive());
        startLive(new TwitchTv());
    }

    public static void startLive(IPlatforms iPlatforms){
        /* System.out.println("...aguarde!");
        Live live = new Live(iPlatforms);
        live.broadcasting();
        live.result();
         */

//    System.out.println("Transmissao avancada... aguarde");
//        AdvanceLive advanceLive = new AdvanceLive(iPlatforms);
//        advanceLive.broadcasting();
//        advanceLive.result();
//        advanceLive.subTitles();
//        advanceLive.comments();

        System.out.println("Transmissao gravada... aguarde");
        RecordLive recordLive = new RecordLive(iPlatforms);
        recordLive.broadcasting();
        recordLive.result();
        recordLive.record();
    }

}

package com.erdioran.constants;

public class Constant {

    private Constant(){}

    private static final String resourcepath = System.getProperty("user.dir") + "/src/test/resources";
    private static final String apkfilepath = resourcepath+"/apkfiles/evam_android_v102.apk";
    private static final String configfilepath = resourcepath+"/config/config.properties";

    public static String getApkFilePath() {
        return apkfilepath;
    }

    public static String getConfigFilePath() {
        return configfilepath;
    }


}


package com.erdioran.constants;


public class Constant {

    private Constant(){}

    public static final String PARENT_DIR = System.getProperty("user.dir");
    private static final String configfilepath = PARENT_DIR+"/src/test/resources/config/config.properties";

    public static String getConfigFilePath() {
        return configfilepath;
    }

}


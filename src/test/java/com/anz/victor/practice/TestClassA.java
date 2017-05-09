package com.anz.victor.practice;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.junit.Test;

public class TestClassA {

    private Logger logger = Logger.getLogger(getClass());

    @Test
    public void Test() {

        String log4JPropertyFile = "C:/ANZ Materials/PRDM/Developement/Cods Backup Repository/log4j.properties";
        PropertyConfigurator.configure(log4JPropertyFile);
        logger.warn("Wow! I'm configured again !");
    }

}

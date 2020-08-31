package com.nisum.java9Features.privatemethod;

import java.util.logging.Logger;

public interface Java9InterfStatic {
     final static Logger log =Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void m1()
    {
         m3();
    }
    public static void m2()
    {
         m3();
    }
    private static void m3()
    {
         log.info("common functionality of methods m1 & m2");
    }
}

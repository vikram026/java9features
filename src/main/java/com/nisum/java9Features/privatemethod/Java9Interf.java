package com.nisum.java9Features.privatemethod;

import java.util.logging.Logger;

public interface Java9Interf
{
   final static Logger log =Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    default void m1()
    {
        m3();
    }
    default void m2()
    {
        m3();
    }
    private void m3()
     {
       log.info("common functionality of methods m1 & m2");
     }
}

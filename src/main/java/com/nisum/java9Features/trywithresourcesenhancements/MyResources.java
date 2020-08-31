package com.nisum.java9Features.trywithresourcesenhancements;

import java.util.logging.Logger;

public class MyResources implements AutoCloseable {
    private final static Logger log =Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    MyResources()
     {
        log.info("Resource Creation...");
     }
     public void doProcess()
     {
         log.info("Resource Processing...");
     }
     public void close()
     {
         log.info("Resource Closing...");
     }

}

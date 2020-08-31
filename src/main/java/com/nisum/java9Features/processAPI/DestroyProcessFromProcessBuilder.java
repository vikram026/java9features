package com.nisum.java9Features.processAPI;

import java.util.logging.Logger;


public class DestroyProcessFromProcessBuilder {
    private final static Logger log =Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    static ProcessBuilder pb;
    public static void main(String[] args) throws Exception {
        pb= new ProcessBuilder("java", "sample");
        Process p = pb.start();
        log.info("Process Started with id:" + p.pid());
        Thread.sleep(10000);
        log.info("Destroying the process with id:" + p.pid());
        p.destroy();
    }

}

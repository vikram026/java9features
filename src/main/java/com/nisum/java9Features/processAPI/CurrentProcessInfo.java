package com.nisum.java9Features.processAPI;

import java.util.logging.Logger;

public class CurrentProcessInfo {
    private final static Logger log =Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    static ProcessHandle p;
    static ProcessHandle.Info info;
    public static void main(String[] args) throws Exception {
            p = ProcessHandle.current();
            info = p.info();
            log.info("Complete Process Inforamtion:\n" + info);
            log.info("User: " + info.user().get());
            log.info("Command: " + info.command().get());
            log.info("Start Time: " + info.startInstant().get());
            log.info("Total CPU Time Acquired: " + info.totalCpuDuration().get());
        }
}

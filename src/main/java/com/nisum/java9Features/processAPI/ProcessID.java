package com.nisum.java9Features.processAPI;

import java.util.logging.Logger;

public class ProcessID {
    private final static Logger log =Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) throws Exception {
        ProcessHandle p = ProcessHandle.current();
        long pid = p.pid();
        log.info("The PID of current running JVM instance :" + pid);
        Thread.sleep(100000);
    }
}

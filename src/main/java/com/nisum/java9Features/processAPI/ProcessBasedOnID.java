package com.nisum.java9Features.processAPI;


import java.util.Optional;
import java.util.logging.Logger;

public class ProcessBasedOnID {
    private final static Logger log =Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) throws Exception {

        //need to get the pid from task manager
        Optional<ProcessHandle> opt = ProcessHandle.of(8408);
        ProcessHandle p = opt.get();
        ProcessHandle.Info info = p.info();
        log.info("Complete Process Inforamtion:\n" + info);
        log.info("User: " + info.user().get());
        log.info("Command: " + info.command().get());
        log.info("Start Time: " + info.startInstant().get());
        log.info("Total CPU Time Acquired: " + info.totalCpuDuration().get());
    }

}

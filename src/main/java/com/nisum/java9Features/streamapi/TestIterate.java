package com.nisum.java9Features.streamapi;


import java.util.logging.Logger;
import java.util.stream.Stream;

public class TestIterate {
    private final static Logger log =Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) {
        Stream.iterate(1, x->x+1).limit(5).forEach(System.out::println);
        log.info("3argument iterate");
        Stream.iterate(1,x->x<10, x->x+1).forEach(System.out::println);
    }
}

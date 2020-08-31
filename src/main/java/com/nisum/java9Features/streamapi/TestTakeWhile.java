package com.nisum.java9Features.streamapi;

import java.util.ArrayList;

import java.util.List;

import java.util.logging.Logger;
import java.util.stream.Collectors;


public class TestTakeWhile {
    private final static Logger log =Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) {

        ArrayList<Integer> l1 = new ArrayList<Integer>();
        l1.add(2);
        l1.add(4);
        l1.add(1);
        l1.add(3);
        l1.add(6);
        l1.add(5);
        l1.add(8);
        log.info("Initial List:" + l1);
        List<Integer> l2 = l1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        log.info("After Filtering:" + l2);
        List<Integer> l3 = l1.stream().takeWhile(i -> i % 2 == 0).collect(Collectors.toList());
        log.info("After takeWhile:" + l3);
    }
}

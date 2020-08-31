package com.nisum.java9Features.streamapi;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.logging.Logger;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TestOfNullable {
    private final static Logger log =Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();
        l.add("A");
        l.add("B");
        l.add(null);
        l.add("C");
        l.add("D");
        l.add(null);
        log.info("l {}"+l);
        List<String> l2 = l.stream().filter(o -> o != null).collect(Collectors.toList());
        log.info("l2 {}"+l2);

        List<String> l3 = l.stream().flatMap(o -> Stream.ofNullable(o)).collect(Collectors.toList());
        log.info("l3 {}"+l3);

        Map<String, String> m = new HashMap<>();
        m.put("A", "Apple");
        m.put("B", "Banana");
        m.put("C", null);
        m.put("D", "Dog");
        m.put("E", null);
        List<String> l4 = m.entrySet().stream().map(e -> e.getKey()).collect(Collectors.toList());
        log.info("l4 {}"+l4);

        List<String> l5 = m.entrySet().stream().flatMap(e -> Stream.ofNullable(e.getValue())).collect(Collectors.toList());
        log.info("l5 {}"+l5);
    }
}

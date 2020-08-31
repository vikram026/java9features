package com.nisum.java9Features.factorymethodsforunmodifiablecollections;



import java.util.Map;
import java.util.logging.Logger;

import static java.util.Map.entry;

public class UnmodifiableMap {
    private final static Logger log =Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);
    static Map<String,String> map=Map.of("A","Apple","B","Banana","C","Cat","D","Dog")
            ,m;
    static Map.Entry<String,String> e1,e2,e3;
    public static void main(String[] args) {
        log.info("{}"+map);

         e1= entry("A","Apple");
        e2= entry("B","Banana");
         e3= entry("C","Cat");
         m=Map.ofEntries(e1,e2,e3);
        log.info("{}"+m);

    }

}

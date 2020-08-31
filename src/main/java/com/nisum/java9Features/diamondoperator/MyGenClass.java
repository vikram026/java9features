package com.nisum.java9Features.diamondoperator;

import java.util.logging.Logger;

public class MyGenClass<T> {
    private final static Logger log =Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    T obj;
    public MyGenClass(T obj)
    {
        this.obj = obj;
    }
     public T getObj()
    {
     return obj;
    }
    public void process()
    {
     log.info("Processing obj...");
    }
}

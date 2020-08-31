package com.nisum.java9Features.reactivestreams;


import java.util.concurrent.Flow.Subscriber;
import java.util.concurrent.Flow.Subscription;
import java.util.logging.Logger;

public class MySubscriber implements Subscriber<Employee> {
    private final static Logger log =Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    private Subscription subscription;
    private int counter = 0;

    @Override
    public void onSubscribe(Subscription subscription) {
        log.info("Subscribed");
        this.subscription = subscription;
        this.subscription.request(1); //requesting data from publisher
        log.info("onSubscribe requested 1 item");
    }

    @Override
    public void onNext(Employee item) {
        log.info("Processing Employee " + item);
        counter++;
        this.subscription.request(1);
    }

    @Override
    public void onError(Throwable e) {
        log.info("Some error happened");
        e.printStackTrace();
    }
    @Override
    public void onComplete() {
        log.info("All Processing Done");
    }

    public int getCounter() {
        return counter;
    }
}

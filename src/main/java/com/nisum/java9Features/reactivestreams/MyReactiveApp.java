package com.nisum.java9Features.reactivestreams;


import java.util.List;
import java.util.concurrent.SubmissionPublisher;
import java.util.logging.Logger;

public class MyReactiveApp {
    private final static Logger log =Logger.getLogger(Logger.GLOBAL_LOGGER_NAME);

    public static void main(String args[]) throws InterruptedException {
        // Create Publisher
        SubmissionPublisher<Employee> publisher = new SubmissionPublisher<>();

        // Register Subscriber
        MySubscriber subs = new MySubscriber();
        publisher.subscribe(subs);

        List<Employee> emps = EmpHelper.getEmps();

        // Publish items
        log.info("Publishing Items to Subscriber");
        emps.stream().forEach(i -> publisher.submit(i));

        // logic to wait till processing of all messages are over
        while (emps.size() != subs.getCounter()) {
            Thread.sleep(10);
        }
        // close the Publisher
        publisher.close();

        log.info("Exiting the app");

    }
}

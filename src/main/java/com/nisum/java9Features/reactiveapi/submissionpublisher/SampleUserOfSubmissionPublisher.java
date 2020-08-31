package com.nisum.java9Features.reactiveapi.submissionpublisher;



import java.util.concurrent.SubmissionPublisher;

/**
 *Use of SubmissionPublisher provided by java 9 Flow API
 * it provides submit method  to publish the data
 * It is implementing the Flow.Publisher
 * x
 */
public class SampleUserOfSubmissionPublisher {
  public static void main(String[] args) throws InterruptedException {
    SubmissionPublisher<String> publisher =
        new SubmissionPublisher<>();

    PrintResultSubscriber subscriber = new PrintResultSubscriber();
    publisher.subscribe(subscriber);

    int count = 0;
    while(count < 20) {
      Thread.sleep(500);
      if(!publisher.hasSubscribers()) {
        System.out.println("Subscription is removed:  as we are getting more than nine corona patients in hyderabd");
        break;
      }
      String res="CoronaPatient"+count++;
      publisher.submit(res);
    }

    Thread.sleep(2000);
  }
}
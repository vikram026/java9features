package com.nisum.java9Features.reactiveapi.hotpublisher;

import io.reactivex.Flowable;

import java.util.concurrent.TimeUnit;

/**
 * hot publisher uses to share the subscription amoung all the subscriber;
 * Any subscriber joining late will miss some amount of data;
 */
public class Sample {
  public static void main(String[] args) throws InterruptedException {
    Flowable<Long> interval =
         Flowable.interval(1, TimeUnit.SECONDS)
        .share();

    interval.subscribe(data -> printMessage("s1:" + data));

    Thread.sleep(5000);

    interval.subscribe(data -> printMessage("s2:" + data));

    Thread.sleep(10000);
  }

  private static void printMessage(String message) {
    System.out.println(message);
  }
}
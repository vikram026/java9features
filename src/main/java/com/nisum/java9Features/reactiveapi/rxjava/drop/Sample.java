package com.nisum.java9Features.reactiveapi.rxjava.drop;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
import io.reactivex.schedulers.Schedulers;


/**
 * BackpressureStrategy.DROP
 * here all the previous data produced by the publisher is droped.
 *
 */
public class Sample {
  public static void main(String[] args) {
    Flowable.<Integer>create(emitter -> emit(emitter), BackpressureStrategy.DROP)
        .map(data -> data * 1.0)
        .filter(data -> data > 4)
        .observeOn(Schedulers.io(), false, 2)
        .subscribe(Sample::printIt,
            err -> System.out.println("ERROR: " + err),
            () -> System.out.println("DONE"));
  }

  private static void printIt(Double value) throws InterruptedException {
    System.out.println(value + " -- " + Thread.currentThread());
    Thread.sleep(2000);
  }

  private static void emit(FlowableEmitter<Integer> emitter) throws InterruptedException {
    int count = 0;

    while(count < 20) {
      System.out.println("emitting " + count + " --" + Thread.currentThread());
      emitter.onNext(count++);

      Thread.sleep(500);
    }

    System.out.println("DONE emitting");
    Thread.sleep(10000);
  }
}
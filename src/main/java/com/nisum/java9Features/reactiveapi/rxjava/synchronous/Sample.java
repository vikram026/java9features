package com.nisum.java9Features.reactiveapi.rxjava.synchronous;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;
//sync by default
public class Sample {
  public static void main(String[] args) {
    Flowable.<Integer>create(emitter -> emit(emitter), BackpressureStrategy.BUFFER)
        .map(data -> data * 1.0)
        .filter(data -> data > 4)
        .subscribe(Sample::printIt,
            err -> System.out.println("ERROR: " + err),
            () -> System.out.println("DONE"));
  }

  private static void printIt(Double value) {
    System.out.println(value + " -- " + Thread.currentThread());
  }

  private static void emit(FlowableEmitter<Integer> emitter) throws InterruptedException {
    int count = 0;

    while(count < 20) {
      System.out.println("emitting " + count + " --" + Thread.currentThread());
      emitter.onNext(count++);

      Thread.sleep(500);
    }
  }
}
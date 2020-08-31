package com.nisum.java9Features.reactiveapi.rxjava.rxjavaflowable;

import io.reactivex.BackpressureStrategy;
import io.reactivex.Flowable;
import io.reactivex.FlowableEmitter;

public class Sample {
  public static void main(String[] args) {
    Flowable.<Integer>create(emitter -> emit(emitter), BackpressureStrategy.BUFFER)
        .map(data -> data * 1.0)
        .filter(data -> data > 4)
        .subscribe(System.out::println);
  }

  private static void emit(FlowableEmitter<Integer> emitter) throws InterruptedException {
    int count = 0;

    while(count < 20) {
      emitter.onNext(count++);
      Thread.sleep(500);
    }
  }
}
package com.just.promise;

public interface IPromise<T> {
    <R> IPromise<R> then(Function<T, R> t);

    T await();
}

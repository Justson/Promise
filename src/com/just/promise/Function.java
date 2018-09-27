package com.just.promise;

/**
 * @author Administrator-Justson
 * @date 2018/9/27
 * @since 1.0.0
 */
public interface Function<T, R> {

    R apply(T t);

}

package com.just.promise;

import java.util.concurrent.Callable;

/**
 * @author Administrator-Justson
 * @date 2018/9/27
 * @since 1.0.0
 */

public interface TaskCallable<V> extends Callable<V> {
    V call();
}

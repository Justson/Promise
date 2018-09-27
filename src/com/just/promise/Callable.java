package com.just.promise;

/**
 * @author cenxiaozhong
 * @date 2018/9/28
 * @since 1.0.0
 */

public interface Callable<V> extends java.util.concurrent.Callable<V> {
	@Override
	V call();
}

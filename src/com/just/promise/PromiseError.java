package com.just.promise;

/**
 * @author cenxiaozhong
 * @date 2018/9/27
 * @since 1.0.0
 */

public class PromiseError<T> extends PromiseLinker<T> {
	PromiseError(Action<T> t) {
		super(t);
	}
}

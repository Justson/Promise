package com.just.promise;

/**
 * @author cenxiaozhong
 * @date 2018/9/27
 * @since 1.0.0
 */

public class PromiseError<T , R> extends PromiseLinker<T , R> {

	PromiseError(IPromise<T> iPromise, Function<? super T, ? extends R> t) {
		super(iPromise, t);
	}
}

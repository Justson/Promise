package com.just.promise;

/**
 * @author cenxiaozhong
 * @date 2018/9/27
 * @since 1.0.0
 */

class PromiseLinker<T, U> extends Promise<T> {

	private Function<? super T, ? extends U> t;
	private IPromise<T> mPromise;

	PromiseLinker(IPromise<T> iPromise, Function<? super T, ? extends U> t) {
		this.t = t;
		this.mPromise = iPromise;
	}

	U call(T t) {
		return this.t.apply(t);
	}


}

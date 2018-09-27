package com.just.promise;

/**
 * @author cenxiaozhong
 * @date 2018/9/27
 * @since 1.0.0
 */

class PromiseLinker<T> extends Promise<T> {


	PromiseLinker(Action<T> t) {
		super(t);
	}



}

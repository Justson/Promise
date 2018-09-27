package com.just.promise;

/**
 * @author cenxiaozhong
 * @date 2018/9/27
 * @since 1.0.0
 */

public class PromiseValue<T> extends Promise<T> {

	private T t;

	public PromiseValue(T t) {
		this.t = t;
	}

}

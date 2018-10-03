package com.just.promise;

/**
 * @author cenxiaozhong
 * @date 2018/10/1
 * @since 1.0.0
 */

public abstract class PromiseTask<V> implements TaskCallble<V> {

	private PromiseTask<?> promiseTask;


	PromiseTask(PromiseTask<?> promiseTask) {
		this.promiseTask = promiseTask;
	}

}

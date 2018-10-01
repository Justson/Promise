package com.just.promise;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Promise<T> implements IPromise<T> {


	private Action<T> action;
	private static final Executor mExecutor = Executors.newFixedThreadPool(3);

	private Promise(Action<T> t) {
		this.action = t;
	}

	public static final <T> IPromise<T> resolve(T t) {
		return new Promise<T>(new Action<T>() {
			@Override
			public T action() {
				return t;
			}
		});
	}

	public static final <T> IPromise<List<T>> all(T... t) {
		// todo
		return null;
	}

	@Override
	public <R> IPromise<R> then(Function<T, R> t) {
		return new Promise<R>(new Action<R>() {
			@Override
			public R action() {
				return t.apply(action.action());
			}
		});
	}

	@Override
	public T await() {
		return action.action();
	}
}

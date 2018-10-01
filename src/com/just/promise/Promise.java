package com.just.promise;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;

public class Promise<T> {


	private TaskCallble<T> mTaskCallble;

	public static final int STATE_PEDDING = 1;
	public static final int STATE_RESOLUED = 2;
	public static final int STATE_REJECTED = 3;
	private AtomicInteger state = new AtomicInteger(STATE_PEDDING);
	private static final Executor mExecutor = Executors.newFixedThreadPool(3);


	private Promise(TaskCallble<T> t) {
		this.mTaskCallble = t;
	}

	public static final <T> Promise<T> resolve(T t) {
		return new Promise<T>(new TaskCallble<T>() {
			@Override
			public T call() {
				return t;
			}
		});
	}

	public static final <T> Promise<List<T>> all(T... t) {
		// todo
		return null;
	}

	public <R> Promise<R> then(Function<T, R> t) {
		return new Promise<R>(new TaskCallble<R>() {
			@Override
			public R call() {
				return t.apply(mTaskCallble.call());
			}
		});
	}

	public T await() {
		return mTaskCallble.call();
	}
}

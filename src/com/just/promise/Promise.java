package com.just.promise;

import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Promise<T> implements IPromise<T> {


	private Action<T> action;
	private T t;
	private static final Executor mExecutor = Executors.newFixedThreadPool(3);


	public static final <T> IPromise<T> resolve(T t) {
		return new PromiseValue<T>(t);
	}

	public static final <T> IPromise<T> reject(T t) {
		return new PromiseReject<T>(t);
	}

	public static final <T> IPromise<List<T>> all(T... t) {
		// todo
		return null;
	}


	@Override
	public <R> IPromise<R> then(Function<? super T, ? extends R> t) {
		return (IPromise<R>) new PromiseLinker<T, R>(this, t);
	}

	public static <T> IPromise<T> onAssembly(Promise<T> source) {
		return source;
	}

	@Override
	public T await() {
		return action.action();
	}

	@Override
	public IPromise<Void> onCatch(Throwable throwable) {
		return null;
	}

	@Override
	public void onFinally(Runnable runnable) {

	}
}

package com.just.promise;

public interface IPromise<T> {
	<R> IPromise<R> then(Function<? super T, ? extends R> t);

	T await();

	IPromise<Void> onCatch(Throwable throwable);

	void onFinally(Runnable runnable);
}

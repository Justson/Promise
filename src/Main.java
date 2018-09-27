import com.just.promise.Function;
import com.just.promise.Promise;

import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {


		// IPromise<List<String>> iPromise =
		Promise.resolve(1)
				.then(new Function<Integer, String>() {
					@Override
					public String apply(Integer integer) {
						return integer + 100 + " x";
					}
				})
				.then(new Function<String, List<String>>() {
					@Override
					public List<String> apply(String s) {
						ArrayList<String> strings = new ArrayList<String>(1);
						strings.add(s);
						strings.add(" extra");
						return strings;
					}
				})
				.onCatch(new Throwable())
				.onFinally(new Runnable() {
					@Override
					public void run() {

					}
				});
//		System.out.print(iPromise.await());
	}
}

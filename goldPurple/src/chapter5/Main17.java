package chapter5;

import java.util.function.Supplier;

import test.Foo;

public class Main17 {

	public static void main(String[] args) {
//		コンストラクタ参照

//		らむだ→Supplier<Foo> obj=()->new Foo();
		Supplier<Foo> obj1=Foo::new;
//		System.out.println(obj1.get().a);
	}
}

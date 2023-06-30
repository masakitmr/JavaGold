package test;

import java.lang.annotation.Repeatable;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

@Repeatable(TestAnnotPack.class)
@Retention(RetentionPolicy.RUNTIME)
@interface TestAnnot{
	public String value();
}

@Retention(RetentionPolicy.RUNTIME)
@interface TestAnnotPack{
	public TestAnnot[] value();
}
public class Foo {
	@TestAnnot("abc")
	@TestAnnot("xyz")
	public void method(int a) {}
}

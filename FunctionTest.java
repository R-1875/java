package Functions;

import java.util.function.BiFunction;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class FunctionTest {
	
	public static int Method1(String name)
	{
		if (name=="Slk");
		return 1;
	}
	
	public static void Method2(String c)
	{
		System.out.println("Hello "+c);
	}	
	
	public static void main(String[] args) {
		
		Predicate<Integer> pr = a->(a>18);
		System.out.println(pr.test(10));
		
		Function<String, Integer> fun = FunctionTest::Method1;
		System.out.println(fun.apply("Slk"));

		Consumer<String> con = FunctionTest::Method2;
		con.accept("Java");
		
		BiFunction<String, String, String> bi = (x, y)->{return x+y;};
		System.out.println(bi.apply("Hello ", "Slk"));
	}

}

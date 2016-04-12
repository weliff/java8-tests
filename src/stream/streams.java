package stream;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.OptionalDouble;
import java.util.function.ToDoubleFunction;
import java.util.stream.DoubleStream;
import java.util.stream.Stream;

public class streams {
	
	public static void main(String[] args) {
		ToDoubleFunction<Integer> i = new ToDoubleFunction<Integer>() {
			@Override
			public double applyAsDouble(Integer value) {
				return value.doubleValue();
			}
		};

		ArrayList<Integer> list = new ArrayList<Integer>();
		list.add(10);
		Stream<Integer> stream = list.stream();
		DoubleStream ds = stream.mapToDouble(Integer::doubleValue);
//		DoubleStream ds2 = stream.mapToDouble((ii)->{ return ii.doubleValue();});
//		double pd = ds.average().orElse(0.0);
		System.out.println(ds.count());
		Arrays.sort(new String[]{"a"}, String::compareToIgnoreCase);
		
		String java = "Java";
		
		java.chars().count();
		System.out.println(java.chars().count());
	}

}

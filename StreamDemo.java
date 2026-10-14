import java.util.Arrays;
import java.util.List;

public class StreamDemo{
	public static void main(String[] args){
		List<Integer>marks = 				 	          Arrays.asList(45,78,65,32,90,55,72,88);

	System.out.println("Students scoring more than 60:");
	marks.stream()
		.filter(mark->mark>60)
		.forEach(mark->System.out.println(marks));
  }
}
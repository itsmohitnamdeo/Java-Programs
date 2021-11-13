import java.util.ArrayList;
import java.util.List;

public class Main
{
	public static void main(String[] args) {
		System.out.print(">> Mohit Namdeo\n");
        System.out.print(">> Join Two Lists using addAll()\n");
        System.out.print("---------------------------------------------\n");

        List<String> list1 = new ArrayList<String>();
        list1.add("a");

        List<String> list2 = new ArrayList<String>();
        list2.add("b");

        List<String> joined = new ArrayList<String>();

        joined.addAll(list1);
        joined.addAll(list2);

        System.out.println("list1: " + list1);
        System.out.println("list2: " + list2);
        System.out.println("joined: " + joined);

	}
}

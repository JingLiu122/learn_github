import java.util.ArrayList;

public class ArrayListCollection{
	public static void main(String[] agrs){
		ArrayList<String> list = new ArrayList<String>();

		System.out.println("ArrayList of the Gundam:");

		list.add("Strike");
		list.add("Freedom");
		list.add("Raiser");
		list.add(1, "Justice");

		for(int i = 0; i < list.size(); i++){
			System.out.printf("%s \n", list.get(i));
		}


		System.out.printf("Size: %d\n", list.size());

	}
}

import java.util.ArrayList;

public class Memory {

	public static ArrayList<String> memory = new ArrayList<String>(3);

	public static void addToMemory(String toMemory) {

		memory.add(toMemory);

		if (memory.size() == 3) {

			memory.remove(0);
		}

	}

	public static void showMemory() {

		if (memory.size() == 0) {
			System.out.println("Memory is empty");
		}
		memory.forEach(mem -> System.out.println(mem));

	}

}
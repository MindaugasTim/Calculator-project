import java.util.ArrayList;

public class Memory {

	private ArrayList<String> memory = new ArrayList<String>(3);

	public void addToMemory(String toMemory) {

			this.memory.add(toMemory);

		if (this.memory.size() == 3) {

			this.memory.remove(2);
		}
	

	}

	public void showMemory() {
		
		
		if (memory.size()==0) {
		 System.out.println("Memory is empty");
		} 	
		this.memory.forEach(mem->System.out.println(mem));
		
		
	}

}

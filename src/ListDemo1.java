import java.util.Vector;

public class ListDemo1 {
	public static void main(String[] args) {
		Vector<String> vector = new Vector<String>(5, 3);
		System.out.print(vector.capacity()+", "); System.out.println(vector.size());
		vector.add("한지민");
		System.out.print(vector.capacity()+", "); System.out.println(vector.size());
		vector.add("한지민");
		System.out.print(vector.capacity()+", "); System.out.println(vector.size());
		vector.add("한지민");

		
		//용량 넘어가면 증가, size는 추가할 때마다 증가
	}
}

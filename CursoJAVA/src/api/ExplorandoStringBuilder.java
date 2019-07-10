package api;

public class ExplorandoStringBuilder {

	public static void main(String[] args) {
		StringBuilder sb = new StringBuilder();
		sb.append("Joao");
		sb.append(",").append("Maria");
		sb.append(",").append("Pedro");
		
		
		// é mutavel
		// sb.reverse();
		System.out.println(sb.toString());
		System.out.println(sb.substring(1, 3));
		System.out.println(sb.toString());
	}
}

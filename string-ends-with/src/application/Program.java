package application;

public class Program {
	public static void main(String[] args) {
		if (solution("abc", "abcd")) {
			System.out.println("YEEE");
		}
		else {
			System.out.println("NOO");
		}
		
	}

	public static boolean solution(String str, String ending) {
		if (str.length() < ending.length()) {
			return false;
		}
		String cortado = str.substring(0, (str.length() - ending.length()));
		if ((cortado + ending).equals(str)) {
			return true;
		}
		return false;
	}
}

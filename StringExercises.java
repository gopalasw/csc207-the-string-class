import java.util.Scanner;
public class StringExercises {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//forgivingPrompt("Do you like chocolate?");
		//System.out.println(parseName("Turing,Alan,Mathison"));
		System.out.println(add(" 0+   31+4+81  +9+   10"));
	}

	public static boolean forgivingPrompt(String question) {

		while(true) {
			System.out.println(question);
			Scanner input = new Scanner(System.in);
			String answer = input.nextLine();

			if(answer.equalsIgnoreCase("Y") ||
					answer.equalsIgnoreCase("Yes") ||
					answer.equalsIgnoreCase("Yep")) {
				input.close();
				return true;
			}
			else if(answer.equalsIgnoreCase("N") ||
					answer.equalsIgnoreCase("No") ||
					answer.equalsIgnoreCase("Nope")) {
				input.close();
				return false;
			}


		}

	}

	public static String parseName(String s) {

		int firstComma = s.indexOf(',');
		int secondComma = s.lastIndexOf(',');


		return s.substring(firstComma + 1, secondComma)
				+ " "
				+ s.substring(secondComma + 1, s.length())
				+ " "
				+ s.substring(0, firstComma);
	}

	public static int add(String line) {
		int sum = 0;
		String[] arr = line.split("[+]");
		for(int i = 0; i < arr.length; i++)
		{
			sum += Integer.parseInt(arr[i].trim());
		}

		return sum;
	}

}

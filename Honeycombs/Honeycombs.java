import java.util.Scanner;

public class Honeycombs {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("How many bees are working today?");
		int bees = sc.nextInt();
		System.out.println("How many flowers will they work on today?");
		int flowers = sc.nextInt();
		
		double totalHoneyProduced = (bees * flowers * 0.21);
		double honeyLeft = totalHoneyProduced % 100;
		int combsFilled = (int) (totalHoneyProduced / 100);
		
		System.out.println("The bees filled out " +  combsFilled + " honeycombs.");
		System.out.println(String.format("%.2f", honeyLeft) + " grams of honey is left.");
		
		sc.close();
	}
	
}

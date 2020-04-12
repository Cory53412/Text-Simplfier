package ie.gmit.sw;

import java.io.Console;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Runner {

	public static void main(String[] args) throws Exception {
		System.out.println(ConsoleColour.BLUE_BRIGHT);
		System.out.println("***************************************************");
		System.out.println("* GMIT - Dept. Computer Science & Applied Physics *");
		System.out.println("*                                                 *");
		System.out.println("*             Text Simplifier V0.1                *");
		System.out.println("*       (AKA Orwellian Language Compliance)       *");
		System.out.println("*                                                 *");
		System.out.println("***************************************************");
		System.out.println("Options:");
		System.out.println("1.Text Simplifier");
		System.out.println("2.Quit");
		System.out.println("Select option: \n");
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();

		String google = "./google-1000.txt";
		String thes = "./MobyThesaurus2.txt";
		Parser p = new Parser();
		p.parsing(google, thes);

		try {
			while (menu != 2) {

				switch (menu) {
				case 1:
					Map<String, String> map = p.map();
					Menu m = new Menu(map);
					System.out.println("Options:");
					System.out.println("1.Text Simplifier");
					System.out.println("2.Quit");
					System.out.println("Select option: \n");
					menu = sc.nextInt();
					break;

				default:
					System.out.println("You must enter 1 or 2");
					System.out.println("Options:");
					System.out.println("1.Text Simplifier");
					System.out.println("2.Quit");
					System.out.println("Select option: \n");
					menu = sc.nextInt();
					break;
				}
			}

			System.out.println("Quiting");

		} catch (Exception E) {
			System.out.println("Error");
		}
	}

}
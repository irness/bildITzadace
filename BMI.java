import java.util.Scanner;

public class BMI {

	public static void main(String[] args) {
		Scanner unos = new Scanner (System.in);
		System.out.println("Unesite tezinu (kg) i svoju visinu (m): ");
		double tezina = unos.nextDouble();
		double visina = unos.nextDouble();
		
		double BMI = (tezina / (visina * visina));
		 if ( BMI >= 0 && BMI <15)
		System.out.println("Vas BMI iznosi: " + BMI + " - vrlo ozbiljna pothranjenost.");
		 if ( BMI >= 15 && BMI < 16)
				System.out.println("Vas BMI iznosi: " + BMI + " - ozbiljna pothranjenost.");
		 else if ( BMI >= 16 && BMI < 18.5)
				System.out.println("Vas BMI iznosi: " + BMI + " -  pothranjenost.");
		 else if ( BMI >= 18.5 && BMI < 25)
				System.out.println("Vas BMI iznosi: " + BMI + " - normalna tezina.");
		 else if ( BMI >= 25 && BMI < 30)
				System.out.println("Vas BMI iznosi: " + BMI + " - pretezak.");
		 else if ( BMI >= 30 && BMI  <35)
				System.out.println("Vas BMI iznosi: " + BMI + " - klasa gojaznosti 1 (umjerena gojaznost).");
		 else if ( BMI >= 35 && BMI < 40)
				System.out.println("Vas BMI iznosi: " + BMI + " - klasa gojaznosti 2 (ozbiljna gojaznost).");
		 else if ( BMI >= 40 )
				System.out.println("Vas BMI iznosi: " + BMI + " - klasa gojaznosti 1 (umjerena gojaznost).");
		
		unos.close();
	}

}

package app;
import java.util.Scanner;
import java.util.Random;
public class LuckySeven {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner in = new Scanner(System.in);
		Random r = new Random();
		
		System.out.println("Lucky seven - oletko onnekkalla päällä?");
		System.out.println("Miten pelataan? 1.Talleta rahat pelitille");
		System.out.println("2. Jokainen kierros maksaa 1 euron.");
		System.out.println("Voitot: yksi kpl 7 voitat 2€ | kaksi kpl 7 voitat 10€ ja kolme kpl 7 voitat 20€ ");
		System.out.println();
		int wallet = 0;
		
		int[] numbers = new int[3];
        
		System.out.println("Montako euroa haluat lisätä pelitilille?");
		int money = in.nextInt();
		wallet += money;
		// Pelaajan tulee lisätä rahaa tilille, jotta pääsee pelaamaan.
		
		while (true) {
			System.out.println("Pelaa peliä 1€ kierros, kirjoita 'n' lopetaaksesi peli");
			in.nextLine();
			
			if(wallet >=1) {
				wallet -=1;
		        for (int i = 0; i < 3; i++) {
	            numbers[i] = r.nextInt(10) + 1;
	            System.out.print(numbers[i] + " ");
			}
		        System.out.println(); // Tyhjä riviväli consolen siistimiseksi
		
		
		int luckySeven = 0;
		for(int i= 0; i<3; i++) {
			if(numbers[i] == 7) {
				luckySeven++;
			}
		}
        if (luckySeven == 1) {
            System.out.println("Voitit 2€!");
            wallet += 1;
        } else if (luckySeven == 2) {
            System.out.println("Voitit 10€!");
            wallet += 5;
        } else if (luckySeven == 3) {
            System.out.println("Voitit 20€!");
            wallet += 10;
        } else {
            System.out.println("Ei voittoa! :(");
        }
		} else {
        System.out.println("Voi rähmä rahat loppui!");
        break; //Poistuu loopista jos "raha" loppuu.
    	}

			System.out.print("Uusi saldo pelitilillä: " + wallet + " euroa. ");
			System.out.println("Jatketaanko? (Paina Enter jatkaaksesi, 'n' lopettaaksesi):");
			String choice = in.nextLine();

		if (choice.equals("n")) {
        break; // Poistuu loopista jos käyttjä kirjotittaa'n' -oldschool ;D
		}
		}

		System.out.println("Peli päättyi. Loppusaldo pelitilillä: " + wallet + " euroa.");
		in.close();
}
}

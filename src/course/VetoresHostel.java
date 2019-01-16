package course;

import java.util.Scanner;
import entities.Hostel;

public class VetoresHostel {

	public static void main(String[] args) {
		Scanner data = new Scanner(System.in);

		System.out.print("How many rooms will be rented? ");
		int n = data.nextInt();
		
		Hostel[] hostel = new Hostel[10];
		
		for (int i = 0; i < n; i++) {
			System.out.println();
			System.out.println("Rent #" + (i+1) + ":");
			System.out.print("Name: ");
			data.nextLine();
			String name = data.nextLine();
			
			System.out.print("Email: ");
			String email = data.nextLine();
			
			System.out.print("Room: ");
			int room = data.nextInt();
		
			hostel[room] = new Hostel(name, email, room);
		}
		
		System.out.println();
		System.out.println("Busy rooms: ");
		for (int i = 0; i < hostel.length; i++) {
			if(hostel[i] != null) {
				System.out.println(hostel[i]);
			}
		}
		
		data.close();

	}

}

package com.atmecs.test.main;


import java.util.Scanner;


import com.atmecs.test.operations.AddUser;
import com.atmecs.test.operations.DeleteUser;
import com.atmecs.test.operations.DisplayUser;

import com.atmecs.test.operations.UpdateUser;



public class UserMainClass {
	static int choice;
	static Scanner scan = new Scanner(System.in);

	public static void main(String[] args){
		do {
			System.out.println("Enter your Choice");
			System.out.println("1.Create Record\n2.Update Record\n3.Display records\n4.Delete Record\n5.Exit");
			System.out.println("=========================================================");
			choice = scan.nextInt();

			switch (choice) {
			case 1:
				AddUser add = new AddUser();
				add.addRecord();
				break;
			case 2:
				UpdateUser update = new UpdateUser();
				update.updateRecord();
				break;
			case 3:

				DisplayUser display = new DisplayUser();
				display.displayRecord();
				break;
			case 4:
				DeleteUser delete=new DeleteUser();
				delete.deleteRecord();
				break;
			
			case 5:
				System.out.println("You have pressed 3..The Program has been Ended..!!");
				System.out.println("============================================");
				break;

			default:
				System.out.println("Wrong Choice..!");
				System.out.println("============================================");

				break;
			}
		} while (choice != 5);
	}

}

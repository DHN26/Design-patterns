package abstractFactoryDesign;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		System.out.println("Enter theme of your choice : ");
		Scanner scan=new Scanner(System.in);
		String s=scan.next();
		
		GUIInterface gui=ManagerClass.manager(s);
		Button button=gui.createButton();
		Textarea ta=gui.createTextarea();
		
		button.button();
		ta.textarea();

	}

}

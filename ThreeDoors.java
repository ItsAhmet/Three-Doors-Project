//Name: Ahmet Yesilbas
//Project Name: Three Doors
//Date: 1/31/2022
//Project Description: Asks user answers for riddles and lets them through the levels depending if they get the answer right or wrong.

import java.util.Scanner;
public class ThreeDoors {
	public static void ThreeDoors() {
		String ans1;
		String ans2;
		String ans3;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Door #1");
		System.out.println("Joe's father had three sons; Peter, Nick and what’s the name of the third son?");
		ans1=scan.nextLine();
		
		if(ans1.equalsIgnoreCase("Joe")){
			System.out.println("Correct! Let's go to the next door.\n");
			System.out.println("Door #2");
			System.out.println("What has 4 fingers and a thumb, but isn't alive?");
			ans2=scan.nextLine();
			if(ans2.equalsIgnoreCase("glove")||ans2.equalsIgnoreCase("a glove")){
				  System.out.println("Correct! Let's go to the next door.\n");
				  System.out.println("Door #3");
				  System.out.println("What comes once in a minute, twice in a moment, but never in a thousand years?");
				  ans3=scan.nextLine();
				  if(ans3.equalsIgnoreCase("M")||ans3.equalsIgnoreCase("letter M")||ans3.equalsIgnoreCase("the letterr M")){
				   System.out.println("Correct\nCongratulations, you have gotten all the answers right and passed throgh the 3 doors.");}
				  else{
				    System.out.println("False! Answer was the letter M");
				    System.out.println("Restart the game.");}}
			else{
			      System.out.println("False! Answer was (a) glove.");
			      System.out.println("Restart the game.");}}
	else{
			    System.out.println("False! Answer was Joe");
			    System.out.println("Restart the game.");}}
	
		
	public static void main(String Args[]) {
	ThreeDoors();
}
}

	

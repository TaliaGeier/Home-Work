package home_work;

import java.util.Scanner;

public class Pizza {
	private int diameter;
	private int slices;
	private int toppings;
	
	Scanner scan = new Scanner (System.in);
	
	public int getDiameter() {
		return diameter;
	}
	public void setDiameter(int diameter) {
		
		while (diameter<10 || diameter>50) {
			System.out.println("The Diameter is Invalid. Enter a new diameter: ");
			diameter = scan.nextInt();
		}
			this.diameter = diameter;
		
	}
	public int getSlices() {
		return slices;
	}
	public void setSlices(int slices) {
		while (slices<1 || slices>8) {
			System.out.println("The number of slices is Invalid. Enter a new one: ");
			slices = scan.nextInt();
		}
			this.slices = slices;
		
	}
	public int getToppings() {
		return toppings;
	}
	public void setToppings(int toppings) {
		while (toppings<0 || toppings>5) {
			System.out.println("The number of toppings is Invalid. Enter a new one: ");
			toppings = scan.nextInt();
		}
			this.toppings = toppings;
		
	}
	public boolean isBasicPizza () {
		boolean isBasic;
		isBasic=(this.toppings==0)?true:false;
	
		return isBasic;
	}
	public void print () {
		System.out.println("The Pizza is " + diameter + " in diameter, there are " + slices + " slices and " + toppings + " toppings.");
	}
	public Pizza(int diameter, int slices, int toppings) {
		setDiameter(diameter);
		setSlices(slices);
		setToppings(toppings);
	}
	
}

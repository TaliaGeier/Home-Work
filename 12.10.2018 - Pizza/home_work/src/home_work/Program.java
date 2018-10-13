package home_work;


public class Program {
	

	public static void main(String[] args) {
		int sumToppings=0;
	Pizza[] pizzas = new Pizza[5];
	pizzas[0] = new Pizza(12, 2, 4);
	pizzas[1] = new Pizza(15, 8, 5);
	pizzas[2] = new Pizza(25, 1, 0);
	pizzas[3] = new Pizza(36, 8, 3);
	pizzas[4] = new Pizza(45, 5, 2);

	
	for (Pizza tempPizza:pizzas) {
		tempPizza.print();
		System.out.println(tempPizza.isBasicPizza()?"The pizza is basic":"The pizza isn't basic");
		sumToppings += tempPizza.getToppings();
	}
	System.out.println("the total number of toppings is: " + sumToppings);
	}

}

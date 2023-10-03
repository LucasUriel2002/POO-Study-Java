// import JUtil.java;

// public class Teste{
	
// 	public static void main(String[] args) throws Exception {
		
// 		//Program to read a vector of names, split the vector, count the length, select a position and print the element in the position
		 
// 		System.out.printf("Digite seu nome completo: ");
// 		String name = JUtil.readString();
// 		String[] names = name.split(" ");
// 		int size = names.length;
		
// 		System.out.printf("digite um numero ate %d: " ,size);
// 		int x = JUtil.readInt();

// 		while(x > size)
// 		{
// 			System.out.printf("digite um numero ate %d: " ,size);
// 			x = JUtil.readInt();
// 		}
// 		if(x <= size)
// 		{
// 			System.out.printf("O elemento que você selecionou é : %s " ,names[x-1]);
// 		}

// 		System.out.printf("test");

// 		/* 
// 		int x = 1;
// 		for(int i = 1; i<=128; i+= i){
// 			x +=x;
// 		}
// 		System.out.printf("%d ",x );
// 		*/
// 	}} 

// import java.util.Scanner;

// public class Teste {

	

// 	public static void main(String [] args) throws Exception {
// 		Scanner read = new Scanner(System.in);
		
// 		int x;
// 		int y;
		
// 		System.out.println("Insira o primeiro Numero");
// 		x = read.nextInt();
// 		System.out.println("Insira o segundo Numero");
// 		y = read.nextInt();

// 		class Soma {
// 			public static int resultado(int num1, int num2) {
// 				return(num1 + num2);
// 			}

// 			public int resultado2(int num1, int num2) {
// 				return(num1 - num2);
// 			}

// 		}

// 		Soma a = new Soma();
// 		int res = Soma.resultado(x,y);
// 		int res2 = a.resultado2(x,y);

// 		int z = res2;

// 		System.out.println("O resultado é: " + z);

// 		switch (z) {
// 			case  10: System.out.println("O numero " + z + " é 10");
// 			break;

// 			case 15: System.out.println("O numero " + z + " é 15");
// 			break;

// 			default: System.out.println("O numero " + z + " é com toda certeza um numero");
// 		}

// 		if (z > 10) {
// 			System.out.println("E o numero " + z + " é maior que 10");
// 		} else {
// 			System.out.println("E o numero " + z + " é menor que 10");
// 		}
		// Verify is x is bigger than y
		// int y = 11;

		// if (x > y) {
		// 	System.out.printf("x is bigger than y");
		// } else {
		// 	System.out.printf("y is bigger than x");
		// }


		// Verify if x is 10 or 15
		// switch (x) {
		// 	case 10: System.out.printf("x is 10!");
		// 	break;

		// 	case 15: System.out.printf("x is 15!");
		// 	break;

		// 	default: System.out.printf("The number chosen is invalid ");
		// }
		


		// Verify if a number is Even or Odd
		// if(x%2 == 0){
		// 	System.out.printf("The number" + x + "is Even");
		// } else {
		// 	System.out.printf("The number" + x + "is Odd");
		// }


		


// 	}

// }

// package src.retangulo;

import java.util.Scanner;

public class Teste {

	public static void main (String [] args) {

		Scanner read = new Scanner(System.in);
		retangulo R1 = new retangulo();

		System.out.println("Insira a Base");
		R1.base = read.nextInt();
		System.out.println("Insira a Altura");
		R1.altura = read.nextInt();

		R1.data();
	}

}

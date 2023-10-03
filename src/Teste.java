import JUtil.java;

public class Teste{
	
	public static void main(String[] args) throws Exception {
		
		//Program to read a vector of names, split the vector, count the length, select a position and print the element in the position
		 
		System.out.printf("Digite seu nome completo: ");
		String name = JUtil.readString();
		String[] names = name.split(" ");
		int size = names.length;
		
		System.out.printf("digite um numero ate %d: " ,size);
		int x = JUtil.readInt();

		while(x > size)
		{
			System.out.printf("digite um numero ate %d: " ,size);
			x = JUtil.readInt();
		}
		if(x <= size)
		{
			System.out.printf("O elemento que você selecionou é : %s " ,names[x-1]);
		}

		System.out.printf("test");

		/* 
		int x = 1;
		for(int i = 1; i<=128; i+= i){
			x +=x;
		}
		System.out.printf("%d ",x );
		*/
	}} 




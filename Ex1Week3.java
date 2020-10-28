import java.util.Scanner;
public class Ex1Week3
{
	public static void main(String [] nilaiTerima)
	{
		String nama;
		int nombor;
		double noDouble;



		Scanner input = new Scanner(System.in);

		System.out.println("Enter a number : ");
		nombor = input.nextInt();
		System.out.println("Number is "+ nombor);

		System.out.println("Enter a double number : ");
		noDouble = input.nextDouble();
		System.out.println("Number is "+ noDouble);


		System.out.println("Enter a name : ");
		nama = input.next(); //atau input.nextln
		System.out.println("Number is "+ nama);	


		input.close();


}
		//int [] tataInt = {10,20,30,40};

		//ordinary for 
		//for (int i=0; i<tataInt.length; i++)
		//{
		//	System.out.println(tataInt[i]);
		//}

		//for (int t : tataInt ) 
		//{
		//	System.out.println("for each : " + t);
		//}



		//}/




		//final static char CHARSAYA = 53;
		//System.out.println("char " + CHARSAYA);
		//CHARSAYA = 100;
		//System.out.println("char " + CHARSAYA);

		//int noInt = '10';
		//System.out.println(noInt);

		//int [] tataInt = new int[4];

		//for (int i=0; i<tataInt.length; i++)
		//{
		//	System.out.println(tataInt[i]);
		//}
		//int noInt = 123;
		//int noInt2 = 345;
		//double noDouble = 123.456;
		//System.out.format("%6d dan %4d", noInt, noInt2);
		//System.out.format("%4d", noInt2);
		//System.out.format("RM%7.2f", noDouble);
		//System.out.format("\nRM%7.3f dan %6d", noDouble, noInt);
		//System.out.println("Nilai 1 : " + nilaiTerima[0]);
		//System.out.println("Nilai 1 : " + nilaiTerima[1]);
		//System.out.println("Nilai 1 : " + nilaiTerima[2]);
		//int sum = 0;

		//for (int i=0; i<nilaiTerima.length; i++)
		//{
		//	System.out.println("Nilai 1 : " + nilaiTerima[i]);
		//	sum += Integer.parseInt(nilaiTerima[i]);
		//	System.out.println("Nilai sum : " + sum);
		//}



	}

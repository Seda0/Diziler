package Diziler;

public class Array {

	public static int lenght;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
   int[]array = new int[10];
   System.out.printf("%s%8%n","Index","Value");
   for (int counter=0;counter<array.length;counter++) {
	   System.out.printf("%5d%8d%n",counter,array[counter]);
	   		
   }
	}

}


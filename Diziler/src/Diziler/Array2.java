package Diziler;

public class Array2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    final int ARRAY_LENGHT=10;
    int [] array=new int[ARRAY_LENGHT];
    for(int counter = 0;counter<array.length;counter++) {
    	array[counter]=2+2*counter;
    	
    }
    System.out.printf("%s%8s%n","Index","Value");
    for( int counter=0;counter<array.length; counter++) 
    {
    	System.out.printf("%5d%8d%n",counter,array[counter] );
    }
	}

}

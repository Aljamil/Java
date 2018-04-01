public class Generic
{
	public static void main(String[] args)
	{
	   Integer[] intArray = {3,5,23,1,4,6};
	   Double[] doubleArray = {3.3, 5.5, 23.23, 1.1, 4.4, 6.6};
	   Character[] characterArray = {'H', 'E', 'L', 'L', 'O'};

	   System.out.printf("Array integerArray contains:%n");
       printArray(intArray); 
       System.out.printf("%nArray doubleArray contains:%n");
       printArray(doubleArray); 
       System.out.printf("%nArray characterArray contains:%n");
       printArray(characterArray);
	}

	public static <J> void printArray(J[] array)
	{
		for(J i : array)
			System.out.printf("%s ", i);

		System.out.println();
	}
}
package ua.hometask;

public class Application {

	public static void main(String[] args) {
		
		
	//1)
		Byte a1 = 2;
		Short a2 = 2;
		Integer a3 = 2;
		Long a4 = 2L;
		int a5 = a1;
		Double a6 = 2.2;
		Float a7 = 3.3F;
		boolean a8 = true;
		
		System.out.println();
		
	//2)
		 int[] numbers2 = {5, 2, 9, 1, 5, 6};
	        
	        int min2 = numbers2[0]; 
	        int max2 = numbers2[0]; 
	        for (int i = 1; i < numbers2.length; i++) {
	            if (numbers2[i] < min2) {
	                min2 = numbers2[i];
	            }
	            if (numbers2[i] > max2) {
	                max2 = numbers2[i];
	            }
	        }
	        
	        System.out.println();
	        
	        System.out.println("Мінімальне значення: " + min2);
	        System.out.println("Максимальне значення: " + max2);
	   
	        double[] numbers1 = {5.5, 2.2, 9.9, 1.1, 5.5, 6.6};
	        
	        double min1 = numbers1[0];
	        double max1 = numbers1[0]; 
	        for (int i = 1; i < numbers1.length; i++) {
	            if (numbers1[i] < min1) {
	                min1 = numbers1[i];
	            }
	            if (numbers1[i] > max1) {
	                max1 = numbers1[i]; 
	            }
	        }
	        
	        System.out.println("Мінімальне значення: " + min1);
	        System.out.println("Максимальне значення: " + max1);
	        
	        System.out.println();
	        
	   //3
	        int[] numbers = new int[10];
	        
	        for (int i = 0; i < numbers.length; i++) {
	            numbers[i] = (int) (Math.random() * 100); }
	        
	        int min = numbers[0];
	        int max = numbers[0];
	        
	        for (int i = 1; i < numbers.length; i++) {
	            if (numbers[i] < min) {
	                min = numbers[i]; 
	            if (numbers[i] > max) {
	                max = numbers[i]; 
	            }
	        }
	        
	        System.out.println("Мінімальне значення: " + min);
	        System.out.println("Максимальне значення: " + max);

		
	        }  
	}
}
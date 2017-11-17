import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Comparator;

import udemy.StudentTest;
// adding this as a test / storage 
public class CodeWars {

	public static void main(String[] args) 
	{
//		String temp = "slug spider rock gravel gravel gravel gravel gravel gravel gravel"; 
//		String temp1 = "gravel gravel gravel gravel gravel gravel gravel gravel gravel rock slug ant gravel gravel snail rock gravel gravel gravel gravel gravel gravel gravel slug gravel ant gravel gravel gravel gravel rock slug gravel gravel gravel gravel gravel snail gravel gravel rock gravel snail slug gravel gravel spider gravel gravel gravel gravel gravel gravel gravel gravel moss gravel gravel gravel snail gravel gravel gravel ant gravel gravel moss gravel gravel gravel gravel snail gravel gravel gravel gravel slug gravel rock gravel gravel rock gravel gravel gravel gravel snail gravel gravel rock gravel gravel gravel gravel gravel spider gravel rock gravel gravel";  
//        String expectedResult = "gravel gravel gravel gravel gravel gravel gravel gravel gravel rock gravel gravel gravel gravel gravel rock gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel rock gravel gravel gravel gravel gravel gravel gravel gravel gravel rock gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel gravel rock gravel gravel rock gravel gravel gravel gravel gravel gravel gravel rock gravel gravel gravel gravel gravel gravel gravel rock gravel gravel";
//        if(CodeWars.rakeGarden(temp1).equals(expectedResult)){
//        		    System.out.println("YaY");
//        }else { System.out.println("Nay"); }
		
		//System.out.println(CodeWars.RowSumNumbers(7));
        
		//String[] s1 = new String[]{"hoqq", "bbllkw", "000", "ejjuyyy", "plmiis", "xxxzgpsssa", "xxwwkktt", "znnnnfqknaz", "qqquuhii", "dvvvwz"};
		//String[] s2 = new String[]{"cccooommaaqqoxii", "gggqaffhhh", "tttoowwwmmww"};


		//System.out.println("Max Diff: " + CodeWars.mxdiflg(s1, s2));
		
		//CodeWars.step(10);
		
		//StudentTest test = new StudentTest();
		//test.testEnroll();
		
		//System.out.println(longestConsec(new String[] {"itvayloxrp","vweqilsfytihvrzlaodfixoyxvyuyvgpck","wkppqsztdkmvcuwvereiupccauycnjutlv"}, 2));

//		Path currentRelativePath = Paths.get("");
//		String s = currentRelativePath.toAbsolutePath().toString();
//		System.out.println("Current relative path is: " + s);

//			// System.getProperty("user.home")
//		Path aPath = Paths.get("");
//						 //This gets Path to where C/W's is
//		String s = aPath.toAbsolutePath().// Will have to do String.split("/")
//		System.out.println("aPath: " + s);
//
//		aPath = Paths.get( s +"/udemy");
//		s = aPath.toString();
//		System.out.println("aPath: " + s);
		

		//testSorting("BCAacb");
	
	}
	/**Where is my parent**
	 * 'best' solution: not my opinion 
		    static String findChildren(final String text) {
		        String[] sorted = text.split("");
		        Arrays.sort(sorted); 
		        Arrays.sort(sorted, String.CASE_INSENSITIVE_ORDER);
		        return String.join("", sorted);
		    }
	 * 
			static String findChildren(final String text) {
		      ArrayList<String> letters = new ArrayList<String>(Arrays.asList(text.split("")));
		      Comparator<String> ALPHA_ORDER = new Comparator<String>() {
		      public int compare(String str1, String str2) {
		          int x = String.CASE_INSENSITIVE_ORDER.compare(str1, str2);
		          if (x== 0) {
		              x= str1.compareTo(str2);
		          }
		          return x;
		      }
		  };
  Collections.sort(letters, ALPHA_ORDER);
  return String.join("", letters);
	 * 
	 * */
	// Try to read and figure out what i have coded 
	public static void testSorting(String testing)
	{
		// Sort the Input
		char[] charArray = testing.toCharArray();
		testing = "";
		Arrays.sort(charArray);
		// Find the number of capital letters in the string/ char
		int numOfCaps = 1;
		while( Character.toLowerCase(charArray[0]) != charArray[numOfCaps] ) //numOfCaps < charArray.length &&
			numOfCaps++;		
		// Give the mums their children
		String[] mothers = new String[numOfCaps];
		for(int i = 0; i < mothers.length; i++) {
			mothers[i] = String.valueOf(charArray[i]);
			int y = numOfCaps;
			while(y < charArray.length && charArray[numOfCaps] == charArray[y]) {	
				mothers[i] += charArray[y];
				y++;
			}
			numOfCaps = y;
			testing += mothers[i];
		}
		System.out.println("The Final: " + testing);
	}
	
	public static String longestConsec(String[] strarr, int k) 
	{
		// This is cool as it can add custom comparators !!
		
		StringBuilder answer = new StringBuilder();
			
		//Arrays.sort(strarr, (a, b)->Integer.compare(a.length(), b.length()));
		//Arrays.sort(strarr, Comparator.comparingInt(String::length));
		
		java.util.Arrays.sort(strarr, new java.util.Comparator<String>() {
		    @Override
		    public int compare(String s1, String s2) {
		        // TODO: Argument validation (nullity, length)
		        return s2.length() - s1.length();// comparision
		    }
		});
		
	
		for(int i = 0; i < strarr.length; i++) {
			answer.append(strarr[i]);
		}
        return answer.toString();
    }
	
	
	
	
	public static int[][] step(int n) 
	{
		int index = 0;
		int factors[][] = new int[2][n];
		for(int i = 1; i < n; i++) {
			if(n % i == 0) {
				System.out.println("Multiple: " + (int) n / i + " | " + i);
				factors[0][index] = (int) n / i;
				factors[1][index] = i;
			}
		}
		
		System.out.println("New........\n\n");
		int x = 0, y = 0;
		factors = new int[2][n];
		
		for(int i = 1; i <= n; i++){
			inner:for(int z = n; z > 0; z--) {
				//System.out.print(z + " | ");
				if(i * z >= n) {

					if(z * i > n) 
						continue inner;
					else if (z * i < n)
						break inner;
					System.out.println("Multiple Found : " + z + " | "+  i);
					factors[0][index] = z;
					factors[1][index] = i;
					index++;
				}// end of if
			}// end of inner
		}// end of outer 	
		return factors;
    }
	
	 public static int mxdiflg(String[] a1, String[] a2)
	 {
		 if(a1.length < 1 || a2.length < 1)
			 return -1;
		 int a1MinMax[] = new int[2]; int a2MinMax[] = new int[2];
		 
		 a1MinMax[0] = a1[0].length(); a1MinMax[1] = a1[0].length();
		 for(int i = 1; i < a1.length; i++) {
			 // a1
			 if(a1[i].length() < a1MinMax[0])
				 a1MinMax[0] = a1[i].length();
			 else if(a1[i].length() > a1MinMax[1])
				 a1MinMax[1] = a1[i].length();
		 }
		 a2MinMax[0] = a2[0].length(); a2MinMax[1] = a2[0].length();
		 for(int i = 1; i < a2.length; i++) {
			// a2
			 if(a2[i].length() < a2MinMax[0])
				 a2MinMax[0] = a2[i].length();
			 else if(a2[i].length() > a2MinMax[1])
				 a2MinMax[1] = a2[i].length();
		 }
		 
		 for(int i = 0; i < 2; i++) {
			 System.out.println("a1MinMax " + a1MinMax[i]);
			 System.out.println("a2MinMax " + a2MinMax[i]);
		 }
		 
		 System.out.println();
		 int a1Max_a2Min = Math.abs(a1MinMax[1] - a2MinMax[0]) ;
		 int a2Max_a1Min = Math.abs(a1MinMax[0] - a2MinMax[1]) ;
		// Return
		 if(  a1Max_a2Min > a2Max_a1Min)
			 return a1Max_a2Min;
		 else
			 return a2Max_a1Min; 
	 }
	
	public static int RowSumNumbers(int n)
	{	
		int y = 0; int z = (n - 1);
		for(int i = 0; i < n - 1 ; i ++) {
			System.out.println("First: " + z);
			y += z;
			z--;
			System.out.println("Last : " + z + "\n");
		}
		return y;
		
	}
	
	// Version 1
    public static String rakeGarden(String garden)
    {
        String gardenArr[] = garden.split("\\s");
        String keywords[] = {"rock", "gravel"};    
        
        garden = "";
        
        for(int y = 0; y < gardenArr.length; y++){
        		if(!gardenArr[y].equals(keywords[0]) && !gardenArr[y].equals(keywords[1]))
        			gardenArr[y] = keywords[1];  
        		//System.out.println(gardenArr[y]);
        		garden += gardenArr[y] + " ";
        }
        
       garden = (String) garden.subSequence(0, (garden.length() - 1));
       System.out.println(garden);
       return garden;
    }

}

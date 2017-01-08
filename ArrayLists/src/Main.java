import javax.swing.JOptionPane;

public class Main {

	public static int multiplesOf7(int[] array){
		int count = 0;
		for (int i = 0; i < array.length; i++){
			if (array[i] % 7 == 0){
				count++;
			}
		}
		return count;
	}


	public static int diff(int[] array){
		int largest = array[0];
		int smallest = array[0];

		for (int i = 0; i < array.length; i++){
			if(array[i] > largest){
				largest = array[i];
			}
			if(array[i] < smallest){
				smallest = array[i];
			}
		}

		int diff = largest - smallest;
		return diff;
	}


	public static String switchThem(int[] array1, int[] array2){

		int[] tempArray = array2;
		StringBuilder result = new StringBuilder();
		String resultOther = "";

		array2 = array1;
		array1 = tempArray;

		String option = JOptionPane.showInputDialog(null, 
				"Which array would you like to be returned: 1 or 2?");

		if (option.equals("1")){
			resultOther = "Array 1: ";
			for(int i: array1){
				result.append(i + ", ");
			}
		}

		else if (option.equals("2")){
			resultOther = "Array 2: ";
			for (int i: array2){
				result.append(i + ", ");
			}
		}

		else if (!option.equals("1") && !option.equals("2")){
			JOptionPane.showMessageDialog(null,
					"Not a valid option!");
		}

		return resultOther += result;
	}


	public static String strConcat(String[][] array){
		String separator = ", ";
		StringBuffer results = new StringBuffer();
		String result = "";
		for (int i = 0; i < array.length; ++i){
			for (int j = 0; j < array[i].length; ++j){
				if (j > 0){
					results.append(array[i][j]).append(separator);						
				}
				else{
					results.append(array[i][j]).append(separator);
				}
			}
		}
		return result + results;
	}


	public static int nbrTrue(boolean[][] array){
		int count = 0;

		for (int i = 0; i < array.length; i++){
			if (array[i][i] == true){
				count++;
			}
		}
		return count;
	}


	public static String oddOrEven(int[] array){
		String oddEven = "error";
		int count = 0;

		for(int i: array){
			count++;			
		}

		if (count % 2 == 0){
			oddEven = "even";
		}
		else if (count %2 != 0){
			oddEven = "odd";
		}

		return oddEven;
	}


	public static int[] foo(int[][] a){
		int[] temp = new int[a.length];

		for (int i = 0; i < a.length; i++){
			temp[i] = a[i].length;
		}
		return temp;
	}


	public static void main(String[] args){
		int[] a1 = {1,2,4,5,6,7,14,21,30};
		System.out.println("multiplesOf7: " + multiplesOf7(a1));

		int[] a2 = {1,2,3,4,5,6,7,8,9,10};
		System.out.println("diff: " + diff(a2));

		int[] a3 = {1,2,3,4,5};
		int[] a4 = {10,9,8,7,6};
		System.out.println("switchThem: " + switchThem(a3,a4));

		String[][] a5 = {{"one","two"},{"three","four"}};
		System.out.println("strConcat: " + strConcat(a5));

		boolean[][] a6 = {{true,false},{false,true}};
		System.out.println("nbrTrue: " + nbrTrue(a6));

		int[] a7 = {1,2,3,4,5,6};
		System.out.println("oddOrEven: " + oddOrEven(a7));
		
		int[][] a8 = {{1,2,6},{3,4,5}};
		System.out.println("foo: " + foo(a8));
	}
}

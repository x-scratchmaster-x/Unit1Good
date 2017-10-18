package Lab1;

public class MultiTable {
	public static void main(String[] args){
	String numString;
	for(int i = 1;i<13;i++){
		for(int j=1;j<13; j++){
			numString = i * j + "        ";
			numString = numString.substring(0,4);
			System.out.print(numString);
		}
		System.out.println();
	}
	}
}

//TO increase file size
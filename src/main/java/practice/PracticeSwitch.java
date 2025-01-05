package practice;

public class PracticeSwitch {
	
	public static void main(String[] args) {
		
		int[] numbers = {1, 2, 3, 5, 4, 2, 4, 3, 1, 5};
		
		for (int num : numbers) {
			
			switch(num) {
			case 1:
				System.out.println("1:勇者");
				break;
			case 2:
				System.out.println("2:バトルマスター");
				break;
			case 3:
				System.out.println("3:パラディン");
				break;
			case 4:
				System.out.println("4:海賊");
				break;
			case 5:
				System.out.println("5:魔法剣士");
				break;
			}
		}
	}

}

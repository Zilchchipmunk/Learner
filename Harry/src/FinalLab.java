public class FinalLab {
		public static void main(String [] args){
			int[] numbers = {1, 4, 9, 16, 9, 7, 4, 9, 11};
			System.out.println("numbers");
			int[] backwards = backwardsArray(numbers);
			for (int i = 0; i < numbers.length; i++) {
			System.out.println(backwards[i]);
			}
			}
		public static int[] backwardsArray(int[] input) {
			int length;
			length = input.length;
			int x = 0;
			int[] backwards = new int[length];
			for (int y=length; y > 0; y--) {
				backwards[x] = input[y-1];
				x++;
			}
			return backwards;
		}
}

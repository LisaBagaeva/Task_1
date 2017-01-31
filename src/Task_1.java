public class Task_1 {
	public static void printNonUniqueSymbols(String expression) {
		char[] chars = expression.toCharArray();
		StringBuffer out = new StringBuffer();
		char currentChar = 0;
		int index = 0;
		int lb = 1;
		while (index != chars.length - 1) {
			for (int i = lb; i < chars.length; i++) {
				if (chars[index] == ' ')
					break;
				if (chars[index] == chars[i]) {
					if (chars[index] != currentChar) {
						out = out.append(chars[index]);
						currentChar = chars[index];
					}
					chars[i] = ' ';
				}
			}
			index++;
			lb++;
		}
		System.out.println(out);
	}

	public static void main(String[] argv) {
		String exp = "       1      1     242    3     1111145  6    455255    7    54444 2";
		Task_1.printNonUniqueSymbols(exp);
	}
}

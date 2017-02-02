import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task_1 {
	public static void printNonUniqueSymbols(String expression) {
		if (!expression.isEmpty()) {
			char[] chars = expression.toCharArray();
			Map<Character, Boolean> elements = new HashMap<>();
			for (Character ch : chars)
				if (ch != ' ')
					if (elements.containsKey(ch))
						elements.replace(ch, true);
					else
						elements.put(ch, false);

			Set<Character> keys = elements.keySet();
			for (Character ch : keys)
				if (elements.get(ch))
					System.out.print(ch + " ");
		}
	}

	public static void main(String[] argv) {
		String exp = "1444      443124555        65";
		Task_1.printNonUniqueSymbols(exp);
	}
}

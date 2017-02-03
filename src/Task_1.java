import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Task_1 {
	public static void printNonUniqueSymbols(String expression) {
		if (!expression.isEmpty()) {
			Map<Character, Boolean> elements = new HashMap<>();
			for (Character ch : expression.toCharArray())
				if (ch != ' ')
					if (elements.containsKey(ch))
						elements.replace(ch, true);
					else
						elements.put(ch, false);
			
			for (Character ch : elements.keySet())
				if (elements.get(ch))
					System.out.print(ch + " ");
		}
	}

	public static void main(String[] argv) {
		String exp = "1444      443124555        65";
		Task_1.printNonUniqueSymbols(exp);
	}
}

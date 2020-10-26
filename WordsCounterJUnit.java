
import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

class WordsCounterJUnit {

	void test() {

		HashMap<String, Integer> map = new HashMap<String, Integer>();
		map.put("the", 57);
		map.put("and", null);
		map.put(null, 32);
		HashMap<String, Integer> expected = new HashMap<>();
		expected.put("the", 57);
		expected.put("and", null);
		expected.put(null, 32);
		assertThat(map.entrySet(), is(expected.entrySet()));

	}

	private void assertThat(Set<Entry<String, Integer>> entrySet, Object object) {
		// TODO Auto-generated method stub

	}

	private Object is(Set<Entry<String, Integer>> entrySet) {
		// TODO Auto-generated method stub
		return null;
	}

}

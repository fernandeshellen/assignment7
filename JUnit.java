import static org.junit.jupiter.api.Assertions.*;
import java.io.File;
import org.junit.jupiter.api.Test;

class JUnit {

	@Test
	void test() throws Exception {

		String path = "/Users/hellenfernandes/Documents/GUI/poem.txt";

		File file = new File(path);
		String absolutePath = file.getAbsolutePath();

		System.out.println(absolutePath);

		assertTrue(absolutePath.endsWith("/Users/hellenfernandes/Documents/GUI/poem.txt"));

	}

}

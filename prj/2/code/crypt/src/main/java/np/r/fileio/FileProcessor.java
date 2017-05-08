package np.r.fileio;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

public class FileProcessor {
	
	public String getFileContent(String filepath){
		try {
			return new String(Files.readAllBytes(Paths.get(filepath)));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return null;
	}
	
	
	public File getFileWithNewContent(String filepath, String text){
		List<String> lines = Arrays.asList(text);
		Path file = Paths.get(filepath);
		try {
			Files.write(file, lines, Charset.forName("UTF-8"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new File(filepath);
		
	}

}

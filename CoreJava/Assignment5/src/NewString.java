import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class NewString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
  var path= "/Assignment5/src/demo";
  try {
	Files.writeString(Path.of(path),"hhhhhhhhhhh",StandardOpenOption.APPEND);
} catch (IOException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}

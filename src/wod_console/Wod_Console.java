package wod_console;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;

public class Wod_Console {

	public static void main(String[] args) throws IOException {
		Document conn;
		String fileName = "out.txt";
		FileWriter plik = new FileWriter(fileName);
		
		try {
			String dane = "";
			int i = 1;
			do {
				conn = Jsoup.connect("https://www.crossfit.com/workout?page=" + i).get();
				dane = dane + conn.getElementsByClass("content").html();
				plik.write(dane);
				i++;
				System.out.println("i: " + i);
				//System.out.println(dane);
			/*String tab[] = dane.split("<h3");
			for (String r : tab) {
				System.out.println(r);
			}*/
			}
			while(
				i < 3 //!conn.getElementsByClass("content").text().isEmpty()
			);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		plik.close();
		System.out.println("Koniec");
	}

}

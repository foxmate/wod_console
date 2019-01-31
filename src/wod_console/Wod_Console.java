package wod_console;
import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Wod_Console {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Document conn = Jsoup.connect("https://www.crossfit.com/workout/2017/06/10/").get();
			String dane = conn.getElementsByClass("content").outerHtml();
			System.out.println(dane);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Test");
	}

}

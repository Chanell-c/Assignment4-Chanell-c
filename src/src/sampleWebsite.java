import java.awt.*;
import java.io.*;
import com.github.cliftonlabs.json_simple.*;

public class sampleWebsite {

    public static void main(String[] args) throws IOException, JsonException{
        JsonArray a = (JsonArray) readData();
            //obtain and parse info from JSON file

        File htmlFile = new File("description.html");
        Desktop.getDesktop().browse(htmlFile.toURI());
            //have java program open website
    }



    public static Object readData()throws IOException, JsonException{
        BufferedReader input = new BufferedReader(new FileReader("data.json"));
            //read data from JSON file
        Object obj = Jsoner.deserialize(input);
            //parse/deserialize JSON file
        input.close();
        return obj;
    }

}

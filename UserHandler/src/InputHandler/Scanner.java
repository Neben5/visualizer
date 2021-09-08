package InputHandler;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

public class Scanner {
    public Scanner(String arg) throws IOException, ParseException {
        Object obj = new JSONParser().parse(new FileReader(arg));
        JSONObject json = (JSONObject) obj;

        int[][] vertices = parseDoublyNestedJsonIntArrays((JSONArray) json.get("vertices"));

        for(int i = 0; i < vertices.length; i++){
            for(int j = 0; j<vertices[i].length;j++){
                System.out.print(vertices[i][j]+",");
            }
            System.out.println();
        }
        JSONArray lines = (JSONArray) json.get("lines");
        JSONArray faces = (JSONArray) json.get("faces");
    }
    public int[][] parseDoublyNestedJsonIntArrays(JSONArray source){
        ArrayList<int[]> listOfArrays = new ArrayList<>();
        for(int i = 0; i < source.size(); i++){
            JSONArray tempArray = (JSONArray) source.get(i);
            int[] ints = new int[tempArray.size()];
            for(int j = 0; j < tempArray.size(); j++){
                ints[j]=((Long) tempArray.get(j)).intValue();
            }
            listOfArrays.add(ints);
        }
        int length = listOfArrays.get(0).length;
        int[][] retval = new int[listOfArrays.size()][length];
        for(int i = 0; i < listOfArrays.size(); i++){
            retval[i] = listOfArrays.get(i);
        }
        return retval;
    }
    public static void main(String[] args) throws IOException, ParseException {
        new Scanner("/Users/benadmin/Projects/visualizer/Test.json");
    }
}

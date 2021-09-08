import InputHandler.Scanner;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main{
    /**
     * @param args Files to visualize
     */
    public static void main(String[]args) throws IOException, ParseException {
        if(args.length == 0){
            System.out.println("At least one object file expected");
            System.exit(0);
        }
        for(int i = 0; i < args.length; i++){
            if(!isValidPath(args[i])){
                System.out.println("File "+ args[i] + "is not accessible");
            }
        }
        new Scanner(args[0]);
    }

    /**
     * Checks if path is valid and accessible
     * @param path
     * @return whether path is valid and readable
     */
    private static boolean isValidPath(String path) throws SecurityException{
        return Files.exists(Paths.get(path)) && Files.isReadable(Paths.get(path));
    }


}
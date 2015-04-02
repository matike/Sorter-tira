package sorter.sorter;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Class for generating a text file filled with random numbers. Currently not used for anything.
 * @author matti
 */
public class ListGenerator {

    private PrintWriter writer;
    private Random random;

    /**
     *
     */
    public ListGenerator() {

        this.random = new Random();
    }

    /**
     * Generates a text file filled with random numbers
     * @param listName Name of the file
     * @param listLength How many numbers you want in the file
     */
    public void generateList(String listName, int listLength) {
        try {

            this.writer = new PrintWriter(listName+".txt");
            for (int i = 0; i < listLength; i++) {
                writer.println(random.nextInt(100));
            }
            writer.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ListGenerator.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    

}

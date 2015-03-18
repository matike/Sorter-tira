package sorter.sorter;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ListReader {

    private FileReader fileReader;
    private BufferedReader bufferedReader;
    private String file;
    private int[] array;

    public ListReader(String file) {
        this.array = new int[10000];
        this.file = file;

    }

    public void readList() {
        int i = 0;
        try {
            fileReader = new FileReader(file);
            bufferedReader = new BufferedReader(fileReader);
            try {

                for (String line = bufferedReader.readLine(); line != null; line = bufferedReader.readLine()) {
                    array[i] = Integer.parseInt(line);
                    i++;
                }
            } catch (IOException ex) {
                Logger.getLogger(ListReader.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(ListReader.class.getName()).log(Level.SEVERE, null, ex);
        }

    }


public int[] getArray() {
        return array;
    }

}

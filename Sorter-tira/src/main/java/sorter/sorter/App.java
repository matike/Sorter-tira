package sorter.sorter;

import java.util.Arrays;

public class App 
{

    public static void main(String[] args) {

        ListGenerator gene = new ListGenerator();
        gene.generateList("test", 10000);
        ListReader reader = new ListReader("test.txt");
        reader.readList();

        int[] array = reader.getArray();
        for (int i = 0; i < reader.getArray().length; i++) {
            array[i] = (reader.getArray()[i]);
        }
        Arrays.sort(array);
        for (int i = 0; i < reader.getArray().length; i++) {
            System.out.println(array[i]);
        }

    }
}

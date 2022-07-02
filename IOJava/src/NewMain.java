import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class NewMain {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        String result = scanner.nextLine();

        String path = "/Users/gregmazur/IdeaProjects/BasicJava/output/test.txt";

        File testFile = new File(path);
        testFile.createNewFile();


        System.out.println(readFile(testFile));


//        try (TestAutoClose autoClose = new TestAutoClose()){
//            System.out.println("run");
//        }


        //write to file

        try (FileOutputStream fileOutputStream = new FileOutputStream(testFile);) {
            fileOutputStream.write(result.getBytes());
            fileOutputStream.flush();
        }
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }


    static String readFile(File file) {
        StringBuilder result = null;
        try(FileInputStream input = new FileInputStream(file);) {


            System.out.println("Data in the file: ");

            int elements = input.available();
            result = new StringBuilder(elements);


            System.out.println("String builder was created with " + result.capacity());


            // Reads the first byte
            int i = input.read();

            while (i != -1) {
                result.append((char) i);
                //                System.out.print((char)i);

                // Reads next byte from the file
                i = input.read();
            }
        }

        catch (Exception e) {
            e.getStackTrace();
        }

        result.append("test");

        System.out.println(result.capacity());
        return result.toString();
    }


    void readFileScanner(File file){
        try (Scanner myReader = new Scanner(file);){

            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }


    static class TestAutoClose implements AutoCloseable{

        @Override
        public void close() {
            System.out.println("Closed");
        }
    }
}

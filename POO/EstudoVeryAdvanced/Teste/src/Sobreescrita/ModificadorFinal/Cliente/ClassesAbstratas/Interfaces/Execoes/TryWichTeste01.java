import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;

public class TryWichTeste01 {
    public static void main(String[] args) {
        
    }

    public static void lerArquivos () {
        try (Reader reader = new BufferedReader(new FileReader("teste.txt"))) {
            
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
package aleatorio;

import java.io.File;
import static java.io.FileDescriptor.out;
import java.io.IOException;
import java.io.RandomAccessFile;
import javax.swing.JOptionPane;

/**
 *
 * @author oracle
 */
public class Aleatorio {

    public static void main(String[] args) throws IOException {
        String[] code = {"p1", "p2", "p3"};
        String[] descricion = {"parafuso", "cravo", "tachos"};
        double[] prices = {3.0, 4.0, 5.0};

        File texto = new File("textoalea.txt");
        texto.createNewFile();

        RandomAccessFile random = new RandomAccessFile(texto, "rw");
        for (int i = 0; i < code.length; i++) {
            random.writeChars(String.format("%-3s", code[i]));
            random.writeChars(String.format("%-10s", descricion[i]));
            random.writeDouble(prices[i]);
        }
        String auxCode = "";
        String auxDesc = "";

        random.seek(34);

        for (int i = 0; i < 3; i++) {
            auxCode = auxCode + random.readChar();

        }
        for (int i = 0; i < 10; i++) {
            auxDesc = auxDesc + random.readChar();

        }
        Product auxP = new Product(auxCode.replace(" ",""), auxDesc.replace(" ",""), random.readDouble());
        System.out.print(auxP);

    

    random.close ();
}
}


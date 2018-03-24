/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package questao06.no3;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author juan
 */
public class No3 {

    public static void main(String[] args) throws FileNotFoundException, IOException {
        File file = new File("../disk.txt");
        FileOutputStream fos = new FileOutputStream(file, true);
        fos.write("changing...\n".getBytes());
        fos.close();
    }
}

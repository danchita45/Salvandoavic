package eddfarmacias;

import eddfarmacias.Interfaz.MultiLista;
import eddfarmacias.Interfaz.MultiLista;
import eddfarmacias.Interfaz.MultiLista;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.RandomAccessFile;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author VictorBack
 */
public class EscrLect {


    public boolean InsertarnuevaLista(Object lista) throws IOException {
        File arch = new File("listas.dat");
         RandomAccessFile archivorw = new RandomAccessFile(arch, "rw");
        archivorw.setLength(0);
        
        File archivo = new File("listas.dat");
        FileOutputStream fos = null;
        try {
            fos = new FileOutputStream(archivo, true);
        } catch (FileNotFoundException ex) {
            Logger.getLogger(EscrLect.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        ObjectOutputStream oos = null;
        try {
            oos = new ObjectOutputStream(fos);
        } catch (IOException ex) {
            Logger.getLogger(EscrLect.class.getName()).log(Level.SEVERE, null, ex);
            return false;
        }
        oos.writeObject(lista);
        oos.close();
        fos.close();
        return true;
    }

    public MultiLista SacaDatos() {
        File archivo = new File("listas.dat");
        MultiLista np = null;
        try {
            FileInputStream fis = new FileInputStream(archivo);
            ObjectInputStream ois;
            while (fis.available() > 0) {
                ois = new ObjectInputStream(fis);
                np = (MultiLista) ois.readObject();
            }
        } catch (Exception e) {
            System.out.println("Error");
            e.printStackTrace();
        }
        return np;
    }
    
}

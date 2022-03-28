package projlab;

import java.io.IOException;
import java.util.ArrayList;

import static projlab.Main.logger;

public abstract class Equipment {
    
    /** 
     * Visszaad egy false-t.
     * @param m
     * @return boolean
     */
    public boolean addMaterial(Material m) {
        logger.printCall();
        logger.returnCall();
        return false;
    }

    
    /** 
     * Null-t ad vissza.
     * @return ArrayList<Material>
     */
    public ArrayList<Material> getMaterials() {
        logger.printCall();
        logger.returnCall();
        return null;
    }

    
    /** 
     * Nem csinál semmit, csak a Bag-ben használjuk.
     * @param m
     */
    public void removeMaterial(Material m) {
        logger.printCall();
        logger.returnCall();
    }


    /** 
     * Nem csinál semmit, csak a Bag-ben használjuk.
     * @param u
     * @param v
     * @return boolean
     */
    public boolean apply(Unction u, Virologist v) throws IOException {
        logger.printCall();
        logger.returnCall();
        return true;
    }
}
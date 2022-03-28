package projlab;

import java.io.IOException;
import java.util.ArrayList;

import static projlab.Main.logger;

public class Field {

    private ArrayList<Field> neighbours = new ArrayList<>();
    private ArrayList<Virologist> virologists = new ArrayList<>();

    /** 
     * Visszaad egy false-t.
     * @param v
     * @return boolean
     * @throws IOException
     */
    public boolean takeStuff(Virologist v) throws IOException {
        logger.printCall();
        logger.returnCall();
        return false;
    }
    
    /** 
     * Beállítja a mező szomszédját.
     * @param f
     */
    public void setNeighbour(Field f) {
        logger.printCall();
        neighbours.add(f);
        logger.returnCall();
    }
    
    /** 
     * Visszaadja a szomszédait.
     * @return Field
     */
    public ArrayList<Field> getNeighbours() {
        logger.printCall();
        logger.returnCall();
        return neighbours;
    }

    /** 
     * Rárakja a virológust a mezőre.
     * @param v
     */
    public void accept(Virologist v) {
        logger.printCall();
        virologists.add(v);
        v.setField(this);
        logger.returnCall();
    }

    /** 
     * Eltávolítja a virológust a mezőről.
     * @param v
     */
    public void remove(Virologist v) {
        logger.printCall();
        virologists.remove(v);
        logger.returnCall();
    }

    /** 
     * Visszaadja a mezőn lévő virológusokat.
     * @return Virologist
     */
    public Virologist getVirologists() {
        logger.printCall();
        logger.returnCall();
        return virologists.get(virologists.size() - 1);
    }


}

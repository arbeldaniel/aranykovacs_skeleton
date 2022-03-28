package projlab;

import java.util.ArrayList;

import static projlab.Main.logger;

public class Bag extends Equipment {

    private ArrayList<Material> materials = new ArrayList<>();

    /** 
     * Anyagot tesz a tárolóba, visszaadja, hogy sikerült-e
     * @param m
     * @return boolean
     */
    public boolean addMaterial(Material m) {
        logger.printCall();
        materials.add(m);
        logger.returnCall();
        return true;
    }

    /** 
     * Visszaadja a tárolt anyagokat.
     * @return ArrayList<Material>
     */
    public ArrayList<Material> getMaterials() {
        logger.printCall();
        logger.returnCall();
        return materials;
    }

    /** 
     * A kapott anyagot eltávolítja a tárolóból.
     * @param m
     */
    public void removeMaterial(Material m) {
        logger.printCall();
        materials.remove(m);
        logger.returnCall();
    }
}

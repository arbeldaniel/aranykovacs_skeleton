package projlab;

import java.io.IOException;

import static projlab.Main.logger;

public class Storage extends Field {

    /** 
     * Odaadja a virológusnak az anyagot.
     * @param v
     * @return boolean
     * @throws IOException
     */
    public boolean takeStuff(Virologist v) throws IOException {
        logger.printCall();
        Material m = new Material();
        v.addMaterial(m);
        Bag b = new Bag();
        v.addEquipment(b);
        logger.returnCall();
        return true;
    }

}
//comment
package projlab;

import static projlab.Main.logger;

public class Shelter extends Field {

    /** 
     * Odaadja a virológusnak a védőfelszerelést
     * @param v
     * @return boolean
     */
    public boolean takeStuff(Virologist v) {
        logger.printCall();
        Cloak c = new Cloak();
        v.addEquipment(c);
        logger.returnCall();
        return true;
    }
}

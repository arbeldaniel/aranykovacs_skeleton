package projlab;

import static projlab.Main.logger;

public class Laboratory extends Field {

    /** 
     * Odaadja a virológusnak a kódot.
     * @param v
     * @return boolean
     */
    public boolean takeStuff(Virologist v) {
        logger.printCall();
        Code c = new Code();
        v.addCode(c);
        logger.returnCall();
        return true;
    }
}

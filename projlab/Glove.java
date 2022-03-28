package projlab;

import java.io.IOException;

import static projlab.Main.logger;

public class Glove {
    
    /** 
     * Kesztyű osztályban lévő apply függvény. Alkalmazza a kesztyűt, visszaadja, hogy sikerült-e.
     * @param u
     * @param v
     * @return boolean
     */
    public boolean apply(Unction u, Virologist v) throws IOException {
        logger.printCall();
        //megkérdezzük, hogy van-e neki
        System.out.print("Does It have Glove? (y/n):");
        char c = (char) System.in.read();
        if(c == 'y'){
            v.useUnction(u);
            logger.returnCall();
            return false;
        }
        logger.returnCall();
        return true;
    }
}

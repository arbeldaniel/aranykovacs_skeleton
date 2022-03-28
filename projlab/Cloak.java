package projlab;

import java.io.IOException;

import static projlab.Main.logger;

public class Cloak extends Equipment {
    
    /** 
     * Alkalmazza a köpenyt, visszaadja, hogy sikerült-e.
     * @param u
     * @param v
     * @return boolean
     */
    public boolean apply(Unction u, Virologist v) throws IOException {
        logger.printCall();
        //megkérdezzük a felhasználót, hogy megvédjen-e
        System.out.print("Megvéd a köpeny? I/N:");
        char c = (char) System.in.read();
        if(c == 'I') {
            logger.returnCall();
            return false;
        }
        logger.returnCall();
        return true;
    }
}

package projlab;

import java.io.IOException;

import static projlab.Main.logger;
import static projlab.Main.scanner;

public class Forget extends Unction {
    
    /** 
     * Forget osztály apply függvénye. MakeUnction esetén false-t ad vissza, egyébként true-t.
     * @param a
     * @return boolean
     */
    public boolean apply(Action a) throws IOException {
        logger.printCall();
        //megkérdezzük, hogy a hatása alatt van-e
        System.out.print("Is It under effect 'Forget'? (y/n): ");
        char c = scanner.next().charAt(0);
        if(c == 'y') {
            logger.returnCall();
            return false;
        }
        logger.returnCall();
        return true;
    }
}

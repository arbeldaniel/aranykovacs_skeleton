package projlab;

import java.io.IOException;

import static projlab.Main.logger;
import static projlab.Main.scanner;

public class Dancing {
    
    /** 
     * Dancing osztály apply függvénye. Move esetén false-t ad vissza, egyébként true-t.
     * @param a
     * @return boolean
     */
    public boolean apply(Action a) throws IOException {
        logger.printCall();
        //megkérdezzük, hogy a hatása alatt van-e
        System.out.print("Táncol? I/N:");
        char c = scanner.next().charAt(0);
        if(c == 'I') {
            logger.returnCall();
            return false;
        }
        logger.returnCall();
        return true;
    }
}

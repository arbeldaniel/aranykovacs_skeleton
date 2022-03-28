package projlab;

import java.io.IOException;

import static projlab.Main.logger;
import static projlab.Main.scanner;

public class Protection {

    public boolean apply(Action a) throws IOException {
        logger.printCall();
        //megkérdezzük, hogy a hatása alatt van-e
        System.out.print("Is It under effect 'Protection'? (y/n): ");
        char c = scanner.next().charAt(0);
        if (c == 'y') {
            logger.returnCall();
            return false;
        }
        logger.returnCall();
        return true;
    }
}

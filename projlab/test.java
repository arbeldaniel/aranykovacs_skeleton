package projlab;

import java.io.IOException;

public class test {
    public void shit() {
        Main.logger.printCall();
    }

    /*public void cycle() throws IOException {
        char c = 'p';
        Skeleton s = new Skeleton();
        System.out.println("Melyik tesztet futtassuk?");
        while(c != 'q') {
            
            c = (char) System.in.read();
            switch(c) {
                case '1':
                s.Move();
                Main.logger.printCall();
                break;
            }
        }
        System.out.println("Vége.");
    }*/
}

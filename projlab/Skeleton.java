package projlab;

import java.io.IOException;
import java.util.ArrayList;

import static projlab.Main.logger;
import static projlab.Main.scanner;

public class Skeleton {

    public void VirologistTriesToMove() throws IOException {
        logger.printCall();
        Field f1 = new Field();
        Field f2 = new Field();
        f1.setNeighbour(f2);
        f2.setNeighbour(f1);
        Virologist v1 = new Virologist();
        v1.setField(f1);
        int numOfFields;
        if((numOfFields = v1.move()) == 0) {
            logger.returnCall();
            return;
        }
        System.out.println("Choose your path by typing a number between 1-" + numOfFields);
        int c = scanner.nextInt();
        while(c > numOfFields && c < 1) {
            System.out.println("Input must be between 1-" + numOfFields);
            c = scanner.nextInt();
        }
        v1.move(c-1);
        logger.returnCall();
    }

    public void VirologistTriesToMakeUnction() throws IOException {
        logger.printCall();
        Virologist v = new Virologist();
        Unction u = new Unction();
        v.makeUnction(u);
        logger.returnCall();
    }

    public void VirologistTriesToUseUnctionOnItself() {
        logger.printCall();
        Virologist v = new Virologist();
        Unction u = new Unction();
        v.addUnction(u);
        ArrayList<Unction> unctions = v.getUnctions();
        v.useUnction(unctions.get(0));
        logger.returnCall();
    }

    public void VirologistTriesToUseUnctionOnOther() throws IOException {
        logger.printCall();
        Virologist v1 = new Virologist();
        Virologist v2 = new Virologist();
        Field f = new Field();
        //v1.setField(f);
        //v2.setField(f);
        f.accept(v1);
        f.accept(v2);
        Unction u = new Unction();
        v1.addUnction(u);
        ArrayList<Unction> unctions = v1.getUnctions();
        v1.useUnctionOnOther(unctions.get(0));
        logger.returnCall();
    }

    public void VirologistTriesToStealFromOtherVirologist() throws IOException {
        logger.printCall();
        Virologist v1 = new Virologist();
        Virologist v2 = new Virologist();
        Field f = new Field();
        f.accept(v1);
        f.accept(v2);
        v1.giveStuff();
        logger.returnCall();
    }

    public void VirologistTriesToPickUpMaterial() throws IOException {
        logger.printCall();
        Virologist v = new Virologist();
        Storage s = new Storage();
        s.accept(v);
        v.getField().takeStuff(v);
        logger.returnCall();
    }

    public void VirologistTriesToPickUpEquipment() throws IOException {
        logger.printCall();
        Virologist v = new Virologist();
        Storage s = new Storage();
        s.accept(v);
        v.getField().takeStuff(v);
        logger.returnCall();
    }

    public void VirologistTriesToReadCode() throws IOException {
        logger.printCall();
        Virologist v = new Virologist();
        Laboratory l = new Laboratory();
        l.accept(v);
        v.getField().takeStuff(v);
        logger.returnCall();
    }
}


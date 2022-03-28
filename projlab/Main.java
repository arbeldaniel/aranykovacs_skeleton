package projlab;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static Log logger = new Log();
    private static final Skeleton skeleton = new Skeleton();
    public static Scanner scanner = new Scanner(System.in);

    
    /** 
     * A programunk belépési pontja
     * @param args
     */
    public static void main(String[] args) throws IOException {
        System.out.println("Choose a test-case by typing a number between 1-x");
        int x = 1;
        while(x != 0) {
            printCases();
            x = scanner.nextInt();
            switch (x) {
                case 1: logger.log("Virologist Tries To Move");
                    skeleton.VirologistTriesToMove();
                    break;
                case 2: logger.log("Virologist Tries To Make Unction");
                    skeleton.VirologistTriesToMakeUnction();
                    break;
                case 3: logger.log("Virologist Tries To Use Unction On Itself");
                    skeleton.VirologistTriesToUseUnctionOnItself();
                    break;
                case 4: logger.log("Virologist Tries To Use Unction On Other");
                    skeleton.VirologistTriesToUseUnctionOnOther();
                    break;
                case 5: logger.log("Virologist Tries To Steal From Other Virologist");
                    skeleton.VirologistTriesToStealFromOtherVirologist();
                    break;
                case 6: logger.log("Virologist Tries To Pick Up Material");
                    skeleton.VirologistTriesToPickUpMaterial();
                    break;
                case 7: logger.log("Virologist Tries To Pick Up Equipment");
                    skeleton.VirologistTriesToPickUpEquipment();
                    break;
                case 8: logger.log("Virologist Tries To Read Code");
                    skeleton.VirologistTriesToReadCode();
                    break;
                default: break;
            }
        }
    }

    private static void printCases() {
        System.out.println("\n***************\n" +
                "1, Virologist Tries To Move\n" +
                "2, Virologist Tries To Make Unction\n" +
                "3, Virologist Tries To Use Unction On Itself\n" +
                "4, Virologist Tries To Use Unction On Other (With Cloak/Glove/Protection/Nothing\n" +
                "5, Virologist Tries To Steal Material From Other Virologist\n" +
                "6, Virologist Tries To Pick Up Material\n" +
                "7, Virologist Tries To Pick Up Equipment\n" +
                "8, Virologist Tries To Read Code\n" +
                "0, exit");
    }
    
}
//comment

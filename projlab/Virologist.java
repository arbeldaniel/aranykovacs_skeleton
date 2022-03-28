package projlab;

import java.io.IOException;
import java.util.ArrayList;

import static projlab.Main.logger;
import static projlab.Main.scanner;

public class Virologist {
    private Field f;
    private ArrayList<Unction> unctions = new ArrayList<>();
    private ArrayList<Material> materials = new ArrayList<>();
    private ArrayList<Code> codes = new ArrayList<>();
    private ArrayList<Equipment> equipments = new ArrayList<>();

    /** 
     * Beállítja a mezőt, amin a viorlógus van.
     * @param f
     */
    public void setField(Field f) {
        logger.printCall();
        this.f = f;
        logger.returnCall();
    }

    public Field getField() {
        logger.printCall();
        logger.returnCall();
        return f;
    }

    /** 
     * Megnézi, hogy tud-e mozogni a virológus, és visszaadja a lehetséges irányokat.
     * @return long
     * @throws IOException
     */
    public int move() throws IOException {
        logger.printCall();
        Freeze fr = new Freeze();
        if(!(fr.apply(Action.Move))) {
            logger.returnCall();
            return 0;
        }
        logger.returnCall();
        return f.getNeighbours().size();
    }

    /** 
     * A megadott irányba lépteti a virológust. Ha dancing Unction van a virológuson, akkor véletlenszerű irányba.
     * @param direction
     * @throws IOException
     */
    public void move(int direction) throws IOException {
        logger.printCall();
        Dancing d = new Dancing();
        d.apply(Action.Move);
        ArrayList<Field> next = f.getNeighbours();
        f.remove(this);
        next.get(direction).accept(this);
        logger.returnCall();
    }

    /** 
     * Megnézi, hogy tud-e mozogni a virológus, és felveszi a mezőről a rajta lévő dolgot.
     * @return boolean
     * @throws IOException
     */
    public boolean takeStuff() throws IOException {
        logger.printCall();
        Freeze fr = new Freeze();
        if(fr.apply(Action.Move)) {
            f.takeStuff(this);
            logger.returnCall();
            return true;
        }
        logger.returnCall();
        return false;
    }

    /** 
     * Anyagot ad a virológusnak.
     * @param m
     * @return boolean
     */
    public boolean addMaterial(Material m) {
        logger.printCall();
        materials.add(m);
        logger.returnCall();
        return true;
    }

    /** 
     * Kódot ad a virológusnak.
     * @param c
     * @return boolean
     */
    public boolean addCode(Code c) {
        logger.printCall();
        codes.add(c);
        logger.returnCall();
        return true;
    }

    /** 
     * Védőfelszerelést ad a virológusnak.
     * @param e
     * @return boolean
     */
    public boolean addEquipment(Equipment e) {
        logger.printCall();
        equipments.add(e);
        logger.returnCall();
        return true;
    }

    /** 
     * Magára keni a virológus az ágenst.
     * @param u
     * @return boolean
     */
    public boolean useUnction(Unction u) {
        logger.printCall();
        unctions.add(u);
        logger.returnCall();
        return true;
    }

    /** 
     * Beállít egy ágenst.
     * @param u
     */
    public void setUnction(int id, Unction u) {
        logger.printCall();
        unctions.set(id, u);
        logger.returnCall();
    }

    /**
     * Hozzáad ehy ágenst.
     * @param u
     */
    public void addUnction(Unction u) {
        logger.printCall();
        unctions.add(u);
        logger.returnCall();
    }
    /** 
     * Visszaadja a rendelkezésre álló ágenseket.
     * @return Unction
     */
    public ArrayList<Unction> getUnctions() {
        logger.printCall();
        logger.returnCall();
        return unctions;
    }
    public Unction getUnction(int id) {
        logger.printCall();
        logger.returnCall();
        return unctions.get(id);
    }

    /** 
     * Egy véletlenszerűen kiválasztott virológusra ken ágenst, amennyiben van ilyen az adott mezőn.
     * @param u
     * @return boolean
     * @throws IOException
     */
    public boolean useUnctionOnOther(Unction u) throws IOException {
        logger.printCall();
        Freeze fr = new Freeze();
        if (!(fr.apply(Action.Move))) {
            logger.returnCall();
            return false;
        }
        Virologist other = f.getVirologists();
        logger.returnCall();
        return (other.addUnction(u, this));
    }
    
    /** 
     * Hozzáadja az ágenst a virológushoz.
     * @param u
     * @param v
     * @return boolean
     * @throws IOException
     */
    public boolean addUnction(Unction u, Virologist v) throws IOException {
        logger.printCall();
        //megkérdezzük, hogy milye van
        System.out.print("Choose test-case between Cloak, Glove, Protection or else (c/g/p/x): ");
        char ca = scanner.next().charAt(0);
        boolean ret = true;
        switch(ca) {
            case 'c': Cloak c = new Cloak();
                ret = c.apply(u, this);
                break;
            case 'g': Glove g = new Glove();
                ret = g.apply(u, this);
                break;
            case 'p': Protection p = new Protection();
                ret = p.apply(Action.UseUnction);
                break;
            default: break;
        }
        logger.returnCall();
        return ret;
    }
    
    /** 
     * Elkészíti a megadott ágenst és a virológusnak adja. Figyelembe veszi az ágenshez szükséges anyagokat és kódokat is
     * @param u
     * @return boolean
     * @throws IOException
     */
    public boolean makeUnction(Unction u) throws IOException {
        logger.printCall();
        Bag b = new Bag();
        b.getMaterials();
        Material m = new Material();
        m.getType();
        b.removeMaterial(m);
        Forget f = new Forget();
        if (!(f.apply(Action.MakeUnction))) {
            logger.returnCall();
            return false;
        }
        Code c = new Code();
        c.getCodeID();
        unctions.add(u);
        logger.returnCall();
        return true;
    }

    /** 
     * Egy véletlenszerűen választott virológustól elvesz felszerelést vagy anyagot (ez is véletlenszerű), amennyiben van ilyen.
     * @throws IOException
     */
    public void giveStuff() throws IOException{
        logger.printCall();
        Freeze fr = new Freeze();
        if(!(fr.apply(Action.Move))) {
            logger.returnCall();
            return;
        }
        Virologist v2 = f.getVirologists();
        
        System.out.print("Steal Equipment or Material? (e/m): ");
        char c = scanner.next().charAt(0);
        if (c == 'e') {
            v2.giveStuffEquipment();
        } else if (c == 'm') {
            v2.giveStuffMaterial();
        } else {}
        logger.returnCall();
    }

    
    /** 
     * Egy véletlenszerűen kiválasztott felszerelést ad vissza. (Equipment)
     * @return Equipment
     * @throws IOException
     */
    private Equipment giveStuffEquipment() throws IOException{
        logger.printCall();
        Cloak cl = new Cloak();
        Freeze fr = new Freeze();
        if((fr.apply(Action.Move))) {
            logger.returnCall();
            return null;
        }
        logger.returnCall();
        return cl;
    }

    
    /** 
     * Egy véletlenszerűen kiválasztott felszerelést ad vissza. (Material)
     * @return Material
     * @throws IOException
     */
    private Material giveStuffMaterial() throws IOException{
        logger.printCall();
        Material m = new Material();
        Freeze fr = new Freeze();
        if((fr.apply(Action.Move))) {
            logger.returnCall();
            return null;
        }
        logger.returnCall();
        return m;
    }


}

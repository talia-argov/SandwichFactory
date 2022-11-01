public class RunSandwichWorld {

    public static void main(String[] args) {
        RunSandwichWorld runSandwich = new RunSandwichWorld();

    }
//public Sandwich(String pBun, boolean pHot, int pIngredients, char pSize){
    public RunSandwichWorld() {
        Sandwich blt;
        blt = new Sandwich();
        blt = new Sandwich("bun",true,3,'r');
        blt.printInfo();

        Sandwich pbj;
        pbj = new Sandwich("wholewheat",false,2,'s');
        pbj.printInfo();
    }
}

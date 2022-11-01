public class RunSandwichWorld {

    public static void main(String[] args) {
        RunSandwichWorld runSandwich = new RunSandwichWorld();

    }
//public Sandwich(String pBun, String pIngredients, boolean pHot, int pIngredients, char pSize, boolean pCanSpeak){
    public RunSandwichWorld() {
        Sandwich blt;
        blt = new Sandwich();
        blt = new Sandwich("bun", "turkey cheese", true,3,'r',false);
        blt.printInfo();

        Sandwich pbj;
        pbj = new Sandwich("wholewheat","peanut butter, jelly",false,2,'s',true);
        pbj.printInfo();

        Sandwich burger;
        burger = new Sandwich("sesamebun","burger, cheese, lettuce, tomato",true,4,'l',true);
        burger.printInfo();
    }
}

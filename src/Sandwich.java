public class Sandwich {

    public String breadtype;
    public boolean hot;
    public int ingredients;
    public char size;


    //constructor method
    public Sandwich() {
        breadtype = "bun";
        hot = true;
        ingredients = 3;
        size = 'r';}

    public Sandwich(String pBun, boolean pHot, int pIngredients, char pSize){
            breadtype = pBun;
            hot = pHot;
            ingredients = pIngredients;
            size = pSize;
        }
        public void printInfo() {
            System.out.println("The sandwich is breadtype" + breadtype);
            System.out.println("The sandwhich is hot:" + hot);
            System.out.println("The sandwhich has ingredient amount::" + ingredients);
            System.out.println("The sandwhich is size:" + size);
        }

    }
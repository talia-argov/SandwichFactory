public class Sandwich {

    public String breadtype;
    public String ingredients;
    public boolean hot;
    public int howMany;
    public char size;
    public boolean canSpeak;


    //constructor method
    public Sandwich() {
        breadtype = "bun";
        ingredients = "turkey";
        hot = true;
        howMany = 3;
        size = 'r';
        canSpeak = true;
    }

    public Sandwich(String pBun, String pIngredients, boolean pHot, int pHowMany, char pSize, boolean pCanSpeak){
            breadtype = pBun;
            hot = pHot;
            ingredients = pIngredients;
            size = pSize;
            canSpeak = pCanSpeak;
    }

        public void printInfo() {
            System.out.println("The sandwich is breadtype" + breadtype);
            System.out.println("The sandwich contains" + ingredients);
            System.out.println("The sandwich is hot:" + hot);
            System.out.println("The sandwich has ingredient amount:" + ingredients);
            System.out.println("The sandwich is size:" + size);
            //if the robot can speak, print "the robot can speak"
            if (canSpeak == true) {
                System.out.println("The sandwich can speak");
            } else {
                System.out.println("The sandwich cannot speak");
            }
            System.out.println();
        }

    }
//Rose McBurnett
//Period 3
//AP CS A
//Space Needle

public class SpaceNeedle{
    //needle is split into 3 parts: top, middle, and bottom
    public static void main(String[] args){
        top();
        middle();
        bottom();
    }
    //the total may be char width of the poll is 26 (still in progress)

    //sections/segments of the needle
    public static void centerPollEx(){
        //prints the center poll used in most lines
        for(int i = 0; i < 4; i++){
            System.out.println("            ||");
        }
    }
    public static void base(){
        //prints roof/bottom of needle, the roof and base use the same method
        System.out.println("         __/||\\__");
        System.out.println("      __/:::||:::\\__");
        System.out.println("   __/::::::||::::::\\__");
        System.out.println("__/:::::::::||:::::::::\\__");
        System.out.println("|\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"\"|");
    }
    public static void bottom(){
        //makes second method for easier reading
        base();
    }
    public static void taper(){
        //prints the lowerhalf/taper of the needle
        System.out.println("\\_/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\/\\_/");
        System.out.println("  \\_/\\/\\/\\/\\/\\/\\/\\/\\/\\_/");
        System.out.println("    \\_/\\/\\/\\/\\/\\/\\/\\_/");
        System.out.println("      \\_/\\/\\/\\/\\/\\_/");
    }
    public static void middleMain(){
        //prints the main part of the middle
        System.out.println("         |%%||%%|");
    }

    //contains the top of the needle
    public static void top(){
        //prints top poll to desired length
        centerPollEx();
        //prints roof of needle
        base();
        //prints the lowerhalf of the top of the needle
        taper();
    }

    //contains the middle of the needle
    public static void middle(){
        //prints the poll on top of the middle
        centerPollEx();
        //prints the bulk of the middle
        for(int i = 0; i < 16; i++){
            middleMain();
        }
        //prints the poll on the bottom of the middle
        centerPollEx();
    }
}

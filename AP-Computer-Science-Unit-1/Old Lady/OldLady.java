//Rose McBurnett
//Period 3
//AP CS A
//Old Lady
public class OldLady
{
    public static void main(String[] args) {
        firstStanza();
    }

    //Repeated lines for the food chain
    public static void spiderEatFly(){
        System.out.println("She swallowed the spider to catch the fly");
    }
    public static void birdEatSpider(){
        System.out.println("She swallowed the bird to catch the spider");
    }

    public static void secondStanza(){  
        //Prints the first stanza and calls last few lines
        System.out.println("There was an old lady who swallowed a spider");
        System.out.println("That wiggled and jiggled and tickled inside her");
        shellDie();
    }
    public static void shellDie() {
        //The repeated lines at the end of most of the stanzas will be refered to as stanza end
        System.out.println("I don't know why she");
        System.out.println("swallowed the fly");
        System.out.println("Perhaps she'll die\n");
    }
    public static void firstStanza(){  
        //Prints the first stanza and calls last few lines
        System.out.println("There was an old lady who swallowed a fly");
        shellDie();
    } 
}

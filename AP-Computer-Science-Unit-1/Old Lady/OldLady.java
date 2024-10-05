//Rose McBurnett
//Period 3
//AP CS A
//Old Lady
public class OldLady{
    public static void main(String[] args) {
        //Runs all stanzas in order
        firstStanza();
        secondStanza();
        thirdStanza();
        fourthStanza();
        fithStanza();
        sixthStanza();
        seventhStanza();
    }

    //Repeated lines for the food chain
    public static void spiderEatFly(){
        System.out.println("She swallowed the spider to catch the fly");
    }
    public static void birdEatSpider(){
        System.out.println("She swallowed the bird to catch the spider");
    }
    public static void catEatBird(){
        System.out.println("She swallowed the cat to catch the bird");
    }
    public static void dogEatCat(){
        System.out.println("She swallowed the dog to catch the cat");
    }
    public static void cowEatDog(){
        System.out.println("She swallowed the cow to catch the dog");
    }
    public static void horseEatCow(){
        System.out.println("She swallowed the horse to catch the cow");
    }

    //Repeated lines for the stanzas
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
    public static void secondStanza(){  
        //Prints the second stanza and calls last few lines
        System.out.println("There was an old lady who swallowed a spider");
        System.out.println("That wiggled and jiggled and tickled inside her");
        spiderEatFly();
        shellDie();
    }
    public static void thirdStanza(){  
        //Prints the third stanza and calls last few lines
        System.out.println("There was an old lady who swallowed a bird");
        System.out.println("How absurd! She swallowed a bird!");
        birdEatSpider();
        spiderEatFly();
        shellDie();
    }
    public static void fourthStanza(){  
        //Prints the fourth stanza and calls last few lines
        System.out.println("There was an old lady who swallowed a cat");
        System.out.println("Imagine that! She swallowed a cat");
        catEatBird();
        birdEatSpider();
        shellDie();
    }
    public static void fithStanza(){
        //Prints the fith stanza and calls last few lines
        System.out.println("There was an old lady who swallowed a dog");
        System.out.println("She went whole hog to swallow the dog");
        dogEatCat();
        catEatBird();
        birdEatSpider();
        shellDie();
    }
    public static void sixthStanza(){
        //Prints the sixth stanza and calls last few lines
        System.out.println("There was an old lady who swallowed a cow");
        System.out.println("I don't know how she swallowed the cow");
        cowEatDog();
        dogEatCat();
        catEatBird();
        birdEatSpider();
        shellDie();
    }
    public static void seventhStanza(){
        //Prints the last stanza and calls last few lines
        System.out.println("There was an old lady who swallowed a horse");
        System.out.println("She died, of course!");
        System.out.println("It was the last course");
        System.out.println("I'm filled with remorse");
        System.out.println("What's left to say");
        System.out.println("Even the artist is crying");
        System.out.println("We'll miss her dearly");
        System.out.println("It's such a loss");
        System.out.println("She had no time to floss");
        System.out.println( "She missed out on the sauce\n");
        System.out.println("Moral: Never swallow a horse");
    }

}

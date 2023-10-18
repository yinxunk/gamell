package gametest;
import gametest.players;
import java.util.*; 
public class gamell{
    public static void main(String[] args) {
        start();
        players player1 = new players("Yin Xun");
        drawCard(player1);
        for(int i = 0 ;i < player1.getHands().size();i++){
            System.out.println(player1.getHands().get(i));
        }
        playCard(player1);
        players player2 = new players("Jeff");
        players[] playerarray = {player1, player2};
        showScore(playerarray);


            
        
        
    }
    public static void start(){
        System.out.println("Welcome to a game, where mind tricks are the weapons of players");
        Scanner startprompt = new Scanner(System.in);
        System.out.println("To start the game, please type \\start");
        String executestartprompt = startprompt.nextLine();
        if(executestartprompt == "\\start"){
            System.out.println("Let the games begin!");
            System.out.println("How many plyers are there?");
            Scanner playeramount = new Scanner(System.in);
            String number = playeramount.nextLine();
            


        }
        else{
            System.out.println("Please make sure you spelled corerectly");
            
        }
    
    }

    public static void drawCard(players player){
        //int characterleft = 16;
        //String[] copiedcharacters = new String[characterleft];
        //for(int i = 0 ; i<characterleft; i++  ){
        //    String
        //}
        //int rnd = new Random().nextInt(character.length);
        ArrayList<String> characters = new ArrayList<>();
        characters.add("9Princess");
        characters.add("8Countess");
        characters.add("7King");
        characters.add("5Prince");
        characters.add("5prince");
        characters.add("4Handmaid");
        characters.add("4Handmaid");
        characters.add("3Baron");
        characters.add("3Baron");
        characters.add("2Priest");
        characters.add("2Priest");
        characters.add("1Guard");
        characters.add("1Guard");
        characters.add("1Guard");
        characters.add("1Guard");
        characters.add("1Guard");
        //fix characters so that it changes after every call 

        
        
        int rnd = new Random().nextInt(characters.size());
        
        System.out.println("Drawn card is " + characters.get(rnd));
        player.getHands().add(characters.get(rnd));
        
        characters.remove(rnd);
        


        
        
    }
    public static String showHand(players player){
        String cardsinhand = " ";
        for(int i = 0; i < player.getHands().size(); i++ ){
            cardsinhand += player.getHands().get(i);

        }   
        return "you are holding the card: " + cardsinhand;
    }
    public static void showScore(players[] player){
        for(int i = 0; i < player.length; i ++){
            int n = player[i].getScore();
            String s=Integer.toString(n);
            System.out.println(player[i].getName() + "score is" + s);
            
        }
        
        
    }
    public static void playCard(players player){
        drawCard(player);
        System.out.println("Only the cards in your hand can be played");
        System.out.println(showHand(player));
        System.out.println("Choose a card to play");
        Scanner playedcard = new Scanner(System.in);
        if(true){
            //to check if the selected card is in the hands of the current player
        }
        else{}
        String card = playedcard.nextLine();
        player.getHands().remove(card);
        System.out.println(showHand(player));
        

    }
    

}
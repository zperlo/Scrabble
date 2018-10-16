public class Player {
    private Dinosaur myDino;
    private int foodTokens;
    private int location = 0;
    private boolean evolveCardSenInt = false;
    private boolean evolveCardSpdSiz = false;
    private int lostTurns = 0;

    public Player(Dinosaur myDino, int foodTokens){
        this.myDino = myDino;
        this.foodTokens=foodTokens;
    }

    public Dinosaur getDino(){
        return myDino;
    }

    public int getFoodTokens(){
        return foodTokens;
    }

    public int getLocation(){
        return location;
    }

    public boolean isEvolveCardSenInt(){
        return evolveCardSenInt;
    }

    public boolean isEvolveCardSpdSiz(){
        return evolveCardSpdSiz;
    }

    public int getLostTurns() {
        return lostTurns;
    }

    public void move(int numSpaces){
        // allow player to move so long as they don't go past the finish space
        if (location + numSpaces <= 105) {
            location = location + numSpaces;
        }
        // if they were to move past the finish, don't let them move at all.
        // They get a chance to make it to the finish next turn if they roll the correct number

        // if the player went behind the start space, put them back on the start space
        else if (location < 0) {
            location = 0;
        }
    }

    public void changeFood(int numChange){
        foodTokens = foodTokens + numChange;
    }

    public void setEvolveCardSenInt(boolean set){
        evolveCardSenInt = set;
    }

    public void setEvolveCardSpdSiz(boolean set){
        evolveCardSpdSiz = set;
    }

    public void setLostTurns(int newLostTurns) {
        lostTurns = newLostTurns;
    }
}
